function solution(word) {
    const result = [];
    const str = '';
    
    const dfs = (str, length, result) => {
        const vowels = [...'AEIOU'];
        
        if(str.length === length) {
            result.push(str);
            return;
        }
        
        vowels.forEach((vowel) => {
            dfs(str + vowel, length, result);
        });
    };
    
    for(let i = 1; i <= 5; i++) dfs(str, i, result);
    
    return result.sort().indexOf(word) + 1;
}
