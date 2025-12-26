class StringBufferMethod {
    public static void main (){
        StringBuffer sb = new StringBuffer("java ");
        sb.append(" programing ");
        System.out.println(sb);

        sb.insert(15 , "Language");
        System.out.println(sb);

        sb.delete(5 , 15);
        System.out.println(sb);

        sb.deleteCharAt(4);
        System.out.println(sb);

        sb.replace(5,11, "language");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);


    }
}