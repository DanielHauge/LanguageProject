package main

import "fmt"

type Results struct {
	problemname string
	measurements []int64
	avg int64
	med int64
	high int64
	low int64

}

func (r Results) PrintSelf (){
	fmt.Printf("%v results: \n", r.problemname)
	fmt.Printf("Median: %v ns\n", r.med)
	fmt.Printf("Average: %v ns\n", r.avg)
	fmt.Printf("High: %v ns\t\tLow: %v \n", r.high, r.low)
	fmt.Print("==========================\n\n")
}

func AverageOfAverage(res []Results) int64{
	total := int64(0)
	for _, x := range res {
		total += x.avg
	}
	return total / int64(len(res))
}

func AverageOfMedian(res []Results) int64{
	total := int64(0)
	for _, x := range res {
		total += x.med
	}
	return total / int64(len(res))
}

func AverageOfHigh(res []Results) int64{
	total := int64(0)
	for _, x := range res {
		total += x.high
	}
	return total / int64(len(res))
}

func AverageOfLow(res []Results) int64{
	total := int64(0)
	for _, x := range res {
		total += x.low
	}
	return total / int64(len(res))
}

func PrintAverages(res []Results){
	fmt.Printf("Printing Averages on: %v \n", res[0].problemname)
	fmt.Printf("Average-Average: %v ns\n", AverageOfAverage(res))
	fmt.Printf("Average-Median: %v ns\n", AverageOfMedian(res))
	fmt.Printf("Average-High: %v ns\n", AverageOfHigh(res))
	fmt.Printf("Average-Low: %v ns\n", AverageOfLow(res))
}

func PrintAllIndi(res []Results){
	for _, x := range res{
		x.PrintSelf()
	}
}
