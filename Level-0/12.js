function solution(array) {
    let answer = 0;
    array.sort((a, b)=>{
       return a - b; 
    });
    answer = Math.floor(array.length / 2);
    return array[answer];
}
