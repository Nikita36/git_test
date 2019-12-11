package main.java;

import main.java.feature.DecoratorImpl;
import main.java.feature_2.OptimizationImpl;

public class Runner implements Printer {
    public static void main(String[] args) {

        System.out.println(new OptimizationImpl().optimization(new DecoratorImpl().addStr(new Runner().print())));
    }
}
