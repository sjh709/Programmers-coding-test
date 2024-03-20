function solution(arr1, arr2) {
    const answer = Array.from(Array(arr1.length), () => new Array(arr2[0].length).fill(0));
    const n = arr2.length;
    
    for(let i = 0; i < answer.length; i++) {
        for(let j = 0; j < answer[i].length; j++) {
            for(let k = 0; k < n; k++) {
                answer[i][j] += arr1[i][k] * arr2[k][j];
            }
        }
    }
    
    return answer;    
}
