load 'problem.rb'
require 'set'

class Problem1 < Problem

  def initialize(list, k, exp)
    @list = list
    @k = k
    @exp = exp
  end

  def Calculate()
    s1 = Set[]
    res = false
    for i in @list
      if s1.include?(i)
        res = true
      else
        s1.add(@k-i)
      end

    end

    return res

  end


end