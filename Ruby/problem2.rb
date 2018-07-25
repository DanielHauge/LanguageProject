load 'problem.rb'

class Problem2 < Problem

  def initialize(list, exp)
    @@list = list
    @@exp = exp
  end

  def Calculate()
    length = @@list.size()-1
    array = Array(0..length)


    for i in 0..@@list.size()-1

      total = 1

      for j in 0..@@list.size()-1
        if j!=i
          total = total * @@list[j].to_f
        end
      end


      array[i] = total

    end
    return true

  end


end