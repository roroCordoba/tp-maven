package Test;

import org.example.TPtdd;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class TPtddTest {

    @Test
    void appRunsWithoutError() {
        TPtdd app = new TPtdd();
        assertNotNull(app);
    }
}