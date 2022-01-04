package programmer.aplication;

import programmer.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("fajar","setyawan");

        System.out.println(loginRequest.name());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);
    }



}
