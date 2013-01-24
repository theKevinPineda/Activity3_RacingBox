package com.rapaelito.racingbox;

import android.os.Handler;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public class RacingBox extends Thread{
	private Handler handler = new Handler();
	private int increment,total,max;
	public ImageView i;
	public TextView tv;
	public RacingBox(ImageView i,TextView tv,int max, int increment){
		
		this.i=i;
		this.increment = increment;
		total=-5;
		this.max=max;
		this.tv=tv;
	}	
	
	@Override
	public void run() {
		total+=increment;
		
			setBox();
			handler.postDelayed(this, 500);
		
	
	}
	public void setBox(){
		if(total<max){
		LinearLayout.LayoutParams params = (LayoutParams) i.getLayoutParams();
		params.setMargins(total, 0, 0, 0); 
		i.setLayoutParams(params);
		}
		else if(tv.getText().toString().contains(Integer.toString(i.getId()))!=true)
					tv.append("Box"+i.getId()+"-");
			
		
	}
	public  int total(){
		return total;
	}
	public int max(){
		return max;
	}
	public  void setTotal(){
		this.total+=10;
	}
	
}
