package suitang_0127;

import java.util.ArrayList;

public class Test_0127 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//引用类型
		//类
	/*		属性 ----  用private修饰 并且生成了get和set
			方法 ---- 等同于函数
			构造器 ---- 创建对象 给私有属性赋初始值 如果不学就默认生成一个无参构造
		数组
			在堆区创建出一个连续的内存空间用来保存对象或者变量
			定义方法
				数据类型[] 对象名=new 数据类型[数组长度]
				数据类型[] 对象名={元素1,元素2(用逗号分隔)}
			访问方式
				对象名[数组下标(从0开始)]
			数组长度
				对象名.length
			增强for循环  jdk1.5之后有的
				for(数据类型 变量:数组对象){
					
				}
			数组的缺点
				一旦定义长度无法改变
			集合  (类)
				定义:
					ArrayList list=new ArrayList();
					或者 
					List list=new ArrayList();
				
		接口
			定义接口 new --Interface 文件名和接口名一样
			抽象方法 --- 只有方法的定义 没有方法具体的实现   用来约束子类必须要重写的方法
				不能有成员变量 但是可以有常量(用static final 修饰)
		内存模型
			堆区 ----用new关键词创建出的对象  jdk1.7之后开始字符串常量池在堆区中存放
			栈区  ----栈帧 每调用一个方法 创建一个栈帧 栈帧下保存临时变量(包含参数)
			方法区---静态成员 类的信息  jdk1.7之前字符串常量池在堆区中存放
			调用方法进行参数传递的时候 基本类型传递的是值 引用类型传递的是内存地址
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
