package innerclass.base.inner;

public class inclass {

	private Lock lock;
	public inclass() {
		lock = new Lock(true);
	}
	
	
	public Lock getLock() {
		return lock;
	}


	public void shopStatus() {
		if(lock.isLock())
		{
			System.out.println("Locked");
		}
		else
		{
			System.out.println("not locked");
		}
	}
	
	public class Lock{
		private boolean lock;
		public Lock(boolean lock) {
			this.lock = lock;
		}
		public boolean isLock() {
			return lock;
		}
		public void setLock(boolean lock) {
			this.lock = lock;
		}
		
		
	}
}
