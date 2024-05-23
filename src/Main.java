import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Map<String, String> map = new HashMap<>();
        String value = map.get("test");
        if (value == null || value.toLowerCase().equalsIgnoreCase("sss")) {
            System.out.println("Value is null or sss");
        }
    }
}