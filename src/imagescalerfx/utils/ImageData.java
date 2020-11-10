package imagescalerfx.utils;

import java.nio.file.Path;

public class ImageData {

    private String imageFileName;
    private Path imagePath;

    public ImageData(String imageFileName, Path imagePath) {
        this.imageFileName = imageFileName;
        this.imagePath = imagePath;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public Path getImagePath() {
        return imagePath;
    }

    @Override
    public String toString() {
        return "ImageData{" +
                "imageFileName='" + imageFileName + '\'' +
                '}';
    }
}
