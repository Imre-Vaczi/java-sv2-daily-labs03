package day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Students {
    private List<Integer> heights = new ArrayList<>();

    public void addHeight(int height){
        heights.add(height);
    }
    public boolean isHeightsIncreasing(){
        int flag = 0;
        for (int i = 1; i < heights.size(); i++){
            if (heights.get(i) > heights.get(i-1)){
                flag++;
            }
        }
        if (flag > 0){
            return false;
        }else{
            return true;
        }
    }
}
