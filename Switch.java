
import java.util.Scanner;
class Switch {
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter character");

        char n = sc.next().charAt(0);



        switch (n){
            case 'a' :
                System.out.println("Sunday");
                break;
            case 'b' :
                System.out.println("Mounday");
                break;
            case 'c' :
                System.out.println("tuesday");
                break;
            case 'd' :
                System.out.println("wenusday");
                break;
            case 'e' :
                System.out.println("thusday");
                break;
            case 'f' :
                System.out.println("frayday");
                break;
            case 'g' :
                System.out.println("saturday");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }

                sc.close();

        
    }
}