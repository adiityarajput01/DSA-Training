import java.util.*;
public class reverse {
    public static void main(String[] args) {
        int rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        while (num>0){
            int d = num%10;
            rev = rev*10 + d;   
            num = num/10;
        }
        System.out.println("Reverse of the number is "+rev);
        
    }
}
