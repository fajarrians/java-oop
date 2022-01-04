package programmer.aplication;

import programmer.data.LoginRequest;
import programmer.error.ValidationException;
import programmer.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest(null,null);

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationException | NullPointerException exception){
            System.out.println("Data tidak valid: " + exception.getMessage());
        } finally {
            System.out.println("Selalu dieksekusi");
        }

        LoginRequest loginRequest1 = new LoginRequest(null,null);
        ValidationUtil.validateRuntime(loginRequest1);
    }

}
