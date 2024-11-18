import java.util.*;
class try{
    public static void main(String[]args){
        Scanner scan =new Scanner(System.in);
        try{
            System.out.println("Enter the number :");
            int number =scan.nextInt();
            if(number>0){
                System.out.println(number+"  is positive number");
            }
        }
        catch(InputMismatchException e){
            System.out.println("enter the numbers only");

        }
    }
}