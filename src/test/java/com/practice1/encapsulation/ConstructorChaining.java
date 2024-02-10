package com.practice1.encapsulation;

class Parent {
Parent() {
System.out.print("Parent ");
}
}
class Child extends Parent {
Child() {
this(1);
System.out.print("Child1 ");
}
Child(int a) {
System.out.print("Child2 ");
}
}
public class ConstructorChaining {
public static void main(String[] args) {
Child child = new Child();
for(int i=1; i<=5; i++)
System.out.print(i+" ");
System.out.println("JAVA");


}
}

