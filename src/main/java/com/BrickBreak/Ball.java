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
	//methods:
	//pre-xpos, ypos, and size are given
	//post-a Ball object is created with an initial position, size,
//       and x and y velocities
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
	//pre-the ball has a yVelocity
	//post-the ball’s yVelocity is reversed
	public void reverseY(){
		yVelocity= -yVelocity;
	}
	//pre- the ball has an xVelocity
	//post- the ball's xVelocity is reversed
	public void reverseX(){
		xVelocity= -xVelocity;
	}
	//pre-the ball has x and y velocities 
	//post-the ball's velocity is updated
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
