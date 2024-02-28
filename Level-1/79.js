function solution(friends, gifts) {
    let max = 0;
    const arr = Array.from(new Array(friends.length), () => new Array(friends.length).fill(0));
    
    // 선물지수
    const getCount = (a, b) => {
        let [cntA, cntB] = [0, 0];
        for(let i = 0; i < arr.length; i++) {
            for(let j = 0; j < arr[i].length; j++) {
                if(i === a) cntA += arr[i][j];
                if(j === a) cntA -= arr[i][j];
                if(i === b) cntB += arr[i][j];
                if(j === b) cntB -= arr[i][j];
            }
        }
        return [cntA, cntB];
    };
    
    gifts.forEach((gift) => {
        const [a, b] = gift.split(' ');
        arr[friends.indexOf(a)][friends.indexOf(b)]++;
    });
    
    for(let i = 0; i < arr.length; i++) {
        let cnt = 0;
        for(let j = 0; j < arr[i].length; j++) {
            if(i === j) continue;
            
            if(arr[i][j] === arr[j][i]) {
                let [cntA, cntB] = getCount(i, j);
                if(cntA > cntB) cnt++;
            }
            
            if(arr[i][j] > arr[j][i]) cnt++;
        }
        
        max = Math.max(max, cnt);
    }
    
    return max;
}
