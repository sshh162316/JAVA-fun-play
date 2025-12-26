import java.util.Scanner;
class ConditionCheck{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter age");
        int age  = sc.nextInt();

        System.out.println("enter salery");
        double salery = sc.nextDouble();

        System.out.println("are you student (trur / false)");
        boolean student = sc.nextBoolean();



        if(age >= 18 && salery > 30000){
        System.out.println("you are an adult with a higher salery");
        }
        else if (age<18 && !student){
        System.out.println("you are under 18 and not a student");
        }
        else if (age >= 18 && student){
        System.out.println("you are an adult an a student");
        }
        else if (age <18 || salery <= 20000){
        System.out.println("either you are under 18 or your salery is below 20000");
        }
        else {
        System.out.println("you dont fit in any of the above catergories");
        }
        sc.close();
    }
}
