package pl.camp.it.car.rent.model;

public class User {
    private String login;
    private String password;
    public Privilages privilages;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String convertToFileFormat() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("User")
                .append(";")
                .append(this.login)
                .append(";")
                .append(this.password);

        return stringBuilder.toString();
    }
}
