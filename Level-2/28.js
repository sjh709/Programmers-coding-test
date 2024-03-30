function solution(cacheSize, cities) {
    let answer = 0;
    let cacheArr = [];
    
    if(cacheSize === 0) return cities.length * 5;
    
    cities.forEach((city) => {
        city = city.toLowerCase();
        if(cacheArr.includes(city)) {
            cacheArr.splice(cacheArr.indexOf(city), 1);
            cacheArr.push(city);
            answer += 1;
        }else {
            if(cacheArr.length === cacheSize) cacheArr.shift();
            cacheArr.push(city);
            answer += 5;
        }
    })
    
    return answer;
}
