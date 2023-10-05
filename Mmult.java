import java.util.*;
class Mmult{
	public static void main(String[] args){
		int [][] a,b,c;
		int n,m,p,q;
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the Dimensions of 1st  Matrix");
		n=x.nextInt();	
		m=x.nextInt();
		System.out.println("Enter the Dimensions of 2st  Matrix");
		p=x.nextInt();	
		q=x.nextInt();
		a=new int[n][m];
		b=new int[p][q];
                c=new int[n][q];
		
		if(m==p){
		System.out.println("Enter the 1st Matrix");
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				a[i][j]=x.nextInt();
		System.out.println("Enter the 2nd Matrix");
		for(int i=0;i<p;i++)
			for(int j=0;j<q;j++)
				b[i][j]=x.nextInt();
		for(int i=0;i<n;i++)
			for(int j=0;j<q;j++){
				c[i][j]=0;
				for(int k=0;k<n;k++)
				c[i][j]+=a[i][k]+b[k][j];
				}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++)
				System.out.print(c[i][j]);
				System.out.println();
		 }
		}
		else
		System.out.println("Multiplication is not Possible");
	}
}