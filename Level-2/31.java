class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        int answerTime = 0;
        m = m.replaceAll("C#", "H");
        m = m.replaceAll("D#", "I");
        m = m.replaceAll("F#", "J");
        m = m.replaceAll("G#", "K");
        m = m.replaceAll("A#", "L");
        for(int i = 0; i < musicinfos.length; i++){
            String[] s = musicinfos[i].split("[:,]");
            int startTime = 60 * Integer.parseInt(s[0]) + Integer.parseInt(s[1]);
            int endTime = 60 * Integer.parseInt(s[2]) + Integer.parseInt(s[3]);
            int playTime = endTime - startTime;
            String musicName = s[4];
            String melody = s[5];
            
            melody = melody.replaceAll("C#", "H");
            melody = melody.replaceAll("D#", "I");
            melody = melody.replaceAll("F#", "J");
            melody = melody.replaceAll("G#", "K");
            melody = melody.replaceAll("A#", "L");
            
            if(melody.length() > playTime){
                melody = melody.substring(0, playTime);
            }else{
                while(melody.length() < playTime){
                    melody += melody;
                }
            }
            
            if(melody.contains(m)){
                if(answerTime < playTime){
                    answer = musicName;
                    answerTime = playTime;
                }
            }
        }
        return answer;
    }
}
