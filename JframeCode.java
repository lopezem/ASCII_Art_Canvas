import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JframeCode extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	  JLabel output = new JLabel("Jframe");

	  JButton NEXT = new JButton("Next");
	  JButton PREVIOUS = new JButton("Previous");
	  JButton PLAY = new JButton("Play");
	  JButton SAVE = new JButton("Save");
	  JButton LOAD = new JButton("Load");
	  JButton ADDFRAME = new JButton("Add Frame");
	  
	  JTextArea input = new JTextArea(20,40);//area where user makes the animation
	  
	  public static void main(String args[])
	  {
	    new JframeCode().setVisible(true);
	   
	    
	 
	  } // end main
	  
	  public JframeCode()
	  {
		  
		  super("ASCii Animation Editor");
		  
		  PLAY.addActionListener(this);
		  NEXT.addActionListener(this);
		  PREVIOUS.addActionListener(this);
		  SAVE.addActionListener(this);
		  LOAD.addActionListener(this);
		  ADDFRAME.addActionListener(this);
		
		  setSize(500,400);;
		  setResizable(false);
		  getContentPane().setBackground(Color.black);
		 // JframeCode().getContentPane().setBackground(Color.BLACK);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  setLayout(new FlowLayout());


		  add(input);
		  
		  PLAY.setBackground(Color.CYAN);
		  add(PLAY);
		  
		  add(NEXT);	  
		  add(PREVIOUS);
		  
		  add(SAVE);
		  SAVE.setBackground(Color.GREEN);
		  
		  add(LOAD);
		  LOAD.setBackground(Color.LIGHT_GRAY);
		  
		  add(ADDFRAME);
		  ADDFRAME.setBackground(Color.ORANGE);
	  }

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  


	@Override
	public void actionPerformed(ActionEvent EVENT) //checks to see which button has been clicked
	{
		AsciiCanvas AC = new AsciiCanvas();//creates an instance of the AsciiCanvas class called AC
		
		String button = EVENT.getActionCommand();
	
		if(button.equals("Play"))
		{
			System.out.println("'Play' button has been clicked.");
			AC.message();
		}
		
		else if(button.equals("Next"))
		{
			System.out.println("'Next' button has been clicked.");
			AC.nextFrame();
		}
		
		else if(button.equals("Previous"))
		{
			System.out.println("'Previous' button has been clicked.");
			AC.previousFrame();
		}
		
		else if(button.equals("Save"))
		{
			System.out.println("'Save' button has been clicked.");
			AC.save(input);
		}
		
		else if(button.equals("Load"))
		{
			System.out.println("'Load' button has been clicked.");
			AC.load();
		}
		
		else if(button.equals("Add Frame"))
		{
			System.out.println("'Add Frame' button has been clicked.");
			AC.addFrame();
		}
		
	}
	

	
}
