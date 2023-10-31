function solution(cipher, code) {
    const arr = cipher.split("");
    let answer = "";
    for(let i = 0; i < arr.length; i++) {
        if((i + 1) % code === 0) {
            answer += arr[i];
        }
    }
    return answer;
}
