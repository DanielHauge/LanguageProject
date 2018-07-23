#include "stdafx.h"
#include "ExperimentResults.h"
#include <list>
#include <string>
#include <math.h>
#include <vector>

using namespace std;



ExperimentResults::~ExperimentResults()
{
	
}



void ExperimentResults::PrintSelf()
{
	cout << this->name << " results:" << endl;
	cout << "Median: " << this->med << "ns" << endl;
	cout << "Average: " << this->avg << "ns" << endl;
	cout << "High: " << this->h << "ns\t\t";
	cout << "Low: " << this->l << endl << endl;
	cout << "============================" << endl << endl;
}

string ExperimentResults::getName()
{
	return this->name;
}

long ExperimentResults::getAvg()
{
	return this->avg;
}

long ExperimentResults::getMed()
{
	return this->med;
}

long ExperimentResults::getH()
{
	return this->h;
}

long ExperimentResults::getL()
{
	return this->l;
}



void ExperimentResults::PrintIndi(vector<ExperimentResults> &all)
{
	for (ExperimentResults x : all) {
		x.PrintSelf();
	}
}

void ExperimentResults::PrintCombined(vector<ExperimentResults> &all)
{
	cout << "Printing averages on: " << all[0].getName() << endl;
	cout << "Average-Average: " << AverageOfAverage(all) << "ns" << endl;
	cout << "Average-Median: " << AverageOfMedian(all) << "ns" << endl;
	cout << "Average-High: " << AverageOfHigh(all) << "ns" << endl;
	cout << "Average-Low: " << AverageOfLow(all) << "ns" << endl;
}

double ExperimentResults::AverageOfAverage(vector<ExperimentResults> all) {
	
	long long total = 0;

	for (ExperimentResults x : all) {
		total += x.getAvg();
	}

	return total / all.size();


}
double ExperimentResults::AverageOfMedian(vector<ExperimentResults> all) {
	long long total = 0;

	for (ExperimentResults x : all) {
		total += x.getMed();
	}

	return total / all.size();
}
double ExperimentResults::AverageOfHigh(vector<ExperimentResults> all) {
	long long total = 0;

	for (ExperimentResults x : all) {
		total += x.getH();
	}

	return total / all.size();
}
double ExperimentResults::AverageOfLow(vector<ExperimentResults> all) {
	long long total = 0;

	for (ExperimentResults x : all) {
		total += x.getL();
	}

	return total / all.size();
}
