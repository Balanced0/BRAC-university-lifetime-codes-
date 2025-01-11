public class Vehicle2010 extends Vehicle{
    public Vehicle2010(){
        x = 0;
        y = 0;
    }
    public void moveLowerLeft(){
        moveDown();
        moveLeft();
    }
    public void moveUpperRight(){
        moveUp();
        moveRight();
    }
    public void moveLowerRight(){
        moveDown();
        moveRight();
    }
}