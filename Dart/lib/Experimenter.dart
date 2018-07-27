import 'package:Dart/ExperimentResults.dart';
import 'package:Dart/Problem.dart';

class Experimenter {

  ExperimentResults RunExperiment(Problem p){
    print("Running Experiment");
    List<double> measurements = [].toList();
    bool res = false;
    Stopwatch sw = new Stopwatch();

    for (int i = 0; i<100000; i++){

      sw.reset();
      sw.start();
      res = p.Calculate();
      sw.stop();
      int ticks = sw.elapsedTicks;
      measurements.add(ticks/sw.frequency * 1000000000);
      if (!res){
        print("Algorithm failed\n");
      }

    }

    return new ExperimentResults(measurements, Average(measurements), Median(measurements), High(measurements), Low(measurements));
  }


  double Average(List<double> list){
    double total = 0.0;
    for (double x in list){
      total+= x;
    }
    return total/list.length;
  }

  double Median(List<double> list){
    list.sort();
    return list[list.length~/2];
  }

  double High(List<double> list){
    list.sort();
    return list[list.length-1];
  }

  double Low(List<double> list){
    list.sort();
    return list[0];
  }

  void PrintIndi(List<ExperimentResults> results){
    for (ExperimentResults x in results){
      x.PrintMe();
    }
  }

  void PrintAverages(List<ExperimentResults> results){
    print("Printing Averages: ");
    print("Average-Average: "+AvgOfAvg(results).round().toString()+"ns");
    print("Average-Median: "+AvgOfMedian(results).round().toString()+"ns");
    print("Average-High: "+AvgOfHigh(results).round().toString()+"ns");
    print("Average-Low: "+AvgOfLow(results).round().toString()+"ns");
  }

  double AvgOfAvg(List<ExperimentResults> results){
    double total = 0.0;
    for (ExperimentResults x in results){
      total += x.avg;
    }
    return total/results.length;
  }

  double AvgOfMedian(List<ExperimentResults> results){
    double total = 0.0;
    for (ExperimentResults x in results){
      total += x.med;
    }
    return total/results.length;
  }

  double AvgOfHigh(List<ExperimentResults> results){
    double total = 0.0;
    for (ExperimentResults x in results){
      total += x.high;
    }
    return total/results.length;
  }

  double AvgOfLow(List<ExperimentResults> results){
    double total = 0.0;
    for (ExperimentResults x in results){
      total += x.low;
    }
    return total/results.length;
  }





}