public class Wrapper4 {
    public static void main(String[] args) {
        // Create an Integer object
        Integer num = new Integer(100);

        byte b = num.byteValue();
        short s = num.shortValue();
        double d = num.doubleValue();

        System.out.println("Byte value: " + b);
        System.out.println("Short value: " + s);
        System.out.println("Double value: " + d);
        
    }
}
