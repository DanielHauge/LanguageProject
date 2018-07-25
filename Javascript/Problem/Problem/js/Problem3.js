function Problem3(list, exp) {
    this.list = list;
    this.exp = exp;
}

Problem3.prototype.Calculate = function () {


    var counter = 0;
    const set = new Set([]);
    this.list.forEach(function (element) {
        if (element == counter + 1) {
            counter++;
            while (set.has(counter + 1)) {
                counter++;
            }
        } else {
            set.add(element);
        }
    });

    return counter+1 == this.exp;
};