package util;

import org.testng.annotations.AfterTest;

public interface BaseTest {
    @AfterTest
    void close();
}
