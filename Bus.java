import java.util.*;
public class Bus {
    public static void main(String[]  args){
        Scanner sc=new Scanner(System.in);
        int amt=0;
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            int age=sc.nextInt();
            if(age<12)
            {
                amt +=50;
            }
            else if(age>=12 && age<=59)
            {
                amt +=100;
            }
            else if(age>=60)
            {
                amt +=70;
            }
        }
        System.out.println("Total Amount : "+amt);
    }
}