package net.dmpetersen.androiddevelopment.StockCalculator;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;



public class SCLongOrShortActivity extends Activity{
	
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.chosemain);
	    
	    
	    
Button Long = (Button) findViewById(R.id.btn_long);
        

        Long.setOnClickListener(new OnClickListener(){
        	public void onClick(View arg0){
        		
        		
        		Intent i = new Intent("net.dmpetersen.androiddevelopment.StockCalculator.STOCKCALCULATORACTIVITY");            
         	    
         	     startActivity(i);
        		
        		
        	}
        });
        
        
        
Button Short = (Button) findViewById(R.id.btn_short);
        

        Short.setOnClickListener(new OnClickListener(){
        	public void onClick(View arg0){
        		
        		
        		Intent i = new Intent("net.dmpetersen.androiddevelopment.StockCalculator.STOCKCALCULATORSHORTACTIVITY");            
         	    
        	     startActivity(i);
        		
        		
        	}
        });
	    
	}

}
