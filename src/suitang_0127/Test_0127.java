package suitang_0127;

import java.util.ArrayList;

public class Test_0127 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������
		//��
	/*		���� ----  ��private���� ����������get��set
			���� ---- ��ͬ�ں���
			������ ---- �������� ��˽�����Ը���ʼֵ �����ѧ��Ĭ������һ���޲ι���
		����
			�ڶ���������һ���������ڴ�ռ��������������߱���
			���巽��
				��������[] ������=new ��������[���鳤��]
				��������[] ������={Ԫ��1,Ԫ��2(�ö��ŷָ�)}
			���ʷ�ʽ
				������[�����±�(��0��ʼ)]
			���鳤��
				������.length
			��ǿforѭ��  jdk1.5֮���е�
				for(�������� ����:�������){
					
				}
			�����ȱ��
				һ�����峤���޷��ı�
			����  (��)
				����:
					ArrayList list=new ArrayList();
					���� 
					List list=new ArrayList();
				
		�ӿ�
			����ӿ� new --Interface �ļ����ͽӿ���һ��
			���󷽷� --- ֻ�з����Ķ��� û�з��������ʵ��   ����Լ���������Ҫ��д�ķ���
				�����г�Ա���� ���ǿ����г���(��static final ����)
		�ڴ�ģ��
			���� ----��new�ؼ��ʴ������Ķ���  jdk1.7֮��ʼ�ַ����������ڶ����д��
			ջ��  ----ջ֡ ÿ����һ������ ����һ��ջ֡ ջ֡�±�����ʱ����(��������)
			������---��̬��Ա �����Ϣ  jdk1.7֮ǰ�ַ����������ڶ����д��
			���÷������в������ݵ�ʱ�� �������ʹ��ݵ���ֵ �������ʹ��ݵ����ڴ��ַ
			javap -c
	*/
//		int[] arr={1,23,44,52,626,333,611,523};
//		for(int i=0;i<arr.length-1;i++){
//			for(int j=0;j<arr.length-1-i;j++){
//				if(arr[j]>arr[j+1]){
//					int temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}
//			}
//		}
//		for(int i:arr){
//			System.out.println(i);
//		}
	
		//ArrayList list=new ArrayList();
		//list.add(50);
		//System.out.println(list.get(0));
		
		Runnable thr=new Thread1();
		Thread t1=new Thread(thr);
		Thread t2=new Thread(thr);
		t1.start();
		t2.start();
	}

}
