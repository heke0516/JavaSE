package com.itheima.reflect;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class SaveObjectFrameWork {
    //保存任意对象的静态方法
    public static void saveObject(Object obj) throws FileNotFoundException, IllegalAccessException {
        PrintStream ps=new PrintStream(new FileOutputStream("day12\\src\\com\\itheima\\reflect\\info.txt", true));
        //狗 学生 老师
        //1、获取Class对象
        Class c = obj.getClass();
        String simpleName= c.getSimpleName();
        ps.println("====="+simpleName+"=====");
        //2、获取对象的所有字段
        Field[] fields = c.getDeclaredFields();
        //3、遍历字段，将字段名和字段值写到info.txt文件中
        for (Field f : fields) {
            String fieldname = f.getName();
            //权限打开，强制访问私有的成员变量
            f.setAccessible(true);
            Object fieldvalue = f.get(obj);
            //打印到文件中去
            ps.println(fieldname+"("+fieldvalue+")");
        }
        ps.close();
    }
}
