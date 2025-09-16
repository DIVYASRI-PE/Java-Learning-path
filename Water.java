import java.util.*;
public class Water {
    public static void main(String[] args){
        int capacity=100;
        int water=7;
        int filled=0;
        int mins=0;
        while(filled<capacity)
        {
            filled+=water;
            mins++;
        }
        System.out.println("Tank filled in "+mins+"Minutes");

}
}