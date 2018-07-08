class Experimenter {
    RunExperiment(problem) {
        var measurements = [];
        var res = false;
        var i;
        for (i = 0; i < 100; i++) {
            var start = performance.now();
            var tempres = problem.Calculate();
            var dur = performance.now() - start;
            measurements.push(dur);
            if (tempres != problem.exp) {
                console.log("Something went wrong!");
            }
        }
        var resultString = "\nRunning Experiment on: " + problem.constructor.name + "\nMedian: " + String(this.Median(measurements) * 1000000) + "ns \nAverage: " + String(this.Average(measurements) * 1000000)+"ns";
        return resultString;


    }

    Average(numbers) {
        var total = 0;
        numbers.forEach(function (element) {
            total += element;
        })
        return total / numbers.length;
    }

    Median(numbers) {
        numbers.sort();
        return numbers[numbers.length / 2];
    }
}