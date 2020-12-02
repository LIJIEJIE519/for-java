package com.topic6.enumT;

public class WeightTable {
   public static void main(String[] args) {
      double earthWeight = Double.parseDouble("100");

      double mass = earthWeight / Planet.EARTH.surfaceGravity();
      // values返回声明顺序的值数组
      final Planet[] values = Planet.values();  // [MERCURY, EARTH]
      // valueOf方法
      System.out.println(Planet.valueOf("EARTH").mass());
      // toString()实现为枚举值的名称
      System.out.println(Planet.EARTH);

      for (Planet p : Planet.values())
         System.out.printf("Weight on %s is %f%n",
                 p, p.surfaceWeight(mass));
   }
}
