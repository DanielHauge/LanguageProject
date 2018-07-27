
class ExperimentResults {
  List<double> measurements;
  double avg;
  double med;
  double high;
  double low;

  ExperimentResults(List<double> measurements, double a, double m, double h, double l){
    this.measurements = measurements;
    this.avg = a;
    this.med = m;
    this.high = h;
    this.low = l;
  }

  void PrintMe(){
    print("Median: "+med.toString()+"ns");
    print("Average: "+avg.toString()+"ns");
    print("High: "+high.toString()+"ns");
    print("Low: "+low.toString()+"ns\n");
    print("============================\n");
  }



}