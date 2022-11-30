package DataStructureAndAlgorithum.VITAP.LABClasses;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
    static class CGPAListNode{
        float data;
        CGPAListNode next;
        CGPAListNode(float data){
            this.data = data;
            next = null;
        }
    }
    static class StudentNode{
        String name;
        String rollNumber;
        String address;
        float cgpa;
        StudentNode next;

        StudentNode(String name, String rollNumber, String address, float cgpa){
            this.name = name;
            this.rollNumber = rollNumber;
            this.address = address;
            this.cgpa = cgpa;
            next = null;
        }
    }

    StudentNode head;
    CGPAListNode cgpaHead;
    public void add(String name, String rollNumber, String address, float cgpa){
        if (head == null){
            head = new StudentNode(name,rollNumber,address,cgpa);
            cgpaHead = new CGPAListNode(cgpa);
            head.next=head;
            return;
        }
        StudentNode currentNode = head;
        while (currentNode.next!=head)
            currentNode = currentNode.next;

        CGPAListNode newNode = new CGPAListNode(cgpa);
        newNode.next = cgpaHead;
        cgpaHead = newNode;

        currentNode.next = new StudentNode(name,rollNumber,address,cgpa);
        currentNode.next.next = head;
    }

    private void selectionSort(CGPAListNode cgpaHead){
        if (cgpaHead.next == null)
            return;

        CGPAListNode currentNode = cgpaHead.next;
        float temp;
        while (currentNode!=null) {
            temp = currentNode.data;
            if (cgpaHead.data > currentNode.data){
                currentNode.data = cgpaHead.data;
                cgpaHead.data = temp;
            }
            currentNode = currentNode.next;
        }
        selectionSort(cgpaHead.next);
    }

    public void selectionSort(){
        selectionSort(cgpaHead);
    }

    private StudentNode searchStudent(float cgpa, StudentNode head){
        if(head.cgpa == cgpa)
            return head;

        return searchStudent(cgpa,head.next);
    }

    int i = 1;
    private void display(CGPAListNode cgpaHead){
        if (cgpaHead == null)
            return;
        StudentNode temp = searchStudent(cgpaHead.data, this.head);
        System.out.printf("%d     %f    %s    %s    %s",i,temp.cgpa,temp.name,temp.rollNumber,temp.address);
        i++;
        System.out.println();
        display(cgpaHead.next);
    }


    public void input(){
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int serialNumber;
        try {
            serialNumber = scanner.nextInt();
        }catch (InputMismatchException e){
            selectionSort();
            System.out.println("S.No    CGPA        Name       Roll       Address");
            display(cgpaHead);
            return;
        }
        add(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat());
        input();
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("S.No        CGPA        Name       Roll       Address");
        student.input();
    }
}
