
package com.bs.observer2;

import java.util.Observable;
import java.util.Observer;


/**
* 
* @author bs
* @version Creation TIme：Apr 7, 2019 7:30:52 PM
*/
//JAVASE提供了Observer
public class ObserverA implements Observer{
	
	private int myState;

	public int getMyState() {
		return myState;
	}

	public void setMyState(int myState) {
		this.myState = myState;
	}

	@Override
	public void update(Observable o, Object arg) {
		myState = ((ConcreteSubject)o).getState();
		
	}

	

}
