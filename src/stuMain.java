import java.util.ArrayList;
import java.util.Scanner;

public class stuMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StuProcess stuProcess = new StuProcess();//객체선언
        ArrayList<Student> list = new ArrayList<>(); // 10명의 배열을 대신해서 적용
        int choice = 0;
        String name = "";
        int kor =0,eng=0,math=0;
        //프로그램 진행 - 무한반복
        while (true) {
            System.out.println("[ 학생성적처리 프로그램 ] \n1. 성적입력 2.성적출력 3.성적수정 4.성적삭제 \n 5. 학생검색 6. 등수처리 7. 오름차순 정렬 8. 내림차순 정렬");
            System.out.println("0. 프로그램 종료");
            System.out.println("---------------------");
            System.out.println("원하는 번호를 입력하세요.");
            choice = scan.nextInt();
            if (choice==0) {
                System.out.println("프로그램 종료");
                System.out.println();
                break;
            }//if//if//if//if//if//if


            switch (choice) {
                case 1: //학생성적입력
                    //StuProcesszmffotmdml stuInput() 메소드 호출
                    stuProcess.stuInput(list);

                    //메소드명
                    break;
            }//switch
        }//while
    }//main
}//class
