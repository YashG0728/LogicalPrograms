import java.util.Scanner;

public class LogicalPrograms {

	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);

	        int a=0,b=1,c,n;
	        System.out.print("Enter value of n: ");
	        n=sc.nextInt();
	        System.out.print(a+" "+ b+ " ");

	        for(int i=3;i<=n;i++){   //Already two numbers we have printed so now starting from i=3,and we want fibonacci series till n.

	            c=a+b;
	            a=b;
	            b=c;
	            System.out.print(c+" ");
	        }	

	}

}
