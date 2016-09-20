package com.aushadhi;




import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.database.Cursor;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

	public class Screen2 extends Activity {
		public long id;
		  
		private String param_symptom1;
 
		/** Called when the activity is first created. */
		@Override
	    
	       
		 public void onCreate(Bundle icicle) {
            super.onCreate(icicle);
	            setContentView(R.layout.next2);
	            database2 db=new database2(this);
	        
	        db.open();
	        
	       
	        id=db.insertSymptom1("fever",
	        		"chills",
	        		null,
	        		null,
	        		null,
	        		"Take a lot of rest",
	        		"Blood Smeer for Malarial parasite",
	        		"Anti malarial drug,Chloroquine tablets,Primaquine");
	        
	        id=db.insertSymptom1("fever",
	        		"cold",
	        		null,
	        		null,
	        		null,
	        		"You need a lot of bed rest",
	        		"Blood test",
	        		"NSAIDS,Cold medicines,argles or Lozenges");
	        
	        id=db.insertSymptom1("fever",
	        		"cough",
	        		null,
	        		null,
	        		null,
	        		"You need a lot of bed rest",
	        		"Blood test",
	        		"NSAIDS,Copugh medicines,argles or Lozenges");
	        
	        
	        
	        
	        
	        id=db.insertSymptom1("fever",
	        		"swelling of leg",
	        		null,
	        		null,
	        		null,
	        		"Do not strain your leg",
	        		"Blood Smeer microscopy-microfilaria",
	        		"Diethyl carbamazapine");
	        
	        
	        id=db.insertSymptom1("dry cough especially in the night",
	        		"breathlessness",
	        		null,
	        		null,
	        		null,
	        		"Avoid oily food and the food items with high mucus production",
	        		"CBP,Chest X-Ray,Sputum microscopy",
	        		"Tusk for temporary aliment,Bronchodilator,Mucolitics");
	        
	        id=db.insertSymptom1("abdominal pain",
	        		"voimitings",
	        		null,
	        		null,
	        		null,
	        		"Take fruit juices and have light food",
	        		"Abdominal X-Ray",
	        		"Surgical treatment");
	        
	        id=db.insertSymptom1("abdominal pain",
	        		"motions",
	        		null,
	        		null,
	        		null,
	        		"Take fruit juices and have light food",
	        		"Abdominal X-Ray",
	        		"Suroxide,Metronidazole");
	        
	        
	        id=db.insertSymptom1("motions",
	        		"abdominal pain",
	        		null,
	        		null,
	        		null,
	        		"Take fruit juices and have light food",
	        		"Abdominal X-Ray",
	        		"Suroxide,Metronidazole");
	        
	        
	        id=db.insertSymptom1("cough",
	        		"wheeze",
	        		null,
	        		null,
	        		null,
	        		"Avoid oily food and stay away from dust",
	        		"Chest X-Ray",
	        		"Ascorilals,Salbutomol");
	        
	        id=db.insertSymptom1("night blindness",
	        		"eye dryness",
	        		null,
	        		null,
	        		null,
	        		"Have an healthy diet",
	        		"Eye check up",
	        		"Revital");
	        
	        id=db.insertSymptom1("severe headache on one side of the head",
	        		"vomitings",
	        		null,
	        		null,
	        		null,
	        		"Use the prescribed medicines regularly and do some neck excersises",
	        		"CBT test,Skull X-Ray",
	        		"Pain killers");
	        
	        id=db.insertSymptom1("Swelling near the joints",
	        		"unable to walk",
	        		null,
	        		null,
	        		null,
	        		"Take bed rest till the pain subsides and take food rich in calcium",
	        		"Knee joint X-Ray",
	        		"Combiflam,NSAID,Glucozamine hydrocholoride tablets");
	        
	        
	        db.close();
	      // final TextView txtsymptom1 = (EditText)findViewById(R.id.txtsymptom1);
	        final EditText txtsymptom2= (EditText)findViewById(R.id.txtsymptom2);
	        
	        // Paramater Reading
	        
            	Bundle params=this.getIntent().getExtras();
            	
            	param_symptom1=params.getString("symptom1");
            	
            	
	        //End Parameter Reading
	        
	        
	       
            	
            	
	        
	        
	       
	        
	        
	        
	        
	        Button btnSubmit2 = (Button)findViewById(R.id.btnSubmit);
	        
	        
	        btnSubmit2.setOnClickListener(new OnClickListener(){

	             

				

					@Override
	                public void onClick(View v) {
	                    
	                        String symptoms2= txtsymptom2.getText().toString().trim();
	                        String symptoms1= "";
	                        
	                        symptoms1=param_symptom1;
	                        
	                        
	                        try{
	                            if(symptoms2.length()>0 )
	                                {
	                                        database2 db = new database2(Screen2.this);
	                                    db.open();
	                                        if( db.Submit2(symptoms1,symptoms2) != null && symptoms1!=symptoms2)
	                                        {
	                                        	
	                                            Cursor c=db.Submit2(symptoms1,symptoms2);
	                                            if(c.moveToFirst())
	                                            {
	                                            	
	                                       	Toast.makeText(Screen2.this,"\n"+"Symptoms"+"\n"+c.getString(1)+"\n"+c.getString(2)+"\n"+"\n"+"Medicine"+"\n"+c.getString(8),Toast.LENGTH_LONG).show();
	                                       
	                                            }
	                                        else{
	                                                Toast.makeText(Screen2.this,"Invalid ", Toast.LENGTH_LONG).show();
	                                        	}
	                                        
	                                        }
	                                        else{
                                                Toast.makeText(Screen2.this,"Symptom is already entered ", Toast.LENGTH_LONG).show();
                                        }db.close();
	                                }
	                            else{
                                    Toast.makeText(Screen2.this,"Symptom is already entered", Toast.LENGTH_LONG).show();
                            }
	                            

	                        
	                       
	                                
	                        }catch(Exception e)
	                        {
	                                Toast.makeText(Screen2.this,e.getMessage(), Toast.LENGTH_LONG).show();
	                  }
	                }
	                
	        });
	        
	        
	        
	        
	        
	        Button bb=(Button)findViewById(R.id.btnpage);
	        bb.setOnClickListener(new View.OnClickListener(){
	        	 public void onClick(View argo)
	        	 {
	        		 Intent i=new Intent(Screen2.this,Screen1.class);
	        		 startActivity(i);
	        	 }
	        });
	        
	        Button bb11=(Button)findViewById(R.id.btnexit);
	        bb11.setOnClickListener(new View.OnClickListener(){
	        	 public void onClick(View argo)
	        	 {
	        		 Intent i=new Intent(Screen2.this,aushadhi.class);
	        		 startActivity(i);
	        	 }
	        });
	        
	        
	        Button bb1=(Button)findViewById(R.id.btnNext);
	        bb1.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View argo) {
					// TODO Auto-generated method stub
					
					
					Intent i=new Intent(Screen2.this,Screen3.class);
	        		 Bundle params2=new Bundle();
	        		  params2.putString("symptom2", txtsymptom2.getText().toString());
	        		 i.putExtras(params2);
	        		 params2.putString("symptom1",param_symptom1);
	        		 i.putExtras(params2);
	        		 startActivity(i);
					
				}
		
	        });
	       
	        
	        
	        
	        Button t=(Button)findViewById(R.id.btntreatment);
	        t.setOnClickListener(new OnClickListener(){

	            

				

				@Override
	            public void onClick(View v) {
					String symptoms2= txtsymptom2.getText().toString().trim();
                    String symptoms1= "";
                    
                    symptoms1=param_symptom1;	                 
	                    
	                    try{
	                        if(symptoms2.length() > 0 )
	                            {
	                                    database2 db = new database2(Screen2.this);
	                                db.open();
	                                    
	                                    if(db.Submitt2(symptoms1,symptoms2) != null )
	                               {
	                                    	
	                                        Cursor c=db.Submitt2(symptoms1,symptoms2);
	                                         if(c.moveToFirst())
	                                        	
	                                   	Toast.makeText(Screen2.this,"Health Tip and Diet"+"\n"+c.getString(6)+"\n"+"\n"+"Tests to be taken"+"\n"+c.getString(7),Toast.LENGTH_LONG).show();
	                                   
	                                                                              	
	                                        
	                                        
	                                        
	                                   
	                                    }else{
	                                          Toast.makeText(Screen2.this,"Invalid ", Toast.LENGTH_LONG).show();
	                                   }
	                                    db.close();
	                            }
	                            
	                    }catch(Exception e)
	                    {
	                            Toast.makeText(Screen2.this,e.getMessage(), Toast.LENGTH_LONG).show();
	              }
	            }
	            
	    });
	        
	        Button bb12=(Button)findViewById(R.id.btnpage);
	        bb12.setOnClickListener(new OnClickListener(){
	        	 public void onClick(View argo)
	        	 {
	        		 setResult(RESULT_OK);
	        		 finish();
	        	 }
	        });
	            
	        
	       
	}
		
	}
	