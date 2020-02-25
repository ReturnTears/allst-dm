package com.allst.dm.ocp;

/**
 * 开闭原则
 *
 * @author YiYa
 * @since 2020-02-25 上午 11:55
 */
public class Ocp {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
    }

}
// 使用方
class GraphicEditor {
    public void drawShape(Shape s) {
        s.draw();
    }
}
// 基类
abstract class Shape {
    int type;
    public abstract void draw();
}
//
class Rectangle extends Shape {

    public Rectangle() {
        super.type = 1;
    }

    @Override
    public void draw() {
        System.out.println("~~~Rectangle~~~");
    }
}
//
class Circle extends Shape {

    public Circle() {
        super.type = 2;
    }

    @Override
    public void draw() {
        System.out.println("~~~Circle~~~");
    }
}
// 有需求新增即可，对提供者开发