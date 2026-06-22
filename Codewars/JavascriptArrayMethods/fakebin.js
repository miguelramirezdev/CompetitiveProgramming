const fakeBin = (numbers) =>
    numbers.split("").map((num) =>(num < 5 ? "0" : "1")).join("");

console.log(fakeBin('45385593107843568'));
