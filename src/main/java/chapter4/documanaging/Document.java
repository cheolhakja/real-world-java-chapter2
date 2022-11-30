package chapter4.documanaging;

import java.util.Map;

public class Document {

    private final Map<String, String> attributes; //불변객체로 만든다

    Document(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public String searchByPersonName() {
        return "Walker";
    }
}
