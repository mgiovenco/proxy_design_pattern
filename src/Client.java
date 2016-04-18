public class Client {

    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.png");
        Image image2 = new ProxyImage("image2.png");

        // Interacting with proxy without needing instantiation of more expensive RealImage object
        image1.getFileName();
        image2.getFileName();

        System.out.println();

        // Interacting through proxy to generate RealImage (as it is now required to show actual image)
        image1.showImage();
        image2.showImage();
    }
}
