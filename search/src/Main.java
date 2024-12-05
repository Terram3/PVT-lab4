package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder b2 = new StringBuilder();
        if (args[0].equals("search")) {
            try {
                File myObj = new File(System.getProperty("user.dir") + "/search/" + args[2]);
                Scanner myReasder = new Scanner(myObj);
                int line = 1; 
                while (myReader.hasNextLine()) {
                    String temp = myReader.nextLine();
                    if(temp.contains(args[1])){
                        b2.append(line+ ". "+temp+"\n");
                    }
                    line++;
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            } catch(Exception e) {
                System.out.println("This should never happen");
                e.printStackTrace();
            }
            System.out.println(b2);
        } else {
            System.out.println("bad input");
        }
    }
}