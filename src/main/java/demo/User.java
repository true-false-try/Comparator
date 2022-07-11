package demo;

import java.util.Arrays;

public class User {
    private Long number;
    private String login;
    private char[] password;

    public User(Long number, String login, char[] password) {
        this.number = number;
        this.login = login;
        this.password = password;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "number=" + number +
                ", login='" + login + '\'' +
                ", password=" + Arrays.toString(password) +
                '}';
    }

}
