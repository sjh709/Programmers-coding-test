function solution(routes) {
    let answer = 0;
    let camera = -30001;
    
    routes.sort((a, b) => a[1] - b[1]);
    
    for(let i = 0; i < routes.length; i++) {
        if(camera < routes[i][0]) {
            answer++;
            camera = routes[i][1];
        }
    }
    
    return answer;
}
