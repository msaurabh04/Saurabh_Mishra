package PROJECTS;
import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        int key = new Random().nextInt(100);
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Guess the number.");
            int Guess = sc.nextInt();
            if(Guess==key){
                System.out.println("You are Winner.");
                break;
            } if (Guess>key){
                System.out.println("Think Small.");
            }else{
                System.out.println("Think Big.");
            }
        }while(true);
    }
}

