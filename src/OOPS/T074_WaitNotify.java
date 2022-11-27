package OOPS;

//Whenever use wait() n notify() method use Synchronized keyword in that particular method

class TwoPersonLTalkLine{
    int i=0;
    String[] talk={"Aryan ---> Hy Hello Nayan","Nayan ---> Hello Aryan","Aryan ---> Kasa Ha bhai tu?",
            "Nayan ---> Thik!\n\t\t   Tu Bata, Tu kasa hai?","Aryan ---> Sab Badiya",
            "Nayan ---> Are ek baat bata!","Aryan ---> H bol!",
            "Nayan ---> Tera is Summer Vacation m kya plans ha?","Aryan ---> DSA soch rha hoon complete krne ka",
            "Nayan ---> Acha ok bhai mera bhi same plan ha, or ab tu bhi DSA hi kar rha to sath milke krenga",
            "Aryan ---> Are Bilkul","Nayan ---> Ha Bhai","Aryan ---> chal thik jab start krna DSA to batana",
            "Nayan ---> bilkul Bhai","Aryan ---> Ha ok bye ... Ttyl","Nayan ---> Byee...ttyl"};
    public synchronized void odd(){//it will get call by Aryan
        if (i%2!=0){
            try {
                wait();
            }catch (Exception e){
                System.out.println("Error!");
            }
        }
        System.out.println((i+1)+" "+talk[i]);
        i++;
        notify();
    }
    public synchronized void even(){//it will get call by Nayan
        if (i%2==0){
            try {
                wait();
            }catch (Exception e){
                System.out.println("Error!");
            }
        }
        System.out.println((i+1)+" "+talk[i]);
        i++;
        notify();
    }
}
class AryanTalk implements Runnable{
    TwoPersonLTalkLine line;
    AryanTalk(TwoPersonLTalkLine line){
        this.line=line;
    }

    public void run(){
        for (int i=0;i<8;i++){
            line.odd();
        }
    }

}
class NayanTalk implements Runnable{
    TwoPersonLTalkLine line;
    NayanTalk(TwoPersonLTalkLine line){
        this.line=line;
    }
    public void run(){
        for (int i=0;i<8;i++){
            line.even();
        }
    }
}
public class T074_WaitNotify {
    public static void main(String[] args) {
        TwoPersonLTalkLine twoPersonLTalkLine=new TwoPersonLTalkLine();
        AryanTalk aryanTalk=new AryanTalk(twoPersonLTalkLine);
        NayanTalk nayanTalk=new NayanTalk(twoPersonLTalkLine);

        Thread t1=new Thread(aryanTalk);
        t1.setName("Aryan Talk");
        Thread t2=new Thread(nayanTalk);
        t2.setName("Nayan Talk");

        t1.start();
        t2.start();
    }
}