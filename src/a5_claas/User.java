package a5_claas;

public class User {
    String name;
    String e_mail;
    String password;

    public User() {}

    public User(String name, String e_mail, String password) {
        this.name = name;
        this.e_mail = e_mail;
        this.password = password;
    }
    public String setPassword(String newPassword) {
        this.password = newPassword;
        return this.password;

    }
}