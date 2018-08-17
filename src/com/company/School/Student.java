package com.company.School;

import com.company.Univercity.DefaultSample;
import com.company.Univercity.ProtectedSample;

public class Student extends Father{
    private int score;
    private OnStudentScoreRecived scoreRecived;
    public Student(int score,OnStudentScoreRecived scoreRecived){
        this.score=score;
        this.scoreRecived=scoreRecived;
    }
    @Override
    public int age(int age) {
        return super.age(age);
    }

    @Override
    public void freelancer(String work) {
        String w="کشاورز";
        super.freelancer(work);
    }

    @Override
    public void driver() {
        super.driver();
    }
    public static void getStatic(){

    }
    public void scoreGeter(){
     if (score>80){
         scoreRecived.onScoreRecived(score);
     }else {
         System.out.println("نمره خوبی نیست");
     }
    }
    interface OnStudentScoreRecived{
        void onScoreRecived(int score);
    }

}
