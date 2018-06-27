load 'problem.rb'

class Experimenter

  def RunExperiment(problem)
    puts "Running experiment on: "+problem.class.name
    meassurements = []

    100000.times do
      start = Process.clock_gettime(Process::CLOCK_MONOTONIC)
      result = problem.Calculate()
      endtime = Process.clock_gettime(Process::CLOCK_MONOTONIC)
      elapsed = (endtime - start)*1000000000
      meassurements.push(elapsed)
      if (!result)
        print("The algorithm failed")
      end

    end

    puts "Median: "+med(meassurements).ceil.to_s+"ns"
    puts "Average: "+avg(meassurements).ceil.to_s+"ns"

  end


  def avg(numbers)
    total = 0
    numbers.each {|num| total+=num}
    return total/numbers.size()
  end


  def med(numbers)
    numbers.sort
    numbers[numbers.size()/2]
  end

end