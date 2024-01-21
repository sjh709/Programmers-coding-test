function solution(lottos, win_nums) {
    const rank = {
        0 : 6,
        1 : 6,
        2 : 5,
        3 : 4,
        4 : 3,
        5 : 2,
        6 : 1,
    };
    
    lottos.sort((a, b) => a - b);
    win_nums.sort((a, b) => a - b);
    
    let num_cnt = 0, zero_cnt = 0;
    lottos.forEach((lotto) => {
        win_nums.forEach((win_num) => {lotto === win_num ? num_cnt++ : ''});
        lotto === 0 ? zero_cnt++ : '';
    });
    
    return [rank[num_cnt + zero_cnt], rank[num_cnt]];
}
