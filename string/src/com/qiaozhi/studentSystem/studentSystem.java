package com.qiaozhi.studentSystem;

import java.util.Scanner;

public class studentSystem {
    public static void main(String[] args) {
        System.out.println("---------欢迎来到xxxx学生管理系统---------");
        System.out.println("1:添加学生信息");
        System.out.println("2:删除学生信息");
        System.out.println("3:修改学生信息");
        System.out.println("4:查询学生信息");
        System.out.print("请输入对应数字进行相应操作：");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch(number){
            case 1:
                Student stu01 = new Student();
                stu01.addStudentInfos();


            case 2:

            case 3:

            case 4:

        }


        {

        }






    }






}
