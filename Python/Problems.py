from Interface import Problem

class Problem1(Problem):

    mylist = {0}
    ks = 0
    exp = False

    def __init__(self, list, k, exp):
        self.mylist = list
        self.ks = k
        self.exp = exp

    def Calculate(self):
        hashset = set()
        for i in self.mylist:
            if i in hashset:
                self.exp = True
            else:
                hashset.add(self.ks-i)

        return self.exp


