package usedat;
import java.io.FileInputStream;

public class instancestr {
    public void matIn(String[] userString) throws Exception{
        for (int i = 0; i < userString.length; i++){
            FileInputStream fin = new FileInputStream(userString[i]);
            byte[] buffer = new byte[1024];
            int bytesRead = fin.read(buffer);
            
            //int index = 0;
            //int a, b;
            if(i == 0){
                System.out.printf("\n");
                System.out.println("Matrix 1: ");
                
            }
            if(i == 1){
                System.out.printf("\n");
                System.out.println("Matrix 2:");
                
            }
            while(bytesRead != -1){
                System.out.println(new String(buffer, 0, bytesRead));
                bytesRead = fin.read(buffer);
            }
            fin.close();
        }

        matrixarray matrix3 = new matrixarray();
        int[][][] matrices = matrix3.processmatrices();  
        int[][] mat1 = matrices[0];  
        int[][] mat2 = matrices[1];
        int[][] mat3 = matrices[3];
        
        for(int i = 0; i < matrices.length; i++){
            for(int j = 0; i < matrices[i].length; j++){
                System.out.println(matrices[i][j]);
            }
        }
    }
}
