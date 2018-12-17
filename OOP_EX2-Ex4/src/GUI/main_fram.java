package GUI;

import javax.swing.JFrame;

public class main_fram {
	public static void main(String[] args)
	{
		MyFarme win = new MyFarme();
		win.setVisible(true);

		win.setSize(win.myImage.getWidth(),win.myImage.getHeight());
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
