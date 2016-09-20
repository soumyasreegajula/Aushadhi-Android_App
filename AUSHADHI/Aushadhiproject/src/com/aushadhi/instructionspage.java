package com.aushadhi;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class instructionspage extends Activity {
	
	
		public long id;
		  

		/** Called when the activity is first created. */
		@Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.instructionspage);
	        
	        
	        Button b=(Button)findViewById(R.id.button1);
	        b.setOnClickListener(new View.OnClickListener(){
	        	 public void onClick(View argo)
	        	 {
	        		 Intent i=new Intent(instructionspage.this,Screen1.class);
	        		 //Bundle params=new Bundle();
	        		 //params.putString("symptom1", txtsymptom1.getText().toString());
	        		 //i.putExtras(params);
	        		 startActivity(i);
	        	 }
	        });

}
	}

