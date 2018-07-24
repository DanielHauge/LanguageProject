public class ExperimentResults {

    public String problemname;
    public Long[] measurements;
    public double average;
    public double median;
    public double high;
    public double low;

    public ExperimentResults(String Problem,Long[] mes, double avg, double med, double h, double l)
    {
        problemname = Problem;
        measurements = mes;
        average = avg;
        median = med;
        high = h;
        low = l;
    }

    public void PrintMySelf()
    {

        System.out.println(problemname + " results:");
        System.out.println("Median: " + Math.round(median) + "ns");
        System.out.println("Average: " + Math.round(average) + "ns");
        System.out.print("High: " + Math.round(high) + "ns \t\t");
        System.out.println("Low: "+ Math.round(low)+"ns");
        System.out.println();
        System.out.println("===================================");
        System.out.println();
    }

    public static double AverageOfAverages(ExperimentResults[] all)
    {
        double total = 0;

        for (ExperimentResults res : all)
        {
            total += res.average;
        }
        return total / all.length;
    }

    public static double AverageOfMedians(ExperimentResults[] all)
    {
        double total = 0;
        for (ExperimentResults res : all)
        {
            total += res.median;
        }
        return total / all.length;
    }

    public static double AverageOfHighs(ExperimentResults[] all)
    {
        double total = 0;
        for (ExperimentResults res : all)
        {
            total += res.high;
        }
        return total / all.length;
    }

    public static double AverageOfLows(ExperimentResults[] all)
    {
        double total = 0;
        for (ExperimentResults res : all)
        {
            total += res.low;
        }
        return total / all.length;
    }

    public static void PrintIndividual(ExperimentResults[] all)
    {
        for (ExperimentResults res : all)
        {
            res.PrintMySelf();
        }
    }

    public static void PrintAverages(ExperimentResults[] all)
    {
        System.out.println("Printing Averages on: "+all[0].problemname);
        System.out.println("Average-Average: " + Math.round(AverageOfAverages(all)) + "ns");
        System.out.println("Average-Median: " + Math.round(AverageOfMedians(all)) + "ns");
        System.out.println("Average-High: " + Math.round(AverageOfHighs(all)) + "ns");
        System.out.println("Average-Low: " + Math.round(AverageOfLows(all)) + "ns");
    }


}
