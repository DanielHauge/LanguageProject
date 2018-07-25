package problem

class ExperimentResult(name: String, measurements: List[Long], avg: Double, med: Long, high: Long, low: Long) {

  def PrintMe(): Unit ={
    println(this.name+ "Results: ")
    println("Average: "+this.avg+"ns")
    println("Median: "+this.med+"ns")
    println("High: "+this.high+"ns")
    println("Low: "+this.high+"ns")
    println("")
    println("====================")
    println("")
  }

  def GetName(): String ={ name }

  def GetAvg(): Double={ avg }

  def GetMed(): Long = { med }

  def GetHigh(): Long = { high }

  def GetLow(): Long = { low }

}
