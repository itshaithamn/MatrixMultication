package usedat;
import java.io.FileInputStream;
import java.io.IOException;

public class instancestr {
    public void matIn(String[] userString) throws IOException{
        for (int i = 0; i < userString.length; i++){
            FileInputStream finmat1 = new FileInputStream(userString[i]);
            byte[] buffer = new byte[1024];
            int bytesRead = finmat1.read(buffer);
            
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
                bytesRead = finmat1.read(buffer);
            }
            finmat1.close();
        }
    }
}
