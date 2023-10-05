import java.util.*;
class Madd{
	public static void main(String[] args){
		int [][] a,b,c;
		int n,m,p,q;
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the Dimensions of 1st  Matrix");
		n=x.nextInt();	
		m=x.nextInt();
		System.out.println("Enter the Dimensions of 1st  Matrix");
		p=x.nextInt();	
		q=x.nextInt();
		a=new int[n][m];
		b=new int[p][q];
                c=new int[n][q];
		System.out.println("Enter the 1st Matrix");
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				a[i][j]=x.nextInt();
		System.out.println("Enter the 2nd Matrix");
		for(int i=0;i<p;i++)
			for(int j=0;j<q;j++)
				b[i][j]=x.nextInt();
		if(n==p && m==q){
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				c[i][j]=a[i][j]+b[i][j];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++)
				System.out.print(c[i][j]);
				System.out.println();
		 }
		}
		else
		System.out.println("Addition is not Possible");
	}
}