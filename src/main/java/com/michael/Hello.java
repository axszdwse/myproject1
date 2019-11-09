package com.michael;

public class Hello {
    public static void main(String[] args) {
        //System.out.println("Hello World");
        Person person=new Person();
        person.hello();
        int age=19; //short 16bits;int 32bits;long 64bits;
        Integer age2=19;//參造資料型態;包裝類別
        char c='A';//16bits
        Character c2='A';
        byte b=120;//8bits
        float weight=66.5f;//32bits後面要加f
        double height=1.7;//64bits
        boolean adult=true;
        boolean enroll=false;
        String name="Michael";
    }
}
