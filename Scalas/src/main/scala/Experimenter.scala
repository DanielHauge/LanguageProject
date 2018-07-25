package problem

import scala.collection.mutable.ListBuffer


class Experimenter {

  def RunExperiment(problem: Problem): ExperimentResult ={
    println("Running experiment on: "+problem.getClass.getName)
    var measurements = new ListBuffer[Long]()
    var success = true

    1 to 100000 foreach { _ =>
      val t0 = System.nanoTime()
      if (!problem.Calculate()){
        success = false
      }
      val t1 = System.nanoTime()
      val dur = t1-t0
      measurements += dur
    }
    if (!success){
      println("Something went wrong!!!")
    }

    return new ExperimentResult(problem.getClass.getName, measurements.toList, avg = this.Average(measurements.toList), med = this.Median(measurements.toList), high = this.High(measurements.toList), low = this.Low(measurements.toList))
  }



  def Average(list: List[Long]): Long ={
    var total = 0l
    for (elem <- list) {
      total+=elem
    }

    return total/list.size
  }

  def Median(list: List[Long]): Long = {
    val sorted = list.sortWith(_<_)
    return sorted(list.size/2)
  }

  def High(list: List[Long]): Long = {
    val sorted = list.sortWith(_<_)
    return sorted(list.size-1)
  }

  def Low(list: List[Long]): Long = {
    val sorted = list.sortWith(_<_)
    return sorted(0)
  }

  def PrintAll(list: List[Long]): Unit ={
    for (elem <- list) {
      print(elem+" - ")
    }
  }

  def PrintIndi(list: List[ExperimentResult]): Unit ={
    for (elem <- list){
      elem.PrintMe()
    }
  }

  def PrintAverages(list: List[ExperimentResult]): Unit ={
    println("Printing Averages on: "+list.head.GetName())
    println("Average-Average: "+AvgOfAvg(list))
    println("Average-Median: "+AvgOfMed(list))
    println("Average-High: "+AvgOfHigh(list))
    println("Average-Low: "+AvgOfLow(list))
  }




  def AvgOfAvg(list: List[ExperimentResult]): Double= {
    var total:Double = 0
    for (elem <- list){
      total += elem.GetAvg()
    }
    return total/list.length
  }
  def AvgOfMed(list: List[ExperimentResult]): Double= {
    var total:Double = 0
    for (elem <- list){
      total += elem.GetMed()
    }
    return total/list.length
  }
  def AvgOfHigh(list: List[ExperimentResult]): Double= {
    var total:Double = 0
    for (elem <- list){
      total += elem.GetHigh()
    }
    return total/list.length
  }
  def AvgOfLow(list: List[ExperimentResult]): Double= {
    var total:Double = 0
    for (elem <- list){
      total += elem.GetLow()
    }
    return total/list.length
  }


}
