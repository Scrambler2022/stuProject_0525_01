import java.util.ArrayList;
import java.util.Scanner;

public class stuProcess {
    Scanner scan = new Scanner(System.in);
    String name = "";
    int kor =0,eng=0,math=0;

    //학생성적입력 메소드
    void stuInput
    while (true) {
        System.out.println("학생 이름 입력(0.이전페이지 이동) >>");
        name = scan.next();
        if(name.equals("0")) {
            System.out.println("이전페이지로 이동");
            break;
        }
        System.out.println("국어점수 입력");
        kor = scan.nextInt();
        System.out.println("영어점수 입력");
        eng = scan.nextInt();
        System.out.println("수학점수 입력");
        math = scan.nextInt();

        //학생성적입력 메소드
        list.add(new Student(name, kor, eng, math));
        //list.size() = 1 - 1
        //-1을 하면 내가저장한 자리로감
        System.out.printf("학번 : %d, 이름 : %s \n",list.get(list.size()-1).getStuNo,name);
        System.out.println("(이)가 입력되었습니다.");
        System.out.println();
    }//while
    void stuInput(ArrayList<Student> list) {
    }//stuInput
}
