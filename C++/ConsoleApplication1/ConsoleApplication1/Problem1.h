#pragma once
#include "Problem.h"
#include <list>

using namespace std;

class Problem1 :  public Problem
{
public:
	Problem1(list<int> list, int k, bool expected)
	{
		this->k = k;
		this->expected = expected;
		this->list = list;
	}
	~Problem1();
	bool Calculate();
	
private:
	int k;
	bool expected;
	list<int> list;
};

