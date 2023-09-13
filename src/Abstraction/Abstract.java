package Abstraction;



/*В этом примере абстрактный класс Shape содержит общие свойства и методы для всех фигур.
У него есть абстрактные методы getArea() и getPerimeter(), которые должны быть реализованы в наследниках.
Классы Circle и Rectangle наследуют абстрактный класс Shape и реализуют абстрактные методы в соответствии с логикой для каждой фигуры.
В методе main() создаются объекты Circle и Rectangle, которые вызывают метод printInfo(), чтобы вывести информацию о каждой фигуре, включая цвет, площадь и периметр.
Пример показывает, как абстракция в ООП позволяет определить общий интерфейс (абстрактный класс) и реализовать его в конкретных классах, обеспечивая гибкость и повторное использование кода.
 */

public class Abstract {
    abstract class Shape {
        protected String color;

        public Shape(String color) {
            this.color = color;
        }

        // абстрактный метод для получения площади
        public abstract double getArea();

        // абстрактный метод для получения периметра
        public abstract double getPerimeter();

        // общий метод для вывода информации о фигуре
        public void printInfo() {
            System.out.println("Цвет: " + color);
            System.out.println("Площадь: " + getArea());
            System.out.println("Периметр: " + getPerimeter());
        }
    }

    class Circle extends Shape {
        private double radius;

        public Circle(String color, double radius) {
            super(color);
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    class Rectangle extends Shape {
        private double length;
        private double width;

        public Rectangle(String color, double length, double width) {
            super(color);
            this.length = length;
            this.width = width;
        }

        @Override
        public double getArea() {
            return length * width;
        }

        @Override
        public double getPerimeter() {
            return 2 * (length + width);
        }
    }

    public class Main {
        public void main(String[] args) {
            Circle circle = new Circle("Красный", 5.0);
            circle.printInfo();

            System.out.println();

            Rectangle rectangle = new Rectangle("Синий", 4.0, 6.0);
            rectangle.printInfo();
        }
    }
}
