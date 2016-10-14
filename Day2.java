import java.util.Scanner;
public class Day2{
	public static void main(String args[]){
		System.out.println("请随意输入5个数字");
		int average=0;
		int sum=0;
		int i;
		for(i=0;i<5;i++){
			
			Scanner input=new Scanner(System.in);
			int b=input.nextInt();
			sum=sum+b;
			
			
			
		}
		average=sum/i;
		System.out.println(average);
		System.out.println(i);
	}
}