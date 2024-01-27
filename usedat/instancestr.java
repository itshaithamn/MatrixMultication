package usedat;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;

class matrixArray{
    String[] allMatrices = {"matrix1.txt", "matrix2.txt"};

    for(i = 0; i < allMatrices.length; i++){
        FileReader reader = new FileReader(allMatrices[i]);
        BufferedReader br = new BufferedReader(reader);
        int i;
        
        int[][] mat1;

        int[][] mat2;

        int [][] currentMatrix = i == 0 ? mat1 : mat2;
        for(int a=0; a<currentMatrix.length; a++){
            for(int j=0; j<currentMatrix[a].length; j++){
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

public class instancestr {
    public void matIn(String[] userString) throws IOException{
        for (int i = 0; i < userString.length; i++){
            FileInputStream fin = new FileInputStream(userString[i]);
            byte[] buffer = new byte[1024];
            int bytesRead = fin.read(buffer);
            
            //int index = 0;
            //int a, b;
            if(i == 0){
              //  System.out.printf("\n");
                //System.out.println("Matrix 1: ");
                //while((bytesRead = fin.read(buffer)) != 1){
                  //  for(int j = 0; j < bytesRead; j++){
                    //    int value = ByteBuffer.wrap(buffer, j * a, a).getInt();
                      //  index++;
                    //}
                //}
            }
            if(i == 1){
                System.out.printf("\n");
                System.out.println("Matrix 2:");
                //while((bytesRead = fin.read(buffer)) != 1){
                  //  for(int j = 0; j < bytesRead; j++){
                    //    int value = ByteBuffer.wrap(buffer, j * a, a).getInt();
                      //  index++;
                   // }
                //}
            }
            while(bytesRead != -1){
                System.out.println(new String(buffer, 0, bytesRead));
                bytesRead = fin.read(buffer);
            }
            fin.close();
        }
    }
}
