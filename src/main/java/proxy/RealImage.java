package proxy;

public class RealImage implements Image {
    private String filename;

    public RealImage(String s){
        filename = s;
        loadFromDisk();
    }

    public void loadFromDisk(){
        System.out.println("Loading " + filename);
    }

    public void display(){
        System.out.println("Displaying " + filename);
    }

    public String getFilename(){
        return filename;
    }
}