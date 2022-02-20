import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class CelsiusConverterFrame extends JFrame implements ActionListener {
	private JLabel fahrenheitLabel;
	private JLabel degreeLabel;
	private JTextField celsiusField; 
	private JTextField fahrenheitField;
	private JButton calcButton;
	
	CelsiusConverterFrame() {
	    GridBagConstraints positionConst = null;
	
	    setTitle("Celcius Converter");
	
	    fahrenheitLabel = new JLabel("Fahrenheit:");
	    degreeLabel = new JLabel(" Degrees");
	
	    celsiusField = new JTextField(6);
	    celsiusField.setEditable(true);
	    celsiusField.setText("0");
	
	    fahrenheitField = new JTextField(6);
	    fahrenheitField.setEditable(false);
	
	    calcButton = new JButton("Convert");
	    
	    calcButton.addActionListener(this);
	
	    setLayout(new GridBagLayout());
	    positionConst = new GridBagConstraints();
	
	    positionConst.gridx = 0;
	    positionConst.gridy = 0;
	    positionConst.insets = new Insets(10, 10, 10, 10);
	    add(celsiusField, positionConst);
	
	    positionConst.gridx = 0;
	    positionConst.gridy = 1;
	    positionConst.insets = new Insets(10, 10, 10, 10);
	    add(fahrenheitLabel, positionConst);
	    
	    positionConst.gridx = 2;
	    positionConst.gridy = 1;
	    positionConst.insets = new Insets(10, 10, 10, 10);
	    add(degreeLabel, positionConst);
	
	    positionConst.gridx = 1;
	    positionConst.gridy = 1;
	    positionConst.insets = new Insets(10, 10, 10, 10);
	    add(fahrenheitField, positionConst);
	
	    positionConst.gridx = 1;
	    positionConst.gridy = 0;
	    positionConst.insets = new Insets(10, 10, 10, 10);
	    add(calcButton, positionConst);
 }

 @Override
 public void actionPerformed(ActionEvent event) {
    String userInput;      
    int celsiusDegree;

    userInput = celsiusField.getText();
    
    celsiusDegree = Integer.parseInt(userInput);

    fahrenheitField.setText(Integer.toString((celsiusDegree * 9/5)+32));
 }

 public static void main(String[] args) {
	CelsiusConverterFrame myFrame = new CelsiusConverterFrame();

    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myFrame.pack();
    myFrame.setVisible(true);
 }
}