package com.itheima.innerClass3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3 {
    public static void main(String[] args) {
        //目标：搞清楚匿名内部类的几个使用场景
        //需求：登录窗口，登录按钮
        JFrame win=new JFrame("登录窗口");
        win.setSize(400,300);
        win.setLocationRelativeTo(null);  //居中
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel=new JPanel();
        win.add(panel);

        JButton btn=new JButton("登录");
        panel.add(btn);

        //给按钮添加一个监听器对象
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("登录按钮被点击了");
            }
        });

        win.setVisible(true);
    }
}
