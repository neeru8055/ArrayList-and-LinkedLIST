import java.sql.SQLOutput;
import java.util.Scanner;

public class Add3no
{
    public static void main(String[] args) {
        int a,b,c,r=0;
        System.out.println("write 3 no:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        r = a+b+c;
        System.out.println("Addition : "+ r);
    }
}
