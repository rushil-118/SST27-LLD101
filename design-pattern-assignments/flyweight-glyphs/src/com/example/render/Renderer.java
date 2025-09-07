package com.example.render;

public class Renderer {
    public int render(String text) {
        int cost = 0;
        for (char c : text.toCharArray()) {
            TextStyle textStyle = TextStyleFactory.getTextStyle("Inter", 14, (c % 7 == 0));
            Glyph g = new Glyph(c, textStyle); // TODO: refactor with TextStyle flyweights
            cost += g.drawCost();
        }
        return cost;
    }
}
