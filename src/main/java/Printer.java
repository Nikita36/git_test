package main.java;

public  interface  Printer {
    default String print(){
        return  "Я чувствую, что излишен";
    }
}
