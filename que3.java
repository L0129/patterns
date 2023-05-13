package dsa;

public class que3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n=6;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print(j);
		}
		System.out.println();

	  }

    }
}
