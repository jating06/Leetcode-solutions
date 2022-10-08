class Solution {
    public String convert(String s, int numRows) {
        int arr[] = new int[s.length()];
        boolean inc = true;
        boolean dec = false;
        int a = 0;
        for(int i = 0 ; i<s.length();i++){
              if(inc && a!=numRows-1){
                  arr[i] = a;
                  a++;
              }
            else if(dec && a!=0){
                 arr[i] = a;
                  a--;
            }
             if(a==0){
                dec = false;
                inc = true;
            }
            else if(a==numRows-1){
                dec = true;
                inc = false;
            }
        }
        String ret = "";
        int rows = 0;
       
        while(true){
         
        for(int j = 0 ; j<s.length();j++){
            if(arr[j]==rows){
                
                ret+=s.charAt(j);
            }
            
        }
            rows++;
            if(rows==numRows){
                break;
            }
            
        }
        return ret;
    }
}