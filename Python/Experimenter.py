from Interface import Problem
import _datetime
import time
import timeit
import ExperimentResults


class Experimenter:



    def Avg(self, numbers):
        total = 0
        for i in numbers:
            total+=i
        return total/len(numbers)

    def Median(self, numbers):
        sortedList = sorted(numbers, key=float)
        return sortedList[int(len(sortedList)/2)]


    def High(self, numbers):
        sortedList = sorted(numbers, key=float)
        return sortedList[int(len(sortedList)-1)]

    def Low(self, numbers):
        sortedList = sorted(numbers, key=float)
        return sortedList[0]


    def RunExperiments(self, problem):
        print("Running experiment on: "+problem.__class__.__name__)
        timed = timeit.repeat(problem.Calculate, number=1, repeat=100000)
        avg = self.Avg(timed)*1000000000
        median = self.Median(timed)* 1000000000
        high = self.High(timed)*1000000000
        low = self.Low(timed) * 1000000000
        return ExperimentResults.Results(problem.__class__.__name__, timed, avg, median, high, low)


    def AvgOfAvg(self, results):
        total = 0
        for i in results:
            total += i.average
        return total/len(results)

    def AvgOfMedian(self, results):
        total = 0
        for i in results:
            total += i.median
        return total/len(results)

    def AvgOfHigh(self, results):
        total = 0
        for i in results:
            total += i.high
        return total/len(results)

    def AvgOfLow(self, results):
        total = 0
        for i in results:
            total += i.low
        return total/len(results)

    def PrintIndi(self, results):
        for i in results:
            i.PrintSelf()


    def PrintAvg(self, results):
        print("Printing Averages on: "+results[0].problemname)
        print("Average-Average: %.0fns" % self.AvgOfAvg(results))
        print("Average-Median: %.0fns" % self.AvgOfMedian(results))
        print("Average-High: %.0fns" % self.AvgOfHigh(results))
        print("Average-Low: %.0fns" % self.AvgOfLow(results))
