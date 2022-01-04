package programmer.data;

import java.awt.font.LayoutPath;

public record LoginRequest(String username, String password) {
    public LoginRequest{
        System.out.println("Membuat object login");
    }
    public LoginRequest(String username){
        this(username,"");
    }
    public LoginRequest(){
        this("","");
    }
}
