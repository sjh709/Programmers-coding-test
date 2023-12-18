function solution(s, n) {
    let answer = '';
    for(let i = 0; i < s.length; i++) {
        if(s[i] === ' ') {
            answer += ' ';
            continue;
        }
        answer += String.fromCharCode((s.charCodeAt(i) > 90 ? (s.charCodeAt(i) + n - 97) % 26 + 97 : (s.charCodeAt(i) + n - 65) % 26 + 65));
    }
    return answer;
}
