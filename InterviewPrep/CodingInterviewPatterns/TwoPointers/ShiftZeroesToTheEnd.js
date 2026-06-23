function shift_zeroes_to_the_end(nums) {
let l = 0, r = 0;
while (r < nums.length) {
    if (nums[r] !== 0) {
        let temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
        l++;
    }
    r++;
}
return nums;
}

console.log(shift_zeroes_to_the_end([0, 1, 0, 3, 2]));
