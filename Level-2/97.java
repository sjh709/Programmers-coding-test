import java.util.*;
class Solution {
    public int getTime(String s) {
        String[] time = s.split(":");
        int hour = Integer.parseInt(time[0]);
        int min = Integer.parseInt(time[1]);
        return hour * 60 + min;
    }
    public int solution(String[][] book_time) {
        int answer = 0;
        
        int[][] bookTime = new int[book_time.length][];
        for(int i = 0; i < book_time.length; i++) {
            bookTime[i] = new int[]{getTime(book_time[i][0]), getTime(book_time[i][1]) + 10};
        }
        
        Arrays.sort(bookTime, (a, b) -> a[0] - b[0]);
        
        PriorityQueue<Integer> room = new PriorityQueue<>();
        for(int i = 0; i < bookTime.length; i++) {
            while(!room.isEmpty() && room.peek() <= bookTime[i][0]) {
                room.poll();
            }
            room.offer(bookTime[i][1]);
            answer = Math.max(answer, room.size());
            // if(!room.isEmpty() && room.peek() <= bookTime[i][0]) {
            //     room.poll();
            //     room.offer(bookTime[i][1]);
            // }else {
            //     room.offer(bookTime[i][1]);
            //     answer++;
            // }
        }
        
        return answer;
    }
}
