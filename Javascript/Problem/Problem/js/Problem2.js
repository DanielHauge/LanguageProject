function Problem2(list, exp) {
    this.list = list;
    this.exp = exp;
}

Problem2.prototype.Calculate = function () {
    var res = [this.list.length]
    for (i = 0; i < this.list.length; i++) {

        var total = 1;

        for (j = 0; j < this.list.length; j++) {

            if (j !== i) {
                total = total * this.list[j];
            }

        }
        res[i] = total;
    }

    console.log(res)
    return true;
}