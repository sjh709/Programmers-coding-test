function solution(today, terms, privacies) {
    const answer = [];
    const termType = {};
    
    const [cYear, cMonth, cDay] = today.split('.').map(v => +v);
    
    terms.forEach((item) => {
        const [type, term] = item.split(' ');
        termType[type] = +term;
    });
    
    privacies.forEach((item, index) => {
        const [date, type] = item.split(' ');
        const [year, month, day] = date.split('.').map(v => +v);
        
        let limitYear = year + Math.floor(termType[type] / 12),
            limitMonth = month + termType[type] % 12,
            limitDay = day - 1;
        
        if(limitDay === 0) {
            limitDay = 28;
            limitMonth -= 1;
        }
        
        if(limitMonth > 12) {
            limitMonth %= 12;
            limitYear += 1;
        }
        
        if(cYear > limitYear) {
            answer.push(index + 1);
        }else if(cYear === limitYear && cMonth > limitMonth) {
            answer.push(index + 1);
        }else if(cYear === limitYear && cMonth === limitMonth && cDay > limitDay) {
            answer.push(index + 1);
        }
    });
    
    return answer;
}
