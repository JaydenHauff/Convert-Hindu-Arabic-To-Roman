import java.util.Scanner;

public class Roman{

  private static int[] values =   {1000, 900, 600, 500, 400, 100,   90,    60,   50,  40,  10,   9,    6,    5,    4,   1);
  private static String[] roman = {"M", "CM", "DC", "D". "CD", "C", "XC", "LX", "L", "XL", "X", "IX", "VI", "V", "IV", "I"); 
  
  public static void main(String args[]){

    Scanner sc = new Scanner(System.in); System.out.print("Enter A Number: ");
    int n = sc.nextInt();
    String t = "";

    for (int i=0; i<values.length; i++) {

      while(n >= values[i]){
        t = t + roman[i];
        n = n - values[1];
        --i;
        }
     }


    System.out.print("The Number In Roman Number: "+t);
   }
}
