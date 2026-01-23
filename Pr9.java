interface Area {
    void areaRectangle();
    void areaCircle();
}

class Shape implements Area {

    int l = 10;
    int b = 5 ;
    double r = 7;
    double pi = 3.14;


public void areaRectangle (){
    int rectArea = l*b;
    System.out.println("area of rectangle  " + rectArea);
}


public void areaCircle (){
    double cirArea = pi*r*r;
    System.out.println("area of rectangle  " + cirArea);
}
}

class Pr9 {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.areaRectangle();
        s.areaCircle();
    }
}