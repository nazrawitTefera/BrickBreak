//nazrawit tefera
//date- dec/2025
// The Ball class represents a moving ball in the Brick Break game.
 // It stores the ball’s position, size, and velocity, and provides
  //methods to draw and move the ball on the screen.

package com.BrickBreak;
import java.awt.*;

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	private int ypos;
	private int xpos;
	private int size;
	private int xVelocity;
	private int yVelocity;

	
	//constructor(s):
	public Ball(int xpos, int ypos, int size){
		 this.xpos = xpos;
         this.ypos = ypos;
         this.size = size;
         this.xVelocity = 1;
         this.yVelocity = -2;
	}
	
     //Draws the ball on the screen.
     
      //Pre: g is a valid Graphics object
     //Post: A cyan ball is drawn at the current position
     
	public void draw(Graphics g){
		g.setColor(Color.cyan);
		g.fillOval(xpos,ypos,size,size);
	
	}
    public void setY(int y){
	this.ypos=y;	
	}
	
	public void setX(int x){
		this.xpos=x;
	}
	public void setXVelocity(int x){
		this .xVelocity=x;
	}
	public void setYVelocity(int y){
		this.yVelocity=y;
	}
	
      //Reverses the vertical direction of the ball.
     
      //Pre: The ball has a yVelocity
     //Post: The yVelocity is reversed
     
	public void reverseY(){
		yVelocity= -yVelocity;
	}
	
     //Reverses the horizontal direction of the ball.
     
     //Pre: The ball has an xVelocity
      //Post: The xVelocity is reversed
    
	public void reverseX(){
		xVelocity= -xVelocity;
	}
	 
     //Moves the ball based on its current velocity.
     
     //Pre: The ball has x and y velocities
      //Post: The ball’s position is updated
     
	public void move(){
		xpos+= xVelocity;
		ypos+= yVelocity;
	}
	public int getSize(){
		return size;
	}
	public int getYpos(){
		return ypos;
	}
	public int getXpos(){
		return xpos;
	}
	public int getxVelocity(){
		return xVelocity;
	}
	public int getyVelocity(){
		return yVelocity;
}

	    
}
