package test;

public class test {
	public static void main(String[] args){
		int a=5;
		int b=10;
		a=a+b;
		b=a-b;
		a=a-b;
		a=a*b;
		b=a/b;
		a=a/b;
		test t= new test();
		t.add(8,15);
		
	}
	public int add(int a,int b){
		for(int k=0;k<5;k++){
			a++;
			
			System.out.println("sssss"+k);
		}
		return 0;
	}
}
