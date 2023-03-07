// chaipat jai 650510606
import java.util.Scanner;
import java.text.DecimalFormat;
public class Lab07_2 {

    public static Scanner sc = new Scanner(System.in);
    public static DecimalFormat df  = new DecimalFormat("0.00");
    public static void main(String[] args) {
        int i, n = sc.nextInt();
        if (n > 0) {
            int totalSalary = 0, totalOvertime = 0, paidTotal;
            MonthlyEmployee[] monthlyEmployees = new MonthlyEmployee[n];

            for (i = 0; i < n ; i++) {
                String id = sc.nextLine().trim();
                String name = sc.nextLine().trim();
                int salary = sc.nextInt();
                int overtime = sc.nextInt();
                monthlyEmployees[i] = new MonthlyEmployee(id, name, salary, overtime);

            }
            for (MonthlyEmployee m: monthlyEmployees) {
                totalSalary += m.salary;
                totalOvertime += m.overtime;

                String info = m.id + "," + m.name + "," + m.salary + "," + m.overtime;
                System.out.println(info);
            }
            paidTotal = totalOvertime+totalSalary;
            System.out.println(totalSalary + "," + totalOvertime + "," + paidTotal);
        }

        n = sc.nextInt();
        if (n > 0) {
            int totalCommission = 0, totalPaid = 0, totalSalary;
            WeeklyEmployee[] weeklyEmployees = new WeeklyEmployee[n];

            for (i = 0; i < n; i++) {

                String id = sc.nextLine().trim();
                String name = sc.nextLine().trim();
                int totalSale = sc.nextInt();
                int commissionRate = sc.nextInt();
                int paidRate = sc.nextInt();
                int workTime = sc.nextInt();
                weeklyEmployees[i] = new WeeklyEmployee(id, name, totalSale, commissionRate, paidRate, workTime);

            }
            for (WeeklyEmployee w: weeklyEmployees) {
                totalCommission += w.commission;
                totalPaid += w.paid;


                String info = w.id + "," + w.name + "," + df.format(w.commission) + "," + w.paid + "," + df.format(w.commission+w.paid);
                System.out.println(info);
            }
            totalSalary = totalCommission+totalPaid;
            System.out.println(df.format(totalCommission) + "," + totalPaid + "," + df.format(totalSalary));
        }

        n = sc.nextInt();
        if (n > 0) {
            int totalCommission = 0, totalPaid = 0, totalSalary;

            DailyEmployee[] dailyEmployees = new DailyEmployee[n];


            for (i = 0; i < n; i++) {
                String id = sc.nextLine().trim();
                String name = sc.nextLine().trim();
                int totalSale = sc.nextInt();
                int commissionRate = sc.nextInt();
                int paidRate = sc.nextInt();
                int workTime = sc.nextInt();
                dailyEmployees[i] = new DailyEmployee(id, name, totalSale, commissionRate, paidRate, workTime);

            }
            for (DailyEmployee d: dailyEmployees) {
                totalCommission += d.commission;
                totalPaid += d.paid;


                String info = d.id + "," + d.name + "," + df.format(d.commission) + "," + d.paid + "," + df.format(d.commission+d.paid);
                System.out.println(info);
            }
            totalSalary = totalCommission+totalPaid;
            System.out.println(df.format(totalCommission) + "," + totalPaid + "," + df.format(totalSalary));
        }
    }



}

class Employee {
    String id;
    String name;

    Employee (String id, String name) {
        this.id = id;
        this.name = name;
    }
}

class MonthlyEmployee extends Employee {


    int salary;
    int overtime;


    MonthlyEmployee (String id, String name, int salary, int overtime) {
        super(id, name);
        this.salary = salary;
        this.overtime = overtime*200;
    }
}

class TempEmployee extends Employee {

    int paid;
    int commission;

    int totalSale;
    int commissionRate;
    int paidRate;
    int workTime;

    TempEmployee(String id, String name, int totalSale, int commissionRate, int paidRate, int workTime) {
        super(id, name);

        this.totalSale = totalSale;
        this.commissionRate = commissionRate;
        this.paidRate = paidRate;
        this.workTime = workTime;
        this.paid = workTime*paidRate;
    }

    static void calPaid(DailyEmployee employee) {
        employee.commission = (employee.commissionRate* employee.totalSale)/100;
    }

    static void calPaid(WeeklyEmployee employee) {
        employee.commission = (employee.commissionRate* employee.totalSale)/100;
    }
}

class DailyEmployee extends TempEmployee {

    DailyEmployee(String id, String name, int totalSale, int commissionRate, int paidRate, int workTime) {
        super(id, name, totalSale, commissionRate, paidRate, workTime);
        TempEmployee.calPaid(this);
    }
}

class WeeklyEmployee extends TempEmployee {

    WeeklyEmployee(String id, String name, int totalSale, int commissionRate, int paidRate, int workTime) {
        super(id, name, totalSale, commissionRate, paidRate, workTime);
        TempEmployee.calPaid(this);
    }
}