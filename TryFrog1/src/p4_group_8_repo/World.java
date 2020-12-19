package p4_group_8_repo;


import java.util.ArrayList;
import java.util.List;

import javafx.animation.AnimationTimer;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

/**
 * A class to handle the scenes
 * @author Amit Saha
 *
 */
public abstract class World extends Pane {
    private AnimationTimer timer;
/**
 * world   
 */
    public World() {
    	
    	sceneProperty().addListener(new ChangeListener<Scene>() {
/**
 * changes
 */
			@Override
			public void changed(ObservableValue<? extends Scene> observable, Scene oldValue, Scene newValue) {
				if (newValue != null) {
					newValue.setOnKeyReleased(new EventHandler<KeyEvent>() {
/**
 * input
 */
						@Override
						public void handle(KeyEvent event) {
							if(getOnKeyReleased() != null) 
								getOnKeyReleased().handle(event);
							List<Actor> myActors = getObjects(Actor.class);
							for (Actor anActor: myActors) {
								if (anActor.getOnKeyReleased() != null) {
									anActor.getOnKeyReleased().handle(event);
								}
							}
						}
						
					});
					
					newValue.setOnKeyPressed(new EventHandler<KeyEvent>() {

/**
 * input						
 */
						@Override
						public void handle(KeyEvent event) {
							if(getOnKeyPressed() != null) 
								getOnKeyPressed().handle(event);
							List<Actor> myActors = getObjects(Actor.class);
							for (Actor anActor: myActors) {
								if (anActor.getOnKeyPressed() != null) {
									anActor.getOnKeyPressed().handle(event);
								}
							}
						}
						
					});
				}
				
			}
    		
		});
    }
/**
 * timer
 */
    public void createTimer() {
        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                act(now);
                List<Actor> actors = getObjects(Actor.class);
                
                for (Actor anActor: actors) {
                	anActor.act(now);
                }
      
            }
        };
    }
/**
 * start
 */
    public void start() {
    	createTimer();
        timer.start();
    }
/**
 * stop
 */
    public void stop() {
        timer.stop();
    }
 /**
  * add  
  * @param actor
  */
    public void add(Actor actor) {
        getChildren().add(actor);
    }
/**
 * remove
 * @param actor
 */
    public void remove(Actor actor) {
        getChildren().remove(actor);
    }
/**
 * 
 * @param <A>
 * @param cls
 * @return array
 */
    public <A extends Actor> List<A> getObjects(Class<A> cls) {
        ArrayList<A> someArray = new ArrayList<A>();
        for (Node n: getChildren()) {
            if (cls.isInstance(n)) {
                someArray.add((A)n);
            }
        }
        return someArray;
    }
/**
 * 
 * @param now
 */
    public abstract void act(long now);
}
