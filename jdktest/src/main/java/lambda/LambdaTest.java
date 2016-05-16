package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;
import java.util.function.Predicate;

import org.junit.Test;

public class LambdaTest {

	@Test
	public void test() {
		List<String> stringCollection = new ArrayList<>();
		stringCollection.add("ddd2");
		stringCollection.add("aaa2");
		stringCollection.add("bbb1");
		stringCollection.add("aaa1");
		stringCollection.add("bbb3");
		stringCollection.add("ccc");
		stringCollection.add("bbb2");
		stringCollection.add("ddd1");
		
//		stringCollection
//	    .stream()
//	    .filter((s) -> s.startsWith("a"))
//	    .forEach(System.out::println);
//		
//		System.out.println(stringCollection.get(0));
		
//		stringCollection
//		.stream()
//		.sorted()
//		.map(String::toUpperCase)
//		.sorted((a,b) -> b.compareTo(a))
//		.forEach(System.out::println);
//		
//		System.out.println(stringCollection.get(0));
		
//		boolean anyStartsWithA =
//			    stringCollection
//			        .stream()
//			        .anyMatch((s) -> s.startsWith("a"));
//
//	    System.out.println(anyStartsWithA);      // true
//
//	    boolean allStartsWithA =
//			    stringCollection
//			        .stream()
//			        .allMatch((s) -> s.startsWith("a"));
//
//		System.out.println(allStartsWithA);      // false
//
//		boolean noneStartsWithZ =
//			    stringCollection
//			        .stream()
//			        .noneMatch((s) -> s.startsWith("z"));
//
//		System.out.println(noneStartsWithZ);      // true
			

//        long startsWithB =
//             stringCollection
//             .stream()
//             .filter((s) -> s.startsWith("b"))
//             .count();
//
//        System.out.println(startsWithB);    // 3

//        Optional<String> reduced =
//        	    stringCollection
//        	        .stream()
//        	        .sorted()
//        	        .reduce((s1, s2) -> s1 + "#" + s2);
//
//        reduced.ifPresent(System.out::println);
		
		
//		int max = 1000000;
//		List<String> values = new ArrayList<>(max);
//		for (int i = 0; i < max; i++) {
//		    UUID uuid = UUID.randomUUID();
//		    values.add(uuid.toString());
//		}
		
//		long t0 = System.nanoTime();
//
//		long count = values.stream().sorted().count();
//		System.out.println(count);
//
//		long t1 = System.nanoTime();
//
//		long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
//		System.out.println(String.format("sequential sort took: %d ms", millis));
		
//		long t0 = System.nanoTime();
//
//		long count = values.parallelStream().sorted().count();
//		System.out.println(count);
//
//		long t1 = System.nanoTime();
//
//		long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
//		System.out.println(String.format("parallel sort took: %d ms", millis));
//		
//		Map<Integer, String> map = new HashMap<>();
//
//		for (int i = 0; i < 10; i++) {
//		    map.putIfAbsent(i, "val" + i);
//		}
//
//		map.forEach((id, val) -> System.out.println(val));		
//		
//		map.computeIfPresent(3, (num, val) -> val + num);
//		map.get(3);             // val33
//
//		map.computeIfPresent(9, (num, val) -> null);
//		map.containsKey(9);     // false
//
//		map.computeIfAbsent(23, num -> "val" + num);
//		map.containsKey(23);    // true
//
//		map.computeIfAbsent(3, num -> "bam");
//		map.get(3);             // val33	
//		
//		map.remove(3, "val3");
//		map.get(3);             // val33
//
//		map.remove(3, "val33");
//		map.get(3);             // null
//		
//		System.out.println(map.getOrDefault(42, "not found"));  // not found
//		
//
//        map.merge(9, "val9", (value, newValue) -> value.concat(newValue));
//        map.get(9);             // val9
//
//        map.merge(9, "concat", (value, newValue) -> value.concat(newValue));
//        map.get(9);             // val9concat

	}
	
	@Test
	public void test1() {
//		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

//        Collections.sort(names, (String a, String b) -> {
//            return b.compareTo(a);
//            });	
//        Collections.sort(names, (String a, String b) -> b.compareTo(a));
//        Collections.sort(names, (a, b) -> b.compareTo(a));
//        System.out.println(names);
        
//        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
//        Integer converted = converter.convert("123");
//        System.out.println(converted);    // 123
        
//        Converter<String, Integer> converter = Integer::valueOf;
//        Integer converted = converter.convert("123");
//        System.out.println(converted);   // 123
        
//		Predicate<String> predicate = (s) -> s.length() > 0;
//
//		predicate.test("foo");              // true
//		predicate.negate().test("foo");     // false
//
//		Predicate<Boolean> nonNull = Objects::nonNull;
//		Predicate<Boolean> isNull = Objects::isNull;
//
//		Predicate<String> isEmpty = String::isEmpty;
//		boolean h =isEmpty.test("hello");
//		boolean h1 =isEmpty.test("");
//		Predicate<String> isNotEmpty = isEmpty.negate();        

//		Function<String, Integer> toInteger = Integer::valueOf;
//		Function<String, String> backToString = toInteger.andThen(String::valueOf);
//
//		System.out.println(backToString.apply("123"));     // "123"
	}

}
