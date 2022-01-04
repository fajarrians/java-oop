package programmer.aplication;

import programmer.data.Application;
import programmer.data.Constant;
import programmer.data.Country;
import programmer.data.LoginRequest;
import programmer.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Constant.application);
        System.out.println(Constant.version);

        System.out.println(
                MathUtil.sum(1,1,1,1)
        );
        Country.city city = new Country.city();
        city.setName("karanganyar");

        System.out.println(city.getName());
        System.out.println(Application.prosecor);
        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("fajar"));
        System.out.println(new LoginRequest("fajar", "setyawan"));

    }
}
