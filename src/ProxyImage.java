
public class ProxyImage implements Image {

    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    /**
     * When the client needs to retrieve the actual image, generate a new one or retrieve
     * the reference to the previously created image in order to show the real image.
     */
    @Override
    public void showImage() {
        System.out.println("ProxyImage.showImage() - fileName=" + fileName);

        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.showImage();
    }

    /**
     * Used when the client only needs some basic information on the file without interacting with the object.
     * @return
     */
    @Override
    public String getFileName() {
        System.out.println("ProxyImage.getFileName() - fileName=" + fileName);
        return fileName;
    }
}