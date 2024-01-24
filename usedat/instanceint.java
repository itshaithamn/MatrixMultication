package usedat;
import java.util.Arrays;
import java.util.Random;

public class instanceint{
    int c, b;
    public void mat12(int a){
        Random rand = new Random();

        c = rand.nextInt(10);
        b = rand.nextInt(10);
        int[][] mat1 = new int[a][b];
        int[][] mat2 = new int[a][c];
        //create random b and c values
        int j;

        for (a = 0; a<mat1.length; a++){
            for(j = 0; j < mat1[a].length; j++){
                mat1[a][j] = rand.nextInt(10);
            }
        }

        for (a = 0; a<mat2.length; a++){
            for(j = 0; j < mat2[a].length; j++){
                mat2[a][j] = rand.nextInt(10);
            }
        }

        System.out.println("Matrix 1: ");
        for(a=0; a<mat1.length; a++){
            System.out.println(Arrays.toString(mat1[a]));
        }

        System.out.println("Matrix 2: ");
        for(a=0; a<mat2.length; a++){
            System.out.println(Arrays.toString(mat2[a]));
        }

        //include in a return variable of mat3 (matrix 3)
    }
}