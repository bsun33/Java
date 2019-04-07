
package com.bs.observer;
/**
* 
* @author bs
* @version Creation TIme：Apr 7, 2019 11:56:27 AM
*/
public class Client {
	public static void main(String[] args) {
		
		// subject 
		ConcreteSubject subject = new ConcreteSubject();
		
		//create multiple observers
		ObserverA obs1 = new ObserverA();
		ObserverA obs2 = new ObserverA();
		ObserverA obs3 = new ObserverA();
		
		//add the three observers to subject list
		subject.registerObserver(obs1);
		subject.registerObserver(obs2);
		subject.registerObserver(obs3);
		
		//change subject state
		subject.setState(3000);
		
		//check if observer state change
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
	}
}
