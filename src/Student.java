public class Student {
    {count++;stuNo = count;}
    Student() {
    }//생성자
    Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.total = kor + eng + math;
        this.avg = total / 3.0;
    }//
    static int count = 1000;
    static String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
    private String name;
    private int stuNo;
    private int kor;
    private int eng;
    private int math;
    private int total;
    private double avg;
    private int rank;
}
