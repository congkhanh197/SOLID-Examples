package org.khanhtrancong.LSP.solution;

public abstract class User {
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
}