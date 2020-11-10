package imagescalerfx;

import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class Controller {
    public ListView listFiles;
    public ListView listThumbs;
    public Button btStart;

    public void startApp(MouseEvent mouseEvent) throws IOException {
        ImageScalerFX.createThumbs();
    }
}
