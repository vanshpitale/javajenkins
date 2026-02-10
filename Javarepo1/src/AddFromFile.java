import java.io.BufferedReader;
import java.io.FileReader;

public class AddFromFile {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("input.txt"));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        System.out.println("Sum = " + (a + b));

        br.close();
    }
}
