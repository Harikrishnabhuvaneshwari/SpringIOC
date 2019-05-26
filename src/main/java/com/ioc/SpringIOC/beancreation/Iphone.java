/**
 * 
 */
package com.ioc.SpringIOC.beancreation;

/**
 * @author hprakash
 *
 */
public class Iphone implements Phone {

	/* (non-Javadoc)
	 * @see com.ioc.SpringIOC.Phone#call()
	 */
	public void call() {
		System.out.println("Calling from Iphone");
	}

	/* (non-Javadoc)
	 * @see com.ioc.SpringIOC.Phone#message()
	 */
	public void message() {
		System.out.println("Message is sent from Iphone");
	}

	/* (non-Javadoc)
	 * @see com.ioc.SpringIOC.Phone#camera()
	 */
	public void camera() {
		System.out.println("Iphone's camera is on");
	}

}
