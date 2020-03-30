package ocp;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/26 11:12
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
    public void drawShape(Shape s){
           s.drawShape(s);
    }
}

class Shape{
    int type;
    public void drawShape(Shape s){
        if(s.type == 1){
            drawRectangle(s);
        }else if(s.type == 2){
            drawCircle(s);
        }else if (s.type == 3){
            drawTriangle(s);
        }
    }

    public void drawRectangle(Shape r){
        System.out.println("矩形");
    }

    public void drawCircle(Shape c){
        System.out.println("圆形");
    }

    public void drawTriangle(Shape t){
        System.out.println("三角形");
    }
}


class Rectangle extends Shape{
    {
        type = 1;
    }
}

class Circle extends Shape{
    {
        type = 2;
    }
}

class Triangle extends Shape{
    {
        type = 3;
    }
}