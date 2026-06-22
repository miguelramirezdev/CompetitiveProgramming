const countBy = (x, n) => {
    let result = [];
    for (let index = 1 ; index <= n ; index++) {
        result.push(x * index);
    }
    return result;
};
console.log(countBy(2,5));