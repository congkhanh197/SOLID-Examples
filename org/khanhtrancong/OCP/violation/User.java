package org.khanhtrancong.OCP.violation;

public class User {
    private int id;
    private String username;
    private String password;
    private int type;

    public User(){
        this.id = -1;
        this.username = "";
        this.password = "";
        this.type = -1;
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

    public String getContent(){
        //Admin
        return type == 1? "Admin":"Client";     
    }
}