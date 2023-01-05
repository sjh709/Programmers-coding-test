import java.util.*;

class Data {
    String time;
    String number;
    String check;
    int price;
    
    Data(String time, String number, String check) {
        this.time = time;
        this.number = number;
        this.check = check;
    }
    
    Data(String number, int price) {
        this.number = number;
        this.price = price;
    }
}

class Solution {
    public int[] solution(int[] fees, String[] records) {
        int[] answer;
        
        Map<String, Data> map = new HashMap<>();
        Map<String, Integer> priceMap = new HashMap<>();
        List<Data> list = new ArrayList<>();
        
        for(int i = 0; i < records.length; i++) {
            String record = records[i];
            String time = record.split(" ")[0];
            String number = record.split(" ")[1];
            String check = record.split(" ")[2];
            if(!map.containsKey(number)) {
                map.put(number, new Data(time, number, check));
            }else {
                Data d = map.get(number);
                int h = Integer.parseInt(time.split(":")[0]) - Integer.parseInt(d.time.split(":")[0]);
                int m = Integer.parseInt(time.split(":")[1]) - Integer.parseInt(d.time.split(":")[1]);
                map.remove(number);
                priceMap.put(number, priceMap.getOrDefault(number, 0) + (60 * h + m));
            }
        }
        
        for(String s : map.keySet()) {
            Data d = map.get(s);
            int h = 23 - Integer.parseInt(d.time.split(":")[0]);
            int m = 59 - Integer.parseInt(d.time.split(":")[1]);
            //map.remove(s); // 런타임 에러
            priceMap.put(s, priceMap.getOrDefault(s, 0) + (60 * h + m));
        }
        
        for(String key : priceMap.keySet()) {
            int value = priceMap.get(key);
            if(value <= fees[0]) {
                priceMap.put(key, fees[1]);
            }else {
                int result = (int)(fees[1] + Math.ceil((value - fees[0]) / (double)fees[2]) * fees[3]);
                priceMap.put(key, result);
            }
        }
        
        for(String key : priceMap.keySet()) {
            list.add(new Data(key, priceMap.get(key)));
        }
        list.sort((a, b) -> (a.number).compareTo(b.number));
        
        answer = new int[list.size()];
        int cnt = 0;
        
        for(Data d : list) {
            answer[cnt++] = d.price;
        }
        
        return answer;
    }
}
