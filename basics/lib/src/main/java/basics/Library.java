/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.lang.Thread.sleep;

public class Library {
    public boolean someLibraryMethod() {

        return true;
    }
    public  static void pluralize(String string,int number){
        if(number==1){
            System.out.println("I own "+number+" " +string+".");
        }else{
            System.out.println("I own "+number+" " +string+"s.");
        }

    }
    public static void random(int number){
        int numHeads=0;
        for(int i=0;i<number;i++){
            double num=Math.random();
            if(num>.5){
                System.out.println("heads");
                numHeads++;
            }else {
                System.out.println("tails");
            }

        }
        if(numHeads==1){
            System.out.println("It took "+number+" flip to flip " +numHeads+" head in a row ");
        }else{
            System.out.println("It took "+number+" flip to flip " +numHeads+" heads in a row ");
        }
    }
    public static void Timer(){
        try{
//            for(int i=0;i<5;i++){
            while (true) {
                LocalDateTime now = LocalDateTime.now();
                String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

                System.out.println(time);
                long sleeping = 1000;
                sleep(sleeping);
            }
        }catch (InterruptedException ignored){
        }


    }

    public static void main(String[] args) {
        pluralize("dog",1);
        pluralize("cat",2);
        pluralize("turtle",0);
        random(1);

        Timer();


    }
}
