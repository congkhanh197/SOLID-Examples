package org.khanhtrancong.SRP.violation;

public class User {
    private int id;
    private String username;
    private String password;

    public User(){
        this.id = -1;
        this.username = "";
        this.password = "";
    }
    /**
     * @param id the id to set
     * @param username the username to set
     * @param password the password to set
     */
    public User(int id, String username, String password){
        this.id = id;
        this.username = username;
        this.password = password;
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    public User getUserbyID(int id){
        //TODO get data from database by id, asume that username = "test", password = "123"
        String username = "test", password = "123";
        return new User(id,username,password);
    }
    
    public boolean pushUserToDataBase(){
        //TODO Pust data to database, asume database return id = 10;
        int databaseReturn = 10; boolean isSuccess;
        if(databaseReturn != -1){
            this.id = databaseReturn;
            isSuccess = true;
        } else isSuccess = false;
        return isSuccess;   
    }
}