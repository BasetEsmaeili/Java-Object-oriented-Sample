package com.company;

import com.company.School.Student;

public class Main {
    private int age;
    public String expert;
    private static final long longitude = 34646874;

    public static void main(String[] args) {

        AbstractInhertance inhertance=new AbstractInhertance();
        inhertance.setBody();
        inhertance.setColor();

        // write your code here
        final String resultS = "Result";
        String nullSample;
        Main main = new Main();
        System.out.println(main.getFullName("Hesam", "Abdoli"));
        main.getExpert("Java", "Android");
        int a = 4;
        int b = 6;
        int result = a % b;
        a++;
        b--;
        a == b;
        a != b;
        a > b;
        b<a ;
        a >= b;
        a <= b;
        if (a == b && a > 4) {

        } else {

        }
        if (a == b || a > 4) {

        } else {

        }
        if (!b>a){

        }
        int score=1;
        int test=45;
        test+=score;
        if (resultS instanceof String){

        }else {

        }

        while (score>4){
            System.out.println(score);
            score++;
        }
        for (int i=0;i<100;i++){
            System.out.println(i);
        }
        int i=0;
        do {
            System.out.println(i);
        }while (i<50);
        if (i>4){
            System.out.println("از چهار بزرگ تر است");
        }else {
            System.out.println("از چهار کمتر است");
        }
        String name="Omar";
if (score>10){
    if (name.equals("Omar")){
        System.out.println("عمر خوش آمدی");
    }else {
        System.out.println("ورود مجاز نیست");
    }
}else {
    System.out.println("امتیاز خیلی پایین است");
}
if (score<1){

}else if (score>2){

}else if (score<5){

}
switch (score){
    case 10:
        System.out.println(score);
        break;
    case 11:
        System.out.println(score);
        break;
}
        Student student=new Student(85, new Student.OnStudentScoreRecived() {
            @Override
            public void onScoreRecived(int score) {
               System.out.println(score+"ایول نمره خوب است");
            }
        });
    }

    public String getFullName(String name, String lastName) {
        String result = name + " " + lastName;
        return result;
    }

    public void getExpert(String expert, String expert2) {
        System.out.println(expert + " " + expert2);
    }
}
