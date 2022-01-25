package com.Q1;

import java.io.Serializable;

enum MySingleton {
	SINGLETON;
//logic
}

public class SingletonDp implements Cloneable, Serializable {

	private static final long serialVersionUID = -6834926027969920657L;

	private volatile static SingletonDp singleton = null; 

	private SingletonDp() {

		if (singleton != null) {

			throw new IllegalStateException("Dont Call me Using Reflection"); 
			
// using reflection

		}

	}

	public static SingletonDp getSingleton() {

		if (singleton == null) {

			synchronized (SingletonDp.class) {
// Double Locking applied
				if (singleton == null) {

					singleton = new SingletonDp(); 

				}

			}

		}

		return singleton;

	}

	@Override

	protected Object clone() throws CloneNotSupportedException {

		return singleton; 

	}

	private Object readResolve() {

		return singleton; 
		
		
// using deserialization

	}

	public static void main(String[] args) {
		MySingleton singletonEnum = MySingleton.SINGLETON; 
		System.out.println(singletonEnum.hashCode());

		MySingleton singletonEnum2 = MySingleton.SINGLETON;
		System.out.println(singletonEnum2.hashCode());
	}

}
