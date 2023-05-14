package dsa;

public class pascal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int sp=n;
		int num=1;
		for(int i=0;i<n;i++) {
			for(int s=1;s<=sp;s++) {
				System.out.print(" ");
			}
			num=1;
			for(int j=0;j<=i;j++) {
				System.out.print(num+" ");
				num=num*(i-j)/(j+1);
			}
			sp--;
			System.out.println();
		}
	}

}
