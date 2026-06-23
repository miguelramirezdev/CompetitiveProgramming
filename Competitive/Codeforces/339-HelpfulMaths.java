

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();
        int vec [] = {0,0,0};
        for (int i = 0; i < line.length() ; i++) {
            if(line.charAt(i) == '1'){
                vec[0]++;
            }else if(line.charAt(i) == '2'){
                vec[1]++;
            }else if(line.charAt(i) == '3'){
                vec[2]++;
            }
        }
        String s = "";
        boolean band = true ;
        while (true) {
            if(vec[0]!=0){
                s +=("1");
                vec[0]--;
            }else if(vec[0] == 0 && vec[1]!=0){
                s+=("2");
                vec[1]--;
            }else if(vec[0] == 0 && vec[1] == 0 &&vec[2]!=0){
                s+=("3");
                vec[2]--;
            }else {
                break;
            }
            s += "+";
        }
        System.out.println(s.subSequence(0,s.length()-1));
    }
}
