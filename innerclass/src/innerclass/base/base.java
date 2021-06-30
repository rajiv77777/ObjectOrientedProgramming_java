package innerclass.base;

import innerclass.base.inner.inclass;

public class base {

	public static void main(String[] args) {
		inclass inc = new inclass();
		inc.shopStatus();
		inc.getLock().setLock(false);
		inc.shopStatus();
	}  	 	

}
