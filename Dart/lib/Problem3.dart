import 'package:Dart/Problem.dart' as Problem;

class Problem3 implements Problem.Problem {

  List<int> list;
  int exp;


  Problem3(List<int> list, int exp){
    this.list = list;
    this.exp = exp;
  }


  @override
  bool Calculate() {

    int counter = 0;
    Set<int> set = [].toSet();
    for (int x in this.list){
      if (x == counter+1){
        counter++;
        while (set.contains(counter+1)){
          counter++;
        }
      }else{
        set.add(x);
      }
    }


    return counter+1 == this.exp;

  }
}