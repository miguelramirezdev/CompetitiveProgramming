
    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;



    public class Main {


        public static void solve(String s)
        {
            int x = 0 , y = 0;
            Boolean band = true ;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '1'){
                    x++;
                    y=0 ;
                }else{
                    y++;
                    x = 0;
                }if(x == 7 || y == 7) {
                    System.out.println("YES");
                    band = false;
                    break;
                }
            }if(band){
            System.out.println("NO");
        }
        }
        public static void main(String[] args) throws IOException {

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String line = in.readLine();
            solve(line);
        }
    }
