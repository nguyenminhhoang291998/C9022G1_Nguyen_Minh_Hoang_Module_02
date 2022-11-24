package restro.exception;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Controller {
    public static void main(String[] args) {
        Ghost g1 = new Ghost("Tiến Bịp","Bronze");
        Ghost g2 = new Ghost("Lý Thông","Wood");
        Ghost g3 = new Ghost("Hậu thứ 2","Gold");
        Ghost g4 = new Ghost("Hãi Hùng","Diamond");
        List<Ghost> listGhost= new ArrayList<>();
        listGhost.add(g1);
        listGhost.add(g2);
        listGhost.add(g3);
        listGhost.add(g4);
        Collections.sort(listGhost, (o1, o2) -> o2.getName().compareTo(o1.getName()));
        System.out.println(listGhost);
    }

}
