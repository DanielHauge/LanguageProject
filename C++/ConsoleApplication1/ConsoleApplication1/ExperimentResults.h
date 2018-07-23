#pragma once
#include <list>
#include <vector>

using namespace std;


class ExperimentResults
{
public:
	ExperimentResults(list<long> list, string name, long avg, long med, long h, long l) {
		this->mes = list;
		this->name = name;
		this->avg = avg;
		this->med = med;
		this->h = h;
		this->l = l;
	}
	~ExperimentResults();
	void PrintSelf();

	string getName();
	long getAvg();
	long getMed();
	long getH();
	long getL();

	static double AverageOfAverage(vector<ExperimentResults> all);
	static double AverageOfMedian(vector<ExperimentResults> all);
	static double AverageOfHigh(vector<ExperimentResults> all);
	static double AverageOfLow(vector<ExperimentResults> all);

	static void PrintIndi(vector<ExperimentResults> &all);
	static void PrintCombined(vector<ExperimentResults> &all);


private:
	list<long> mes;
	string name;
	long avg;
	long med;
	long h;
	long l;
};

