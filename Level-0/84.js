function solution(my_string) {
    let answer = 0;
    let oper = '';
    my_string.split(' ').forEach((v, i) => {
        if(i === 0) {
            answer += parseInt(v);
        }else {
            if(v === '+' || v === '-') {
                oper = v;
            }else {
                if(oper === '+') {
                    answer += parseInt(v);
                }else if(oper === '-') {
                    answer -= parseInt(v);
                }
            }
        }
    });
    return answer;
}
