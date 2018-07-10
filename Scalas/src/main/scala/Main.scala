package problem

object Main {

  def main(args: Array[String]): Unit = {
    val exp = new Experimenter();

    // Problem1
    val l1: List[Int] = List(1,2,3,4,5)
    val p1 = new Problem1(l1, 17, true);

    val result = exp.RunExperiment(p1)

    println(result.toString)




  }
}
