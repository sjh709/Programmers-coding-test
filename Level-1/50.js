function solution(s) {
    const nums = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine'];
    let answer = s;
    
    nums.forEach((num, index) => {
        answer = answer.split(num).join(index);
    });
    
    return Number(answer);
}
