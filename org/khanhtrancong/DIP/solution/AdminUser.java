package org.khanhtrancong.DIP.solution;
public class AdminUser implements IUser{

    @Override
    public String getType() {
        return "Admin";
    }

}