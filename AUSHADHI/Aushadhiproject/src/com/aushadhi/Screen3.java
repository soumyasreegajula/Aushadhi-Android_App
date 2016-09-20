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

	public class Screen3 extends Activity {
		public long id;
		  
		private String param_symptom2;
		private String param_symptom1;
 
		/** Called when the activity is first created. */
		@Override
	    
	       
		 public void onCreate(Bundle icicle) {
            super.onCreate(icicle);
	            setContentView(R.layout.next3);
	            
	            database2 db=new database2(this);
	        
	        db.open();
	        
	       
	        
	        id=db.insertSymptom1("fever",
	        		"rashes",
	        		"running nose",
	        		null,
	        		null,
	        		"Be away from imfectious areas",
	        		"Clinical diagnosis",
	        		"Anti viral drug");
	        
	        id=db.insertSymptom1("fever",
	        		"rash in groups over the central body",
	        		"running nose",
	        		null,
	        		null,
	        		"avoid oily food and stay away from dust",
	        		"Clinical diagnosis,PCR,Tissue viral culture",
	        		"Anti viral drug");
	        
	        id=db.insertSymptom1("fever >2 weeks",
	        		"tongue coating",
	        		"loss of appetite",
	        		null,
	        		null,
	        		"Take a lot of rest",
	        		"Widal test,Tissue viral culture",
	        		"Anti viral drug");
	        
	        id=db.insertSymptom1("low grade fever >4 weeks",
	        		"cough",
	        		"sputum often with blood",
	        		null,
	        		null,
	        		"Take a lot of rest",
	        		"Sputum for AFB,CBP,ECR,Montoux Test,Chest X-Ray",
	        		"INH+RIFAMPICIAN,Ethombutil,Pyrazinamide");
	        
	        id=db.insertSymptom1("fever",
	        		"headache",
	        		"stiffiness of next muscles",
	        		null,
	        		null,
	        		"Do yoga and neck exercises",
	        		"Cerebro Spinal Fluid(LP) for analysis,C/S,Brain CT Scan,MRI Scan",
	        		"High potency antibiotics");
	        
	        
	        id=db.insertSymptom1("loss motions",
	        		"vomitings",
	        		"dehydration",
	        		null,
	        		null,
	        		"Have lots of liquids",
	        		"Stools for microscopy,Stools for C/S",
	        		"Supportive IV fluid to reduce dehydration");
	            
	        id=db.insertSymptom1("pale look",
	        		"weakness",
	        		"breathlessness",
	        		null,
	        		null,
	        		"Take food rich in vitamins and lot of leafy vegetables",
	        		"Blood Test",
	        		"Tonoferon");
	        
	        
	        
	        id=db.insertSymptom1("eye pain",
	        		"watering of eye",
	        		"redness of eye",
	        		null,
	        		null,
	        		"Do not strain your eyes",
	        		"Eye check up",
	        		"Cholorophinocol eye drops,Neoscorin ointment");
	        
	        
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
	        		null,
	        		null,
	        		"You need a lot of bed rest",
	        		"Blood test",
	        		"NSAIDS,Copugh medicines,argles or Lozenges");
	        
	        id=db.insertSymptom1("fever",
	        		"cold",
	        		"cough",
	        		null,
	        		null,
	        		"You need a lot of bed rest",
	        		"Blood test",
	        		"NSAIDS,Copugh medicines,argles or Lozenges");
	        id=db.insertSymptom1("fever",
	        		"cough",
	        		"cold",
	        		null,
	        		null,
	        		"You need a lot of bed rest",
	        		"Blood test",
	        		"NSAIDS,Copugh medicines,argles or Lozenges");
	        
	        
	        
	        
	        
	        db.close();
	        
	      	        final EditText txtsymptom3= (EditText)findViewById(R.id.txtsymptom3);
	        
	        // Paramater Reading
	        
            	Bundle params2=this.getIntent().getExtras();
            	
            	param_symptom2=params2.getString("symptom2");

            	
            	param_symptom1=params2.getString("symptom1");
            	
            	
            	
            	
Bundle params=this.getIntent().getExtras();
            	
            	param_symptom1=params.getString("symptom1");
            	
            	
            	
            	
            	
	        //End Parameter Reading
	        
	        
	       
            	
            	
	        
	        
	        Button btnSubmit3 = (Button)findViewById(R.id.btnSubmit);
	       
	        
	        
	        
	        
	        
	        btnSubmit3.setOnClickListener(new OnClickListener(){

	             

				

					@Override
	                public void onClick(View v) {
	                    
	                        String symptoms3= txtsymptom3.getText().toString().trim();
	                        String symptoms2= "";
	                        String symptoms1= "";
	                        symptoms2=param_symptom2;
	                        symptoms1=param_symptom1;
	                        System.out.println("param_symptom1:"+param_symptom1);
	                    	
	                    	
	                    	
	                    	
	                    	
	                        try{
	                            if(symptoms3.length()>0)
	                                {
	                                        database2 db = new database2(Screen3.this);
	                                    db.open();
	                                    
	                                     Cursor c=db.Submit3(symptoms1,symptoms2,symptoms3);
	                                     if(symptoms3.length()>0 && symptoms3!=symptoms2 && symptoms3!=symptoms1)
	                                     {
	                                        if( c!=null)
	                                        {
	                                        	
	                                            
	                                            if(c.moveToFirst())
	                                            {
	                                            	
	                                            	System.out.println("Record Found...!");
	                                            	
	                                       	
	                                            	Toast.makeText(Screen3.this,"\n"+"Symptoms"+"\n"+c.getString(1)+"\n"+c.getString(2)+"\n"+c.getString(3)+"\n"+"\n"+"Medicine"+"\n"+c.getString(8),Toast.LENGTH_LONG).show();
	                                            }
	                                            
	                                                                        
	                                       
	                                        }else{
	                                                Toast.makeText(Screen3.this,"Symptom is already entered ", Toast.LENGTH_LONG).show();
	                                        } db.close();
	                                     }
	                                        else{
                                                Toast.makeText(Screen3.this,"Symptom is already entered ", Toast.LENGTH_LONG).show();
                                        }
	                                       
	                                
	                                }
	                                
	                        }catch(Exception e)
	                        {
	                                Toast.makeText(Screen3.this,"Error:"+e.getMessage(), Toast.LENGTH_LONG).show();
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
					 String symptoms3= txtsymptom3.getText().toString().trim();
                     String symptoms2= "";
                     String symptoms1= "";
                     symptoms2=param_symptom2;
                     symptoms1=param_symptom1;
                     System.out.println("param_symptom1:"+param_symptom1);
                 	             
	                    
	                    try{
	                        if(symptoms2.length() > 0 )
	                            {
	                                    database2 db = new database2(Screen3.this);
	                                db.open();
	                                    
	                                    if(db.Submitt3(symptoms1,symptoms2,symptoms3) != null )
	                               {
	                                    	
	                                        Cursor c=db.Submitt3(symptoms1,symptoms2,symptoms3);
	                                         if(c.moveToFirst())
	                                        	
	                                   	Toast.makeText(Screen3.this,"Health Tip and Diet"+"\n"+c.getString(6)+"\n"+"\n"+"Tests to be taken"+"\n"+c.getString(7),Toast.LENGTH_LONG).show();
	                                   
	                                                                              	
	                                        
	                                        
	                                        
	                                   
	                                    }else{
	                                          Toast.makeText(Screen3.this,"Invalid ", Toast.LENGTH_LONG).show();
	                                   }
	                                    db.close();
	                            }
	                            
	                    }catch(Exception e)
	                    {
	                            Toast.makeText(Screen3.this,e.getMessage(), Toast.LENGTH_LONG).show();
	              }
	            }
	            
	    });
	        
	        
	        
	        
	        Button b1=(Button)findViewById(R.id.btnNext);
	        b1.setOnClickListener(new View.OnClickListener(){
	        	 public void onClick(View argo)
	        	 {
	        		 Intent i=new Intent(Screen3.this,Screen4.class);
	        		 Bundle params2=new Bundle();
	        		  params2.putString("symptom3", txtsymptom3.getText().toString());
	        		 i.putExtras(params2);
	        		 params2.putString("symptom1",param_symptom1);
	        		 i.putExtras(params2);
	        		 params2.putString("symptom2",param_symptom2);
	        		 i.putExtras(params2);
	        		 
	        		 startActivity(i);
	        	 }
	        });
	        
	        
	        Button bb=(Button)findViewById(R.id.btnexit);
	        bb.setOnClickListener(new OnClickListener(){
	        	 public void onClick(View argo)
	        	 {
	        		 Intent i=new Intent(Screen3.this,aushadhi.class);
	        		 startActivity(i);
	        	 }
	        });
	        
	        
	        
	}
		
	}
	