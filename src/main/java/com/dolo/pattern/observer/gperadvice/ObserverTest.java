package com.dolo.pattern.observer.gperadvice;

public class ObserverTest {
    public static void main(String[] args) {
        GPer gper = GPer.getInstance();
        Teacher tomcat = new Teacher("Tomcat");
        Teacher dolojia = new Teacher("Dolojia");


        //这为没有@Tom老师
        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者设计模式适用于哪些场景？");
        //通知tom监听
        gper.addObserver(tomcat);
        //通知Dolojia监听
        gper.addObserver(dolojia);
        gper.publishQuestion(question);


    }

}
