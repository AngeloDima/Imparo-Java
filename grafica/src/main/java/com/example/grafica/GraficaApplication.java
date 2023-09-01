package com.example.grafica;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraficaApplication implements ActionListener {

	int count = 0;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;

	public GraficaApplication() {
		JFrame frame = new JFrame();

		JButton button = new JButton("Cliccami");
		button.addActionListener(this);

		label = new JLabel("Numero di click: 0");

		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);

		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Primo programma grafico");
		frame.pack();
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		new GraficaApplication();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Numero di click: " + count);

	}

}
