function solution(k, score) {
    const answer = [];
    const rank = [];
    
    score.map((v, i) => {
        if(i < k) rank.push(v);
        else {
            const min = rank[rank.length - 1];
            if(min < v) {
                rank.pop();
                rank.push(v);
            }
        }
        rank.sort((a, b) => b - a);
        answer.push(rank[rank.length - 1]);
    });
    
    return answer;
}
