package aris.habr;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class JavaForArisExample {
    public static Runtime getRuntime() {
        return Runtime.getRuntime();
    }

    public static String getJson(String url) {
        try {
            return IOUtils.toString(new URL(url), StandardCharsets.UTF_8);
        } catch (IOException e) {
            return "Error! Can't read JSON from URL!";
        }
    }
}
