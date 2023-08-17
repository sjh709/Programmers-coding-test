function solution(numer1, denom1, numer2, denom2) {
    const numerTotal = (numer1 * denom2) + (numer2 * denom1);
    const denomTotal = denom1 * denom2;
    
    function gcd(a, b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    
    const gcdNum = gcd(numerTotal, denomTotal);
    const result = [numerTotal / gcdNum, denomTotal / gcdNum];
    
    return result;
}
