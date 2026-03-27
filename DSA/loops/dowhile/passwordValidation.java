package dowhile;

import java.util.Scanner;

public class passwordValidation {
    
    // String secretPW = "prince12@123";
    public static String validatePassword(String secretPW){
        int attempt = 3;
        Scanner sc = new Scanner(System.in);
        do { 
            String userPW = sc.nextLine();
        if(userPW.length() >= 8 && userPW.length() <= 20 && userPW.equals(secretPW)){
            return "Validation is successful";
        } else {
            System.out.println("Invalid Password....");
            System.out.println("You have left with " + attempt + " attempt now.");
            attempt--;
        }
        } while (attempt>=1);
        return "Validation unsuccessfull \n You are blocked now.";
    }

    public static void main(String[] args) {
        System.out.println(validatePassword("prince@123"));
    }
}
