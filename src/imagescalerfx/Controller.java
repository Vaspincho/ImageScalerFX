package imagescalerfx;

import imagescalerfx.utils.FileUtils;
import imagescalerfx.utils.ImageData;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.ScheduledService;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Controller {
    @FXML
    public ListView listFiles;
    @FXML
    public ListView listThumbs;
    @FXML
    public Button btStart;
    @FXML
    private Label lbFinish;
    private static ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
    public static String nombreCarpeta = "images";
    private ScheduledService<Boolean> schService;
    public static ObservableList<String> imageListCompleted;
    public static ObservableList<ImageData> thumbListCompleted;

    public static ImageData img;

    public  void initialize() {

        schService = new ScheduledService<Boolean>() {
            @Override
            protected Task<Boolean> createTask() {
                return new Task<Boolean>() {
                    @Override
                    protected Boolean call() throws Exception {
                        Platform.runLater(() -> {
                            lbFinish.setText("" + executor.getCompletedTaskCount() + " of " + executor.getTaskCount() + " tasks finished." );
                            //imageListCompleted.add("" + executor.getCompletedTaskCount());

                            listFiles.setItems(imageListCompleted);
                        });
                        return executor.isTerminated();
                    }
                };
            }
        };
    schService.setDelay(Duration.millis(500));
    schService.setPeriod(Duration.seconds(1));
        schService.setOnSucceeded(e->  {
            if(schService.getValue())
            {
                schService.cancel();
                btStart.setDisable(false);
            }
        });
    }

    @FXML
    public void startApp(MouseEvent mouseEvent) throws IOException {

        btStart.setDisable(true);
        File carpeta = new File(nombreCarpeta);
        String[] listado = carpeta.list();
        ObservableList<ImageData> data = FXCollections.observableArrayList();

        if (listado == null || listado.length == 0) {
            System.out.println("Not files found");
        } else {
            for (int i = 0; i < listado.length; i++) {

                img = new ImageData(listado[i], Path.of(nombreCarpeta));
                data.add(i, img);
                executor.execute(img);

            }
        }
        executor.shutdown();
        schService.restart();

        }


}
