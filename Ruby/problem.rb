require 'set'


class Problem

  def CanListSumToK(list, k)
    s1 = Set[]

    for i in list
      if s1.include?(i)
        return true
      else
        s1.add(k-i)
      end

    end

    return false

  end


end