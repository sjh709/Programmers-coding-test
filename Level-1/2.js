function solution(a, b) {
    const dayList = ['FRI', 'SAT', 'SUN', 'MON', 'TUE', 'WED', 'THU'];
    const monthArr = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
    let day = b - 1;
    
    if(a > 1) {
        for(let i = 0; i < a - 1; i++) {
            day += monthArr[i];
        }
    }
    
    return dayList[day % 7];
}
