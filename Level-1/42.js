function solution(numbers, hand) {
    let answer = '';
    let left = '*';
    let right = '#';
    
    const findKey = (num) => {
        const numArr = [[1, 2, 3], [4, 5, 6], [7, 8, 9], ['*', 0, '#']];
        for(let i = 0; i < 4; i++) {
            for(let j = 0; j < 3; j++) {
                if(numArr[i][j] === num) return [i, j];
            }
        }
    };
    
    numbers.forEach((key) => {
        if(key === 1 || key === 4 || key === 7) {
            answer += 'L';
            left = key;
        }else if(key === 3 || key === 6 || key === 9) {
            answer += 'R';
            right = key;
        }else {
            const leftKey = findKey(left);
            const rightKey = findKey(right);
            const currKey = findKey(key);
            const leftDist = Math.abs(currKey[0] - leftKey[0]) + Math.abs(currKey[1] - leftKey[1]);
            const rightDist = Math.abs(currKey[0] - rightKey[0]) + Math.abs(currKey[1] - rightKey[1]);
            
            if(leftDist < rightDist) {
                answer += 'L';
                left = key;
            }else if(leftDist > rightDist) {
                answer += 'R';
                right = key;
            }else {
                if(hand === 'left') {
                    answer += 'L';
                    left = key;
                }else {
                    answer += 'R';
                    right = key;
                }
            }
        }
    });
    
    return answer;
}
