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

	public class Screen4 extends Activity {
		public long id;
		  
		private String param_symptom2;
		private String param_symptom1;
		private String param_symptom3;
		 
		/** Called when the activity is first created. */
		@Override
	    
	       
		 public void onCreate(Bundle icicle) {
            super.onCreate(icicle);
	            setContentView(R.layout.next4);
	            
	            database2 db=new database2(this);
	        
	        db.open();
	        
	       
	        
	        id=db.insertSymptom1("fever",
	        		"chills",
	        		"headache",
	        		"bodyaches",
	        		null,
	        		"Take bed rest",
	        		"Blood Smeer for Malarial parasite",
	        		"Anti malarial drug,Chloroquine tablets");
	        
	        
	        id=db.insertSymptom1("fever >7days",
	        		"abdominal pain",
	        		"voimitings",
	        		"bodyaches",
	        		null,
	        		"Have lots of liquids",
	        		"Blood Smeer test",
	        		"Cefixine,Chlorochenacoc");
	        
	        id=db.insertSymptom1("sneezing",
	        		"headache",
	        		"nosal pain",
	        		"allergy to dust",
	        		null,
	        		"Be away from dust",
	        		"Head X-Ray,Frontal test",
	        		"Nosal drops,alaspan");
	        
	        
	        
	        id=db.insertSymptom1("low grade fever",
	        		"loss of weight",
	        		"chest pain",
	        		"blood in sputum",
	        		null,
	        		"Avoid oily foods",
	        		"Sputum for AFB,CBP,ECR,Montoux Test,Chest X-Ray",
	        		"INH+RIFAMPICIAN,Ethombutil,Pyrazinamide");
	        
	        
	        db.close();
	        
	      	        final EditText txtsymptom4= (EditText)findViewById(R.id.txtsymptom4);
	        
	        // Paramater Reading
	        
            	Bundle params2=this.getIntent().getExtras();
            	
            	param_symptom2=params2.getString("symptom2");

            	
            	param_symptom1=params2.getString("symptom1");
            	
            	param_symptom3=params2.getString("symptom3");
            	
            	
            	
Bundle params=this.getIntent().getExtras();
            	
            	param_symptom1=params.getString("symptom1");
            	
            	
            	
            	
            	
	        //End Parameter Reading
	        
	        
	       
            	
            	
	        
	        
	        Button btnSubmit3 = (Button)findViewById(R.id.btnSubmit);
	       
	        
	        
	        
	        
	        
	        btnSubmit3.setOnClickListener(new OnClickListener(){

	             

				

					@Override
	                public void onClick(View v) {
	                    
	                        String symptoms4= txtsymptom4.getText().toString().trim();
	                        String symptoms2= "";
	                        String symptoms1= "";
	                        symptoms2=param_symptom2;
	                        symptoms1=param_symptom1;
	                        String symptoms3= "";
	                        symptoms3=param_symptom3;
	                        System.out.println("param_symptom1:"+param_symptom1);
	                    	
	                    	
	                    	
	                    	
	                    	
	                        try{
	                            if(symptoms4.length()>0)
	                                {
	                                        database2 db = new database2(Screen4.this);
	                                    db.open();
	                                    
	                                     Cursor c=db.Submit4(symptoms1,symptoms2,symptoms3,symptoms4);
	                                     if(symptoms4.length()>0 && symptoms4!=symptoms3 && symptoms4!=symptoms2&&symptoms4!=symptoms1)
	                                     {
	                                        if( c!=null)
	                                        {
	                                        	
	                                            
	                                            if(c.moveToFirst())
	                                            {
	                                            	
	                                            	System.out.println("Record Found...!");
	                                            	
	                                       	
	                                            	Toast.makeText(Screen4.this,"\n"+"Symptoms"+"\n"+c.getString(1)+"\n"+c.getString(2)+"\n"+c.getString(3)+"\n"+c.getString(4)+"\n"+"\n"+"Medicine"+"\n"+c.getString(8),Toast.LENGTH_LONG).show();
	                                            }
	                                            
	                                                                        
	                                       
	                                        }else{
	                                                Toast.makeText(Screen4.this,"Symptom is already entered ", Toast.LENGTH_LONG).show();
	                                        } db.close();
	                                     }
	                                        else{
                                                Toast.makeText(Screen4.this,"Symptom is already entered ", Toast.LENGTH_LONG).show();
                                        }
	                                       
	                                
	                                }
	                                
	                        }catch(Exception e)
	                        {
	                                Toast.makeText(Screen4.this,"Error:"+e.getMessage(), Toast.LENGTH_LONG).show();
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
					String symptoms4= txtsymptom4.getText().toString().trim();
                    String symptoms2= "";
                    String symptoms1= "";
                    symptoms2=param_symptom2;
                    symptoms1=param_symptom1;
                    String symptoms3= "";
                    symptoms3=param_symptom3;
                    System.out.println("param_symptom1:"+param_symptom1);
                 	             
	                    
	                    try{
	                        if(symptoms4.length() > 0 )
	                            {
	                                    database2 db = new database2(Screen4.this);
	                                db.open();
	                                    
	                                    if(db.Submitt4(symptoms1,symptoms2,symptoms3,symptoms4) != null )
	                               {
	                                    	
	                                        Cursor c=db.Submitt4(symptoms1,symptoms2,symptoms3,symptoms4);
	                                         if(c.moveToFirst())
	                                        	
	                                   	Toast.makeText(Screen4.this,"Health Tip and Diet"+"\n"+c.getString(6)+"\n"+"\n"+"Tests to be taken"+"\n"+c.getString(7),Toast.LENGTH_LONG).show();
	                                   
	                                                                              	
	                                        
	                                        
	                                        
	                                   
	                                    }else{
	                                          Toast.makeText(Screen4.this,"Invalid ", Toast.LENGTH_LONG).show();
	                                   }
	                                    db.close();
	                            }
	                            
	                    }catch(Exception e)
	                    {
	                            Toast.makeText(Screen4.this,e.getMessage(), Toast.LENGTH_LONG).show();
	              }
	            }
	            
	    });
	        
	        
	        
	        
	        Button b1=(Button)findViewById(R.id.btnNext);
	        b1.setOnClickListener(new View.OnClickListener(){
	        	 public void onClick(View argo)
	        	 {
	        		 Intent i=new Intent(Screen4.this,Screen5.class);
	        		 Bundle params2=new Bundle();
	        		  params2.putString("symptom4", txtsymptom4.getText().toString());
	        		 i.putExtras(params2);
	        		 params2.putString("symptom1",param_symptom1);
	        		 i.putExtras(params2);
	        		 params2.putString("symptom2",param_symptom2);
	        		 i.putExtras(params2);
	        		 params2.putString("symptom3",param_symptom3);
	        		 i.putExtras(params2);
	        		 
	        		 startActivity(i);
	        	 }
	        });
	        
	        Button bb=(Button)findViewById(R.id.btnexit);
	        bb.setOnClickListener(new OnClickListener(){
	        	 public void onClick(View argo)
	        	 {
	        		 Intent i=new Intent(Screen4.this,aushadhi.class);
	        		 startActivity(i);
	        	 }
	        });
	          
	}
		
	}
	