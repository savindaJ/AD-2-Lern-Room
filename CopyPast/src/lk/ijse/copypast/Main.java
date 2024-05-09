package lk.ijse.copypast;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : savindaJ
 * @date : 2024-05-09
 * @since : 0.1.0
 **/
public class Main {
    public static void main(String[] args) {

        Map<LocalDateTime, String> valueList = new HashMap<>();
        valueList.put(LocalDateTime.now(), "value 1");
        valueList.put(LocalDateTime.now(), "value 2");
        valueList.put(LocalDateTime.now(), "value 3");
        valueList.put(LocalDateTime.now(), "value 4");
        valueList.put(LocalDateTime.now(), "value 5");

        undo(valueList);
        redo(valueList);

        print(valueList);
    }

    static void undo(Map<LocalDateTime, String> valueList){
        valueList.remove(LocalDateTime.now());
    }

    static void redo(Map<LocalDateTime, String> valueList){
        valueList.put(LocalDateTime.now(), "value 6");
    }

    static void print(Map<LocalDateTime, String> valueList){
        valueList.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));
    }
}
