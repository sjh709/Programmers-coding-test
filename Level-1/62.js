function solution(food) {
    let answer = '';
    
    for(let i = 1; i < food.length; i++) {
        food[i] = Math.floor(food[i] / 2);
        answer += String(i).repeat(food[i]);
    }
    
    let reverse = answer.split('').reverse().join('');
    
    return answer + '0' + reverse;
}
