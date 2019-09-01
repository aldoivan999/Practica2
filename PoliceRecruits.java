import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int mc=0;   //police men counter
        int in=0;
        int c=0; //crimes
        for(int i=0;i<n;++i){
            in = s.nextInt();
            if(in>0){
                mc+=in;
            }
            if(in<0){
                if(mc<=0){
                    c++;
                }else
                mc--;
            }
        }
        System.out.println(c);
    }
}