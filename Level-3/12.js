function solution(genres, plays) {
    let map = new Map();
    const list = [];
    let answer = [];
    
    for(let i = 0; i < genres.length; i++) {
        list.push([genres[i], plays[i], i]);
        if(map.has(genres[i])) {
            map.set(genres[i], map.get(genres[i]) + plays[i]);
        }else {
            map.set(genres[i], plays[i]);
        }
    }
    
    map = new Map([...map].sort((a, b) => b[1] - a[1]));
    list.sort((a, b) => {
        if(a[1] > b[1]) {
            return -1;
        }else if(a[1] < b[1]) {
            return 1;
        }else {
            if(a[2] > b[2]) {
                return 1;
            }else if(a[2] < b[2]) {
                return -1;
            }else {
                return 0;
            }
        }
    });
    
    for(let key of map.keys()) {
        let cnt = 0;
        for(let i of list) {
            if(key === i[0] && cnt < 2) {
                answer.push(i[2]);
                cnt += 1;
            }
        }
    }
    
    return answer;
}
