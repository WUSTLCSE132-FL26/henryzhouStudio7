package communication;

import jssc.*;

public class DisplayControl {
	
	final private SerialComm port;
	
	public DisplayControl(String portname) throws SerialPortException {
		port = new SerialComm(portname);
	}

	public void run() {
		//You may want to consider importing your Assignment 6 code here, renaming it DisplayControl.java, and modifying it rather than starting over...


	}

	public static void main(String[] args) throws SerialPortException {
		DisplayControl dc = new DisplayControl("COM4"); // Adjust this to be the right port for your machine
		dc.run();
	}
}
