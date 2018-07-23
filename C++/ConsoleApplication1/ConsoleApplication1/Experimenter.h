#pragma once

#include "Problem.h"
#include <list>
#include "ExperimentResults.h"

using namespace std;

class Experimenter
{
public:
	Experimenter();
	~Experimenter();
	ExperimentResults RunExperiment(Problem &p);
	


private:
	long average(list<long> list);
	long median(list<long> list);
	long high(list<long> list);
	long low(list<long> list);
};

