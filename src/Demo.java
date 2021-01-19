
import java.util.ArrayList;
import java.util.Scanner;


public class Demo {
    public static void main(String[] args) {
        //here we are going to take scores of 11 players (cricket) as input and will store them
        
        Scanner sc=new Scanner(System.in);
        ArrayList scores=new ArrayList();
        while(true){
            System.out.println("Enter Score : (-1 for exit..)");
            int score=sc.nextInt();
            if(score==-1)break;
            scores.add(score);
        }
        System.out.println("You Entered Following Scores : ");
        for(int i=0; i<scores.size(); i++){
            System.out.println(scores.get(i));
        }
        
        
        /*
        int scores[]=new int[5];       //we have declared an array of size 11
        
        
        for(int i=0;i<5; i++){
            System.out.println("Score :"+(i+1));
            scores[i]=sc.nextInt();
        }
        System.out.println("Scores Given : ");
        for(int score:scores){
            System.out.println(score);
        }
        */
    }
}
