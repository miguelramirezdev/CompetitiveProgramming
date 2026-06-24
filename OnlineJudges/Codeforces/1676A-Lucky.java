import java.util.Scanner;

/**
 * Accomplished using the EduTools plugin by JetBrains https://plugins.jetbrains.com/plugin/10081-edutools
 *
 * To modify the template, go to Preferences -> Editor -> File and Code Templates -> Other
 */

public class Main {
   public static void main(String[] args) {
      // Write your solution here
      Scanner in = new Scanner(System.in);
      int t = in.nextInt();
      while (t-->0){
         String s = in.next();
         if(s.charAt(0)+ s.charAt(1)+s.charAt(2) == s.charAt(3)+ s.charAt(4)+s.charAt(5)){
            System.out.println("YES");
         }else{
            System.out.println("NO");
         }
      }
   }
}