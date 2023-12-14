package challenges;

import java.util.ArrayList;
import java.util.List;

public class plusMinus {
    public static void plusMinus(List<Integer> arr) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        List<Integer> nil = new ArrayList<>();
        
        for (Integer s : arr){
            if (s < 0){
                neg.add(s);
            } else if ( s == 0) {
                nil.add(s);
            } else {
                pos.add(s);
            }
        }
        double positives = (double) pos.size() / arr.size();
        double negatives = (double) neg.size() / arr.size();
        double nils = (double) nil.size() / arr.size();
        
        System.out.printf("%.6f%n%.6f%n%.6f%n",positives, negatives,nils);  
    }

}

