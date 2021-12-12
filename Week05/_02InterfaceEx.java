package com.robogenies.Week05;
//12-Dec-2021
//Derived Class
public class _02InterfaceEx implements TestInterface {



    //Method Definition
    @Override
    public void print() {

        System.out.println("Praveen");

    }

    @Override
    public void onPaymentSuccess() {

    }

    @Override
    public void onPaymentFail() {

    }

    public static void main(String[] args) {
        _02InterfaceEx obj=new _02InterfaceEx();
        obj.print();
    }





}
    //Base Class
interface TestInterface
{
    //Method Signature (Signature = Name)
    void print();
    void onPaymentSuccess();
    void onPaymentFail();


}
