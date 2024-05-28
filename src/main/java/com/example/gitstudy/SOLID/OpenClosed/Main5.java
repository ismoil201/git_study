package com.example.gitstudy.SOLID.OpenClosed;

public class Main5 {
    public static void main(String[] args) {
        HelloProgrammer helloProgrammer = new HelloProgrammer();

        helloProgrammer.hi(new JavaProgrammer2());
        helloProgrammer.hi(new CProgrammer());
    }
}
