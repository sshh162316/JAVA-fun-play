import java.util.Vector;
public class Vector {
    public static void main(String[] args) {
     
        Vector <String> v1 = new Vector <>();
        v1.add("Dog");
        v1.add("Horse");

        v1.add(2 , "cat");
        System.out.println("vecter i s " + v1);


        Vector<String> v2 = new Vector <>();
        v2.add("rocodile");
        v2.add(v1);
        System.out.println("new vector" +v2);

    }
}
