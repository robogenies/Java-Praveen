package com.robogenies.Week04.OOPSample;

public class _02InheritExample {


    public static void main(String[] args) {

        GrandChild grandChild=new GrandChild();

        grandChild.printGrandParent();
        grandChild.printGrandChild();

        System.out.print(grandChild.x);

    }


}

//Class D
class GrandChild extends GrandParent
{
    void printGrandChild()
    {
        System.out.print("I am a grand child");

    }

}

//Class C
class Son1
{
    void printGuardian()
    {
        System.out.println("I'm the Guardian");
    }
}

//Class B
class Parent extends GrandParent
{

    public void printParent()
    {
        System.out.println("I'm the Parent");
    }

}

//Class A
class GrandParent{
    int x=353636;
    public void printGrandParent()
    {
        System.out.println("I'm the Grand Parent");
    }
}
