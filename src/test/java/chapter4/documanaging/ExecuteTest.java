package chapter4.documanaging;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExecuteTest {

    @Test
    public void searchByPersonNameTest() {
        Document document = new Document();
        String answer = "Walker";
        String name = document.searchByPersonName();
        Assertions.assertThat(name).isEqualTo(answer);
    }
}
