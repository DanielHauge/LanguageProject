#include "stdafx.h"
#include "Problem1.h"
#include <list>
#include <unordered_set>

using namespace std;

Problem1::~Problem1()
{
	
}

bool Problem1::Calculate()
{
	
	unordered_set<int> set;
	for (int num : this->list) {
		if (set.find(num) != set.end()) {
			return true;
		}
		set.insert(this->k-num);
		
	}
	
	
	
	return true;
}

