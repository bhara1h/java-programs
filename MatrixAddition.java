public class MatrixAddition {

public static void main(String[] args) {
int[][] matrix1 = {
{1, 2, 3},
{4, 5, 6},
{7, 8, 9}
};

int[][] matrix2 = {
{9, 8, 7},
{6, 5, 4},
{3, 2, 1}
};

if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
System.out.println("Matrices must have the same dimensions for addition.");
return;
}
int[][] resultMatrix = new int[matrix1.length][matrix1[0].length];
for (int i = 0; i < matrix1.length; i++) {
for (int j = 0; j < matrix1[0].length; j++) {
resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
}
}
System.out.println("Resultant Matrix:");
for (int i = 0; i < resultMatrix.length; i++) {
for (int j = 0; j < resultMatrix[i].length; j++) {
System.out.print(resultMatrix[i][j] + " ");
}
System.out.println();
}
}
}