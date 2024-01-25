package usedat;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class instancestr {
    public void matIn(String[] userString) throws IOException{
        for(int i = 0; i < userString.length; i++){
            FileReader reader = new FileReader(userString[i]);
            BufferedReader br = new BufferedReader(reader);
            //copy into arrays here \/\/\/\/
            String line;
            while((line = br.readLine()) != null){
                String[] randc = line.split(" ");
                int rows = Integer.parseInt(randc[0]);
                int cols = Integer.parseInt(randc[1]);

                int[][] mat1 = new int[rows][cols];
                int[][] mat2 = new int[rows][cols];
                
                for(int j = 0; j < mat1.length; j++){
                    System.out.println(mat1[j]);
                }
            }
        }
    }
    public void mat3() throws IOException{
        FileWriter writer = new FileWriter("matrix3.txt");
        BufferedWriter bw = new BufferedWriter(writer);




        bw.close();

    }
    
    
}
