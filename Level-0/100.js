function solution(babbling) {
    let answer = 0;
    babbling.forEach((v) => {
        if(v.replaceAll(/(aya|ye|woo|ma)/g, '').length === 0) answer++;
    });
    return answer;
}
