const squareSum = (numbers) =>{
  const initialValue = 0;  
  const sum = numbers.reduce((accumulator, currentValue) => accumulator + Math.pow(currentValue, 2), initialValue);
  return sum;
}