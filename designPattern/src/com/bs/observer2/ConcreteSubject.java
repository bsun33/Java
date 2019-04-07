
package com.bs.observer2;

import java.util.Observable;

/**
* 
* @author bs
* @version Creation TIme：Apr 7, 2019 7:28:14 PM
*/
//JAVASE提供了Observable
public class ConcreteSubject extends Observable{
	
	private int state;
	
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public void set(int s) {
		state = s;
		
		setChanged();    // 表示目标对象已经做了更改
		notifyObservers(state);   // 通知所有的观察者
	}
}
