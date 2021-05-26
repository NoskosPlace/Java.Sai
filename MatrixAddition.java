public class MatrixAddition {
    // If you don't know what a matrix is
    // https://www.khanacademy.org/math/precalculus-2018/precalc-matrices/intro-to-matrices/a/intro-to-matrices
    // additional links
    // https://www.imdb.com/title/tt0133093/
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrix2 = {
                {10, 11, 12},
                {13, 14, 15},
                {16, 17, 18}
        };
        int[][] expectedResult = {
                {11, 13, 15},
                {17, 19, 21},
                {23, 25, 27}
        };
        MatrixAddition matrixAddition = new MatrixAddition();
        assert equals(matrixAddition.addMatrices(matrix1, matrix2), expectedResult);
       
    }
    // If you don't know how to do add matrices, practice
    // https://www.khanacademy.org/math/precalculus/x9e81a4f98389efdf:matrices/x9e81a4f98389efdf:adding-and-subtracting-matrices/a/adding-and-subtracting-matrices
    /**
     * This method should take two matrices as input, then return a matrix that 
     * is the sum of these two matrices
     * @param matrix1
     * @param matrix2
     * @return matrix that is the sum of matrix1, matrix2.
     */
    public int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix2.length];
        
        for(int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        // System.out.println(result);
        return result;
        
    }
    public static boolean equals(int[][] matrix1, int[][] matrix2) {
        if (matrix1 == null && matrix2 == null) {
            return true;
        }
        if (matrix1 == null || matrix2 == null) {
            return false;
        }
        if (matrix1.length != matrix2.length) {
            return false;
        }
        for(int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}








/**
 * To run this:
javac MatrixAddition.java
java -ea MatrixAddition
Complete the method addMatrices to add the given matrix1, matrix2 then return it's resulting sum. Links to help you with matrix addition should be in the program.
If your work is correct, you should NOT see:
Exception in thread "main" java.lang.AssertionError
	at MatrixAddition.main(MatrixAddition.java:29)
Do NOT modify main or equals method.

The matrix addition program will be challenging. We have not covered multi-dimensional arrays. However, they are not much different than a single dimension array.
Read through https://www.geeksforgeeks.org/multidimensional-arrays-in-java/ to understand how to access/construct them.
Only read until 2 dimensional arrays on that website. Don't read more and get confused at this point.
 * 
 * **/