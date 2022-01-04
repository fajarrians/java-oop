public class Polymarpsm {
    public static void main(String[] args) {
        Employee employee = new Employee("fajar");
        employee.seyHello("Budu");

        employee = new MAnager("fajar");
        employee.seyHello("budi");

        employee = new VicePresident( "Fajar");
        employee.seyHello("budi");

//        method polymorphism
        seyHello(new Employee("fajar"));
        seyHello(new MAnager("rian"));
        seyHello(new VicePresident("setyawan"));
    }
     static void seyHello(Employee employee){
        if (employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("hello vp " + vicePresident.nama);
        } else if (employee instanceof MAnager){
            MAnager manager =  (MAnager) employee;
            System.out.println("Hello Manager " + manager.nama);
        }else {
            System.out.println("Hello Employee " + employee.nama);
        }


    }
}
