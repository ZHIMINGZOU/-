package Demo;

/**
 * 匿名内部类
 *
 * 匿名内部类也就是没有名字的内部类 正因为没有名字，所以匿名内部类只能使用一次，它通常用来简化代码编写
 * 但使用匿名内部类还有个前提条件：必须继承一个父类或实现一个接口
 */

/**
 * 不适用匿名内部类
 */

/**
class Person {
    public void eat() {
        System.out.println("Person..");
    }
}

class Student extends Person {
    public void eat() {
        System.out.println("student..");
    }
}

public class demo {
    public static void main(String[] args) {
        Person person = new Student();
        person.eat();
    }
}
*/

/**
 * 使用匿名内部类方法
 */
class Person {
    public void eat() {
        System.out.println("Person..");
    }
}

public class demo {
    public static void main(String[] args) {
        Person person = new Person() {
            public void eat() {
                System.out.println("匿名内部");
            }
        };
        person.eat();
    }
}
