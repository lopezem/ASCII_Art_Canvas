import javax.swing.JTextArea;


public class AsciiCanvas {

	public void message()
	{
		System.out.println("it worked!!!");
	}
	
	public void setFrame()
	{
		
	}
	
	public void getFrame()
	{
		
	}
	
	
	public void nextFrame()
	{
		setFrame();
		getFrame();
		System.out.println("it worked!!!");
	}
	
	public void previousFrame()
	{
		setFrame();
		getFrame();
		System.out.println("it worked!!!");
	}
	
	
	public void play()//needs a delay
	{
		//use a loop
		setFrame();
		getFrame();
		System.out.println("it worked!!!");
	}
	
	public void save(JTextArea input)
	{
		String s = input.getText();
		System.out.println(s);
		//System.out.println("it worked!!!");
	}
	
	public void load()
	{
		System.out.println("it worked!!!");
	}
	
	public void addFrame()
	{
		System.out.println("it worked!!!");
	}
	
	

}
