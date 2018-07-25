package problem

import scala.collection.mutable

class Problem3(list: List[Int], k: Int) extends Problem {
  override def Calculate(): Boolean = {

    var counter = 0
    var Set = new mutable.HashSet[Int]()

    for (elem <- list) {

      if ( elem == counter+1){
        counter += 1
        while (Set.contains(counter+1)){
          counter +=1
        }


      }
      else
        {
          Set.add(elem)
        }

    }
    return counter+1 == k
  }
}
