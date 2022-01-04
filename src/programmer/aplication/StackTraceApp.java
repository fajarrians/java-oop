package programmer.aplication;

public class StackTraceApp {
    public static void main(String[] args) {

        try {
            sampleError();
        } catch (RuntimeException exception){
            exception.printStackTrace();
        }
//        try {
//            String[] names = {
//                    "fajar","rian","setyawan"
//            };
//            System.out.println(names[100]);
//        } catch (Throwable throwable){
//            StackTraceElement[] stackTraceElements = throwable.getStackTrace();
//
//            throwable.printStackTrace();
//        }
    }
    public static void sampleError(){
        try {
            String[] names = {
                    "fajar","rian","setyawan"
            };
            System.out.println(names[100]);
        } catch (Throwable throwable){
            throw new RuntimeException(throwable);
        }
    }
}
