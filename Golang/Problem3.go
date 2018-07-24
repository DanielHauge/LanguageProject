package main

type Problem3 struct {
	list []int
	expect int
}

func (p Problem3) Calculate() bool {

	counter := 0
	hashset := map[int]bool{}

	for _,x := range p.list{
		if x == counter+1{
			counter ++
			for hashset[counter+1]{
				counter ++
			}
		}else {
			hashset[x] = true
		}

	}

	return counter+1 == p.expect

}