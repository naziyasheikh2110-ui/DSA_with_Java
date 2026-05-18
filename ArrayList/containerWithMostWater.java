package ArrayList;

import java.util.ArrayList;
public class containerWithMostWater {
    //BRUTE FORCE - O(n^2)
public static void storeWater(ArrayList<Integer> height){
    int maxWater = 0;
    for (int i= 0; i<height.size(); i++){
        for(int j = i+1; j<height.size(); j++) {
            int ht = Math.min(height.get(i), height.get(j));
            int wd = j - i;
            int currWater = ht * wd;
            maxWater = Math.max(currWater, maxWater);
        }
    }
    System.out.println("Maximum water stored is " + maxWater + " unit");
}

//Two pointer approach
public static void storeWater2(ArrayList<Integer> height){
    int maxWater = 0;
    int lp = 0;
    int rp = height.size()-1;

    while(lp < rp){
        //calculate waterArea
        int ht = Math.min(height.get(rp) , height.get(lp));
        int width = rp-lp;
        int currWater = ht * width;
        maxWater = Math.max(maxWater,currWater);

        //update pointers
        if(height.get(lp)<height.get(rp)){
            lp++;
        }else{
            rp--;
        }
    }
}
    public static void main (String [] args){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        storeWater(height);
    }
}
