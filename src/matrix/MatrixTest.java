package matrix;

public class MatrixTest {

	public static void main(String[] args) throws MyException{
		Matrix mat = new Matrix();
		mat.setMatrix(3,4);
		double[][] x = mat.getMatrix();
        System.out.println("\nYour first matrix:");
		mat.printMatrix(x);

		mat.setMatrix(5,2);
		double[][] y = mat.getMatrix();
		System.out.println("\nYour second matrix:");
		mat.printMatrix(y);

		double[][] a = mat.addition(x,y);
        System.out.println("\nThe matrix after addition:");
		mat.printMatrix(a);
		
		double[][] b = mat.multiply(x,y);
        System.out.println("\nThe matrix after multiplication:");
		mat.printMatrix(b);
		
		double[][] c = mat.transpose(x);
        System.out.println("\nThe first matrix after transposition:");
		mat.printMatrix(c);

	}
}
