import java.util.Scanner;
//it is also an example of linear search .
public class ls {
    public static void main (String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        //
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(nums[i]==x)
            {
                System.out.println("number is found at index: " +i);
            }
        }


    }
}
