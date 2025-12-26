class Stringmethod {
    public static void main (String [] args){
        String s = "Hello        ";
        String s1 = "java programming";
        System.out.println("String is " + s);
        System.out.println("length is " + s.length());

        System.out.println("character at index 4 " + s.charAt(2));

        System.out.println("character at index 4 " + s.equals(s1));
        System.out.println("character at index 4 " + s.equalsIgnoreCase(s1));

        System.out.println("s1. concat " + s.concat(" " +s1));

        System.out.println("s1 " + s1.toUpperCase());
        System.out.println("s1 " + s1.toLowerCase());

        System.out.println("s1 " + s);
        System.out.println("s1 " + s.trim());

        System.out.println(  s.indexOf('l'));
        System.out.println(  s.lastIndexOf('l'));

        System.out.println("s1 " + s.contains("He"));

        System.out.println(s1.substring(5));
        System.out.println(s1.substring(0,4));

        System.out.println(s1.replace("java" , "python"));
    }
}











