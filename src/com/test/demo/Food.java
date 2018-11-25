package com.test.demo;

import java.util.Date;

public interface Food<T> {
    enum Coffe implements Food<String> {
        BLACK_COFFE {
            @Override
            public String getAnyThing() {
                return "black coffe";
            }
            @Override
            public String toString() {
                return this.getAnyThing();
            }
        }, WHITE_COFFE {
            @Override
            public String getAnyThing() {
                return "white coffe";
            }
            @Override
            public String toString() {
                return this.getAnyThing();
            }
        }, LATTE  {
            @Override
            public String getAnyThing() {
                return "latte";
            }
            @Override
            public String toString() {
                return this.getAnyThing();
            }
        }, CAPPUCCINO  {
            @Override
            public String getAnyThing() {
                return "cappuccino";
            }
            @Override
            public String toString() {
                return this.getAnyThing();
            }
        }
    }

    enum Dessert implements Food<Date> {
        FRUIT  {
            @Override
            public Date getAnyThing() {
                return new Date();
            }

            @Override
            public String toString() {
                return this.getAnyThing().toString();
            }
        }, CAKE  {
            @Override
            public Date getAnyThing() {
                return new Date();
            }

            @Override
            public String toString() {
                return this.getAnyThing().toString();
            }
        }, GELATO  {
            @Override
            public Date getAnyThing() {
                return new Date();
            }

            @Override
            public String toString() {
                return this.getAnyThing().toString();
            }
        }
    }

    T getAnyThing();

    String toString();
}
