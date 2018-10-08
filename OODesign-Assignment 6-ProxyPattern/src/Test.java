import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Test {
	ImageComponent imageComponent;
	JFrame frame = new JFrame("CD Cover Viewer");
	JMenuBar menuBar;
	JMenu menu;
	Hashtable<String, String> cds = new Hashtable<String, String>();

	public static void main(String [] args) throws Exception{

		Test testDrive = new Test();
		
	}
	
	public Test() throws Exception{
		cds.put("Insert Dollar","https://i.ytimg.com/vi/EZlmj8a-Z98/maxresdefault.jpg");
		cds.put("Eject Dollar","https://orig00.deviantart.net/2edf/f/2014/152/6/0/no_dollar_for_you__facebook__by_zombiesandwich-d7kmrrk.jpg");
		cds.put("Choose Drink","https://www.federalmachine.com/images/vending-machines/combo/40Select-BD.jpg");
		cds.put("Vending Machine","https://www.candymachines.com/images/bulk_vending_machines/snack_soda_vending_machines/seaga-infinity-INF5B-soda-beverage-vending-machine.jpg");

		SodaMachine sodaMachine = new SodaMachine(10);
		
		URL initialURL = new URL((String)cds.get("Vending Machine"));
		menuBar = new JMenuBar();
		menu = new JMenu("Actions");
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);

		for (Enumeration<String> e = cds.keys(); e.hasMoreElements();) {
			String name = (String)e.nextElement();
			JMenuItem menuItem = new JMenuItem(name);
			menu.add(menuItem); 
			menuItem.addActionListener(event -> {
				imageComponent.setIcon(new ImageProxy(getCDUrl(event.getActionCommand())));
				if(event.getActionCommand().toString() == "Insert Dollar") {
					sodaMachine.insertDollar();
				}
				else if(event.getActionCommand().toString() == "Eject Dollar") {
					sodaMachine.ejectDollar();
				}
				else if(event.getActionCommand().toString() == "Choose Drink") {
					sodaMachine.chooseDrink();
				}
				else if(event.getActionCommand().toString() == "Vending Machine") {
					sodaMachine.chooseDrink();
				}
				else {
					System.out.println("Error");
				}
				
				frame.repaint();
			});
		}

		// set up frame and menus

		Icon icon = new ImageProxy(initialURL);
		imageComponent = new ImageComponent(icon);
		frame.getContentPane().add(imageComponent);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,600);
		frame.setVisible(true);

	}

	URL getCDUrl(String name) {
		try {
			return new URL((String)cds.get(name));
		} catch (MalformedURLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
