import java.io.*;

public class compare_main {
    public static void main(String[] args) {
        String file1Path = "file1.txt";
        String file2Path = "file2.txt";

        try {
            boolean areEqual = compareFiles(file1Path, file2Path);

            if (areEqual) {
                System.out.println("The two files are equal lexicographically.");
            } else {
                System.out.println("The two files are not equal lexicographically.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean compareFiles(String filePath1, String filePath2) throws IOException {
        try (BufferedReader reader1 = new BufferedReader(new FileReader(filePath1));
             BufferedReader reader2 = new BufferedReader(new FileReader(filePath2))) {

            String line1, line2;

            while ((line1 = reader1.readLine()) != null && (line2 = reader2.readLine()) != null) {
                if (!line1.equals(line2)) {
                    return false; 
                }
            }
            return reader1.readLine() == null && reader2.readLine() == null;
        }
    }
}
