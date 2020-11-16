package imagescalerfx.utils;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.File;
import java.net.URI;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class FileUtils {
/*
    private static ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
    public static String nombreCarpeta ="images";
        static List<ImageData> readImgDirs(){

            File carpeta = new File(nombreCarpeta);
            String[] listado = carpeta.list();
            ObservableList<ImageData> data = FXCollections.observableArrayList();

            if (listado == null || listado.length == 0) {
                System.out.println("Not files found");
            } else {
                for (int i = 0; i < listado.length; i++) {
                    // Lanzar thread para cada imagen

                        ImageData img = new ImageData(listado[i], Path.of(nombreCarpeta));
                        data.add(i, img);
                        executor.execute(img);
                    Platform.runLater(() -> {
                        lbFinish = executor.getCompletedTaskCount();

                    });
                }
            }
            executor.shutdown();
            return data;
        }


        public static List<ImageData> getImgs() {
            return readImgDirs();
        }

*/

}
