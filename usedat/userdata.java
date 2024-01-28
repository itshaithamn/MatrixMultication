package usedat;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class userdata{
    public void data(String[] userString) throws Exception{
        Scanner userin = new Scanner(System.in);
        System.out.println("Please enter in 2 files (matrix1.txt matrix2.txt) or an integer to generate matrices: ");

        if (userin.hasNextInt()){
            int userInt = userin.nextInt();
            instanceint intMat = new instanceint();
            intMat.mat12(userInt);
            userin.close();
        }else{
            String userLine = userin.nextLine();
            userString = userLine.split(" ");

            matrixarray matrixArray = new matrixarray();

            System.out.printf("\n");
            System.out.println(userString[0] + " values: ");
            int [][] mat1 = matrixArray.processmatrices(userString[0]);
        
            System.out.printf("\n");
            System.out.println(userString[1] + " values: ");
            int [][] mat2 = matrixArray.processmatrices(userString[1]);


            BufferedReader reader = new BufferedReader(new FileReader("matrix2.txt"));

            String line;
            int rows = 0;
            int cols = 0;
        
            while ((line = reader.readLine()) != null) {
                String[] elements = line.split(" ");
                cols = elements.length;
                rows++;
            }
            reader.close();

            int[][] mat3 = new int[rows][cols];

            for (int i = 0; i < mat3.length; i++){
                for (int j = 0; j < mat3[i].length; j++){
                    mat3[i][j] = 0;
                    for (int k = 0; k < mat1[i].length; k++){
                        mat3[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }
            }  

            BufferedWriter writer = new BufferedWriter(new FileWriter("matrix3.txt"));

            for (int row = 0; row < mat3.length; row++) {
                for (int col = 0; col < mat3[row].length; col++) {
                    writer.write(mat3[row][col] + " ");
                }
                writer.newLine();
            }
    
            writer.close();
        }
    }
} 