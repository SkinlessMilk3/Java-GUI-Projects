package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main extends Application {

    public static final List<String> SUPPORTED_FILE_EXTENSIONS = Arrays.asList(".mp3");
    protected enum Months{
        April (4, 30),
        May (5, 31),
        June (6, 30),
        July (7, 31),
        August (8, 31),
        September (9, 30);

        private final int month;
        private final int days;

        Months(int month, int days){
            this.month = month;
            this.days = days;
        }

        protected int getMonthVal(){
            return this.month;
        }

        protected int getDaysVal(){
            return this.days;
        }
    }

    //List of songs to be played.
    private List<MediaPlayer> players = new ArrayList<>();
    private Stage stage;

    @Override
    public void start(Stage primaryStage) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        stage = primaryStage;

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));//new GridPane();
        primaryStage.setMaximized(true);
        primaryStage.setTitle("Cyberpunk 2077 Countdown");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }

    protected void setPlayer(){

        DirectoryChooser ch = new DirectoryChooser();
        ch.setTitle("Choose playlist");
        File dir = ch.showDialog(stage);

        if(dir != null) {
            for (String file : dir.list(new FilenameFilter() {
                @Override
                public boolean accept(File file, String s) {
                    for (String ch : SUPPORTED_FILE_EXTENSIONS)
                        if (s.endsWith(ch)) {


                            return true;
                        }

                    return false;
                }
            })) {
                String path = "file:///" + (dir + "\\" + file).replace("\\", "/").replaceAll(" ", "%20");
                players.add(new MediaPlayer(new Media(path)));
            }
        }
    }

    //problem: Resets to the beginning of playlist.
    protected void MusicStop(){

        MediaPlayer.Status status = MediaPlayer.Status.PLAYING;
        for(MediaPlayer player : players){
            if(player.getStatus().equals(status) ){
                player.stop();
            }
        }
    }

    protected int play() {
        if (players.size() > 0) {
            Task tsk = new Task() {
                @Override
                protected Void call() throws Exception {
                    for (int i = 0; i < players.size(); i++) {
                        if (i % players.size() == 0) {
                            i = 0;
                        }

                        final MediaPlayer player = players.get(i);
                        final MediaPlayer nxtPlayer = players.get((i + 1) % players.size());
                        players.get(i).setOnEndOfMedia(new Runnable() {
                            @Override
                            public void run() {
                                player.stop();
                                nxtPlayer.play();
                            }
                        });

                    }
                    players.get(0).play();
                    return null;
                }
            };

            Thread th = new Thread(tsk);
            th.setDaemon(true);
            th.start();

            return 0;
        }
        return 1;
    }

    protected void Countdown(Label timer){

        Task t = new Task<Void>() {

            @Override
            protected Void call() throws Exception {

                while(true){
                    LocalDateTime time = LocalDateTime.now();
                    int seconds = Seconds(time);
                    int days = Days(time, Months.September, 17);
                    int hours = Hours(time);
                    int minutes = Minutes(time);

                    Platform.runLater(new Runnable(){
                        @Override public void run(){

                            timer.setText(Integer.toString(days) + ":" + Integer.toString(hours)+":"+ minutes+":"+seconds);
                        }
                    });
                    Thread.sleep(1000);

                }
            }
        };

        Thread th = new Thread(t);
        th.setDaemon(true);
        th.start();
    }

    protected int Days(LocalDateTime currTime, Months ending, int endDay){

        int distance = 0;

        for(Months month : Months.values()){
            if(ending.getMonthVal() == month.getMonthVal()){
                distance += endDay;
            }
            else if(month.getMonthVal() == currTime.getMonthValue()){
                distance += month.getDaysVal() - currTime.getDayOfMonth();
            }
            else{
                distance += month.getDaysVal();
            }
        }

        return distance-1;
    }

    protected int Hours(LocalDateTime currTime){//Months ending, int endDay){

        int remTime = 24 - currTime.getHour();
        return remTime;
    }

    protected int Minutes(LocalDateTime time){

        int remTime = 60 - time.getMinute();

        return remTime;
    }

    protected int Seconds(LocalDateTime time){

        int remTime = 60 -  time.getSecond();

        return remTime;
    }
}
