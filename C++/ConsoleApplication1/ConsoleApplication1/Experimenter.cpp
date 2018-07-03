#include "stdafx.h"
#include "Experimenter.h"
#include <list>
#include <chrono>

using namespace std;

Experimenter::Experimenter()
{
}


Experimenter::~Experimenter()
{
}

void Experimenter::RunExperiment(Problem &p)
{
	auto ProblemName = typeid(p).name();
	cout << "Starting Experiment on: " << ProblemName << endl;

	list<long> measurements;

	auto res = false;
	for (int i = 0; i < 100000; i++) {
		
		auto start = chrono::steady_clock::now();
		res = p.Calculate();
		auto finish = chrono::steady_clock::now();
		auto dur = chrono::duration_cast<chrono::nanoseconds>(finish - start).count();
		measurements.push_front(dur);
		if (!res) {
			cout << "Algorithm failed!!!";
		}
	}
	auto med = median(measurements);
	auto avg = average(measurements);
	cout << "Median: " << med << "ns" << endl;
	cout << "Average: " << avg << "ns" << endl << endl;
}

long Experimenter::average(list<long> list) {
	long long total = 0;
	for (auto num : list) {
		total += num;
	}
	return total / list.size();
}

long Experimenter::median(list<long> list) {
	list.sort();
	auto it1 = std::next(list.begin(), list.size() / 2);
	return *it1;
}