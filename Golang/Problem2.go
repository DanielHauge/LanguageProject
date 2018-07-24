package main


type Problem2 struct {
	list []int
	expect []int
}

func (p Problem2) Calculate() bool{

	length := len(p.list)
	res := make([]int, length)
	for i := 0; i<len(p.list); i++{
		total := 1

		for j := 0; j<len(p.list); j++{

			if j!=i{
				total = total*p.list[j]
			}


		}

		res[i] = total


	}
	//PrintAllNumbers(res)

	return true;
}

/*
func PrintAllNumbers(numbers []int){
	for _,x := range numbers{
		fmt.Print(x)
	}
	fmt.Println("\n")
}
*/