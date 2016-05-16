package synchronization;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import org.junit.Test;

public class ReentrantLockTest {

	@Test
	public void test() {
		ReentrantLock lock = new ReentrantLock();
		
		try {
			lock.tryLock(100, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println("Hello world");
	}

}
