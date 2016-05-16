package synchronization.delayedqueue;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class DelayItem<T> implements Delayed{
	private static final long NANO_ORIGIN = System.nanoTime();
	
	final static long now() {
		return System.nanoTime() - NANO_ORIGIN;
	}
	
	private static final AtomicLong sequencer = new AtomicLong(0);
	
	private long sequenceNumber;
	
	private long time;
	
	private T item;
	
	public DelayItem(T submit, long timeout) {
		this.time = now() + timeout;
		this.item = submit;
		this.sequenceNumber = sequencer.getAndIncrement();
	}
	

	@Override
	public int compareTo(Delayed other) {
        if (other == this) // compare zero ONLY if same object
            return 0;
        if (other instanceof DelayItem) {
            DelayItem x = (DelayItem) other;
            long diff = time - x.time;
            if (diff < 0)
                return -1;
            else if (diff > 0)
                return 1;
            else if (sequenceNumber < x.sequenceNumber)
                return -1;
            else
                return 1;
        }
        long d = (getDelay(TimeUnit.NANOSECONDS) - other.getDelay(TimeUnit.NANOSECONDS));
        return (d == 0) ? 0 : ((d < 0) ? -1 : 1);
	}

	@Override
	public long getDelay(TimeUnit unit) {
        long d = unit.convert(time - now(), TimeUnit.NANOSECONDS);
        return d;
	}
	

    public T getItem() {
        return this.item;
    }

}
