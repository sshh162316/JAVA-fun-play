class WrapperDemo {
    public static void main (String [] args){
        Integer a = new Integer(25);
        Integer b = new Integer.valueOf("50");

        int x = a.intValue();
        System.out.println("int value of a = " + x);

        System.out.println("comparaission of a and b :" + a.compareTo(b));
        System.out.println("string value of a:" + a.toString());
    }
}