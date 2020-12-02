package com.topic6;

import com.topic6.enumT.Apple;
import com.topic6.enumT.Operation;
import com.topic6.enumT.Planet;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @Author LJ
 * @Date 2020/11/19
 * msg
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(Apple.FUJI.equals(Apple.PIPP));

        final double apply = Operation.DIVIDE.apply(1, 3);

    }
}
