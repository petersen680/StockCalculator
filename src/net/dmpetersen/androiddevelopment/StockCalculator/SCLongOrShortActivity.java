package net.dmpetersen.androiddevelopment.StockCalculator;


import java.text.NumberFormat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class SCLongOrShortActivity extends Activity{
	
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.chosemain);
	    
	    
	    
	    
Button Calculate = (Button) findViewById(R.id.btn_calcatrisk);
        

        Calculate.setOnClickListener(new OnClickListener(){
        	public void onClick(View arg0){
        		
        		 EditText capital = (EditText) findViewById(R.id.calcatrisk);
        		 TextView results = (TextView) findViewById(R.id.atriskcalced);
        		 String number;
        		 Double temp;
        		 NumberFormat currency = NumberFormat.getCurrencyInstance(); 
        		 
        		number = capital.getText().toString();  
        		
        		
        		if(number.equals("")) 
    	        {    
        			temp = new Double(0.0);  
    	        
    	        } 
        		
        		
    	        else {
    	        	
    	        	temp = new Double(Double.parseDouble(number.toString())); 
    	        	
    	        }
        		
        		
        		Double calc = new Double(temp.doubleValue() * .02);
        		
        		
        		 results.setText(currency.format(calc.doubleValue()));
        		 
        		 
        	}
        });
        
        
        
        
        
        
	    
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
