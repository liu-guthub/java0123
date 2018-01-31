package homework_0124;

public class GongyueGongbei {
	public static void main(String[] args) {
		int i=20;
		int j=6;
		GongyueGongbei gg=new GongyueGongbei();
		//最大公约数
		int yue=gg.function(i,j);
		System.out.println("最大公约数为："+yue);
		//最小公倍数；两数相乘再除以最大公约数
		int bei=i*j/yue;
		System.out.println("最小公倍数为："+bei);
	}
	public int function(int i,int j){
		int min=i<j?i:j;
		int result=0;
		for(int k=min;k>=1;k--){
			if(i%k==0&&j%k==0){
				result=k;
				break;
			}
		}
		return result;
	}
}
