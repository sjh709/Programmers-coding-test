function solution(s) {
    let answer = 0;
    let z = 0;
    s.split(" ").map((n) => {
        if(n === "Z") {
            answer -= Number(z);
        }else {
            answer += Number(n);
            z = n;
        }
    });
    return answer;
}
