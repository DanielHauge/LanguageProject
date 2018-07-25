class Result {
    constructor(name, mes, avg, med, h, l) {
        this.name = name;
        this.mes = mes;
        this.avg = avg;
        this.med = med;
        this.h = h;
        this.l = l;
    }

    PrintMe() {
        var returnstring = String(this.name) + " results:\n" + "Median: " + Math.round(this.med) + "ns\n" + "Average: " + String(Math.round(this.avg)) + "ns\n" + "High: " + String(Math.round(this.h)) + "ns\t\tLow: " + String(Math.round(this.l)) + "ns\n\n==============================\n";
        return returnstring;
    }

}

function StringAverages(allresults) {
    var returnstring = "Average-Average: " + Math.round(AverageOfAverage(allresults)) + "    Average-Median: " + Math.round(AverageOfMedian(allresults)) + "     Average-High: " + Math.round(AverageOfHigh(allresults)) + "      Average-Low: " + Math.round(AverageOfLows(allresults));
    return returnstring;
}

function AverageOfAverage(allresults) {
    var total = 0;
    allresults.forEach(function (element) {
        total += element.avg;
    })
    return total / allresults.length;
}

function AverageOfMedian(allresults) {
    var total = 0;
    allresults.forEach(function (element) {
        total += element.med;
    })
    return total / allresults.length;

}

function AverageOfHigh(allresults) {
    var total = 0;
    allresults.forEach(function (element) {
        total += element.h;
    })
    return total / allresults.length;

}

function AverageOfLows(allresults) {
    var total = 0;
    allresults.forEach(function (element) {
        total += element.l;
    })
    return total / allresults.length;

}



