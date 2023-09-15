function solution(age) {
    const answer = age.toString().split("").map((age) => {
        return "abcdefghij"[age];
    }).join("");
    return answer;
}
