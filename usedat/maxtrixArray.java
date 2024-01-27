package usedat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class maxtrixArray{
    public void processMatrices() throws Exception {
        String[] allMatrices = {"matrix1.txt", "matrix2.txt"};

        for (int i = 0; i < allMatrices.length; i++) {
            try (BufferedReader br = new BufferedReader(new FileReader(allMatrices[i]))) {
                int currentMatrixIndex = i == 0 ? 0 : 1;
                String line = br.readLine();        
                String[] size = line.split(line);
                int rows = Integer.parseInt(size[0]);
                int cols = Integer.parseInt(size[1]);
                int[][] mat1 = new int[rows][cols];
                int[][] mat2 = new int[rows][cols];
                int[][] currentMatrix = currentMatrixIndex == 0 ? mat1 : mat2;

                for(int a = 0; a < currentMatrix[a].length; a++){
                //matrix 1
                for(int o = 0; o < rows; o++){
                    line = br.readLine();
                    String[] row = line.split(" ");
                    for(int j = 0; j < cols; j++){
                        mat1[o][j] = Integer.parseInt(row[j]);
                    }
                }
                //matrix 2
                for(int o = 0; o < rows; o++){
                    line = br.readLine();
                    String[] row = line.split(" ");
                    for(int j = 0; j < cols; j++){
                        mat1[o][j] = Integer.parseInt(row[j]);
                    }
                }
            }
            } catch (IOException e) {
                // Handle file reading errors
            }
        }
    }
}
