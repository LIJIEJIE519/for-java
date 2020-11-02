package com.topic2.try_with_re;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Try_with {
    public static void main(String[] args) {

    }

    // 自动close
    static String test(String path, String defaultV) {
        try (BufferedReader br = new BufferedReader(
                new FileReader(path))) {
            return br.readLine();
        } catch (IOException e) {
            return defaultV;
        }
    }

}
