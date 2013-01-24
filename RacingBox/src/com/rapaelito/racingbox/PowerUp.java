package com.rapaelito.racingbox;

import java.util.Random;

import android.os.Handler;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class PowerUp extends Thread{
	private Handler handler = new Handler();
	private RacingBox rb1,rb2,rb3,rb4,rb5;
	final Random randomGenerator = new Random();
	int temp;
	public PowerUp(RacingBox rb1,RacingBox rb2,RacingBox rb3,RacingBox rb4,RacingBox rb5){
		this.rb1=rb1;
		this.rb2=rb2;
		this.rb3=rb3;
		this.rb4=rb4;
		this.rb5=rb5;
		
	}
	
	
	@Override
	public void run() {
		
		
			
			
				temp = randomGenerator.nextInt(5);
				switch(temp){
				case 0: powerUpBox(rb1);
						break;
				case 1: powerUpBox(rb2);
						break;
				case 2: powerUpBox(rb3);
						break;
				case 3: powerUpBox(rb4);
						break;	
				case 4: powerUpBox(rb5);
						break;
				
				
			}
			
				handler.postDelayed(this, 500);
		
	}
	private void powerUpBox(RacingBox r){
		if(r.total()<r.max()){
		r.setTotal();
		r.setBox();
		
		}
		
	}
}
