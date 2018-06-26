from Interface import Problem
import _datetime
import time
import timeit


class Experimenter:



    def Avg(self, numbers):
        total = 0
        for i in numbers:
            total+=i
        return total/len(numbers)

    def Median(self, numbers):
        sortedList = sorted(numbers, key=float)
        return sortedList[int(len(sortedList)/2)]


    def RunExperiments(self, problem):
        print("Running experiment on: "+problem.__class__.__name__)
        timed = timeit.repeat(problem.Calculate, number=1, repeat=100000)
        avg = self.Avg(timed)*1000000000
        median = self.Median(timed)* 1000000000
        print("Median: %.0fns" % median)
        print("Average: %.0fns" % avg)

        print("hello")


