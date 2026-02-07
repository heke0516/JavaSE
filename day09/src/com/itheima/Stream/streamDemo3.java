package com.itheima.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class streamDemo3 {
    public static void main(String[] args) {
        //掌握stream提供的常用中间方法，对流上的数据进行处理（返回新流，支持链式编程）
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("张三丰");
        list.add("张强");
        list.add("张翠山");
        list.add("赵敏");

        //1、过滤方法
        list.stream().filter(name -> name.startsWith("张")).forEach(name -> System.out.println(name));
        //2、排序方法
        List<Double> scores=new ArrayList<>();
        scores.add(99.9);
        scores.add(99.1);
        scores.add(99.5);
        scores.add(99.3);
        scores.stream().sorted().forEach(score -> System.out.println(score));  //默认升序
        System.out.println("-------------------------");
        scores.stream().sorted((s1,s2)->-s1.compareTo(s2)).forEach(score -> System.out.println(score)); //降序
        System.out.println("-------------------------");
        scores.stream().sorted((s1,s2)->-s1.compareTo(s2)).limit(2).forEach(score -> System.out.println(score));//取前2个
        System.out.println("-------------------------");
        scores.stream().sorted((s1,s2)->-s1.compareTo(s2)).skip(2).forEach(score -> System.out.println(score));//跳过前2个
        System.out.println("-------------------------");
        //3、映射、加工方法
        scores.stream().map(s->s+"加10分后"+(s+10)).forEach(score -> System.out.println(score));
        //4、去重方法
        list.stream().distinct().forEach(name -> System.out.println(name));
        System.out.println("-------------------------");
        //5、合并流
        Stream<Object> s3=Stream.concat(list.stream(),scores.stream());
        s3.forEach(name -> System.out.println(name));  //Stream 在执行终端操作（如 forEach、count）后就会关闭，不能再使用。需要创建新的 Stream
        //System.out.println(s3.count());  //报错，因为s3流已经关闭了
        long length=Stream.concat(list.stream(),scores.stream()).count();  //Stream.count() 方法本身返回的就是 long 类型
        System.out.println(length);
    }
}
