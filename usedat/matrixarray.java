package usedat;

import java.io.BufferedReader;
import java.io.FileReader;

public class matrixarray {    
    public int[][][] processmatrices() throws Exception {
        FileReader reader = new FileReader("matrix1.txt");
        BufferedReader br = new BufferedReader(reader);
        String line = br.readLine();        
        String[] size = line.split(line);
        int rows = Integer.parseInt(size[0]);
        int cols = Integer.parseInt(size[1]);
        int[][] mat1 = new int[rows][cols];
        System.out.println("%d %d".formatted(rows, cols));


        for (int i = 0; i<rows; i++){
            line = br.readLine();
            String[] row = line.split(" ");
            for(int j=0;j<cols;j++){
                mat1[i][j] = Integer.parseInt(row[j]);
            }
        }

        FileReader reader2 = new FileReader("matrix2.txt");
        BufferedReader br2 = new BufferedReader(reader2);
        String line2 = br2.readLine();        
        String[] size2 = line2.split(line2);
        int cols2 = Integer.parseInt(size2[1]);
        int[][] mat2 = new int[rows][cols];
        System.out.println("%d %d".formatted(rows, cols2));

        for (int i = 0; i<rows; i++){
            line = br2.readLine();
            String[] row = line.split(" ");
            for(int j=0;j<cols2;j++){
                mat2[i][j] = Integer.parseInt(row[j]);
            }
        }

        int[][] mat3 = new int[rows][cols2]; 
        //How can I automate these readers?? ^^^^

        br2.close();
        br.close();
        return new int[][][] {mat1, mat2, mat3};
    }
}
