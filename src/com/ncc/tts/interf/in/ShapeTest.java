package com.ncc.tts.interf.in;

import com.ncc.tts.interf.in.Circle;
import com.ncc.tts.interf.in.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Circle(10);
        s1.draw();
        System.out.println("Area= "+s1.getArea());

        Shape s2 = new Rectangle(10,10);
        s2.draw();
        System.out.println("Area= "+s2.getArea());
    }
}
