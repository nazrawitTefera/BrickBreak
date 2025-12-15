package com.BrickBreak;

import java.awt.Graphics;
import java.awt.*;

public class Paddle {


	//your code here!


	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int width;
	private int height;
	private int velocity;
	private int size;
	

	
	//constructor(s):
	public Paddle(int x , int y, int size){
		this.x=x;
		this.y=y;
		this.size=size;
		this.width=size;
		this.height=2;
		this.velocity=2;

	}
	
	//methods:
	//pre-g is a valid Graphics object
	//post- sets the color of the paddle to be pink and it makes the paddle a rectangle
	public void draw(Graphics g){
		g.setColor(Color.pink);
		g.fillRect(x, y, width, height);
	}
	public void move(){
		x+=velocity;
	}
	public void addVelocity(int v){
		velocity+=v;
	}
	public void setX(int x){
		this.x=x;
	}
	public void setVelocity(int v){
		this.Velocity=v;
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
