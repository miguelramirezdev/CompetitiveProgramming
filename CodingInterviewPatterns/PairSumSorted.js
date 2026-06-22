function pair_sum_sorted(nums, target) {
  let l = 0,
    r = nums.length - 1,
    sum;
  while (l < r) {
    sum = nums[l] + nums[r];

    if (sum === target) {
      return [l, r];
    }
    if (sum < target) {
      l++;
    } else if (sum > target) {
      r--;
    }
  }
  return [];
}

let nums = [1,2,3,4,5],
  target = 10;
console.log(pair_sum_sorted(nums, target));
