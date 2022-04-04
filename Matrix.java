package lab_program;
import java.util.Scanner;

public class Matrix {
		int rows;
		int columns;
		int array[][];
		Scanner sc = new Scanner(System.in);
		public Matrix(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		this.array = new int[rows][columns];
		}
		public void getInput(){
		for(int i = 0; i<rows; i++){
		for(int j = 0; j<columns; j++){
		array[i][j] = sc.nextInt();
		}
		}
		}
		public int mul(Matrix m1, Matrix m2){
		int flag = 0;
		if (m1.columns != m2.rows){
		flag = 1;
		return flag;
		}
		else{
		for(int i = 0; i<m1.rows;i++){
		for(int j = 0;j<m2.columns;j++){
		for(int k = 0;k<m1.columns;k++){
		array[i][j] += m1.array[i][k] * m2.array[k][j];
		}
		}
		}
		return flag;
		}

		}
		public void print(){
		for(int i = 0; i<rows; i++){
		for(int j = 0; j<columns; j++){
		System.out.print(array[i][j]+" ");
		}
		System.out.println();
		}
		}

		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("For matrix 1");
		System.out.print("Enter the no. of rows and columns");
		int row1 = sc.nextInt();
		int col1 = sc.nextInt();
		Matrix m1 = new Matrix(row1,col1);
		System.out.println("Enter elements of matrix 1-");
		m1.getInput();

		System.out.println("For matrix 2");
		System.out.print("Enter the no. of rows and columns");
		int row2 = sc.nextInt();
		int col2 = sc.nextInt();
		Matrix m2 = new Matrix(row2,col2);
		System.out.println("Enter elements of matrix 2-");
		m2.getInput();
		Matrix m3 = new Matrix(m1.rows,m2.columns);
		int flag = m3.mul(m1, m2);
		System.out.println("The First Matrix is -");
		m1.print();
		System.out.println("The Second Matrix is -");
		m2.print();

		if(flag == 0){
		System.out.println("The Product of the above two matrices is -");
		m3.print();
		}
		else{
		System.out.println("The multiplication of the above two matrices is not possible.");
		}
		}

	}

