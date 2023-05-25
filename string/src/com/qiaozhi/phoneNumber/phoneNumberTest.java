package com.qiaozhi.phoneNumber;

public class phoneNumberTest {
    public static void main(String[] args) {
        phoneNumber pn1 = new phoneNumber();
        if (pn1.setPhoneNumber()){
            String phoneNumber = pn1.getPhoneNumber();
            String newPhoneNumber = pn1.hidePartNumber(phoneNumber);
            // System.out.println(phoneNumber);
            System.out.println(newPhoneNumber);

        }
    }
}
