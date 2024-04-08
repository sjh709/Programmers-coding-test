function solution(progresses, speeds) {
    const answer = [];
    const arr = [];
    for(let i = 0; i < progresses.length; i++) {
        arr[i] = Math.ceil((100 - progresses[i]) / speeds[i]);
    }
    
    let cnt = 1;
    let day = arr[0];
    for(let i = 1; i < arr.length; i++) {
        if(arr[i] <= day) {
            cnt++;
        }else {
            answer.push(cnt);
            day = arr[i];
            cnt = 1;
        }
    }
    answer.push(cnt);
    
    return answer;
}
