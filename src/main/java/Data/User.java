package Data;

public class User {
    String name, email,telephone,messenger;

    public User(String name, String email, String telephone, String messenger) {
        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.messenger = messenger;
    }

    public User() {
        this.name = "Nicole";
        this.email = "user@email.com";
        this.telephone = "956666666";
        this.messenger = "Viber";
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getMessenger() {
        return messenger;
    }
}