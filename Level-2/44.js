function solution(numbers) {
    const arr = numbers.split('');
    const set = new Set();
    
    const isPrimeNum = (num) => {
        if(num <= 1) return false;
        for(let i = 2; i <= Math.sqrt(num); i++) {
            if(num % i === 0) return false;
        }
        return true;
    };
    
    const getPermutation = (arr, str) => {
        if(arr.length) {
            for(let i = 0; i < arr.length; i++) {
                let copy = [...arr];
                copy.splice(i, 1);
                getPermutation(copy, str + arr[i]);
            }
        }
        
        if(isPrimeNum(Number(str))) set.add(Number(str));
    };
    
    getPermutation(arr, '');
    
    return set.size;
}
