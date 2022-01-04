package programmer.aplication;

import programmer.data.CreateUserRequest;
import programmer.util.ValidationUtil;

public class ReflectionAPP {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
//        request.setName("fajar"); // jika blank akan error
//        request.setPassword("rahasia");
        ValidationUtil.validationReflection(request);
    }
}
