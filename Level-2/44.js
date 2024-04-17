function solution(name) {
    let answer = 0;
    let minMove = name.length - 1;
    
    [...name].map((v, i) => {
        answer += Math.min(v.charCodeAt() - 65, 91 - v.charCodeAt());
        let next = i + 1;
        
        while(next < name.length && name[next] === 'A') {
            next++;
        }
        
        // BBBAAAAAABA인 경우는 다시 왼쪽으로 돌아가는 것이 더 빠르다.
        // 처음 위치로 돌아간 횟수(i*2) + 문자열길이 - A가 연속으로 나오는 지점의 다음값
        const toBack = name.length - next;
        // 오른쪽으로 가기, 왼쪽으로 가기, 뒤의 요소 먼저 입력
        minMove = Math.min(minMove, (i * 2) + toBack, i + (2 * toBack));
    });
    
    return answer + minMove;
}
