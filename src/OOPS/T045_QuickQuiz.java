package OOPS;

class T45_Animal{
    public void leg(){
        System.out.println("Have four legs");
    }

    public void ear(){
        System.out.println("Have 2 ears");
    }
}
class Dog extends T45_Animal {
    public void voice(){
        System.out.println("Voice of Dog ---> barks bhau bhau");
    }
}
public class T045_QuickQuiz {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.voice();
        dog.ear();
        dog.leg();
    }
}