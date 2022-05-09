package com.uz;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(increment.apply(3));

        Function<Integer, Integer> multiply10AndIncrement1 = multiply.andThen(increment);
        System.out.println(multiply10AndIncrement1.apply(3));

        System.out.println(multiplyAndIncrement.apply(3,10));

        System.out.println(isPhoneNumberValid.test("12345"));
        System.out.println(contains.and(isPhoneNumberValid).test("1245"));
        System.out.println(contains.or(isPhoneNumberValid).test("1245"));

//        Lambda expressions
        Function<String,String> upperCase= String::toUpperCase;

        System.out.println(upperCase.apply("abror"));
        System.out.println(getUrl);

    }

    static Function<Integer, Integer> increment = number -> number + 1;
    static Function<Integer, Integer> multiply = number -> number * 10;

    static BiFunction<Integer,Integer,Integer> multiplyAndIncrement=
            (increment,multiply)-> (increment+1)*multiply;

    static Predicate<String> isPhoneNumberValid=phoneNumber->
            phoneNumber.startsWith("12")&&phoneNumber.length()==5;

    static Predicate<String> contains=phoneNumber->phoneNumber.contains("3");

    static Supplier<String> getUrl= ()->"https://github.com/AbrorbekAllaberganov/Abror";


}