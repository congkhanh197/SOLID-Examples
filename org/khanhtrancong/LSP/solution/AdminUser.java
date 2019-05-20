package org.khanhtrancong.LSP.solution;

class NoAccessPermissionException extends Exception{
    private static final long serialVersionUID = -7694139104846321688L;
}

public class AdminUser extends User{
    public String getSecretData() {
        return "Some Secret Data";
    }
}