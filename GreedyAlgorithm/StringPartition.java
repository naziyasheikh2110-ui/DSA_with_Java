package GreedyAlgorithm;

public class StringPartition {
    public static void main(String[]args){
        String str = "LRRRRLLRLLRL";
        int l =0;
        int r=0;
        int ans =0;

        for(int i=0;i<str.length(); i++){
            if(str.charAt(i)=='L'){
                l++;
            }else{
                r++;
            }
            if(r==l){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
