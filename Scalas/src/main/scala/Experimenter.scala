package problem

import scala.collection.mutable.ListBuffer


class Experimenter {

  def RunExperiment(problem: Problem): Unit ={
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
    println("Median :"+ this.Median(measurements.toList))
    println("Average: "+this.Average(measurements.toList))
    println()

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

  def PrintAll(list: List[Long]): Unit ={
    for (elem <- list) {
      print(elem+" - ")
    }
  }

}
