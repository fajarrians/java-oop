package programmer.aplication;

import programmer.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {
        HelloWorld english = new HelloWorld() {
            @Override
            public void seyHello() {
                System.out.println("Hello");
            }

            @Override
            public void seyHello(String name) {
                System.out.println("Hello " + name);
            }
        };
        HelloWorld indonesia = new HelloWorld() {
            @Override
            public void seyHello() {
                System.out.println("Halo");
            }

            @Override
            public void seyHello(String name) {
                System.out.println("Halo " + name);
            }
        };

        english.seyHello();
        english.seyHello("fajar");

        indonesia.seyHello();
        indonesia.seyHello("rian");
    }

}
