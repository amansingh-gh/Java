package com.digest.corejava.AccessModifier.test;

public class School {
    private static  School instance;
    private School(){};

        public static School getInstance(){
        if(instance ==  null){
            instance = new School();
        }
        return instance;
        }
}
