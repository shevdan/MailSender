package images;


import lombok.Getter;

@Getter
public class ProxyImage implements Image{
    private String filename;
    private RealImage img = null;

    public ProxyImage(String filename){
        this.filename = filename;
    }

    @Override
    public void display() {
        if (img == null)
            img = new RealImage(filename);
        img.display();
    }
}
