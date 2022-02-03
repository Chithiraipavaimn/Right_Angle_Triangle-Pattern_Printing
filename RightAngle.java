import java.util.*;

public class RightAngle
{
    public static void main(String[] args)
    {
       Scanner in=new Scanner(System.in);
        System.out.println("Enter the N: ");
        int N=in.nextInt();
        int row,col;
        for(row=1;row<=N;row++)
        {
            for(col=1;col<=row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
