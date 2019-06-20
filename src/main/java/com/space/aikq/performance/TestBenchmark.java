package com.space.aikq.performance;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.infra.Blackhole;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author aikaiqiang
 * @date 2019年06月20日 13:37
 */
public class TestBenchmark {

	@Benchmark
	@BenchmarkMode(Mode.AverageTime)
	@OutputTimeUnit(TimeUnit.MINUTES)
	public void method(Blackhole blackhole){
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		int sum = sum(list);
		System.out.println(sum);
		blackhole.consume(sum);
	}

	public int sum(List<Integer> list){
		int sum = 0;
		list.forEach(i -> add(sum, i));
		return sum;
	}

	public int add(int sum, int i){
		return sum + i;
	}
}
