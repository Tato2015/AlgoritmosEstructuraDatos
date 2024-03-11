package ArraysStringsHashTables.exercise04;

/*
Dada una matriz escribe un algoritmo para establecer ceros en la fila F
y la columna C si existe un 0 en la celda F:C

Ejemplo:
    Input   2 1 3 0 2
            7 4 1 3 8
            4 0 1 2 1
            9 3 4 1 9

    Output: 0 0 0 0 0
            7 0 1 0 8
            0 0 0 0 0
            9 0 4 0 9

    Temporal: O(F*C) + z*(F+C))
    Espacial: 0(F*C)
 */

public class ZeroMatrix {

    public int[][] zeroMatrix( int[][] matrix ){
        boolean firstRowHasZero = hasFirstRowAnyZero(matrix);
        boolean firstColHasZero = hasFirstColAnyZero(matrix);

        checkForZeroes(matrix);
        processRows(matrix);
        processColumns(matrix);

        if( firstRowHasZero ){
            setRowToZero(matrix,0);
        }

        if( firstColHasZero ){
            setColZero(matrix,0);
        }
        return matrix;
    }

    private boolean hasFirstRowAnyZero(int[][] matrix) {

        for( int i = 0 ; i < matrix[0].length; i++ ){
            if( matrix[0][i] == 0 ) return true;
        }
        return false;
    }

    private boolean hasFirstColAnyZero(int[][] matrix) {
        for (int[] ints : matrix) {
            if (ints[0] == 0) return true;
        }
        return false;
    }

    private void checkForZeroes(int[][] matrix){
        for( int row = 1 ; row < matrix.length ; row++ ){
            for( int col = 1; col < matrix[0].length ; col++){
                if( matrix[row][col] == 0 ){
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }
    }

    private void processRows( int[][] matrix){
        for( int row = 0; row < matrix.length; row ++){
            if( matrix[row][0] == 0 ){
                setRowToZero(matrix,row);
            }
        }
    }

    private void setRowToZero(int[][] matrix, int row) {
        for(int col = 0; col < matrix[0].length; col++){
            matrix[row][col] = 0;
        }
    }

    private void processColumns(int[][] matrix){
        for(int col = 0; col < matrix[0].length ; col++){
            if( matrix[0][col] == 0 ){
                setColZero(matrix,col);
            }
        }
    }

    private void setColZero(int[][] matrix, int col) {
        for( int row = 0; row < matrix.length ; row++ ){
            matrix[row][col] = 0;
        }
    }


}
