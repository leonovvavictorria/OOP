package Encapsulation;


// происходит сокрытие данных для случайного(или намеренного) изменения кода, поэтому мы используем этот принцип
// доступ к полю/методу осуществляется с помощью геттеров и сеттеров
public class Encapsul {

    public static class Student {

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    class Test {

        public void main(String[] args) {
            Student student = new Student();
            student.setName("Josh");
            System.out.println(student.getName());
        }
    }
}
