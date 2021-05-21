package com.dtt.lgsp.app.config;

import javax.swing.JTextArea;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.Level;
import org.apache.log4j.spi.LoggingEvent;

import com.dtt.lgsp.app.ProcessingViewer;


public class MyCustomAppender extends AppenderSkeleton {

	private JTextArea jTextA;

    public MyCustomAppender() {
        jTextA = new ProcessingViewer().getTxtLog();
    }
    protected void append(LoggingEvent event) 
    {
        if(event.getLevel().equals(Level.INFO)){
        	if(jTextA==null) {
        		jTextA = new ProcessingViewer().getTxtLog();
        	}
        jTextA.append(event.getMessage().toString()+ "\n");
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