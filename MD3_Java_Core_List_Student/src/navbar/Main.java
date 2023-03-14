package navbar;

import student.Student;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] listStudent = new Student[2];
        int choice = -1;

        boolean isQuit = false;
        while (choice != 0) {
            System.out.println("Menu : \n"
                    + "1: Show List Student \n"
                    + "2: Create Student \n"
                    + "3: Update Student \n"
                    + "4: Delete Student \n"
                    + "5: Sort Student by Age ASC(Tăng dần) \n"
                    + "0: Exit "
            );
            System.out.println("Nhập sự lựa chọn của bạn! ");
            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    isQuit = true;
                    System.out.println(" Bạn sẽ thoát khỏi chương trình  ");
                    break;
                case 1:

                    System.out.println("Hiển thị danh sách sinh viên : \n");
                    for (Student student : listStudent) {
                        if (student != null) {
                            student.showList();
                        }

                    }


                    break;
                case 2:
                     Student st = new Student();

                    System.out.println("Nhập mã sinh viên :");
                    st.setStudentId( scanner.nextInt());
                    System.out.println("Nhập vào tên sinh viên : ");
                    st.setStudentName(scanner.next());
                    System.out.println("Nhập vào tuổi sinh viên : ");
                    st.setAge(scanner.nextInt());
                    boolean check = false;
                    for (int i = 0; i < listStudent.length; i++) {
                        if (listStudent[i] == null) {
                            listStudent[i]=st;
                            check= true;
                            break;
                        }
                    }

                    if (!check) {
                        System.err.println("mảng đã đầy");
                    }else {
                        System.out.println("thêm thành công");
                    }
                    break;


            }
        }
    }


}
