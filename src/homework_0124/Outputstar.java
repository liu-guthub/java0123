package homework_0124;

import java.util.Scanner;

public class Outputstar {
	public static void main(String[] args){
		//输入行数
		Scanner sc=new Scanner(System.in);
		int linenum=sc.nextInt();
		//输出*和空格
		for(int i=1;i<=linenum;i++){
			for(int j=1;j<=linenum-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
				System.out.print("*");
			}
			for(int j=1;j<=linenum-i;j++){
				System.out.print(" ");
			}
			//换行
			System.out.println();
		}
		sc.close();
	}
}
