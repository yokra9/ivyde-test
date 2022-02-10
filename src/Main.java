import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;

public class Main {
    public static void main(String[] args) {
        File file = new File("ivy.xml");
        try {
            List<String> lines = FileUtils.readLines(file, "UTF-8");
            lines.forEach(s -> System.out.println(s));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}