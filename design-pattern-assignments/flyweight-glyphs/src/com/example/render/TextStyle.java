package com.example.render;

public class TextStyle {
    private final String font;
    private final int size;
    private final boolean bold;

    public TextStyle(String font, int size, boolean bold){
        this.bold = bold;
        this.font = font;
        this.size = size;
    }

    public String getFont() { return font; }
    public int getSize() { return size; }
    public boolean isBold() { return bold; }
}
