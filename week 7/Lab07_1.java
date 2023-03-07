/**
 * author: chaipat jainan 650510606
 */

import java.util.Scanner;
import java.text.DecimalFormat;
public class Lab07_1 {
    // you can insert other methods to complish your work
    public static void printAllStudents(Student [] stu,int num_s) {
        System.out.println("Student");
        //insert code here
        for (int i=0;i<num_s;i++){
            System.out.println((i+1)+")"+stu[i].display()  );
        }
    }
    public static void printAllTeachers(Teacher [] teacher,int num_t) {
        System.out.println("Teacher");
        int i;
        //insert code here
        for (i=0;i<num_t;i++){
            System.out.println((i+1)+")"+teacher[i].display());
        }
    }
    public static void calAndPrintAvgAgeForStu(Student [] stu,int num_s){
        DecimalFormat df = new DecimalFormat("0.00");
        float avg;
        float sum=0.0f;
        for(int i=0;i<num_s;i++)
            sum+=stu[i].getAge();
        avg = sum/num_s;
        if (num_s == 0)
            System.out.println("0.00");
        else
            System.out.println(df.format(avg));
    }
    public static float calAndPrintAvgAgeForTea(Teacher [] teachers,int num_t){
        DecimalFormat df = new DecimalFormat("0.00");
        float avg;
        float sum=0.0f;
        for(int i=0;i<num_t;i++)
            sum+=teachers[i].getAge();

        avg = sum/num_t;
        if (num_t == 0)
            System.out.println("0.00");
        else
            System.out.println(df.format(avg));
        return avg;
    }
    public static void countTeacherBelowAvg(float avgT,Teacher[] teachers,int num_t){
        int count=0;
        for (int i=0;i<num_t;i++)
            if (avgT > teachers[i].getAge()) {
                count +=1;
            }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        Student [] stu = new Student[N];
        Teacher [] teacher = new Teacher[N];
        String perName;
        //is=i student.,it=i teacher
        int i,is=0,it=0,age;

        char type;
        for (i=0;i< N;i++){
//            input.nextLine(); // flush new line
            type = input.next().trim().charAt(0);
            type = Character.toLowerCase(type);
//            input.nextLine(); // flush new line
            perName = input.nextLine().trim();
            age = input.nextInt();
            if (type == 't'){
                teacher[it] = new Teacher(perName,age,input.nextInt());
                it++;
            }
            else{
                stu[is] = new Student(perName,age,input.nextInt());
                is++;
            }
        }


        printAllStudents(stu,is);
        calAndPrintAvgAgeForStu(stu,is);
        printAllTeachers(teacher,it);
        float avgT = calAndPrintAvgAgeForTea(teacher,it);
        countTeacherBelowAvg(avgT,teacher,it);
    }
}

class Person {
    protected String personName;
    protected int age;

    public void setName(String name){
        personName=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getPersonName(){
        return personName;
    }
    public int getAge(){
        return age;
    }
    public String display(){
        return (personName+" "+age);
    }
}
class Student  extends Person  {
    //insert code here
    private int level;
    public Student(String n,int age,int level){
        personName=n;
        this.age=age;
        this.level=level;
    }

    public void setLevel(){
        this.level =level;
    }
    @Override
    public String display(){
        return(super.display()+" "+level);
    }
}
class Teacher  extends Person  {
    private int salary;
    //insert code here
    public Teacher(String n,int age,int salary){
        personName=n;
        this.age=age;
        this.salary=salary;
    }

    public int getSalary(){
        return salary;
    }

    @Override public String display(){
        return(super.display()+" "+salary);
    }
}
/* input Example
5
t
Nida Jaidee
40 40000
t
Panya Pimpa
32 30000
s
Wipa Rattana
19 2
T
Siros Wiparat
35 35000
s
Jaisai Sirirat
20 3
*/
