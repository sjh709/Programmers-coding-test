function solution(s){
    let arr = [];
    
    for(let i = 0; i < s.length; i++) {
        if(s[i] === '(') {
            arr.push(s[i]);
        }else {
            if(arr.length) {
                if(arr[arr.length - 1] === '('){
                    arr.pop();
                }else if(arr[arr.length - 1] === ')') {
                    return false;
                }
            }else {
                return false;
            }
        }
    }
    
    return arr.length ? false : true;
}
