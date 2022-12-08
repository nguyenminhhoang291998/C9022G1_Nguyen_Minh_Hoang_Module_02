package case_study.furama_resort.common;

import java.util.Scanner;

public class Regex {

    public static final String ID_VILLA_REGEX = "^SVVL-\\d{4}$";
    public static final String ID_ROOM_REGEX = "^SVRO-\\d{4}$";
    /*
   -	Mã dịch vụ phải đúng định dạng: SVXX-YYYY, với YYYY là các số từ 0-9, XX là:
   -	Nếu là Villa thì XX sẽ là VL
   -	Nếu Room thì XX sẽ là RO
   */

    public static final String NAME_REGEX = "^[A-Z][a-z]+$";
    //-	Tên dịch vụ, Kiểu thuê, Tiêu chuẩn phòng phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường

    public static final String AREA_REGEX = "^([3-9]\\d|\\d{3,})([.]\\d+)?$";
    //-	Diện tích sử dụng và diện tích hồ bơi phải là số thực lớn hơn 30m2

    public static final String RENTAL_COSTS_REGEX = "^\\d+([.]\\d+)?$";
    //-	Chi phí thuê phải là số dương
    public static final String MAXIMUM_NUMBER_OF_PEOPLE_REGEX = "^(0?[1-9]|1\\d)$";
    //-	Số lượng người tối đa phải >0 và nhỏ hơn <20

    public static final String FLOOR_COUNT = "^(0?[1-9]|[1-9]\\d+)$";
    //-	Số tầng phải là số nguyên dương.

    public static final String DATE_REGEX = "^(?:(?:31(\\/)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/)" +
            "(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?" +
            "(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/)" +
            "(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    // - kiểm tra ngày theo năm nhuận và không nhuận

    public static final String DATE_FORMAT = "\\d{2}/\\d{2}/\\d{4}";
    // - check date bắt buộc đủ format

    public static boolean checkDateFormat(String date){
        return (date.matches(DATE_REGEX) && date.matches(DATE_FORMAT));
    }

    private static final Scanner scanner = new Scanner(System.in);

    //check regex
    public static String inputAndCheckRegex(String regex) {
        boolean flag;
        String o;
        do {
            o = scanner.nextLine();
            flag = o.matches(regex);
            if (!flag) System.out.print("Invalid data. Enter again: ");
        } while (!flag);
        return o;
    }
}
