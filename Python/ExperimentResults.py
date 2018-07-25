class Results:
    problemname = "nonameyet"
    measurements = []
    average = 0
    median = 0
    high = 0
    low = 0

    def __init__(self, name, mes, avg, med, h, l):
        self.problemname = name
        self.measurements = mes
        self.average = avg
        self.median = med
        self.high = h
        self.low = l


    def PrintSelf(self):
        print(self.problemname+" Results: ")
        print("Median: %.0fns" % self.median)
        print("Average: %.0fns" % self.average)
        print("High: %.0fns" % self.high)
        print("Low: %.0fns" % self.low)
        print("")
        print("============================")
        print("")