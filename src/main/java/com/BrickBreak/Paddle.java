//nazrawit tefera
//date- dec/2025
//The Paddle class represents the player-controlled paddle
  //in the Brick Break game. It can move horizontally and
  //interact with the ball.

package com.BrickBreak;

import java.awt.*;

public class Paddle {


	//your code here!


	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int width;
	private int height;
	private int velocity;
	
	

	
	//constructor(s):
	public Paddle(int x , int y, int width){
		this.x=x;
		this.y=y;

		this.width=100;
		this.height=2;
		this.velocity=2;
		

	}
	
	 
      //Draws the paddle on the screen.
     
     //Pre: g is a valid Graphics object
     //Post: A pink rectangular paddle is drawn
    
	public void draw(Graphics g){
		g.setColor(Color.pink);
		g.fillRect(x, y, width, height);
	}
	 //Moves the paddle horizontally based on velocity.
     //Pre: The paddle has a velocity
      //Post: The paddle’s x-position is updated
     
	public void move(){
		x+=velocity;
	}
	 
     //Changes the paddle’s velocity.
      //Pre: v is a valid integer
     //Post: The paddle’s velocity is increased by v
     
	public void addVelocity(int v){
		velocity+=v;
	}
	public void setX(int x){
		this.x=x;
	}
	public void setVelocity(int v){
		this.velocity=v;
	}
	public int getX(){
		return x;

	}
	public int getY(){
		return y;

	}
	public int getWidth(){
		return width;

	}
	public int getHeight(){
		return height;

	} 
	public int getVelocity(){
		return velocity;
	}
	

	
}
