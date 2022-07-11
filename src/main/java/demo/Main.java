package demo;

import demo.sort.NumberComparator;
import demo.sort.PasswordComparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<User> users = new TreeSet<>(new PasswordComparator());
        users.add(new User(8000L,"string1",new char[] {'a','b','c'}));
        users.add(new User(1L,"string4",new char[] {'a','b','c','d'}));
        users.add(new User(5000L,"string2",new char[] {'d','f','g'}));
        users.add(new User(3000L,"string3",new char[] {'a','b','z'}));

        users.forEach(System.out::println);
    }
}
