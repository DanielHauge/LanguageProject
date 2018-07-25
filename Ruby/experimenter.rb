load 'problem.rb'
load 'experiment_results.rb'

class Experimenter

  def RunExperiment(problem)
    puts "Running experiment on: "+problem.class.name
    meassurements = []

    10.times do
      start = Process.clock_gettime(Process::CLOCK_MONOTONIC)
      result = problem.Calculate()
      endtime = Process.clock_gettime(Process::CLOCK_MONOTONIC)
      elapsed = (endtime - start)*1000000000
      meassurements.push(elapsed)
      if (!result)
        print("The algorithm failed")
      end

    end

    return ExperimentResults.new(problem.class.name, meassurements, avg(meassurements), med(meassurements), high(meassurements), low(meassurements))

  end


  def avg(numbers)
    total = 0
    numbers.each {|num| total+=num}
    return total/numbers.size()
  end


  def med(numbers)
    numbers.sort
    return numbers[numbers.size()/2]
  end

  def high(numbers)
    numbers.sort
    return numbers[0]
  end

  def low(numbers)
    numbers.sort
    return numbers[numbers.size-1]
  end


  def PrintIndi(results)
    results.each {|i|
      i.PrintSelf
    }
  end

  def PrintAvg(results)
    puts "Printing Averages on: "+results[0].to_s+"ns"
    puts "Average-Average: "+AvgOfAvg(results).to_s+"ns"
    puts "Average-Median: "+AvgOfMed(results).to_s+"ns"
    puts "Average-High: " +AvgOfHigh(results).to_s+"ns"
    puts "Average-Low: " +AvgOfLow(results).to_s+"ns"
  end


  def AvgOfAvg(results)
    total = 0
    results.each {|i|
      total += i.avg
    }
    return (total/results.size).round

  end

  def AvgOfMed(results)
    total = 0
    results.each {|i|
      total += i.med
    }
    return (total/results.size).round

  end

  def AvgOfHigh(results)
    total = 0
    results.each {|i|
      total += i.high
    }
    return (total/results.size).round

  end

  def AvgOfLow(results)
    total = 0
    results.each {|i|
      total += i.low
    }
    return (total/results.size).round

  end



end