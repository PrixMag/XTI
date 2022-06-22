package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Layouts extends JFrame {//transforma a classe em uma janela

	public Layouts() {//metodo construtor da classe
		super ("Layouts");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		
		//getContentPane().add(new JButton("1"));//adiciona componentes a janela
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);

	}
	
	public static void main(String[] args) {
		new Layouts();
		
	}

}
