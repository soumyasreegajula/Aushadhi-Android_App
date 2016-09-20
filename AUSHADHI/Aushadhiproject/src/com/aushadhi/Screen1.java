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

public class Screen1 extends Activity {
	public long id;
	  

	/** Called when the activity is first created. */
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next1);
       
        database2 db=new database2(this);
        
        db.open();
        
       
        
        id=db.insertSymptom1("fever",
        		null,
        		null,
        		null,
        		null,
        		"Avoid oily food",
        		"Blood test",
        		"Dolo");
        
                
        id=db.insertSymptom1("dry cough",
        		null,
        		null,
        		null,
        		null,
        		"Avoid oily food",
        		"Blood CBP-ESR,",
        		"Mucolitics,Bronchiodilators");
        
        id=db.insertSymptom1("cough",
        		null,
        		null,
        		null,
        		null,
        		"Avoid oily food",
        		"Blood CBP-ESR,",
        		"Mucolitics,Bronchiodilators");
                
        id=db.insertSymptom1("dry cough especially in the morning",
        		null,
        		null,
        		null,
        		null,
        		"Avoid oily food",
        		"Blood CBP-ESR,",
        		"Mucolitics,Bronchiodilators");
                
        id=db.insertSymptom1("Chest pain on the left side",
        		null,
        		null,
        		null,
        		null,
        		"Take a lot of rest",
        		"ECG,Troponum T&I CKMB,Coronary Angiogram",
        		"Anti anginial drugs,Anti hypertensive drugs/Anti diabiatic drug,Anti lipids,Anxiolytic drugs");
        
        
        id=db.insertSymptom1("burning abdominal pain",
        		null,
        		null,
        		null,
        		null,
        		"Take light food and lots of juices",
        		"Upper GI Endoscopy",
        		"Antacids,Antihistaminics,Anxiolytics"); 
        
        
        id=db.insertSymptom1("abdominal pain",
        		null,
        		null,
        		null,
        		null,
        		"Take light food and lots of juices",
        		"Upper GI Endoscopy",
        		"Antacids"); 
        
        
        id=db.insertSymptom1("severe abdominal pain",
        		null,
        		null,
        		null,
        		null,
        		"Have liquid foods",
        		"U.S abdomen,X-Ray IVP",
        		"Antispamodics,Surgical removal of stones");
        
        id=db.insertSymptom1("severe abdominal pain on the right side",
        		null,
        		null,
        		null,
        		null,
        		"Take light food and lots of juices",
        		"(Appendicitics)U.S abdomen,CBP,ESR & Neutrophitics",
        		"Surgical excision-Appendicetomy");
        
        id=db.insertSymptom1("tongue pain",
        		null,
        		null,
        		null,
        		null,
        		"Avoid intake of hard substances",
        		"Consult ENT specialist",
        		"Vitamin B tablets");
        
        id=db.insertSymptom1("severe abdominal pain",
        		null,
        		null,
        		null,
        		null,
        		"Take light food and lots of juices",
        		"USG Abdominal X-ray,Urine analysis",
        		"Colinol");
        id=db.insertSymptom1("body pains",
        		null,
        		null,
        		null,
        		null,
        		"Take a lot of rest",
        		null,
        		"Combiflam");
        
        id=db.insertSymptom1("severe headache",
        		null,
        		null,
        		null,
        		null,
        		"Sleep a lot and have an healthy diet",
        		"CT scan of brain",
        		"Combiflam");
        
        id=db.insertSymptom1("ear pain",
        		null,
        		null,
        		null,
        		null,
        		"Keep your ear dry by constantly cleaning it ",
        		"Audioscope test",
        		"Ear drops,pain killers");
        
        
        
        
        id=db.insertSymptom1("weakness",
        		null,
        		null,
        		null,
        		null,
        		"Take balanced diet",
        		"CBT test",
        		"Multi Vitamin Tablets");
      
        id=db.insertSymptom1("loss of apetite",
        		null,
        		null,
        		null,
        		null,
        		"Take balanced diet",
        		"Blood test and urine test",
        		"Bitazyma,Aristozyma");
        
        id=db.insertSymptom1("severe headache on one side of the head",
        		null,
        		null,
        		null,
        		null,
        		"Do not take stress and have a good sleep",
        		"CBT test,Skull X-Ray",
        		"Pain killers");
        
        id=db.insertSymptom1("severe headache while reading",
        		null,
        		null,
        		null,
        		null,
        		"Have an healthy diet and lots of carrots",
        		"Eye check up",
        		"Saridon,Combiflam");
        
        id=db.insertSymptom1("gastric trouble",
        		null,
        		null,
        		null,
        		null,
        		"Have a lot of fluids",
        		"Endoscopy test,X-Ray of abdomen",
        		"Digena,Vitazyma,Gelucil");
        
        
        
        id=db.insertSymptom1("Back pain",
        		null,
        		null,
        		null,
        		null,
        		"Do not do any rigorous work and rest a lot",
        		"Spine X-ray",
        		"Combiflam,NSAID");
        
        
        
        
        
        
        
        
        
        
        
        
       
        db.close();
        final EditText txtsymptom1 = (EditText)findViewById(R.id.txtsymptom1);
       
        Button btnSubmit = (Button)findViewById(R.id.btnSubmit);
       
        btnSubmit.setOnClickListener(new OnClickListener(){

             

			

				@Override
                public void onClick(View v) {
                        String symptoms1= txtsymptom1.getText().toString().trim();
                     
                        
                        try{
                            if(symptoms1.length() > 0 )
                                {
                                        database2 db = new database2(Screen1.this);
                                    db.open();
                                        
                                        if(db.Submit(symptoms1) != null )
                                   {
                                        	
                                            Cursor c=db.Submit(symptoms1);
                                             if(c.moveToFirst())
                                            	
                                       	Toast.makeText(Screen1.this,"Symptom"+"\n"+c.getString(1)+"\n"+"\n"+"Medicine"+"\n"+c.getString(8),Toast.LENGTH_LONG).show();
                                       
                                                                                  	
                                            
                                            
                                            
                                       
                                        }else{
                                              Toast.makeText(Screen1.this,"Invalid ", Toast.LENGTH_LONG).show();
                                       }
                                        db.close();
                                }
                            else{
                                Toast.makeText(Screen1.this,"Invalid ", Toast.LENGTH_LONG).show();
                         }
                                
                        }catch(Exception e)
                        {
                                Toast.makeText(Screen1.this,e.getMessage(), Toast.LENGTH_LONG).show();
                  }
                }
                
        });
        Button b=(Button)findViewById(R.id.btnNext);
        b.setOnClickListener(new View.OnClickListener(){
        	 public void onClick(View argo)
        	 {
        		 Intent i=new Intent(Screen1.this,Screen2.class);
        		 Bundle params=new Bundle();
        		 params.putString("symptom1", txtsymptom1.getText().toString());
        		 i.putExtras(params);
        		 startActivity(i);
        	 }
        });
        
        
        
        
        
        
        
        
        Button t=(Button)findViewById(R.id.btntreatment);
        t.setOnClickListener(new OnClickListener(){

            

			

			@Override
            public void onClick(View v) {
                    String symptoms1= txtsymptom1.getText().toString().trim();
                 
                    
                    try{
                        if(symptoms1.length() > 0 )
                            {
                                    database2 db = new database2(Screen1.this);
                                db.open();
                                    
                                    if(db.Submit(symptoms1) != null )
                               {
                                    	
                                        Cursor c=db.Submitt1(symptoms1);
                                         if(c.moveToFirst())
                                        
                                   	Toast.makeText(Screen1.this,"Health Tip and Diet"+"\n"+c.getString(6)+"\n"+"\n"+"Tests to be taken"+"\n"+c.getString(7),Toast.LENGTH_LONG).show();
                                   
                                                                              	
                                        
                                        
                                        
                                   
                                    }else{
                                          Toast.makeText(Screen1.this,"Invalid ", Toast.LENGTH_LONG).show();
                                   }
                                    db.close();
                            }
                            
                    }catch(Exception e)
                    {
                            Toast.makeText(Screen1.this,e.getMessage(), Toast.LENGTH_LONG).show();
              }
            }
            
    });
        
        
        
        Button bb=(Button)findViewById(R.id.btnpage);
        bb.setOnClickListener(new OnClickListener(){
        	 public void onClick(View argo)
        	 {
        		 Intent i=new Intent(Screen1.this,aushadhi.class);
        		 startActivity(i);
        	 }
        });
        
}
	
}

