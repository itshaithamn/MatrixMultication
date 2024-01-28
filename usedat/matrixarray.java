package usedat;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;


public class matrixarray {    
    public int[][] processmatrices(String matrixId) throws Exception {

        BufferedReader reader = new BufferedReader(new FileReader(matrixId));

        String line;
        int rows = 0;
        int cols = 0;
        
        while ((line = reader.readLine()) != null) {
            String[] elements = line.split(" ");
            cols = elements.length;
            rows++;
        }

        reader.close();

        reader = new BufferedReader(new FileReader(matrixId));
        int[][] matInstance = new int[rows][cols];

        int row = 0;
        while ((line = reader.readLine()) != null) {
            String[] elements = line.split(" ");
            for (int col = 0; col < cols; col++) {
                matInstance[row][col] = Integer.parseInt(elements[col]);
            }
            row++;
        }
       
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(matInstance[i]));
        }
        reader.close();
        return matInstance;
    }
}
