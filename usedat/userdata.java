package usedat;
import java.util.Scanner;

public class userdata{
    public void data(String[] userString) throws Exception{
        Scanner userin = new Scanner(System.in);
        System.out.println("Please enter in 2 files or an integer to generate matrices: ");

        if (userin.hasNextInt()){
            int userInt = userin.nextInt();
            instanceint intMat = new instanceint();
            intMat.mat12(userInt);
        }else{
            String userLine = userin.nextLine();
            userString = userLine.split(" ");
            switch (userString[0]){
                case "matrix1.txt":
                    switch(userString[1]){
                        case "matrix2.txt":
                            instancestr intStr = new instancestr();
                            intStr.matIn(userString);
                    }
                    break;
                case "matrix2.txt":
                    switch(userString[1]){
                        case "matrix1.txt":
                            instancestr intStr = new instancestr();
                            intStr.matIn(userString);
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