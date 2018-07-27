import 'package:Dart/Problem.dart' as Problem;

class Problem2 implements Problem.Problem {

  List<int> list;
  List<int> exp;


  Problem2(List<int> list, List<int> exp){
    this.list = list;
    this.exp = exp;
  }


  @override
  bool Calculate() {
    var results = new List(this.list.length);
    for (int i = 0; i<this.list.length; i++){

      int total = 1;
      for (int j= 0; j<this.list.length; j++){

        if (j != i){

          total = total*this.list[j];

        }


      }
      results[i] = total;

    }

    return true;

  }
}