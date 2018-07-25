class ExperimentResults


  def initialize(name, mes, avg, med, high, low)
    @@name = name
    @@mes = mes
    @@avg = avg
    @@med = med
    @@high = high
    @@low = low
  end



  def PrintSelf()

    puts @@name+" Results: "
    puts "Median: "+@@med.round.to_s+"ns"
    puts "Average: "+@@avg.round.to_s+"ns"
    puts "High: "+@@high.round.to_s+"ns"
    puts "Low: " + @@low.round.to_s+ "ns"
    puts ""
    puts "===================="
    puts ""
  end

  def name
    @@name
  end

  def mes
    @@mes
  end

  def avg
    @@avg
  end

  def med
    @@med
  end

  def high
    @@high
  end

  def low
    @@low
  end


end