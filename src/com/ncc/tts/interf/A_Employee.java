package com.ncc.tts.interf;

public class A_Employee extends A_Person {

    @Override
    public double luong() {
        System.out.println("12");
        return 0;
    }

    public static void main(String[] args) {

        A_Person p= new A_Employee();
        System.out.println("h");

        p.luong();
        p.sleep();
    }

//    private int empId;
//
//    public A_Employee(String nm, String gen, int id) {
//        super(nm, gen);
//        this.empId=id;
//    }
//
//    @Override
//    public void work() {
//        if(empId == 0){
//            System.out.println("Not working");
//        }else{
//            System.out.println("Working as employee!!");
//        }
//    } public static void main(String args[]){
//        A_Person student = new A_Employee("Dove","Female",0);
//        A_Person employee = new A_Employee("Pankaj","Male",123);
//        student.work();
//        employee.work();
//
//        employee.changeName("tran huy");
//        System.out.println(employee.toString());
//    }


//git
}
