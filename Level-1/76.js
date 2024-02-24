function solution(name, yearning, photo) {
    const obj = {};
    
    for(let i = 0; i < name.length; i++) {
        obj[name[i]] = yearning[i];
    }
    
    return photo.map((item) => {
        return item.reduce((acc, cur) => {
            if(obj[cur]) {
                return acc + obj[cur];
            }
            return acc;
        }, 0);
    });
}
