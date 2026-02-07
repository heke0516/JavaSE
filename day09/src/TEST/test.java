package TEST;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        User u=new User();
//        u.setAddress(new Address("北京"));
//        System.out.println(u.getAddress());
        System.out.println("请输入名字：");
        Scanner sc=new Scanner(System.in);
        u.setName(sc.next());
        System.out.println("请输入年龄：");
        u.setAge(sc.nextInt());
        System.out.println("请输入地址：");
        u.setAddress(new Address(sc.next()));
        System.out.println(u);
    }
}
