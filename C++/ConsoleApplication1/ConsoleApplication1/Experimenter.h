#pragma once

#include "Problem.h"
#include <list>

using namespace std;

class Experimenter
{
public:
	Experimenter();
	~Experimenter();
	void RunExperiment(Problem &p);


private:
	long average(list<long> list);
	long median(list<long> list);
};

