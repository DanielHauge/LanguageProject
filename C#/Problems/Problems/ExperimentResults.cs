using System;
using System.Collections.Generic;
using System.Text;

namespace Problems
{
    class ExperimentResults
    {
        public string problemname;
        public double[] measurements;
        public double average;
        public double median;
        public double high;
        public double low;

        public ExperimentResults(string Problem,double[] mes, double avg, double med, double h, double l)
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
            
            Console.WriteLine(problemname + " results:");
            Console.WriteLine("Median: " + Math.Round(median) + "ns");
            Console.WriteLine("Average: " + Math.Round(average) + "ns");
            Console.Write("High: " + Math.Round(high) + "ns \t\t");
            Console.WriteLine("Low: "+ Math.Round(low)+"ns");
            Console.WriteLine();
            Console.WriteLine("===================================");
            Console.WriteLine();
        }

        public static double AverageOfAverages(ExperimentResults[] all)
        {
            double total = 0;
            foreach (var res in all)
            {
                total += res.average;
            }
            return total / all.Length;
        }

        public static double AverageOfMedians(ExperimentResults[] all)
        {
            double total = 0;
            foreach (var res in all)
            {
                total += res.median;
            }
            return total / all.Length;
        }

        public static double AverageOfHighs(ExperimentResults[] all)
        {
            double total = 0;
            foreach (var res in all)
            {
                total += res.high;
            }
            return total / all.Length;
        }

        public static double AverageOfLows(ExperimentResults[] all)
        {
            double total = 0;
            foreach (var res in all)
            {
                total += res.low;
            }
            return total / all.Length;
        }

        public static void PrintIndividual(ExperimentResults[] all)
        {
            foreach (var res in all)
            {
                res.PrintMySelf();
            }
        }

        public static void PrintAverages(ExperimentResults[] all)
        {
            Console.WriteLine("Printing Averages on: "+all[0].problemname);
            Console.WriteLine("Average-Average: " + Math.Round(AverageOfAverages(all)) + "ns");
            Console.WriteLine("Average-Median: " + Math.Round(AverageOfMedians(all)) + "ns");
            Console.WriteLine("Average-High: " + Math.Round(AverageOfHighs(all)) + "ns");
            Console.WriteLine("Average-Low: " + Math.Round(AverageOfLows(all)) + "ns");
        }

    }
}
