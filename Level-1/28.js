function solution(phone_number) {
    const answer = phone_number.slice(phone_number.length - 4);
    return '*'.repeat(phone_number.length - 4) + answer;
}
