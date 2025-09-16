import java.util.*;
class arr5
{
public static void main(String args[])
{
int arr[]={1,2,3,4,5};
int maximum=arr[0];
for(int i=0;i<arr.length;i++)
{
if(arr[i]>=maximum)
maximum=arr[i];
}
System.out.println("Maximum element is:"+maximum);
}
}
