package suitang_0126;

public class Cat extends Animal implements Animal_implements,Animal_implements2{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("我会走猫步");
	}

	@Override
	public void move2() {
		// TODO Auto-generated method stub
		System.out.println("我不会狗刨");
	}
	
}
