function solution(priorities, location) {
    let answer = 0;
    let arr = Array.from({length: priorities.length}, (v, i) => i);
    let max = 0;
    
    while(priorities.length) {
        max = Math.max(...priorities);
        
        if(priorities[0] < max) {
            priorities.push(priorities.shift());
            arr.push(arr.shift());
        }else {
            answer++;
            priorities.shift();
            if(arr.shift() === location) {
                return answer;
            }
        }
    }
}
