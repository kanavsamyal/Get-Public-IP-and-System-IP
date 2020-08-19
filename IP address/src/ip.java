import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame; 

  
public class ip
{ 
    public static void main(String args[]) throws Exception 
    { 
    	JFrame f=new JFrame();  
        
    	JButton b=new JButton("Get Public IP"); 
    	JButton c=new JButton("Get System IP"); 
    	
        c.setBounds(130,200,200, 40);   
    	f.add(c);
    	f.setSize(400,500); 
    	f.setLayout(null); 
    	f.setVisible(true);
    	
    	b.setBounds(130,100,200, 40);    	          
    	f.add(b);    	          
    	
    	
    	
    	c.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e){ 
    			 InetAddress localhost = null;
				try {
					localhost = InetAddress.getLocalHost();
				} catch (UnknownHostException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
    		        System.out.println("System IP Address : " + 
    		                      (localhost.getHostAddress()).trim()); 
    		  
    			
    			
    		}	
    	});
    	b.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e){ 
    			 String systemipaddress = ""; 
    		        try
    		        { 
    		            URL url_name = new URL("http://bot.whatismyipaddress.com"); 
    		  
    		            BufferedReader sc = 
    		            new BufferedReader(new InputStreamReader(url_name.openStream())); 
    		  
    		           
    		            systemipaddress = sc.readLine().trim(); 
    		        } 
    		        catch (Exception e1) 
    		        { 
    		            systemipaddress = "Cannot Execute Properly"; 
    		        } 
    		        System.out.println("Public IP Address: " + systemipaddress +"\n"); 
    		    		  
    		
    			
    		}	
    	});
             
       
        
       
    } 
} 