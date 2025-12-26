// for each loop print 

public class ArrayExample {
    public static void main (String[] args){
        int[] arr = {10 , 20 , 30 , 40 ,50 , 60 };
        System.out.println("Array element");
        for(int i = 0 ; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
        arr[2] = 100;
        System.out.println("modifay array element");
        for(int i = 0 ; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
