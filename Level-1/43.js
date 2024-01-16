function solution(numbers) {
    const set = new Set();
    
    numbers.forEach((number, index) => {
        for(let i = 0; i < numbers.length; i++) {
            if(index !== i) {
                set.add(number + numbers[i]);
            }
        }
    });
    
    return [...set].sort((a, b) => a - b);
}
