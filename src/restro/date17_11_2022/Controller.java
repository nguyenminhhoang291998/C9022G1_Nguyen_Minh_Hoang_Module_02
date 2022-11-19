package restro.date17_11_2022;
import java.util.*;

public class Controller {
    public static void main(String[] args) {
        Worker worker = new Worker("Cong","Codegym");
        Worker worker1 = new Worker("Anh","Codegym");
        Worker worker2 = new Worker("Anh","Da nang");
        Worker worker3 = new Worker("Tai","Codegym");
//        Set<Worker> workerSet = new HashSet<>();
//        giống nhau trên mã hash. địa chỉ ô nhớ vẫn khác
//        System.out.println(worker == worker1);
//        workerSet.add(worker);
//        workerSet.add(worker1);
//        System.out.println(workerSet);
//        Set<Worker> workers = new TreeSet<>();
//        workers.add(worker);
//        workers.add(worker1);
//        workers.add(worker2);
//        workers.add(worker3);
//        System.out.println(workers);
        List<Worker> workerList = new ArrayList<>();
        workerList.add(worker);
        workerList.add(worker1);
        workerList.add(worker2);
        workerList.add(worker3);
        System.out.println(workerList);
        Collections.sort(workerList, new SortWorker());
        System.out.println(workerList);
    }
}
