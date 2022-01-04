public class Shape {
    int getSudut(){
        return 0;
    }
}
class Rectangle extends Shape{
    int getSudut(){
        return 4;
    }

    int getParntSudut(){
        return super.getSudut();
    }
}
