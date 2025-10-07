import java.util.ArrayList;

class Solution {
    public static void main(String[] args) {
        // ArrayList of supplies counts
        ArrayList<Integer> supplies = new ArrayList<>();
        supplies.add(5);
        supplies.add(3);
        supplies.add(7);
        supplies.add(2);
        supplies.add(9);
        // Calculate the total sum of the supplies
        int totalSum = 0;
        // Loop over each supply count in the supplies ArrayList
        for (int supply : supplies) {
            totalSum += supply;
        }
        System.out.println(totalSum);  // This should print the total sum of the supplies

        //test
        //test2

        //test3
    }
}