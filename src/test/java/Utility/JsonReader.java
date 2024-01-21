package Utility;

import lombok.SneakyThrows;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class JsonReader {
    public static class TestJson {
        @SneakyThrows
        public static String getJson(String filePath, String key) {
            JSONObject jsonObject = (JSONObject) new JSONParser().parse(new FileReader(filePath));
            return (String) jsonObject.get(key);
        }
    }
}
