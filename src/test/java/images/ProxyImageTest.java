package images;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ProxyImageTest {
    private ProxyImage img = new ProxyImage("test_img.png");

    @Test
    void getFilename() {
        assertEquals("test_img.png", img.getFilename());
    }

    @Test
    void getImg() {
        assertEquals(null, img.getImg());
        img.display();
        assertEquals(new RealImage("test_img.png").getFilename(), img.getImg().getFilename());
    }
}