package task_5;

public abstract class Figure {
    String color; // цвет
    private float x;
    private float y;

    public Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // вычисление периметра фигуры
    public abstract float getPerimeter();

    // вычисление площади
    public abstract float getArea();
}
