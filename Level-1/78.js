function solution(bandage, health, attacks) {
    const max = health;
    
    let time = 0;
    let cnt = 0;
    
    attacks.sort((a, b) => a[0] - b[0]);
    
    while(true) {
        if(time === attacks[0][0]) {
            health -= attacks[0][1];
            cnt = 0;
            attacks.shift();
        }else {
            health += bandage[1];
            if(cnt === bandage[0]) {
                health += bandage[2];
                cnt = 0;
            }
            if(health > max) health = max;
        }
        
        if(health < 0 || !attacks.length) break;
        
        time += 1;
        cnt += 1;
    }
    
    return health <= 0 ? -1 : health;
}
