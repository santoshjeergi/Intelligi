import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputVal = sc.nextInt();


        for(int i = 1; i <= 10; i++)
        {
             TableCreator tc = new TableCreator(inputVal, i);
             Thread t = new Thread(tc);
             t.start();
        }
    }
}
