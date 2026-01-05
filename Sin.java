class Room{
    double l,b;
    void getArea(){
        double area = l*b;
        System.out.println("area of room"+area);
    }
}

class roomVolume extends Room{
    double h;
    void getVolume(){
        double volume = l*b*h;
        System.out.println("volume of room" + volume);
    }
}

public class Sin{
    public static void main ( String [] args){
        roomVolume rv = new roomVolume();
        rv.l = 10;
        rv.b = 5;
        rv.h = 3;

        rv.getArea();
        rv.getVolume();


    }
}