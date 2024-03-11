package ArraysStringsHashTables.exercise02;

public class Main {
    public static void main(String[] args) {
        //int []array = new int[]{5,9,3,12,7,1};
        int []array = new int[]{9,2,5,6};
        int target = 7;
        int [] response = new int[2];
        response = TwoSum.twoSum(array,target);

        System.out.println("Indices : " + response[0] +" , "+ response[1]);
    }

}
