package main

import (
	"fmt"
	"time"
	"sort"
)

func RunExperirment(p Problem){
	fmt.Println("Running experiment")
	measurements := []int64{}
	res := false;
	for i := 0; i<100000; i++ {
		now := time.Now()
		res = p.Calculate()
		end := time.Since(now)
		measurements = append(measurements, end.Nanoseconds())
		if !res {
			fmt.Println("Uhh algorithm failed")
		}
	}

	fmt.Printf("Median: %v ns\n",Median(measurements))
	fmt.Printf("Average: %v ns\n\n",Average(measurements))
	//PrintAll(measurements)

}

func Median(durs []int64)int64{
	sort.Slice(durs, func(i, j int) bool {
		return durs[i] < durs[j]
	})
	return durs[len(durs)/2]
}

func Average(durs []int64) int64{
	var total int64 = 0
	for _, x := range durs{
		total += x
	}
	return total/int64(len(durs))
}

/*
func PrintAll(durs []int64){
	for _,x := range durs{
		fmt.Print(x)
		fmt.Print(" - ")
	}
}
*/
