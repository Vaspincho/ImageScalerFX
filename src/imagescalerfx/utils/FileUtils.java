package imagescalerfx.utils;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.File;
import java.util.List;

public class FileUtils {


        static List<String> readImgDirs(){
            String nombreCarpeta = "images";
            File carpeta = new File(nombreCarpeta);
            String[] listado = carpeta.list();
            ObservableList<String> data = FXCollections.observableArrayList();

            if (listado == null || listado.length == 0) {
                System.out.println("Not files found");
            } else {
                for (int i = 0; i < listado.length; i++) {
                    // Lanzar thread para cada imagen
                    data.add(i,listado[i]);
                }
            }
            return data;
        }


        public static List<String> getImgs() {
            return readImgDirs();
        }



}
