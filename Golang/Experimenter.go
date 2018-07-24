package main

import (
	"fmt"
	"time"
	"sort"
	"reflect"
)

func RunExperirment(p Problem) Results{
	name := reflect.TypeOf(p).Name()
	fmt.Println("Running experiment on: "+name)
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

	//PrintAll(measurements)
	return Results{avg:Average(measurements), med:Median(measurements), problemname:name, measurements:measurements, high:High(measurements), low:Low(measurements)}

}

func Median(durs []int64)int64{
	sort.Slice(durs, func(i, j int) bool {
		return durs[i] < durs[j]
	})
	return durs[len(durs)/2]
}

func High(durs []int64)int64{
	sort.Slice(durs, func(i, j int) bool {
		return durs[i] < durs[j]
	})
	return durs[len(durs)-1]
}

func Low(durs []int64)int64{
	sort.Slice(durs, func(i, j int) bool {
		return durs[i] < durs[j]
	})
	return durs[0]
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
