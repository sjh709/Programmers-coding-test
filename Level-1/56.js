function solution(survey, choices) {
    let arr = [['R', 'T'], ['C', 'F'], ['J', 'M'], ['A', 'N']];
    let score = {
        'R' : 0,
        'T' : 0,
        'C' : 0,
        'F' : 0,
        'J' : 0,
        'M' : 0,
        'A' : 0,
        'N' : 0,
    };
    let answer = '';
    
    for(let i = 0; i < survey.length; i++) {
        if(choices[i] < 4) {
            score[survey[i][0]] += (4 - choices[i]);
        }else if(choices[i] > 4) {
            score[survey[i][1]] += (choices[i] - 4);
        }
    }
    
    arr.forEach(([a, b]) => {
        if(score[a] < score[b]) {
            answer += b;
        }else {
            answer += a;
        }
    });
    
    return answer;
}
