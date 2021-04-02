package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {
    private List<Integer> intList;

    public StreamMain(List<Integer> intList) {
        this.intList = intList;
    }
    public Stream filterStream() {
        Stream<Integer> stream = intList.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder());
        return stream;
    }
}
