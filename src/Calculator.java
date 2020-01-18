import java.awt.BorderLayout;

import javax.swing.*;
import java.awt.GridLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

public class Calculator extends Functions {
	private static JTextField numberArea;
	static int current = 0;
	static String temp = "0";
	static String temp2 = "0";
	static boolean num1, num2, operator, equalbutton = false;
	static String op;
	private static JTextField topNumberArea;

	public static void main(String args[]) {

		// Creating the Frame
		JFrame frmCalculator = new JFrame("CalculatorFrame");
		frmCalculator.setTitle("Calculator by Kalvin Kao");
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.setSize(315, 484);
		frmCalculator.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel_1 = new JPanel();
		frmCalculator.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));

		topNumberArea = new JTextField();
		topNumberArea.setBackground(Color.WHITE);
		topNumberArea.setEditable(false);
		panel_1.add(topNumberArea);

		numberArea = new JTextField();
		numberArea.setBackground(Color.WHITE);
		numberArea.setEditable(false);
		numberArea.setFont(new Font("Tahoma", Font.PLAIN, 40));
		numberArea.setColumns(1);
		numberArea.setText(temp);
		panel_1.add(numberArea);
		JPanel panel_3 = new JPanel();
		frmCalculator.getContentPane().add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel = new JPanel();
		panel_3.add(panel);

		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				temp = "0";
				temp2 = "0";
				topNumberArea.setText("");
				numberArea.setText(temp);
				num1 = false;
				num2 = false;
				operator = false;
				equalbutton = false;
			}
		});
		panel.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel label = new JLabel("");
		panel.add(label);

		JLabel lblNewLabel = new JLabel("");
		panel.add(lblNewLabel);
		panel.add(btnC);

		JButton button_3 = new JButton("<--");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				temp = temp.substring(0, temp.length() - 1);
				numberArea.setText(temp);
			}
		});
		button_3.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel.add(button_3);

		JPanel panel_2 = new JPanel();
		panel_3.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 4, 0, 0));

		JButton seven = new JButton("7");
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_2.add(seven);

		JButton eight = new JButton("8");
		panel_2.add(eight);

		JButton nine = new JButton("9");
		panel_2.add(nine);

		JButton division = new JButton("\u00F7");
		panel_2.add(division);

		JButton four = new JButton("4");
		panel_2.add(four);

		JButton five = new JButton("5");
		panel_2.add(five);

		JButton six = new JButton("6");
		panel_2.add(six);

		JButton multiply = new JButton("X");
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_2.add(multiply);

		JButton one = new JButton("1");
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num1 == false && operator == false) {
					num1 = true;
					temp = "1";
					numberArea.setText("1");
				} else if (num1 == true && operator == false) {
					temp = temp + "1";
					numberArea.setText(temp);
				} else if (num2 == false && operator == true) {
					temp2 = "1";
					numberArea.setText(temp2);
					num2 = true;
				} else if (num2 == true && operator == true) {
					temp2 = temp2 + "1";
					numberArea.setText(temp2);
				}
			}
		});
		panel_2.add(one);

		JButton two = new JButton("2");
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num1 == false && operator == false) {
					num1 = true;
					temp = "2";
					numberArea.setText("2");
				} else if (num1 == true && operator == false) {
					temp = temp + "2";
					numberArea.setText(temp);
				} else if (num2 == false && operator == true) {
					temp2 = "2";
					numberArea.setText(temp2);
					num2 = true;
				} else if (num2 == true && operator == true) {
					temp2 = temp2 + "2";
					numberArea.setText(temp2);
				}
			}
		});
		panel_2.add(two);

		JButton three = new JButton("3");
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num1 == false && operator == false) {
					num1 = true;
					temp = "3";
					numberArea.setText("3");
				} else if (num1 == true && operator == false) {
					temp = temp + "3";
					numberArea.setText(temp);
				} else if (num2 == false && operator == true) {
					temp2 = "3";
					numberArea.setText(temp2);
					num2 = true;
				} else if (num2 == true && operator == true) {
					temp2 = temp2 + "3";
					numberArea.setText(temp2);
				}
			}
		});
		panel_2.add(three);

		JButton subtract = new JButton("-");
		panel_2.add(subtract);

		JButton dot = new JButton(".");
		panel_2.add(dot);

		JButton zero = new JButton("0");
		panel_2.add(zero);

		JButton equal = new JButton("=");
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (equalbutton == false) {
					equalbutton = true;
					num1 = false;
					num2 = false;
					topNumberArea.setText(temp + op + temp2 + " = ");
					
					// finish functions later 
					numberArea.setText(temp2);

				}

			}
		});

		panel_2.add(equal);

		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operator == false) {
					operator = true;
					num1 = true;
					op = "+";
					topNumberArea.setText(temp + op);
					numberArea.setText(temp2);

				}

			}
		});

		panel_2.add(plus);

		frmCalculator.setVisible(true);

	}
}