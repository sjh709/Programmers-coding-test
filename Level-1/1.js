function solution(nums) {
    const max = nums.length / 2;
    const answer = new Set(nums).size;
    return max < answer ? max : answer;
}
