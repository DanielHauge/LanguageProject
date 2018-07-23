using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;

namespace Problems
{
    class Experimenter
    {

        public ExperimentResults RunExperiment(Problem p)
        {
            Console.WriteLine("Running experiments on: "+ p.GetType().Name);
            List<double> meassurements = new List<double>();
            bool res;
            Stopwatch sw = new Stopwatch();
            for (int i = 0; i < 100000; i++)
            {
                sw.Reset();
                sw.Start();
                res = p.Calculate();
                sw.Stop();
                double ticks = sw.ElapsedTicks;
                meassurements.Add((ticks / Stopwatch.Frequency)* 1000000000);
                if (!res)
                {
                    Console.WriteLine("Uhh the Algorithm failed");
                }
            }

            double[] results = meassurements.ToArray();

            return new ExperimentResults(p.GetType().Name, results, Average(results), Median(results), High(results), Low(results));
        }

        private static double Median(double[] durs)
        {
            Array.Sort(durs);
            return durs[durs.Length / 2];
        }

        private static double High(double[] durs)
        {
            Array.Sort(durs);
            return durs[durs.Length - 1];
        }

        private static double Low(double[] durs)
        {
            Array.Sort(durs);
            return durs[0];
        }

        private static double Average(double[] durs)
        {
            double total = 0;
            foreach (double d in durs)
            {
                total += d;
            }
            return total / durs.Length;
        }


    }
}
