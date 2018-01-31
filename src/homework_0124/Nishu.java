package homework_0124;
import java.util.Scanner;


public class Nishu {
	public static void main(String[] args){
		//输入一个4位数
		System.out.print("请输入一个四位数值：");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a=num/1000;
		int b=(num%1000)/100;
		int c=(num%100)/10;
		int d=(num%10);
		int out=(int)(Math.pow(10,3)*d+Math.pow(10,2)*c+Math.pow(10,1)*b+a);
		System.out.println(out);
		sc.close();
	}
}
