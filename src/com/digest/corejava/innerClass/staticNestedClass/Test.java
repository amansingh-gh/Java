package com.digest.corejava.innerClass.staticNestedClass;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer("HP", "7500", "Window");
        computer.getOs().displayInfo();

        Computer.USB usb = new Computer.USB("TYPE-C");
    }
}
