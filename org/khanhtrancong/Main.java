package org.khanhtrancong;

import org.khanhtrancong.SRP.violation.User;

public class Main{
    public static void main(String[] args) {
        User user = new User(1,"123","2323");
        System.out.println(user.toString());
    }
}