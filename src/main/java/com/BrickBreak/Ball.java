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
		 this.xpos = x;
         this.ypos = y;
         this.size = size;
         this.xVelocity = 1;
         this.yVelocity = -2;
	}
	//methods:
	//pre
	//post
	public void draw(Graphics g){
		g.setColor(Color.cyan);
		g.fillOval(x,y,size,size);
	
	}
    public void setY(int y){
	this.ypos=y;	
	}
	
	public void setX(int x){
		this.xpos=x;
	}
	public void setXVelocity(int x){
		this .setxVelocity =x;
	}
	public void setYVelocity(int y){
		this.setyVelocity=y;
	}
	//pre
	//post
	public void reverseY(){
		yVelocity= -yVelocity;
	}
	public void reverseX(){
		xVelocity= -xVelocity;
	}
	//pre
	//post
	public void move(){
		xpos+= XVelocity;
		ypos+= YVelocity;
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
