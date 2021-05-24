package com.dtt.lgsp.app.config;

import javax.swing.JTextArea;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.Level;
import org.apache.log4j.spi.LoggingEvent;

import com.dtt.lgsp.app.ProcessingViewer;
import com.dtt.lgsp.app.SettingViewer;


public class MyCustomAppender extends AppenderSkeleton {

	private JTextArea jTextA;
	private JTextArea jTextB;

    public MyCustomAppender() {
        jTextA = new ProcessingViewer().getTxtLog();
        jTextB = new SettingViewer().gettxtLog2();
    }
    protected void append(LoggingEvent event) 
    {
        if(event.getLevel().equals(Level.INFO)){
        	if(jTextA==null) {
        		jTextA = new ProcessingViewer().getTxtLog();
        	}
        	jTextA.append(event.getMessage().toString()+ "\n");
        	
        	//
        	
        	
        	if(jTextB==null) {
        		jTextB = new SettingViewer().gettxtLog2();
        	}
        	jTextB.append(event.getMessage().toString()+ "\n");
        }
    }
    public void close() 
    {
    }
    public boolean requiresLayout() 
    {
        return false;
    }

}