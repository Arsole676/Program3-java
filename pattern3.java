public class pattern3
{
    public static void main(String args[])
    {
        int alpha = 97;
        int i,j,k,l;
        for(i=0;i<=3;i++)
        {
            for(j=0;j<=3-i;j++)
            {
                System.out.print((char)(alpha+j));
            }
            for(k=1;k<=i*2-1;k++)
            {
                System.out.print(" ");
            }
            for(l=3-i;l>=0;l--)
            {
                if(l!=3)
                {
                    System.out.print((char)(alpha+l));
                }
            }
            System.out.println();
        }
        for(i=3-1;i>=0;i--)
        {
            for(j=0;j<=3-i;j++)
            {
                System.out.print((char)(alpha+j));
            }
            for(k=1;k<=i*2-1;k++)
            {
                System.out.print(" ");
            }
            for(l=3-i;l>=0;l--)
            {
                if(l!=3)
                {
                    System.out.print((char)(alpha+l));
                }
            }
            System.out.println();
        }
    }
}
