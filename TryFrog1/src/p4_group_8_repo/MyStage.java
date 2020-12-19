package p4_group_8_repo;

import java.io.File;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;
/**
 * A class to define the stage or level
 * @author Amit Saha
 *
 */
public class MyStage extends World{
	MediaPlayer mediaPlayer;
/**
 * 	
 */
	@Override
	public void act(long now) {
		
	}
	/**
	 * 
	 */
	public MyStage() {
		
	}
/**
 * defining music source and playing it on loop
 */
	public void playMusic() {
		String musicFile = "src/p4_group_8_repo/music/Frogger Main Song Theme (loop).mp3";   
		Media sound = new Media(new File(musicFile).toURI().toString());
		mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
	    mediaPlayer.play();
	}
/**
 * stopping music	
 */
	public void stopMusic() {
		mediaPlayer.stop();
	}

}
