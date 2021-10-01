import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        
        String next(){
            while(st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            
            return st.nextToken();
        }
        
        public int nextInt(){
            return Integer.parseInt(next());
        }
        
        public long nextLong(){
            return Long.parseLong(next());
        }
        
        public double nextDouble(){
            return Double.parseDouble(next());
        }
        
        public String nextLine(){
            String str = "";
            try{
                str = br.readLine();
            }catch(IOException e){
                e.printStackTrace();
            }
            
            return str;
        }
        
    }
    
    public static void main(String args[]){
        FastReader fr = new FastReader();
        System.out.println("Enter your name");
        String name = fr.nextLine();
        System.out.println("Enter your age");
        int age = fr.nextInt();
        System.out.println("Enter your weight");
        double weight = fr.nextDouble();
        
        System.out.println("Hello "+name+", you have added load of "+weight+"kgs on Earth for "+age+" years !!!");
    }
}
