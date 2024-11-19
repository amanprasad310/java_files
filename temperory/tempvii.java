package temperory;

import java.util.ArrayList;

public class tempvii {
    public static void main(String[] args) {
        random p1 = new random("a",2,100);
        random p2 = new random("a",2,100);
        random p3 = new random("a",2,100);
        random p4 = new random("a",2,100);
        random p5 = new random("a",2,100);

        ArrayList<random> arr = new ArrayList<random>();
        ArrayList<String> arr2 = new ArrayList<>();
        for(random i : arr){
            i
        }
    }
    
}

class random {
    String jobID;
    int deadline;
    int profit;

    random(String jobID, int deadline,int profit){
        this.jobID = jobID;
        this.deadline = deadline;
        this.profit = profit;
    }
}