package com.rapaelito.racingbox;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.LinearLayout.LayoutParams;


public class RaceStarter extends Activity{
	private ImageView b1,b2,b3,b4,b5;
	TextView tv;
	private final int MAX=120, INCREMENT=5;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.racetrack);
        initialize();
        start();
        
	}
	public void start(){
		
		TextView result = (TextView)findViewById(R.id.result);
		result.setText("Result: ");
        RacingBox rb1 = new RacingBox(b1,result,MAX,INCREMENT);
        RacingBox rb2 = new RacingBox(b2,result,MAX,INCREMENT);
        RacingBox rb3 = new RacingBox(b3,result,MAX,INCREMENT);
        RacingBox rb4 = new RacingBox(b4,result,MAX,INCREMENT);
        RacingBox rb5 = new RacingBox(b5,result,MAX,INCREMENT);
        
        PowerUp pu = new PowerUp(rb1, rb2, rb3, rb4, rb5);
        rb1.start();
        rb2.start();
        rb3.start();
        rb4.start();
        rb5.start();
        pu.start();
	}
	public void initialize(){
		(b1=(ImageView)findViewById(R.id.box1)).setId(1);
		(b2=(ImageView)findViewById(R.id.box2)).setId(2);
		(b3=(ImageView)findViewById(R.id.box3)).setId(3);
		(b4=(ImageView)findViewById(R.id.box4)).setId(4);
		(b5=(ImageView)findViewById(R.id.box5)).setId(5);
		
	}
	
}
