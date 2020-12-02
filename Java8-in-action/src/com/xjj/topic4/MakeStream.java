package com.xjj.topic4;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @Author LJ
 * @Date 2020/11/6
 * msg 生成流
 */

public class MakeStream {
    public static void main(String[] args) {
        /*1.  由值创建流  */
        // 调用Arrays.stream()
        Stream<String> stream = Stream.of("123", "java", "hhhh");
        stream.map(String::toCharArray).forEach(System.out::println);

        // 创建空流
        Stream<String> empty = Stream.empty();
        // Arrays静态方法
        int sum = Arrays.stream(new int[]{1, 2, 3}).sum();


        /*2. 文件生成流*/
        long count = 0;
        try (Stream<String> lines = Files.lines(Paths.get("123.txt"), Charset.defaultCharset())) {
            count = lines.flatMap(line -> Arrays.stream(line.split(" ")))
                    .distinct()
                    .count();
        } catch (IOException e) {
        }

        /*3. 函数生成流 生成无限流*/
        // 有初始值
        Stream.iterate(0, n -> n+1)
                .limit(10)
                .forEach(System.out::println);
        // 无初始值
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);
    }
}
