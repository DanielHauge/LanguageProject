package problem

import scala.collection.mutable

class Problem2(list: List[Int], exp: List[Int]) extends Problem {
  override def Calculate(): Boolean = {
    var array = Array.fill(list.length){0}

    for ( i <- 0 to list.length-1){

      var total = 1
      for ( j <- 0 to list.length-1){

        if (j != i){
          total = total * list(j)


        }

      }

      array(i) = total
    }

    return true
  }
}
