package images;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        String filename = "random.png";
        ProxyImage img = new ProxyImage(filename);
        img.display();
    }
}
