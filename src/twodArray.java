import java.util.Scanner;

public class twodArray {
    public static void main (String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int cols=sc.nextInt();
        int nums[][] =new int[row][cols];
        // for input:
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<cols;j++)
            {
                nums[i][j]=sc.nextInt();
            }
        }
        // for output:
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}
