import java.util.*;
public class TowerOfHanoi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
         hanoi(n,'A','B','C');
    }
    public static void hanoi(int n,char a,char b,char c){
        if(n==0) return;
        hanoi(n-1,a,c,b);
        System.out.println(a+"->"+c);
        hanoi(n-1,b,a,c);

    }
}