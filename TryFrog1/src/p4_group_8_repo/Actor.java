package p4_group_8_repo;

import javafx.scene.image.ImageView;
import javafx.scene.input.InputEvent;

import java.util.ArrayList;

/**
 * A base class for Actor
 * @author Amit Saha
 *
 */
public abstract class Actor extends ImageView{
/**
 * position
 * @param dx
 * @param dy
 */
    public void move(double dx, double dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }
/**
 * world
 * @return
 */
    public World getWorld() {
        return (World) getParent();
    }
/**
 * get width
 * @return
 */
    public double getWidth() {
        return this.getBoundsInLocal().getWidth();
    }
/**
 * get height
 * @return 
 */
    public double getHeight() {
        return this.getBoundsInLocal().getHeight();
    }
/**
 * 
 * @param <A>
 * @param cls
 * @return Array
 */
    public <A extends Actor> java.util.List<A> getIntersectingObjects(java.lang.Class<A> cls){
        ArrayList<A> someArray = new ArrayList<A>();
        for (A actor: getWorld().getObjects(cls)) {
            if (actor != this && actor.intersects(this.getBoundsInLocal())) {
                someArray.add(actor);
            }
        }
        return someArray;
    }
 /**
  * manage input
  * @param e
  */
    public void manageInput(InputEvent e) {
        
    }
/**
 * 
 * @param <A>
 * @param cls
 * @return array
 */
    public <A extends Actor> A getOneIntersectingObject(java.lang.Class<A> cls) {
        ArrayList<A> someArray = new ArrayList<A>();
        for (A actor: getWorld().getObjects(cls)) {
            if (actor != this && actor.intersects(this.getBoundsInLocal())) {
                someArray.add(actor);
                break;
            }
        }
        return someArray.get(0);
    }
/**
 * 
 * @param now
 */
    public abstract void act(long now);

}
