/**
 * Created by jboiko on 05/12/2017.
 */

import java.util.*;


public class SortTest {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student2> studentList = new ArrayList<Student2>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student2 st = new Student2(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList, new Comparator<Student2>() {
            public int compare(Student2 o1, Student2 o2) {
                System.out.println("1: "+ (o1.getCgpa() > o2.getCgpa()));
                System.out.println("2: "+ (o1.getId() < o2.getId()));
                System.out.println("3: "+ (o1.getCgpa() > o2.getCgpa() ? -1 : (o1.getId() < o2.getId()) ? 1 : 0));
                System.out.println();
                return o1.getCgpa() > o2.getCgpa() ? -1 : (o1.getId() < o2.getId()) ? 1 : 0;
                // (a < b) ? a : b;
            }
        });

        Collections.sort(studentList,
                new Comparator<Student2>() {
                    public int compare(Student2 o1, Student2 o2) {
                        if (o1.getCgpa() == o2.getCgpa()) {
                            return o1.getFname().compareTo(o2.getFname());
                        }
                        return 0;
                    }
                });

        for (Student2 st : studentList) {
            System.out.println(st.getFname());
        }
    }

}

class Student2 {
    private int id;
    private String fname;
    private double cgpa;

    public Student2(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

