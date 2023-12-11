function solution(s){
    let [pcnt, ycnt] = [0, 0];
    s.toLowerCase().split('').forEach(v => {
        if(v === 'p') {
            pcnt++;
        }else if(v === 'y') {
            ycnt++;
        }
    });
    return pcnt !== ycnt ? false : true;
}
