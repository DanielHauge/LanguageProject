class Experimenter {
    RunExperiment(problem) {
        var measurements = [];
        var res = false;
        var i;
        for (i = 0; i < 100000; i++) {
            var start = performance.now();
            var tempres = problem.Calculate();
            var dur = performance.now() - start;
            measurements.push(dur);
            if (!tempres) {
                console.log("Something went wrong!");
            }
        }
        //var resultString = "\nRunning Experiment on: " + problem.constructor.name + "\nMedian: " + String(this.Median(measurements) * 1000000) + "ns \nAverage: " + String(this.Average(measurements) * 1000000) + "ns";
        var results = new Result(problem.constructor.name, measurements, this.Average(measurements) * 1000000, this.Median(measurements) * 1000000, this.High(measurements) * 1000000, this.Low(measurements) * 1000000);
        console.log(results);
        return results;

    
    }

    Average(numbers) {
        if (numbers.legnth != 0) {


            var total = 0;
            numbers.forEach(function (element) {
                total += element;
            })
            return total / numbers.length;
        } else {
            return 0;
        }
    }

    Median(numbers) {
        numbers.sort();
        return numbers[numbers.length / 2];
    }
    High(numbers) {
        numbers.sort();
        return numbers[numbers.length-1];
    }
    Low(numbers) {
        numbers.sort();
        return numbers[0];
    }
}