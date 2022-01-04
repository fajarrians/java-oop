package programmer.data;

public class Application {
    public static final int prosecor;

    static {
        System.out.println("Mengakses clas Application");
        prosecor = Runtime.getRuntime().availableProcessors();
    }
}
