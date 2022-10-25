package ineuron;

public class Assignment1 {
	
	public static void main(String [] args) {
		int n = 7;
		
		System.out.println("Pattern - 1");
		System.out.println("------------");
		for (int i=0;i<n;i++) {
			
			int let = 1;
			for (int j=0;j<n;j++)
			{
				
				//Print 'I'
				if(j==n/2 || i== 0 || i==n-1)			
					System.out.print("*");
				else
					System.out.print(" ");
				
				
			}
			System.out.print("\t");
			
			//Print 'N'
			int n2= n * ++let;
			for(int k=n;k<n2;k++)
			{
				if(k==n || k<n2 && k==i+n || k==n2-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\t");
			
			//Print 'E'
			int n3= n * ++let ;
			for(int l=n2;l<n3;l++)
			{
				if(l==n2 || l<n3 && (i==0 || i==n/2 || i==n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\t");
			
			//Print U
			int n4= n * ++let;
			for(int m=n3;m<n4;m++)
			{
				if(m==n3 && i < n-1 || m==n4-1 && i< n-1 || i == n-1 && (m>n3 && m <n4-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\t");
			
			//Print R
			int n5= n * ++let;
			for(int o=n4;o<n5;o++)
			{
				if(o==n4 || (i==0 || i==n/2) && o<n5-1 || i>0 && i<(n-1)/2 && o==n5-1 || i>n/2 && i+n4==o)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print("\t");
			
			//Print O
			int n6= n * ++let;
			for(int p=n5;p<n6;p++)
			{
				if((p==n5 || p==n6-1) && i>0 && i<n-1 || ( i == 0 || i ==n-1) && p>n5 && p<n6-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\t");
			
			//Print N
			int n7= n * ++let;
			for(int q=n6;q<n7;q++)
			{
				if(q==n6 || q<n7 && q==i+n6 || q==n7-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();	
		}
	
		System.out.println("Pattern - 2");
		System.out.println("------------");
		
		
		n = 4;
		for (int i=0; i< n; i++) {
			for (int j=0; j<n ; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("------------");
		System.out.println("Pattern - 3");
		System.out.println("------------");
		
		n = 14;
		for (int i=0; i< n; i++) {
			for (int j=0; j<n ; j++)
			{
				if(i==0 ||  j<n/2 &&  i <n/2  && i+j<n/2 || 
						i <= n/2 && j >=(n-1)/2 && j-i>=(n-1)/2  || 
						i >= (n-1)/2 && (j==0  || j== (n-1))||
						i==(n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("------------");
		System.out.println("Pattern - 4");
		System.out.println("------------");
		
		for (int i=0; i< n; i++) {
			for (int j=0; j<n ; j++)
			{
				
				  if( i >=n/2 && (i-j > n/2 || j+i >= n+n/2) ) 
					  System.out.print("*"); 
				  else
					  System.out.print(" ");
				 
			}
			System.out.println();
		}
		for (int i=0;i<2;i++)
		{
			for (int j=0; j<n; j++)
				System.out.print("*");
			System.out.println();
		}
	
		System.out.println("------------");
		System.out.println("Pattern - 5");
		System.out.println("------------");
		
		
		for (int i=0; i< n; i++) {
			for (int j=0; j<n ; j++)
			{
				
				  if( i+j < n/2 || i-j >= (n-1)/2 || i==0 || i==n-1 ) 
					  System.out.print("*"); 
				  else
					  System.out.print(" ");
				 
			}
			System.out.println();
		}
		
	}	
}
