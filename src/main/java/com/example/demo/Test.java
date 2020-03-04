package com.example.demo;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

public class Test {
    public static void main(String args[]) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,4,2,8,9);
        System.out.println(numbers.stream()
                .filter(e -> e % 2 == 0)
                .map( e -> e * 2)
                .collect(toList()));

    }
}
