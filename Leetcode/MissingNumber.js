var missingNumber = function (nums) {
  const n = nums.length;
  const totalSum = (n * (n + 1)) / 2;
  const actualSum = nums.reduce((acc, item) => acc + item);
  return  totalSum - actualSum;
};


const person = [];
person["firstName"] = "John";
person["lastName"] = "Doe";
person["age"] = 46;



console.log(person[0]);