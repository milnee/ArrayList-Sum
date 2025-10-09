import java.util.ArrayList;


class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> temperatures = new ArrayList<>();
    
         temperatures.add(22);
         temperatures.add(31);
         temperatures.add(10);

        for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) > 30) {
        System.out.println("Temperature is hot at " + temperatures.get(i));
            break;
            
        }
        
        else if (temperatures.get(i) < 15) {
        System.out.println("Its too cold " + temperatures.get(i));
        continue;
        
        }
        else {
        System.out.println("Temperature is nice at " + temperatures.get(i));
    }
    }
    }
}
