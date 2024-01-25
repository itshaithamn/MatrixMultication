package usedat;
import java.io.IOException;
import java.util.Scanner;

public class userdata{
    public void data(String[] userString) throws IOException{
        Scanner userin = new Scanner(System.in);
        System.out.println("Please enter in 2 files or an integer to generate matrices: ");

        if (userin.hasNextInt()){
            int userInt = userin.nextInt();
            instanceint intMat = new instanceint();
            intMat.mat12(userInt);
            //class that does random calculations with i as row in mat1 and column in mat2
            //i might need to refer to an entirely different object for this one
        }else{
            String userLine = userin.nextLine();
            userString = userLine.split(" ");
            switch (userString[0]){
                case "matrix1":
                    switch(userString[1]){
                        case "matrix2":
                            System.out.println("First enter");
                    }
                    break;
                case "matrix2":
                    switch(userString[1]){
                        case "matrix1":
                            System.out.println("Second enter");
                    }
                    break;
                default:
                    userin.close();
                    System.out.println("Invalid input");
            } 
        }
        userin.close(); 
    } 
}
