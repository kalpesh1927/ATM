import javax.swing.JFrame;

public class InfoFrame extends JFrame {

	private InfoPanel infoPanel;

	public InfoFrame() {
		super("Customer Info");
		setSize(530, 280);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		infoPanel = new InfoPanel();
		this.setLocation(500, 500);
		add(infoPanel);
	}

	public void addToDisplay(String info) {
		infoPanel.addToDisplay(info);
	}

	public boolean getBack() {
		return infoPanel.getBack();
	}

	public void setBackFalse() {
		infoPanel.setBackFalse();
	}

	public void clearDisplay() {
		infoPanel.clearDisplay();
	}

}