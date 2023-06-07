package ru.netology.graphics.image;

public class ColorSchema implements TextColorSchema {
    private char[] arr = {'#', '$', '@', '%', '*', '+', '-', '\''};

    @Override
    public char convert(int color) {
        final int count = 256 / arr.length;
        return arr[(color / count)];
    }
}
