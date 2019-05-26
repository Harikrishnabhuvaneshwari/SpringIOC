/**
 * 
 */
package com.ioc.SpringIOC.beancreation;

/**
 * @author hprakash
 *
 */
public class Nokia implements Phone {

	/* (non-Javadoc)
	 * @see com.ioc.SpringIOC.Phone#call()
	 */
	public void call() {
		System.out.println("Calling from Nokia phone");
	}

	/* (non-Javadoc)
	 * @see com.ioc.SpringIOC.Phone#message()
	 */
	public void message() {
		System.out.println("Message is sent from nokia phone");
	}

	/* (non-Javadoc)
	 * @see com.ioc.SpringIOC.Phone#camera()
	 */
	public void camera() {
		System.out.println("Nokia's camera is on");
	}

}
