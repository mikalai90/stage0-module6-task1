package com.epam.mjc.stage0;

public class Bird extends Animal{
    public Bird() {
        super("blue", 2, false);
    }
    @Override
    public String getDescription() {
        String fur = isHasFur() ? "a" : "no";
        String paw = getNumberOfPaws() == 1 ? "paw" : "paws";
        return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + " " + paw + " and " + fur + " fur. Moreover, it has 2 wings and can fly.";
    }

}
