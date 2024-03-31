function solution(m, musicinfos) {
    let answer = [];
    m = filterString(m);
    
    for(let i = 0; i < musicinfos.length; i++) {
        let temp = musicinfos[i].split(',');
        let [start, end, title, code] = temp;
        code = filterString(code);
        
        let play_time = countTime(start, end);
        
        if(play_time < code.length) {
            code = code.slice(0, play_time);
        }else {
            code = code.repeat(Math.ceil(play_time / code.length));
        }
        
        if(code.includes(m)) {
            answer.push([play_time, title]);
        }
    }
    
    answer.sort((a, b) => b[0] - a[0]);
    
    return answer.length === 0 ? '(None)' : answer[0][1];
}

function filterString(string) {
    let result = string.replace(/(C#)/g, 'c')
                       .replace(/(D#)/g, 'd')
                       .replace(/(F#)/g, 'f')
                       .replace(/(G#)/g, 'g')
                       .replace(/(A#)/g, 'a');
    return result;
}

function countTime(start, end) {
    let [s_h, s_m] = start.split(':');
    let [e_h, e_m] = end.split(':');
    return (e_h - s_h) * 60 + (e_m - s_m);
}
