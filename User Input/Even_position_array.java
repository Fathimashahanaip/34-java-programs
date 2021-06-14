import java.util.Scanner;
public class Main
{
        public static void main(String[] args) 
        {
              int j=0;
              int[] arr=new int[40];
              Scanner sc=new Scanner(System.in);
              System.out.println("enter size");
              int size=sc.nextInt();
              System.out.println("enter element");
              for(int i=0;i<size;i++)
                    arr[i]=sc.nextInt();
          System.out.println("the even positin array");
           for(int i=1;i<size;i=i+2)
           System.out.print(arr[i]+" ");
         }
}