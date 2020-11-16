package imagescalerfx;

import imagescalerfx.utils.FileUtils;
import imagescalerfx.utils.IOUtils;
import imagescalerfx.utils.ImageData;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.awt.font.ImageGraphicAttribute;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.*;
import java.util.stream.Stream;


public class ImageScalerFX extends Application {
    public static String nombreCarpeta ="images";
    public static File carpeta = new File(nombreCarpeta);



    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("ImageScalerFX");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static void createThumbs() throws IOException {


        String dirName = "";
        File dirImg;
        String baseDir = null;
        //scheduledService comprobando si han terminado las tareas cada segundo


     //   for (ImageData img : Controller.getImgs()) {



            /*
            File img2 = new File(img.getImagePath() + "/" + img.getImageFileName());

            if (img2.isFile()) {
                dirName = img.getImageFileName().substring(0, img.getImageFileName().length() - 4);

                File dirName2 = new File("images/" + dirName);

                if (dirName2.isDirectory()) {
                    IOUtils.deleteDirectory(dirName2.toPath());
                }


                dirImg = new File("images/" + dirName);
                dirImg.mkdir();


                for (double i = 1; i < 10; i++) {
                    File finalDirImg = dirImg;
                    double finalI = i;
                        executor.submit(new Runnable() {
                            @Override
                            public void run() {
                                try {
                                    IOUtils.resize("images/" + img.getImageFileName(), finalDirImg + "/" + finalI * 10 + "_" + img.getImageFileName(), finalI / 10);
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }


                            }});

                    }

                executor.shutdown();
                }
            }





            //PlatForm.runLater();
*/

            //    }

    //    }

    }}



