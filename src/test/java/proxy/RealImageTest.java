package proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RealImageTest {
    RealImage realImage;
    String filename;

    @BeforeEach
    void setUp() {
        filename = "test.txt";
        realImage = new RealImage(filename);
    }

    @Test
    void getFilename() {
        assertEquals("test.txt", realImage.getFilename());
    }
}