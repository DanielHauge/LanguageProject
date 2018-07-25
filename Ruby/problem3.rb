load 'problem.rb'
require 'set'

class Problem3 < Problem

  def initialize(list, exp)
    @list = list
    @exp = exp
  end

  def Calculate()
    counter = 0
    s1 = Set[]
    for i in @list
      if i == counter+1
        counter = counter + 1
        while (s1.include?(counter+1))
          counter = counter + 1
        end
      else
        s1.add(i)
      end

    end

    return @exp == counter+1

  end

end