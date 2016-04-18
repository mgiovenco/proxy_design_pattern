
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void showImage() {
        System.out.println("RealImage.showImage() - fileName=" + fileName);
    }

    @Override
    public String getFileName() {
        System.out.println("RealImage.getFileName() - fileName=" + fileName);
        return fileName;
    }

}