function solution(progresses, speeds) {
    let day = 0, count = 0;
    let arr = [];
    progresses.map((v) => 100 - v)
              .map((v, index) => Math.ceil(v / speeds[index]))
              .map((v) => {
                if(day < v) {
                    if(count !== 0) arr.push(count);
                    count = 1;
                    day = v;
                }else {
                    count++;
                }
              });
    arr.push(count);
    return arr;
}
