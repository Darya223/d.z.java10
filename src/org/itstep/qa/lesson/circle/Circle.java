package org.itstep.qa.lesson.circle; //Создать программу для работы с объектом круг. Создать в отдельном файле класс Circle (круг).
// Описать его свойства (атрибуты) и реализовать методы. В главном классе присвоить значения свойству круга и узнать площадь круга.

public class Circle {
    public double circleRadius;
    public double pi = 3.14;

    public void ValueOfRadius(double i) {
       circleRadius = i;
    }

    public void getValueOfRadius() {
        System.out.println("радиус круга равен" + circleRadius);
    }

    public double getAreaOfCircle(){
        double s = pi*circleRadius*circleRadius;
        System.out.println("площадь круга равна" + s);
        return s;
    }
}
