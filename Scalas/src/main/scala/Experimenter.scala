package problem

class Experimenter {

  def RunExperiment(problem: Problem): Unit ={

    var measurement: List[Long] = List()

    1 to 100000 foreach { _ =>
      val t0 = System.nanoTime()
      problem.Calculate()
      val t1 = System.nanoTime()
      val dur = t1-t0
      measurement.
    }



  }

}
