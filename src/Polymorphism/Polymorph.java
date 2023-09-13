package Polymorphism;

//этот принцип позволяет переопределить поведение метода, которое нужно для работы
//здесь переопределение метода walk() класса Person
public class Polymorph {
    class Person {

        void walk() {
            System.out.println("Can Run....");
        }
    }

    class Employee extends Person {

        void walk() {
            System.out.println("Running Fast...");
        }


        public void main(String[] arg) {
            Person p = new Employee();
            p.walk();
        }
    }


    //здесь перегрузка методов
    //то есть это использование одного имени метода с разными параметрами.
    public class Program{

        public static void main(String[] args) {

            System.out.println(sum(2, 3));          // 5
            System.out.println(sum(4.5, 3.2));      // 7.7
            System.out.println(sum(4, 3, 7));       // 14
        }
        static int sum(int x, int y){

            return x + y;
        }
        static double sum(double x, double y){

            return x + y;
        }
        static int sum(int x, int y, int z){

            return x + y + z;
        }
    }

}
