function solution(m, n, puddles) {
    const dp = new Array(n + 1).fill().map(v => new Array(m + 1).fill(0));
    
    for(let i = 1; i <= n; i++) {
        for(let j = 1; j <= m; j++) {
            if(i === 1 && j === 1) {
                dp[i][j] = 1;
                continue;
            }
            
            if(isPuddle(i, j, puddles)) continue;
            
            dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % 1000000007;
        }
    }
    
    return dp[n][m];
}

const isPuddle = (i, j, puddles) => {
    for(let puddle of puddles) {
        if(puddle[1] === i && puddle[0] === j) {
            return true;
        }
    }
    return false;
} 
