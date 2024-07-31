import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String[] args) {

    int CVictory = -1;
    int Uinput;
    Scanner scan = new Scanner(System.in);
    Random rand = new Random ();
    System.out.println("R (0), P (1), or S (2)?");
    Uinput = scan.nextInt();
    int Cinput = rand.nextInt(1, 3);
    String CInput;
    if (Cinput == 0){
      CInput = "R";
    } else if (Cinput == 1){
      CInput = "P";
    } else {
      CInput = "S";
    }
    switch (Cinput) {
       case 0:
        if (Uinput == 0) {
         CVictory=2;
       } else if (Uinput==1) {
         CVictory=0;
       } else if (Uinput == 2) {
         CVictory=1;
       }
        break;

        case 1: 
        if(Uinput == 1) {
          CVictory=2;
        } else if (Uinput == 0) {
          CVictory=1;
        } else if (Uinput == 2) {
          CVictory=0;
        }
         break;

        case 2:
        if (Uinput == 2){
          CVictory = 2;
        } else if (Uinput == 1){
          CVictory = 1;
        } else if (Uinput == 0){
          CVictory = 0;
        }
        
    }

    if (CVictory==1){
      System.out.println("Computer played "+CInput);
      System.out.println("Computer wins!");
    } else if (CVictory==0) {
      System.out.println("Computer played "+CInput);
      System.out.println("You win!");
    } else if (CVictory==2){
      System.out.println("Computer played "+CInput);
      System.out.println("Tie!");
    }
    
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}
