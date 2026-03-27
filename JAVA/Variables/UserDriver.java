class UserDetails {
    // static variable
    static String appName = "ChatZone";

    // instance variables
    String username;
    String email;
    int age;

    public void getUserInfo() {
        String status = "Active"; // local variable
        System.out.println("App Name: " + appName);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Status: " + status);
        System.out.println("----------------------------------");
    }

    public void setUserInfo(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }
}

public class UserDriver {
    public static void main(String[] args) {
        UserDetails user1 = new UserDetails();
        user1.setUserInfo("naresh_912", "naresh@gmail.com", 22);
        user1.getUserInfo();

        UserDetails user2 = new UserDetails();
        user2.setUserInfo("sneha_0702", "sneha@gmail.com", 19);
        user2.getUserInfo();
    }
}
