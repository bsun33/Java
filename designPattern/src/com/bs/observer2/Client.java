
package com.bs.observer2;
/**
* 
* @author bs
* @version Creation TIme：Apr 7, 2019 7:36:15 PM
*/

public class Client {
	
	public static void main(String[] args) {
		// subject
		ConcreteSubject subject = new ConcreteSubject();

		// create multiple observers
		ObserverA obs1 = new ObserverA();
		ObserverA obs2 = new ObserverA();
		ObserverA obs3 = new ObserverA();
		
		//将上面三个观察者对象添加到目标对象subject的观察者容器中
		subject.addObserver(obs1);
		subject.addObserver(obs2);
		subject.addObserver(obs3);
		
		//改变subject对象的状态
		subject.set(3000);
		
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
		
		subject.set(6000);
		
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
	}		
}
