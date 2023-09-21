function solution(rsp) {
    let answer = "";
    const obj = {2 : 0,
                0 : 5,
                5 : 2};
    rsp.split("").map(s => answer += obj[s]);
    return answer;
}
