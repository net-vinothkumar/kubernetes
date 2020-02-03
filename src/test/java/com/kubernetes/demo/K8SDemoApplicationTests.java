package com.kubernetes.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class K8SDemoApplicationTests {

	@Test
	public void testme () {
		Stream<Integer> stream = Stream.of(1,11,3,15,4,25);
		int result  = stream.filter(i -> i > 10).mapToInt(i -> i).sum();
		System.out.println(result);
	}

}
