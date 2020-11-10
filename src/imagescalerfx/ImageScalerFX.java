package imagescalerfx;

import imagescalerfx.utils.FileUtils;
import imagescalerfx.utils.IOUtils;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class ImageScalerFX extends Application {

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


    public static void readImagesFromDir(){

    }

    public static void createThumbs() throws IOException {
        //scheduledService comprobando si han terminado las tareas cada segundo
        for (String s : FileUtils.getImgs()
             ) {

            System.out.println(s.toString());
            // Borrar directorio de thumbs de esa imagen
            //Path path = Path.of("ee");
            //IOUtils.deleteDirectory(path);

            // Crear directorio de cada imagen

            //Resize imgs
            // save each img as XX_name

            //PlatForm.runLater();

        }


    }

    public void borrarDirectorios() {
        String sDirectorio = "images";
        File f = new File(sDirectorio);

        borrarDirectorio(f);

        if (f.delete()) {
            System.out.println("El directorio " + sDirectorio + " ha sido borrado correctamente");
        } else {
            System.out.println("El directorio " + sDirectorio + " no se ha podido borrar");
        }
    }

    public static void borrarDirectorio(File directorio) {

        File[] ficheros = directorio.listFiles();

        for (int i = 0; i<ficheros.length; i++){
            if (ficheros[i].isDirectory()) {
                borrarDirectorio(ficheros[i]);
            }
            ficheros[i].delete();
        }
    }

}



