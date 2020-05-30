package task_8;

import java.io.*;
import java.util.Scanner;

public class FileCopyProgramm {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        String fromDirectory = in.nextLine();
        String destinationDirectory = in.nextLine();

        try(FileInputStream fileInputStream = new FileInputStream(fromDirectory);
            FileOutputStream fileOutputStream = new FileOutputStream(destinationDirectory)) {
            int c;
            while ((c = fileInputStream.read()) != -1) {
                fileOutputStream.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
