class Solution {
    
    public boolean check(int x, int y, char[][] position) {
        // PP
        if(y < 4 && position[x][y + 1] == 'P') return false;
        if(x < 4 && position[x + 1][y] == 'P') return false;
        
        // POP
        if(y < 3 && position[x][y + 1] == 'O' && position[x][y + 2] == 'P') return false;
        if(x < 3 && position[x + 1][y] == 'O' && position[x + 2][y] == 'P') return false;
        
        // PX  PO  PO
	// OP  XP  OP
        if(x < 4 && y < 4 && position[x + 1][y + 1] == 'P'
				    	  && (position[x][y + 1] == 'O' || position[x + 1][y] == 'O')) return false;
        
        // OP  XP  OP
	// PX  PO  PO
        if(x < 4 && y > 0 && position[x + 1][y - 1] == 'P'
						  && (position[x + 1][y] == 'O' || position[x][y - 1] == 'O')) return false;
        
        return true;
    }
    
    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        
        for(int i = 0; i < 5; i++) {
            char[][] position = new char[5][5];
            int check = 1;
            for(int j = 0; j < 5; j++) {
                for(int k = 0; k < 5; k++) {
                    position[j][k] = places[i][j].charAt(k);
                }
            }
            
            for(int j = 0; j < 5; j++) {
                for(int k = 0; k < 5; k++) {
                    if(position[j][k] == 'P') {
                        if(!check(j, k, position)) {
                            check = 0;
                            break;
                        }
                    }
                }
                
                if(check == 0) break;
            }
            
            answer[i] = check;
        }
        
        return answer;
    }
}
