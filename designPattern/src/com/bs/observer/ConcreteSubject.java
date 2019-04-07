
package com.bs.observer;
/**
* 
* @author bs
* @version Creation TIme：Apr 7, 2019 11:52:05 AM
*/
public class ConcreteSubject extends Subject{
	
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		//subject value change will notify all observers
		this.notifyAllObservers();
	}
}
