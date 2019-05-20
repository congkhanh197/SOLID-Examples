package org.khanhtrancong.SRP.solution;

public class UserStore{
    public UserStore(){}

    public User getUserbyID(int id){
        //TODO get data from database by id, asume that username = "test", password = "123"
        String username = "test", password = "123";
        return new User(id,username,password);
    }
    
    public boolean pushUserToDataBase(User user){
        //TODO Pust data to database, asume database return id = 10;
        int databaseReturn = 10;
        return databaseReturn != -1? true: false;   
    }
}