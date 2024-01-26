package usedat;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class instanceint{
    int c, b;
    public void mat12(int i) throws IOException{
        Random rand = new Random();
        c = rand.nextInt(1, 10);
        b = rand.nextInt(1, 10);
        
        int[][] mat1 = new int[i][i];
        int[][] mat2 = new int[i][b];
        int[][] mat3 = new int[i][b];
        
        int a, k, j;
        for (a = 0; a<mat1.length; a++){
            for(j = 0; j < mat1[a].length; j++){
                mat1[a][j] = rand.nextInt(1, 10);
            }
        }
        

        for (a = 0; a <mat2.length; a++){
            for(j = 0; j < mat2[a].length; j++){
                mat2[a][j] = rand.nextInt(1,10);
            }
        }

        for (a = 0; a<mat3.length; a++){
            for (j = 0; j<mat3[a].length; j++){
                mat3[a][j] = 0;
                for (k = 0; k<mat1[a].length; k++){
                    mat3[a][j] += mat1[a][k] * mat2[k][j];
                }
            }
        }

        String[] allMatrices = {"matrix1.txt", "matrix2.txt", "matrix3.txt"};

        for(i = 0; i < allMatrices.length; i++){
            FileWriter writer = new FileWriter(allMatrices[i]);
            BufferedWriter bw = new BufferedWriter(writer);

            int [][] currentMatrix = i == 0 ? mat1 : i == 1 ? mat2 : mat3;

            for(a=0; a<currentMatrix.length; a++){
                for(j=0; j<currentMatrix[a].length; j++){
                     bw.write("%d".formatted(currentMatrix[a][j]));
                     if(j != currentMatrix[a].length -1){
                         bw.write(" ");
                     }
                }
                if(a != currentMatrix.length - 1){
                    bw.write("\n");
                }
            }
            bw.close();
        }
    }
}