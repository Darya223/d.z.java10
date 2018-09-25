package org.itstep.qa.lesson.runner;

import org.itstep.qa.lesson.circle.Circle;

public class Runner {
    public static void main(String[] args) {
        Circle cr = new Circle();

        cr.ValueOfRadius(8);
        cr.getValueOfRadius();
        cr.getAreaOfCircle();
    }
}
