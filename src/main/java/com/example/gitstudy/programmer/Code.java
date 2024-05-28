package com.example.gitstudy.programmer;

public class Code {

    Programmer programmer;
    public  void  writeCode(){
        if (programmer instanceof  JavaProgrammer){
            System.out.println("Java programmer");
        } else if (programmer instanceof  CProgrammer) {
            System.out.println("C programmer");
        }
    }
}
