package matrix;

public class Matrix {
    private double[][] matrix;

    public void setMatrix(int rows, int columns) throws MyException {
        if (rows < 1 || rows > 50 || columns < 1 || columns > 50) {
            throw new MyException("Matrix must contain from 1 to 50 rows/columns. " +
                    "Your rows: " + rows + " Your columns: " + columns);
        }
        matrix = new double[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                matrix[i][k] = i + k * 2;
            }
        }
    }

    public double[][] getMatrix() {
        return matrix;
    }

    private double[][] matrixSize(double[][] mat1, double[][] mat2) {
        int xSize = 0;
        int ySize = 0;

        if (mat1.length >= mat2.length) xSize = mat1.length;
        else xSize = mat2.length;
        if (mat1[0].length >= mat2[0].length) ySize = mat1[0].length;
        else ySize = mat2[0].length;

        double[][] mat3 = new double[xSize][ySize];

        return mat3;
    }

    public double[][] addition(double[][] mat1, double[][] mat2) throws MyException {
        double[][] mat3 = this.matrixSize(mat1, mat2);
        try {
            for (int i = 0; i < mat3.length; i++) {
                for (int k = 0; k < mat3[0].length; k++) {
                    if (k < mat1[0].length && i < mat1.length) mat3[i][k] += mat1[i][k];
                    if (k < mat2[0].length && i < mat2.length) mat3[i][k] += mat2[i][k];
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {    //processed just in case
            throw new MyException(e);
        }
        return mat3;


    }

    public double[][] multiply(double[][] mat1, double[][] mat2) throws MyException {
        double[][] mat3 = this.matrixSize(mat1, mat2);
        try {
            for (int i = 0; i < mat1.length; i++) {
                for (int k = 0; k < mat1[i].length; k++) {
                    if (k < mat1[0].length && i < mat1.length && k < mat2[0].length && i < mat2.length) {
                        mat3[i][k] = mat1[i][k] * mat2[i][k];
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {    //processed just in case
            throw new MyException(e);
        }
        return mat3;
    }

    public double[][] transpose(double[][] mat1) throws MyException{
        double[][] mat2 = new double[mat1[0].length][mat1.length];
        try {
            for (int i = 0; i < mat1.length; i++) {
                for (int k = 0; k < mat1[i].length; k++) {
                    mat2[k][i] = mat1[i][k];
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {    //processed just in case
            throw new MyException(e);
        }

        return mat2;
    }

    public void printMatrix(double[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int k = 0; k < mat[i].length; k++) {
                System.out.print(mat[i][k] + " ");
            }
            System.out.println("");

        }
    }
}
