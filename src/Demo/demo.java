package Demo;

/**
 * �����ڲ���
 *
 * �����ڲ���Ҳ����û�����ֵ��ڲ��� ����Ϊû�����֣����������ڲ���ֻ��ʹ��һ�Σ���ͨ�������򻯴����д
 * ��ʹ�������ڲ��໹�и�ǰ������������̳�һ�������ʵ��һ���ӿ�
 */

/**
 * �����������ڲ���
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
 * ʹ�������ڲ��෽��
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
                System.out.println("�����ڲ�");
            }
        };
        person.eat();
    }
}
