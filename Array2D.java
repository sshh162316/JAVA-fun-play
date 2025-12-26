// print
import java.util.Scanner;
class Array2D {
    public static void main(String[] args) {
        // String name [][]= {{"mrs " , "ms " , "ms "} , {"smith " , "jones "}};
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("enter no. of row");
        int c = sc.nextInt();
        int[][]arr = new int[r][c];

        for(int i=0 ; i<r ; i++){
            for(int j = 0 ; j>c ; j++){
                arr[i][j] = (i+1) * (j+1);
            }
        }

        for(int i=0 ; i<r ; i++){
            for(int j = 0 ; j>c ; j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
