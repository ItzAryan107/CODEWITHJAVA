package OOPS;

import java.util.Scanner;

class Employe{
    int id;
    int salary;
    String name;
    String detailOf;
    public int getSalary(int a){
        salary=a;
        return salary;
    }
    public void getDetail(String a,String b,int c){
        detailOf=a;
        name=b;
        id=c;
        System.out.println("Detail of ---> "+detailOf);
        System.out.println("My name ---> "+name);
        System.out.println("My i'd ---> "+id);
    }
}

public class T035_Function {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Employe aryan=new Employe();

        System.out.print("Enter detailOf ---> ");
        String a=sc.nextLine();
        System.out.print("Enter you name ---> ");
        String b=sc.nextLine();
        System.out.print("Enter your Id ---> ");
        int c=sc.nextInt();
        System.out.print("Enter your Salary ---> ");
        int d=sc.nextInt();

        System.out.println();
        aryan.getDetail(a,b,c);
        System.out.println("Your Salary ---> "+aryan.getSalary(d));
    }
}
