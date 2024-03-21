function solution(s) {
    const answer = s.split(' ').map(el => {
        let s = '';
        for(let i = 0; i < el.length; i++) {
            if(i === 0) s += el[i].toUpperCase();
            else s += el[i].toLowerCase();
        }
        return s;
    });
    
    return answer.join(' ');
}
