
package com.bs.observer;
/**
* 
* @author bs
* @version Creation TIme：Apr 7, 2019 11:54:17 AM
*/
public class ObserverA implements Observer{
	
	private int myState; 	// should be consistent with subject state

	public int getMyState() {
		return myState;
	}

	public void setMyState(int myState) {
		this.myState = myState;
	}

	@Override
	public void update(Subject subject) {
		myState = ((ConcreteSubject)subject).getState();
		
	}

}
