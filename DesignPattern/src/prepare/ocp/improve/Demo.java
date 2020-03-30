package ocp.improve;

import java.awt.*;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/26 11:20
 */
public class Demo {
    public static void main(String[] args) {
        GraphicEditor editor = new GraphicEditor();
        editor.drawShape(new Rectangle());
        editor.drawShape(new Circle());
        editor.drawShape(new Triangle());
    }
}

// 用于绘图的类[使用方]
class GraphicEditor{
    //使用方不用修改，可扩展
    public void drawShape(Shape s){
        s.drawShape();
    }
}

abstract class Shape{
    int type;
    abstract void drawShape();
}



class Rectangle extends Shape {
    {
        type = 1;
    }

    @Override
    void drawShape() {
        System.out.println("1");
    }
}

class Circle extends Shape {
    {
        type = 2;
    }

    @Override
    void drawShape() {
        System.out.println("2");
    }
}

class Triangle extends Shape {
    {
        type = 3;
    }

    @Override
    void drawShape() {
        System.out.println("3");
    }
}