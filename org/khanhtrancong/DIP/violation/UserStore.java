package org.khanhtrancong.DIP.violation;
public class UserStore{
    private AdminUser adminUser;
    public UserStore(AdminUser adminUser){
        this.adminUser = adminUser;
    }
    public boolean pushUserToDatabase(){
        String username = adminUser.getUsername();
        String password = adminUser.getPassword();
        // push data to Database
        return true;
    }
}