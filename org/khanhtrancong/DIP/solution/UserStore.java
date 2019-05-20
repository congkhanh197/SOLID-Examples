package org.khanhtrancong.DIP.solution;
public class UserStore{
    private IUser user;
    public UserStore(IUser user){
        this.user = user;
    }
    public boolean pushUserToDatabase(){
        user.getType();
        // push data to Database
        return true;
    }
}