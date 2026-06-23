const vowels = new Set(["a", "e", "i", "o", "u"]);
const isVowel =(char) =>{
    return vowels.has(char.toLowerCase());
}
const isVow = (numbers) =>
  numbers.map((num) => {
    const char = String.fromCharCode(num);
    return isVowel(char) ? char : num;
  });
console.log(isVow([100,100,116,105,117,121]));