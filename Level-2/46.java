class Solution {
    public int solution(String name) {
        int answer = 0;
        int min = name.length() - 1;
        for(int i = 0; i < name.length(); i++) {
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);
            int next = i + 1;
            // 현재 알파벳 위치에서 A가 아닌 다음 알파벳의 위치를 찾음
            while(next < name.length() && name.charAt(next) == 'A') {
                next++;
            }
            // 현재 알파벳에서 next까지 역으로(왼쪽) 탐색할때 이동횟수
            // i + i : 내 위치에서 첫 위치까지 돌아감
            // name.length() - next : 총 길이에서 현재 바로 다음에 연속된 A가 지나고 남은 문자 개수
            // 순방향과 역방향 탐색 중 최소 횟수 저장
            // 오른쪽 -> 제자리 -> 왼쪽
            // i + i + name.length() - next;
            min = Math.min(min, i * 2 + name.length() - next);
            // 왼쪽 -> 제자리 -> 오른쪽
            min = Math.min(min, (name.length() - next) * 2 + i);
        }
        
        return answer + min;
    }
}
