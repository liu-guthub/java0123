package homework_0124;

public class GongyueGongbei {
	public static void main(String[] args) {
		int i=20;
		int j=6;
		GongyueGongbei gg=new GongyueGongbei();
		//���Լ��
		int yue=gg.function(i,j);
		System.out.println("���Լ��Ϊ��"+yue);
		//��С����������������ٳ������Լ��
		int bei=i*j/yue;
		System.out.println("��С������Ϊ��"+bei);
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
