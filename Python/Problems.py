
def CanListSumToK(list, k):
    hashset = set()
    for i in list:
        if i in hashset:
            return True
        else:
            hashset.add(k-i)

    return False


