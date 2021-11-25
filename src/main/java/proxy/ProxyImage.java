package proxy;

public class ProxyImage implements Image{
    private String filename;
    private RealImage realImage;

    public ProxyImage(String s){
        filename = s;
        realImage = null;
    }

    public void display(){
        if (realImage == null)
            realImage = new RealImage(filename);

        realImage.display();
    }

}