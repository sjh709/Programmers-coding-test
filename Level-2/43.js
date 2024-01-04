function solution(citations) {
    citations.sort((a, b) => a - b);
    let h = 0;
    let answer = 0;
    while(true) {
        let cnt = 0;
        citations.forEach(v => v >= h ? cnt++ : '');
        if(cnt < h) break;
        answer = Math.max(answer, h++);
    }
    return answer;
}
