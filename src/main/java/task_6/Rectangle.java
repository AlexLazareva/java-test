package task_6;

import task_5.Figure;

public class Rectangle extends Figure {
    private float width;
    private float height;

    Rectangle(float x, float y, float width, float height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public float getPerimeter() {
        return width * 2 + height * 2;
    }

    @Override
    public float getArea() {
        return width * height;
    }

    public boolean isSquare(float width, float height) {
        if (width == height) {
            return true;
        } else {
            return false;
        }
    }
}
