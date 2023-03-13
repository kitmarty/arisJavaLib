package aris.habr;

import org.json.JSONObject;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class JavaForArisExample {
    public static String getJsonFromUrl(String url) {
        try {
            return IOUtils.toString(new URL(url), StandardCharsets.UTF_8);
        } catch (IOException e) {
            return "Error! Can't read JSON from URL!";
        }
    }

    public static JSONObject createJsonObject(String jsonString) {
        return new JSONObject(jsonString);
    }
}
