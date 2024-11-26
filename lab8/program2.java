import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        String filename = "test.txt";
        
        try {
            String fileContent = new CheckedExceptionDemo().readFile(filename);
            System.out.println(fileContent);
        } catch (FileNotFoundException e) {
            System.out.println("File: " + filename + " is missing, Please check file name");
        } catch (IOException e) {
            System.out.println("File is not having permission to read, please check the permission");
        }
    }

    public String readFile(String filename) throws FileNotFoundException, IOException {
        FileInputStream fin = null;
        StringBuilder sb = new StringBuilder();
        int i;

        try {
            fin = new FileInputStream(filename);
            while ((i = fin.read()) != -1) {
                sb.append((char) i);
            }

        } finally {
            if (fin != null) {
                fin.close();
            }
        }

        return sb.toString();
    }
}






