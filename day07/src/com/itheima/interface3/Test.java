package com.itheima.interface3;

public class Test {
    public static void main(String[] args) {
        //完成接口小案例
        Student[] allStudents= new Student[10];
        allStudents[0]=new Student("张三", 18, '男');
        allStudents[1]=new Student("张三", 18, '男');
        allStudents[2]=new Student("张三", 18, '男');
        allStudents[3]=new Student("张三", 18, '男');
        allStudents[4]=new Student("张三", 18, '男');
        allStudents[5]=new Student("张三", 18, '男');
        allStudents[6]=new Student("张三", 18, '男');
        allStudents[7]=new Student("张三", 18, '男');
        allStudents[8]=new Student("张三", 18, '男');
        allStudents[9]=new Student("张三", 18, '男');

        ClassDataInter cdi1 = new ClassDataImpl1(allStudents);
        cdi1.printAllStudentInfos();
        cdi1.printAverageScore();
        System.out.println("===================");
        ClassDataInter cdi2 = new ClassDataImpl2(allStudents);
        cdi2.printAllStudentInfos();
        cdi2.printAverageScore();
    }
}
