package homework_0124;

public class Huiwen {
	public static void main(String[] args) {
		int i=23432;
		int a=i/10000;
		int b=(i%10000)/1000;
		int d=(i%100)/10;
		int e=(i%10);
		if(b==d&&a==e){
			System.out.println(i+"是回文数。");
		}else{
			System.out.println(i+"不是回文数。");
		}
	}
}
