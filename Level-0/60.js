function solution(spell, dic) {
    return dic.some(d => spell.sort().toString() === [...d].sort().toString()) ? 1 : 2;
}
