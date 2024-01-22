function solution(arr) {
    let answer = [arr[0]];
    for(let i = 1; i < arr.length; i++) {
        if(arr[i] !== answer[answer.length - 1]) {
            answer.push(arr[i]);
        }
    }
    return answer;
}

// function solution(arr) {
//     let answer = [];
    
//     arr.forEach((v) => {
//         if(answer.length) {
//             if(answer[answer.length - 1] !== v) answer.push(v);
//         }else {
//             answer.push(v);
//         }
//     });
    
//     return answer;
// }
