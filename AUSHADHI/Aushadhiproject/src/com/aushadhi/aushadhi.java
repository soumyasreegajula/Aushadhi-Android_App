package com.aushadhi;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class aushadhi extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
       Button b=(Button)findViewById(R.id.btnHomePage);
                b.setOnClickListener(new View.OnClickListener(){
                	 public void onClick(View argo)
                	 {
                		 Intent i=new Intent(aushadhi.this,instructionspage.class);
                		 startActivity(i);
                	 }
                });
            }

    }

