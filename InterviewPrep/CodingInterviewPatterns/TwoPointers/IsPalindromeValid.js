function is_palindrome_valid(s) {
  let validString = s.replace(/[^a-zA-Z0-9]/g, "");
  let l = 0,
    r = validString.length - 1;
  while (l <= r) {
    if (validString[l] !==  validString[r]) {
      return false;
    }
    l++;
    r--;
  }
  return true;
}

let s = "byteetyb";
console.log(is_palindrome_valid(s));
