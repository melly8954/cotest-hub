class Solution {
    public int solution(int n) {
        int order = 0;        
        int villageNumber = 0;
        
        while(order < n) {
            villageNumber ++;
            
            if(villageNumber % 3 == 0 || String.valueOf(villageNumber).contains("3")){
                continue;
            }
        
            order ++;
        }
        
        return villageNumber;
    }
}
