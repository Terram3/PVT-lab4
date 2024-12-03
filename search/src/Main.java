import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder b2 = new StringBuilder();
        if (args[0].equals("search")) {
            try {
                File myObj = new File(System.getProperty("user.dir") + "/" + args[2]);
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String temp = myReader.nextLine();
                    if(temp.contains(args[1])){
                        b2.append(temp+"\n");
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            System.out.println(b2);
        }
    }
}