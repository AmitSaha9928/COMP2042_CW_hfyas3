package p4_group_8_repo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import p4_group_8_repo.Menu;
/**
 * Main class for frogger game
 * @author Amit Saha
 *
 */
public class Main extends Application {
	AnimationTimer timer;
	MyStage background;
	Animal animal;
	int score;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
/** 
* setting gameplay menu
*/
		MyStage main_scene = new MyStage();
		score = currentHighscore();
		Scene mainscene = new Scene(main_scene,600, 800);
		Menu mm = new Menu();
		main_scene.add(mm);
		
/**
* Display mainmenu
*/
		primaryStage.setScene(mainscene);
		primaryStage.show();
		primaryStage.setResizable(false);
		
/**
* Starting the game on pressing Spacebar
*/
		main_scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
			public void handle(KeyEvent event) {
				if(event.getCode() == KeyCode.SPACE) {
/**
*  Start
*/
					 background = new MyStage();
					    Scene scene  = new Scene(background,600,800);
					    
/**
 * adding necessary image paths and their parameters
 */
						BackgroundImage froggerback = new BackgroundImage("file:src/p4_group_8_repo/img/iKogsKW.png");
					    
						background.add(froggerback);
						
						background.add(new Log("file:src/p4_group_8_repo/img/log3.png", 150, 0, 166, 0.75));
						background.add(new Log("file:src/p4_group_8_repo/img/log3.png", 150, 220, 166, 0.75));
						background.add(new Log("file:src/p4_group_8_repo/img/log3.png", 150, 440, 166, 0.75));
						//background.add(new Log("file:src/p4_group_8_repo/img/log3.png", 150, 0, 166, 0.75));
						background.add(new Log("file:src/p4_group_8_repo/img/logs.png", 300, 0, 276, -2));
						background.add(new Log("file:src/p4_group_8_repo/img/logs.png", 300, 400, 276, -2));
						//background.add(new Log("file:src/img/logs.png", 300, 800, 276, -2));
						background.add(new Log("file:src/p4_group_8_repo/img/log3.png", 150, 50, 329, 0.75));
						background.add(new Log("file:src/p4_group_8_repo/img/log3.png", 150, 270, 329, 0.75));
						background.add(new Log("file:src/p4_group_8_repo/img/log3.png", 150, 490, 329, 0.75));
						//background.add(new Log("file:src/p4_group_8_repo/img/log3.png", 150, 570, 329, 0.75));
						
						background.add(new Turtle(500, 376, -1, 130, 130));
						background.add(new Turtle(300, 376, -1, 130, 130));
						background.add(new WetTurtle(700, 376, -1, 130, 130));
						background.add(new WetTurtle(600, 217, -1, 130, 130));
						background.add(new WetTurtle(400, 217, -1, 130, 130));
						background.add(new WetTurtle(200, 217, -1, 130, 130));
						//background.add(new Log("file:src/p4_group_8_repo/img/log2.png", 200, 100, 1));
						//background.add(new Log("file:src/p4_group_8_repo/img/log2.png", 0, 100, 1));
						//background.add(new Log("file:src/p4_group_8_repo/img/log2.png", 100, 120, -1));
						//background.add(new Log("file:src/p4_group_8_repo/img/log2.png", 200, 120, -1));
						//background.add(new Log("file:src/p4_group_8_repo/img/log2.png", 100, 140, 1));
						//background.add(new Log("file:src/p4_group_8_repo/img/log2.png", 200, 140, 1));
						//background.add(new Log("file:src/p4_group_8_repo/img/log2.png", 100, 160, -1));
						//background.add(new Log("file:src/p4_group_8_repo/img/log2.png", 300, 160, -1));
						//background.add(new Log("file:src/p4_group_8_repo/img/log2.png", 100, 180, 1));
						//background.add(new Log("file:src/p4_group_8_repo/img/log2.png", 200, 180, 1));
						//background.add(new Log("file:src/p4_group_8_repo/img/log2.png", 100, 200, -1));
						//background.add(new Log("file:src/p4_group_8_repo/img/log2.png", 200, 200, -1));
						//background.add(new Log("file:src/p4_group_8_repo/img/log2.png", 100, 220, 1));
						//background.add(new Log("file:src/p4_group_8_repo/img/log2.png", 200, 220, 1));
						//background.add(new Log("file:src/p4_group_8_repo/img/log2.png", 400, 220, 1));
						//End end2 = new End();
						//End end3 = new End();
						//End end4 = new End();
						//End end5 = new End();
						background.add(new End(13,96));
						background.add(new End(141,96));
						background.add(new End(141 + 141-13,96));
						background.add(new End(141 + 141-13+141-13+1,96));
						background.add(new End(141 + 141-13+141-13+141-13+3,96));
						animal = new Animal("file:src/p4_group_8_repo/img/froggerUp.png");
						background.add(animal);
						background.add(new Obstacle("file:src/p4_group_8_repo/img/truck1Right.png", 0, 649, 1, 120, 120));
						background.add(new Obstacle("file:src/p4_group_8_repo/img/truck1Right.png", 300, 649, 1, 120, 120));
						background.add(new Obstacle("file:src/p4_group_8_repo/img/truck1Right.png", 600, 649, 1, 120, 120));
						//background.add(new Obstacle("file:src/p4_group_8_repo/img/truck1"+"Right.png", 720, 649, 1, 120, 120));
						background.add(new Obstacle("file:src/p4_group_8_repo/img/car1Left.png", 100, 597, -1, 50, 50));
						background.add(new Obstacle("file:src/p4_group_8_repo/img/car1Left.png", 250, 597, -1, 50, 50));
						background.add(new Obstacle("file:src/p4_group_8_repo/img/car1Left.png", 400, 597, -1, 50, 50));
						background.add(new Obstacle("file:src/p4_group_8_repo/img/car1Left.png", 550, 597, -1, 50, 50));
						background.add(new Obstacle("file:src/p4_group_8_repo/img/truck2Right.png", 0, 540, 1, 200, 200));
						background.add(new Obstacle("file:src/p4_group_8_repo/img/truck2Right.png", 500, 540, 1, 200, 200));
						background.add(new Obstacle("file:src/p4_group_8_repo/img/car1Left.png", 500, 490, -5, 50, 50));
						background.add(new Digit(0, 30, 560, 20));
						//background.add(obstacle);
						//background.add(obstacle1);
						//background.add(obstacle2);
						background.start();
						primaryStage.setScene(scene);
						primaryStage.show();
						start();  
						
					}
				if(event.getCode() == KeyCode.H) {
					main_scene.add(new Help(1000));
				}
			}
		});	
	}
	

	public void createTimer() {
        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
            	if (animal.changeScore()) {
            		setNumber(animal.getPoints());
            	}
            	if (animal.getStop()) {
            		if (animal.getPoints() > score) {
                        try {
                            writeScore(animal.getPoints());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

            		System.out.print("STOPP:");
            		background.stopMusic();
            		stop();
            		background.stop();
            		Alert alert = new Alert(AlertType.INFORMATION);
            		alert.setTitle("You Have Won The Game!");
            		alert.setHeaderText("Your Score is "+animal.getPoints()+"!\nPrevious Highest Score is "+score);
            		alert.setContentText("Highest Possible Score: 800");
            		alert.show();
            	}

            }
        };
    }
/**
 * game start
 */
	public void start() {
		background.playMusic();
    	createTimer();
        timer.start();
    }
	
/**
* game end
*/
    public void stop() {
        timer.stop();
    }
/**
 * score parameters    
 * 
 */
    public void setNumber(int n) {
    	int shift = 0;
    	while (n > 0) {
    		  int d = n / 10;
    		  int k = n - d * 10;
    		  n = d;
    		  background.add(new Digit(k, 30, 560 - shift, 25));
    		  shift+=30;
    		}
    }
/**
 * adding score file and its arguments
 */
    public void writeScore(int newHiScore) throws IOException {

        File output = new File( "src/p4_group_8_repo/img/scores.dat");
        FileWriter writer = new FileWriter(output);
        PrintWriter printWriter = new PrintWriter(writer);

        printWriter.printf("%d", newHiScore);
        printWriter.close();
    }
/**
 * current high score reading from file
 */
public int currentHighscore() { 
        FileReader readFile = null;
        BufferedReader reader = null;
        try
        {
            readFile = new FileReader( "src/p4_group_8_repo/img/scores.dat");
            reader = new BufferedReader(readFile);
            return Integer.parseInt(reader.readLine());
        }
        catch (Exception e)
        {
            return 0;
        }
        finally
        {
            try {
                if (reader != null)
                reader.close();
            } catch (IOException e) {

                e.printStackTrace();
            }
        }
    }  

}
