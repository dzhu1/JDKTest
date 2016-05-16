package forkjoin;

import java.util.Collection;
import java.util.concurrent.RecursiveTask;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Calculator extends RecursiveTask<Integer> {
	
	private static final int THRESHOLD = 100;
	private int start;
	private int end;
	
	public Calculator(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	protected Integer compute() {
		int sum = 0;
		if ((end - start) < THRESHOLD) {
			sum = Stream.generate(() -> start++).limit(end - start + 1).reduce((v1, v2) -> v1 + v2).get();
//			for(int i=start; i<=end;i++) {
//				sum +=i;
//			}
		} else{
			int middle = (start + end)/2;
			Calculator left = new Calculator(start, middle);
			Calculator right = new Calculator(middle+1, end);
			left.fork();
			right.fork();
			
			sum = left.join() + right.join();
		}
		return sum;
	}

}
