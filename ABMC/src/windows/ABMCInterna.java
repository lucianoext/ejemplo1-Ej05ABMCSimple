package windows;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class ABMCInterna extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ABMCInterna frame = new ABMCInterna();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ABMCInterna() {
		setBounds(100, 100, 450, 300);

	}

}
