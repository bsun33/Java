
package com.bs.observer;

import java.util.ArrayList;
import java.util.List;


/**
* 
* @author bs
* @version Creation TIme：Apr 7, 2019 11:47:59 AM
*/


public class Subject {
	
	protected List<Observer> list = new ArrayList<Observer>();
	
	public void registerObserver(Observer obs) {
		list.add(obs);
	}
	
	public void removeObserver(Observer obs) {
		list.remove(obs);
	}
	
	//notice all observers to update status
	public void notifyAllObservers() {
		for(Observer observer : list) {
			observer.update(this);
		}
	}
	
}
