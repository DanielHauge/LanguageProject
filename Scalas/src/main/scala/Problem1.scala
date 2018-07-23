package problem

import scala.collection.mutable

class Problem1(list: List[Int], k: Int, exp: Boolean) extends Problem {


  override def Calculate(): Boolean = {
    var res = false
    var Set = new mutable.HashSet[Int]()
    for (elem <- list) {
      if (Set.contains(elem)){
        res = true
        return res==exp
      }else{
        Set.add(k-elem)
      }
    }



    return res==exp
  }
}
