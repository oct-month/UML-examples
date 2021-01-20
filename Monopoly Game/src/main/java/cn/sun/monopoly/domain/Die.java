package cn.sun.monopoly.domain;

import java.util.Random;

public class Die
{
    public static final int MAX = 6;

    private int faceValue;
    private Random random;

    public Die()
    {
        random = new Random();
        this.roll();
    }

    public void roll()
    {
        this.faceValue = random.nextInt(MAX) + 1;
    }

    public int getFaceValue()
    {
        return this.faceValue;
    }
}
