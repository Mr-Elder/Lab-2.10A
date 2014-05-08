import java.applet.Applet;
import java.util.*;
import java.awt.*;

public class SnowThread extends Thread{
    
    Graphics page;
    
    public SnowThread(Graphics pageIn){
    	this.page = pageIn;
    }
    
    @Override
    public void run(){
    	Random rand = new Random();
    	int i = 0;
    	while(true){
    		i++;
    		int some = rand.nextInt(600);
			page.fillOval(some, i, some+1, i+1);
			try{Thread.sleep(80);}catch(Exception e){}
    	if(i > 300)
    		i=0;
    }
    }
    
    
}