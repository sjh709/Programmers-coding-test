function solution(players, callings) {
    const obj = {};
    
    players.forEach((player, index) => obj[player] = index);
    
    for(let calling of callings) {
        const idx = obj[calling];
        const temp = players[idx - 1];
        
        [players[idx], players[idx - 1]] = [players[idx - 1], players[idx]];
        
        [obj[calling], obj[temp]] = [obj[temp], obj[calling]];
    }
    
    return players;
}
