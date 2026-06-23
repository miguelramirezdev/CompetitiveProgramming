import java.util.Scanner;

/**
 *  author:  migrmez
 */

public class Main {
   public static void main(String[] args) {
      // Write your solution here
      Scanner in = new Scanner(System.in);
      int t = in.nextInt();
      while(t-->0){
         int a = in.nextInt();
         int b = in.nextInt();
         int c = in.nextInt();

         int x = in.nextInt();
         int y = in.nextInt();

         if (a <= x ){
            x -= a ;
         }else if (a > x){
            x = 0 ;
         }if(b <= y){
            y -= b;
         }else if(b >y){
            y = 0;
         }
         x += y ;
         if(c >= x){
            System.out.println("YES");
         }else{
            System.out.println("NO");
         }

      }
   }
}