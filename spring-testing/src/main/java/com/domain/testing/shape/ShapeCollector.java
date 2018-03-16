package com.domain.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int figureNumber) {
        Shape theShapes = null;
        if (figureNumber >= 0 && figureNumber < shapes.size()) {
            theShapes = shapes.get(figureNumber);
        }
        return theShapes;
    }

    public int getSize() {
        return shapes.size();
    }
}
