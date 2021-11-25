package images;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RealImageTest {
    private RealImage img = new RealImage("test_img.jpg");

    @Test
    void getFilename() {
        assertEquals("test_img.jpg", img.getFilename());
    }
}