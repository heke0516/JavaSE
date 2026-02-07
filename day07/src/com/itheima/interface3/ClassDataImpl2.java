package com.itheima.interface3;

public class ClassDataImpl2 implements ClassDataInter{
    private Student[] students;
    public ClassDataImpl2(Student[] students) {
        this.students = students;
    }
    @Override
    //打印学生信息，并输出男生女生人数
    public void printAllStudentInfos() {
        int countMaleStudents = 0;
        int countFemaleStudents = 0;
        System.out.println("打印所有学生的信息");
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            if(s.getSex() == '男') {
                countMaleStudents++;
            } else {
                countFemaleStudents++;
            }
            System.out.println(s.getName()+"---"+s.getScore()+"---"+s.getSex());
        }
        System.out.println("男生人数："+countMaleStudents);
        System.out.println("女生人数："+countFemaleStudents);
    }
    @Override
    //去掉一个最高分，去掉一个最低分，并计算剩余的分数的平均分
    public void printAverageScore() {
        double max=students[0].getScore();
        double min=students[0].getScore();
        System.out.println("打印所有学生的平均分");
        double sum = 0;
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            if(s.getScore()>max) {
                max = s.getScore();
            } else if(s.getScore()<min) {
                min = s.getScore();
            }
            sum += s.getScore();
        }
        System.out.println("平均分是："+((sum-max-min)/(students.length-2)));
    }
}
