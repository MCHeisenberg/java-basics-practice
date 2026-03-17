package day06;

public class Student {
    String name;
    int age;
    Computer myPc;

    public void study(){
        System.out.println(name + " is studying.");
    }

    public void writeCode(){
        System.out.println("鄙人江湖外号："+name+","+"我今年"
        +age+"岁，"+"我正在用我的"+myPc.brand +"电脑疯狂敲代码，键盘都在喷火手指上全在彪电火花！");
    }
}
