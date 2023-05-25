package com.qiaozhi.phoneNumber;

import java.util.Scanner;

public class phoneNumber {
    String phoneNumber;


    public boolean setPhoneNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号码：");
        String currentNumber = sc. next();
        if (currentNumber.length() == 11) {
            for (int i = 0; i < currentNumber.length(); i++) {
                int chr = currentNumber.charAt(i);
                if (chr < 48 || chr > 57) {
                    System.out.println("手机号码包括字母等非法符号，请重新输入！");
                    return false;
                }
            }
            phoneNumber = currentNumber;
            System.out.println("手机号码保存成功");
            return true;
        }else {
            System.out.println("手机号码位数不正确，请重新输入！");
            return false;
        }
    }


    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String hidePartNumber(String phoneNumber){
        String numStart = phoneNumber.substring(0,3);
        String numEnd = phoneNumber.substring(7);
        return numStart + "****" + numEnd;
    }
}
