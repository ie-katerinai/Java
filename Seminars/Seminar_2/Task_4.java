
package Seminars.Seminar_2;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args){
        generateString();
        writeStringToFile("file.txt");

    }
    public static String generateString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append("TEST ");
        }
        return sb.toString();
    }
    

    public static void writeStringToFile(String filename) {
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(generateString());
            writer.close();
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}