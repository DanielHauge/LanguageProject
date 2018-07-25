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


class Problem2(Problem):

    mylist = {0}
    exp = {0}

    def __init__(self, list, exp):
        self.mylist = list
        self.exp = exp

    def Calculate(self):
        res = [None] * len(self.mylist)

        for i in range(len(self.mylist)-1):

            total = 1
            for j in range(len(self.mylist)-1):

                if i != j:
                    total = total * self.mylist[j]

            res[i] = total

        return True


class Problem3(Problem):
    mylist = {0}
    exp = 0

    def __init__(self, list, k):
        self.mylist = list
        self.exp = k


    def Calculate(self):
        counter = 0
        hashset = set()
        for i in self.mylist:
            if i == counter+1:
                counter +=1
                while counter+1 in hashset:
                    counter +=1
            else:
                hashset.add(i)
        return counter+1 == self.exp