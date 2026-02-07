package com.itheima.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher implements Comparable<Teacher>{
    private String name;
    private int age;
    private double salary;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}'+"\n";
    }

    /*t2.compareTo(t1)
    t2=this  比较者
    t1=o  被比较者
    如果左边大于右边，返回正整数
    如果左边小于右边，返回负整数
    如果左边等于右边，返回0*/
    @Override
    public int compareTo(Teacher o) {
        //按照薪水升序
        /*if (this.salary>o.salary) return 1;
        if (this.salary<o.salary) return -1;
        return 0;*/
        return (int)(this.salary-o.salary);  //简便写法
    }
}
