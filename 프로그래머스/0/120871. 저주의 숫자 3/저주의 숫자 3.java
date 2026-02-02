class Solution {
    public int solution(int n) {
        int number = 0;        
        int villageNumber = 0;
        
        while(number < n) {
            villageNumber ++;
            
            if(villageNumber % 3 == 0 || String.valueOf(villageNumber).contains("3")){
                continue;
            }
        
            number ++;
        }
        
        return villageNumber;
    }
}
