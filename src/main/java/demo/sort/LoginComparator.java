package demo.sort;

import demo.User;

import java.util.Comparator;

public class LoginComparator implements Comparator<User> {
    @Override
    public int compare(User u1, User u2) {
        return u1.getLogin().compareTo(u2.getLogin());
    }
}
