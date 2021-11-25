package proxy;

public class ProxyPatternDemo {
    public static void main(String [] args){
        Image realImage = new RealImage("example.txt");
        realImage.display();

        Image proxyImage = new ProxyImage("example.txt");
        proxyImage.display();
    }
}