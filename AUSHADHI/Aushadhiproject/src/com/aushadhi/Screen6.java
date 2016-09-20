package com.aushadhi;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen6 extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next6);
        
       Button b=(Button)findViewById(R.id.btnHomePage);
                b.setOnClickListener(new View.OnClickListener(){
                	 public void onClick(View argo)
                	 {
                		 Intent i=new Intent(Screen6.this,aushadhi.class);
                		 startActivity(i);
                	 }
                });
            }

    }

