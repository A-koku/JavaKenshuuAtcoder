import java.util.*;
 
class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double up[] = new double[n];
		double down[] = new double[n];
		for(int i = 0; i < n;i++){
			up[i] = sc.nextDouble();
		}
		for(int i = 0; i < n;i++){
			down[i] = sc.nextDouble();
		}
		double total = 0;
		for(int i = 0;i < n;i++){
				total = total + Math.pow(up[i]-down[i],2);
		}
		System.out.println(String.format("%.2f", Math.sqrt(total)));

	}
}
