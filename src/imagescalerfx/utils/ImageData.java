package imagescalerfx.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ImageData extends Thread implements Runnable{

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
        return imagePath ;
    }
    public void run() {
        String dirName = "";


        try {

            File img2 = new File(getImagePath() + "/" + getImageFileName());

            if (img2.isFile()) {
                dirName = getImageFileName().substring(0, getImageFileName().length() - 4);

                File dirName2 = new File("images/" + dirName);

                if (dirName2.isDirectory()) {
                    try {
                        IOUtils.deleteDirectory(dirName2.toPath());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                Files.createDirectory(Path.of("images/" + getImageFileName().substring(0, getImageFileName().length() - 4)));

                for (double i = 1; i < 10; i++) {

                    try {
                        System.out.println(getImageFileName());
                        IOUtils.resize("images/"+getImageFileName(), "images/"+dirName+ "/" + (int)(i * 10) + "_" + getImageFileName(), i / 10);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        @Override
    public String toString() {
        return imageFileName ;
    }
}
