import java.util.Scanner;

public class main {
    private static Scanner sc = new Scanner(System.in);

    private static String id;
    private static String password;
    private static int money;

    public static void main(String[] args) {
        int i = 0;
        User_Management um = new User_Management();
        id = sc.nextLine();
        password = sc.nextLine();
        money = sc.nextInt();
        um.SignUp(id, password, money);
    }
}