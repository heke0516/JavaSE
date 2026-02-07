package com.itheima.interface3;

public class ClassDataImpl1 implements ClassDataInter{
    private Student[] students;
    public ClassDataImpl1(Student[] students) {
        this.students = students;
    }

    @Override
    public void printAllStudentInfos() {
        System.out.println("打印所有学生的信息");
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s.getName()+"---"+s.getScore()+"---"+s.getSex());
        }


    }
    @Override
    public void printAverageScore() {
        System.out.println("打印所有学生的平均分");
        double sum = 0;
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            sum += s.getScore();
        }
        System.out.println("平均分是："+(sum/students.length));

    }
}
