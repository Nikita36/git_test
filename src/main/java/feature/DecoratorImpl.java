package main.java.feature;

public class DecoratorImpl implements Decorator {

    @Override
    public String addStr(String str) {
        return str + " Я добавлюсь к любой строке, хм, может я вирус?";
    }
}
