package main

type Problem1 struct {
	list []int
	k int
	exp bool
}

func (p1 Problem1) Calculate() bool{
	res := false;
	hashset := map[int]bool{}

	for _, v := range p1.list{
		if hashset[v]{
			res = true
		} else {
			hashset[p1.k-v] = true;
		}
	}
	return res;
}
