import 'package:Dart/Problem.dart' as Problem;

class Problem1 implements Problem.Problem {

  List<int> list;
  int k;
  bool exp;


  Problem1(List<int> list, int k, bool exp){
    this.list = list;
    this.k = k;
    this.exp = exp;
  }


  @override
  bool Calculate() {
    bool res = false;
    Set<int> set = [].toSet();
    for (int x in this.list){
      if (set.contains(x)){
        res = true;
        return res == exp;
      }else{
        set.add(this.k-x);
      }
    }

    return res == this.exp;
  }
}