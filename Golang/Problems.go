package main

//Problem 1
func CanListSumToK(list []int, k int) bool{
	hashset := map[int]bool{}

	for _, v := range list{
		if hashset[v]{
			return true
		} else {
			hashset[k-v] = true;
		}
	}
	return false;
}
