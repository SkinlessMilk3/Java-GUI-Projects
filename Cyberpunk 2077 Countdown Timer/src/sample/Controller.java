package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button playBtn;

    @FXML
    private Button stopBtn;

    @FXML
    private Button choosePlaylist;

    @FXML
    private GridPane root;

    @FXML
    private Label timer;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Main obj = new Main();

        Image img = new Image(getClass().getResourceAsStream("metro-en.jpg"));
        root.setBackground(new Background(new BackgroundImage(img, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));

        timer.setTextFill(Color.WHITE);
        timer.setFont(new Font("Timers New Roman", 30));

        obj.Countdown(timer);

        //Choose playlist for music
        choosePlaylist.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                obj.setPlayer();
            }
        });

        //Play music
        playBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(playBtn.getText().compareTo("Play") == 0) {
                    if(obj.play() == 0)
                        playBtn.setText("Pause");
                }
                else{
                    playBtn.setText("Play");
                }
            }
        });

        //Stop music. Probably should get rid of this because it's pretty useless.
        stopBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) { obj.MusicStop(); }
        });


    }
    public Button getChoosePlaylist(){
        return choosePlaylist;
    }
}
