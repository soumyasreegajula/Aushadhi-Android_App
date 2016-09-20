package com.aushadhi;








import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

	public class Screen5 extends Activity {
		public long id;
		  
		private String param_symptom2;
		private String param_symptom1;
		private String param_symptom3;
		private String param_symptom4;
		 
		/** Called when the activity is first created. */
		@Override
	    
	       
		 public void onCreate(Bundle icicle) {
            super.onCreate(icicle);
	            setContentView(R.layout.next5);
	            
	            database2 db=new database2(this);
	        
	        db.open();
	        
	       
	        
	        id=db.insertSymptom1(
	        		"abdominal pain",
	        		"blood vomitings",
	        		"high fever",
	        		"muscle pain",
	        		"severe headache",
	        		"You need a lot of bed rest",
	        		"Blood test,Platelet count,Dengue Antibody test",
	        		"Paracetamol,IV fluid(Glucose),Platelet transession");

	        
	        
	        
	        
	        id=db.insertSymptom1(
	        		"headache",
	        		"high fever",
	        		"muscle pain",
	        		"blood vomitings",
	        		"abdominal pain",
	        		"You need a lot of bed rest",
	        		"Blood test,Platelet count,Dengue Antibody test",
	        		"Paracetamol,IV fluid(Glucose),Platelet transession");
	        
	        
	        id=db.insertSymptom1(
	        		"high fever",
	        		"headache",
	        		"muscle pain",
	        		"blood vomitings",
	        		"abdominal pain",
	        		"tip1",
	        		"Blood test,Platelet count,Dengue Antibody test",
	        		"Paracetamol,IV fluid(Glucose),Platelet transession");
	        
	        id=db.insertSymptom1(
	        		"headache",
	        		"body pains",
	        		"sneezing",
	        		"fever",
	        		"eyeredness",
	        		"You need a lot of bed rest",
	        		"CBT,X-Ray,Virusdiagnostic test",
	        		"Paracetemol,TuskQ");
	        
	        id=db.insertSymptom1(	
	        		"fever",
	        		"body pains",
	        		"sneezing",
	        		"headache",
	        		"eyeredness",
	        		"You need a lot of bed rest",
	        		"CBT,X-Ray,Virusdiagnostic test",
	        		"Paracetemol,TuskQ");
	        
	        
	        id=db.insertSymptom1(	
	        		"fever",
	        		"headache",
	        		"body pains",
	        		"sneezing",
	        	
	        		"eyeredness",
	        		"You need a lot of bed rest",
	        		"CBT,X-Ray,Virusdiagnostic test",
	        		"Paracetemol,TuskQ");
	        
	        
	        id=db.insertSymptom1("yellow discoloration of eyes",
	        		"abdominal pain",
	        		"vomitings",
	        		"fever",
	        		"yellow urine",
	        		"Low oil food,rest and supportive treatment",
	        		"Urine test for bilesalt,Bile segment, Liver function test, scanning of abdomen",
	        		"Livomin tablets, Colinol");
	        
	        id=db.insertSymptom1("cold",
	        		"cough",
	        		"fever",
	        		"breathlessness",
	        		"nosal block",
	        		"You need a lot of rest",
	        		"X-Ray,CBT",
	        		"Paracetemol, Ascoril for oxygen");
	        
	        
	        id=db.insertSymptom1("fever",
	        		"headache",
	        		"gydiness",
	        		"fits",
	        		"loss of consiousness",
	        		"You need a lot of bed rest",
	        		"Lumber Puncture, CT scanning of Brain",
	        		"IV fliuds, Monitol");
	        
	        
	        id=db.insertSymptom1("fever",
	        		"sore throat",
	        		"dry cough",
	        		"tiredness",
	        		"body aches",
	        		"You need a lot of bed rest",
	        		"Blood test",
	        		"NSAIDS,Copugh medicines,argles or Lozenges");
	        
	        
	        
	        
	        
	        db.close();
	        
	      	        final EditText txtsymptom5= (EditText)findViewById(R.id.txtsymptom5);
	        
	        // Paramater Reading
	        
            	Bundle params2=this.getIntent().getExtras();
            	
            	param_symptom2=params2.getString("symptom2");

            	
            	param_symptom1=params2.getString("symptom1");
            	
            	param_symptom3=params2.getString("symptom3");
            	param_symptom4=params2.getString("symptom4");
            	
            	
            	
Bundle params=this.getIntent().getExtras();
            	
            	param_symptom1=params.getString("symptom1");
            	
            	
            	
            	
            	
	        //End Parameter Reading
	        
	        
	       
            	
            	
	        
	        
	        Button btnSubmit3 = (Button)findViewById(R.id.btnSubmit);
	       
	        
	        
	        
	        
	        
	        btnSubmit3.setOnClickListener(new OnClickListener(){

	             

				

					@Override
	                public void onClick(View v) {
	                    
	                        String symptoms5= txtsymptom5.getText().toString().trim();
	                        String symptoms2= "";
	                        String symptoms1= "";
	                        symptoms2=param_symptom2;
	                        symptoms1=param_symptom1;
	                        String symptoms3= "";
	                        symptoms3=param_symptom3;
	                        String symptoms4= "";
	                        symptoms4=param_symptom4;
	                        System.out.println("param_symptom1:"+param_symptom1);
	                    	
	                    	
	                    	
	                    	
	                    	
	                        try{
	                            if(symptoms4.length()>0)
	                                {
	                                        database2 db = new database2(Screen5.this);
	                                    db.open();
	                                    
	                                     Cursor c=db.Submit5(symptoms1,symptoms2,symptoms3,symptoms4,symptoms5);
	                                     if(symptoms5.length()>0 && symptoms5!=symptoms2 && symptoms5!=symptoms3&&symptoms4!=symptoms2&&symptoms4!=symptoms1)
	                                     {
	                                        if( c!=null)
	                                        {
	                                        	
	                                            
	                                            if(c.moveToFirst())
	                                            {
	                                            	
	                                            	System.out.println("Record Found...!");
	                                            	
	                                       	
	                                            	Toast.makeText(Screen5.this,"\n"+"Symptoms"+"\n"+c.getString(1)+"\n"+c.getString(2)+"\n"+c.getString(3)+"\n"+c.getString(4)+"\n"+c.getString(5)+"\n"+"\n"+"Medicine"+"\n"+c.getString(8),Toast.LENGTH_LONG).show();
	                                            }
	                                            
	                                                                        
	                                       
	                                        }else{
	                                                Toast.makeText(Screen5.this,"Symptom is already entered ", Toast.LENGTH_LONG).show();
	                                        } db.close();
	                                     }
	                                        else{
                                                Toast.makeText(Screen5.this,"Symptom is already entered ", Toast.LENGTH_LONG).show();
                                        }
	                                       
	                                
	                                }
	                                
	                        }catch(Exception e)
	                        {
	                                Toast.makeText(Screen5.this,"Error:"+e.getMessage(), Toast.LENGTH_LONG).show();
	                  }
	                }
	                
	        });
	       
	        
	        Button b=(Button)findViewById(R.id.btnpage);
	        b.setOnClickListener(new View.OnClickListener(){
	        	 public void onClick(View argo)
	        	 {
	        		 setResult(RESULT_OK);
	        		 finish();
	        	 }
	        });
	        
	        
	        
	        Button t=(Button)findViewById(R.id.btntreatment);
	        t.setOnClickListener(new OnClickListener(){

	            

				

				@Override
	            public void onClick(View v) {
					String symptoms5= txtsymptom5.getText().toString().trim();
                    String symptoms2= "";
                    String symptoms1= "";
                    symptoms2=param_symptom2;
                    symptoms1=param_symptom1;
                    String symptoms3= "";
                    symptoms3=param_symptom3;
                    String symptoms4= "";
                    symptoms4=param_symptom4;
                    System.out.println("param_symptom1:"+param_symptom1);
                 	             
	                    
	                    try{
	                        if(symptoms5.length() > 0 )
	                            {
	                                    database2 db = new database2(Screen5.this);
	                                db.open();
	                                    
	                                    if(db.Submitt5(symptoms1,symptoms2,symptoms3,symptoms4,symptoms5) != null )
	                               {
	                                    	
	                                        Cursor c=db.Submitt5(symptoms1,symptoms2,symptoms3,symptoms4,symptoms5);
	                                         if(c.moveToFirst())
	                                        	
	                                   	Toast.makeText(Screen5.this,"Health Tip and Diet"+"\n"+c.getString(6)+"\n"+"\n"+"Tests to be taken"+"\n"+c.getString(7),Toast.LENGTH_LONG).show();
	                                   
	                                                                              	
	                                        
	                                        
	                                        
	                                   
	                                    }else{
	                                          Toast.makeText(Screen5.this,"Invalid ", Toast.LENGTH_LONG).show();
	                                   }
	                                    db.close();
	                            }
	                            
	                    }catch(Exception e)
	                    {
	                            Toast.makeText(Screen5.this,e.getMessage(), Toast.LENGTH_LONG).show();
	              }
	            }
	            
	    });
	        
	        
	        
	        
	        Button b1=(Button)findViewById(R.id.btnNext);
	        b1.setOnClickListener(new View.OnClickListener(){
	        	 public void onClick(View argo)
	        	 {
	        		 Intent i=new Intent(Screen5.this,Screen6.class);
	        		 
	        		 
	        		 startActivity(i);
	        	 }
	        });
	        Button bb=(Button)findViewById(R.id.btnexit);
	        bb.setOnClickListener(new OnClickListener(){
	        	 public void onClick(View argo)
	        	 {
	        		 Intent i=new Intent(Screen5.this,aushadhi.class);
	        		 startActivity(i);
	        	 }
	        });
	        
	        
	}
		
	}
	