import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java .util.Scanner;
public class MainMenu {
    public MainMenu() {
        SLFile.readUsersFromFile();
    }
    HomePage home = new HomePage();
    Scanner in = new Scanner(System.in);
    Register register = new Register();
    static User user = new User();
    String choice;
    public  void menu() {
        while (true) {
            System.out.println("press 1 to login");
            System.out.println("press 2 to register");
            System.out.println("press 3 to exit");
            choice = in.next();
            switch (choice) {
                case "1": {
                    System.out.println("Enter your username :");
                    user.setUserName(in.next());
                    System.out.println("Enter your password :");
                    user.setPassword(in.next());
                    if (!Login.getLoginInstance() .authenticate(user.getUserName(), user.getPassword())) {
                        System.out.println("wrong username or password");
                    } else {
                        System.out.println("logged in");
                        home.home();
                    }
                    break;
                }
                case "2": {
                    System.out.println("Enter your username :");
                    user.setUserName(in.next());
                    System.out.println("Enter your password :");
                    user.setPassword(in.next());
                    register.addUser(user.getUserName(), user.getPassword());
                    break;
                }
                case "3": {
                    return;
                }
                default:
                    System.out.println("Wrong Input!!");
            }
        }
    }
}
