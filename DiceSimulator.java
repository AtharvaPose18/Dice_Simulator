import java.util.Scanner;
import java.util.Random;
public class DiceSimulator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        String choice;
        System.out.print("How many Dice do you want to roll(1/2):");
        int roll=sc.nextInt();
        sc.nextLine();
        if(roll==1){
                do{
                    int number=random.nextInt(6)+1;
                    System.out.println("You Rolled:"+number);
                    System.out.print("Do you want to roll again:(yes/no):");
                    choice=sc.nextLine();
                }while(choice.equalsIgnoreCase("yes"));
            }
            else{
                do{
                    int number=random.nextInt(6)+1;
                    int number2=random.nextInt(6)+1;
                    System.out.println("You Rolled " +number+ " on First Dice!");
                    System.out.println("You Rolled " +number2+ " on Second Dice!");
                    System.out.println("Total number rolled:"+(number+number2));
                    System.out.print("Do you want to roll again:(yes/no):");
                    choice=sc.nextLine();
                }while(choice.equalsIgnoreCase("yes"));
            }
            System.out.println("Thanks for playing!");
        sc.close();
    }
}