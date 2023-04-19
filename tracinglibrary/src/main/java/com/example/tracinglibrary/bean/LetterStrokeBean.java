package com.example.tracinglibrary.bean;

import java.util.List;

public class LetterStrokeBean {

    public String id;
    public String style;

    //@SerializedName("char")
    //@SerialzedName("char")
    public String letter;
    public List<Strokes> strokes;

    public static class Strokes {
        public List<String> points;
    }

    public List<String> getCurrentStrokePoints(int currentStroke) {
        return strokes.get(currentStroke).points;
    }
}
