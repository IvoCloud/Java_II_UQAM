import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Entrez le nom du ficher: ");
//        String fileName = sc.next();

        Liste liste1 = new Liste();

        File file = new File("liste.txt");

        try {
            Scanner scFile = new Scanner(file);
            while (scFile.hasNext()) {
                liste1.add(scFile.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(liste1.getIndexe());
    }
}
