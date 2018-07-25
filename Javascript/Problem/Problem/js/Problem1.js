function Problem1(list, k, exp) {
    this.list = list;
    this.k = k;
    this.exp = exp;
}

Problem1.prototype.Calculate = function () {
    var res = false;
    const set = new Set([]);
    this.list.forEach(function (element) {
        if (set.has(element)) {
            res = true;
            return res;
        }
        set.add(this.k - element);
    });
    return res === exp;
}