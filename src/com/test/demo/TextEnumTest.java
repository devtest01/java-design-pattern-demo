package com.test.demo;

public class TextEnumTest {
    public static void main(String[] args) {

        try {
            String a = test(args);
            System.out.println(a);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static <Target> Target test(Object... args) throws Exception {
        Target a = null;
        for (TextEnum textEnum : TextEnum.values()) {
            a = (Target)textEnum.getTextConvert().convert(args);
        }

//        a = (Target) TextEnum.CONV_half.getTextConvert().convert(args);

        return a;
    }
}
