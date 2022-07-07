import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s1[] = new String[a];
        String s2[] = new String[b];
        for(int i =0; i<a; i++)
        {
            s1[i] = sc.next();
        }
        for(int i =0; i<b; i++)
            {
                s2[i] = sc.next(); 
            }
     int n =sc.nextInt();
     while(n>0)
     {
         int m=sc.nextInt();
         m--;
         System.out.println(s1[m%a]+" "+s2[m%b]);
         n--;
     }
        
    }
}
