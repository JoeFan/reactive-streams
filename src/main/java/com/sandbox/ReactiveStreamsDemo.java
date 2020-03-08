package com.sandbox;

import java.util.List;
import java.util.concurrent.Future;

public interface ReactiveStreamsDemo {

    Future<List<Integer>> doSquaresAsync(int count);

    Future<String> doStringConcatAsync(int count);

    Future<List<Integer>> doParallelSquaresAsync(int count);

    Future<String> doParallelStringConcatAsync(int count);

}
