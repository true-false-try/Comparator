package demo.sort;

import demo.User;

import java.util.Comparator;

public class PasswordComparator implements Comparator<User> {

    @Override
    public int compare(User u1, User u2) {
        char[] p1 = u1.getPassword();
        char[] p2 = u2.getPassword();
        int flag = 0;
        if (p1.length == p2.length) {
            for (int i = 0; i < p1.length; i++) {
                flag = Integer.compare(u1.getPassword()[i], u2.getPassword()[i]);
                if (flag > 0) {
                    return Integer.compare(u1.getPassword()[i], u2.getPassword()[i]);
                } else if (flag < 0) {
                    Integer.compare(u1.getPassword()[0], u2.getPassword()[i]);
                }
            }
        }
        else
            return p1.length - p2.length;

        return flag;
    }
}
