package restro.mvc.controller;



import restro.mvc.service.IStudentService;
import restro.mvc.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
//    Tạo đối tượng Student service để sử dụng các method cần thiết
    private IStudentService iStudentService = new StudentService();
    private Scanner scanner = new Scanner(System.in);

//  Gọi hàm display của student service
    public void display() {
        iStudentService.display();
    }

//    Hiển thị menu cho người dùng lựa chọn
    public void studentMenu() {
        StudentController studentController = new StudentController();
        System.out.println("1. Hiển thị danh sách\n" +
                "2. Thêm mới học viên.\n" +
                "3. Chỉnh sửa học viên.\n" +
                "4. Thoát");
        int choice = choice();
        switch (choice) {
            case 1:
                studentController.display();
                break;
            case 2:
            case 3:
            case 4:
        }
    }

//    Phương thức cho phép nhập lựa chọn
    public static int choice() {
        StudentController studentController = new StudentController();
        System.out.println("Nhập lựa chọn có trong menu");
        int choice = Integer.parseInt(studentController.scanner.nextLine());
        return choice;
    }
}
