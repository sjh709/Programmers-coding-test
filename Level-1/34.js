function solution(n, arr1, arr2) {
    let answer = [];
    
    for(let i = 0; i < n; i++) {
        let a = arr1[i].toString(2);
        let b = arr2[i].toString(2);
        a = '0'.repeat(n - a.length) + a;
        b = '0'.repeat(n - b.length) + b;
        
        let s = '';
        for(let j = 0; j < n; j++) {
            if(a[j] === '1' || b[j] === '1') {
                s += '#';
            }else {
                s += ' ';
            }
        }
        
        answer.push(s);
    }
    
    return answer;
}
