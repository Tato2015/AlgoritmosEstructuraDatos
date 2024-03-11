package ArraysStringsHashTables.exercise04;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ZeroMatrix zeroMatrix = new ZeroMatrix();
        int[][] matrix = {
                {2,1,3,0,2},
                {7,4,1,3,8},
                {4,0,1,2,1},
                {9,3,4,1,9}
        };

        System.out.println(Arrays.deepToString(zeroMatrix.zeroMatrix(matrix)));

    }

}
