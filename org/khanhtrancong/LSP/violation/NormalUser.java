package org.khanhtrancong.LSP.violation;

class NoAccessPermissionException extends Exception{
    private static final long serialVersionUID = -7694139104846321688L;
}

public class NormalUser extends User{
    @Override
    public String getSecretData() throws NoAccessPermissionException {
        throw new NoAccessPermissionException();
    }
}