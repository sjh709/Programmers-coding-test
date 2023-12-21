function solution(participant, completion) {
    const map = new Map();
    participant.forEach(v => map.has(v) ? map.set(v, map.get(v) + 1) : map.set(v, 1));
    completion.forEach(v => map.set(v, map.get(v) - 1));
    for(const [key, value] of map) {
        if(value) return key;
    }
}
