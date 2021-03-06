import java.awt.BorderLayout;

import javax.swing.*;
import java.awt.GridLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

// Basic Calculator by Kalvin Kao

public class Calculator extends Functions {
	private static JTextField numberArea;
	static String temp = "0";
	static String temp2 = "0";
	static boolean num1, num2, operator, equalbutton, resulted, decimal1, decimal2 = false;
	static String op;
	private static JTextField topNumberArea;
	static double result = 0;

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

		// Clear all
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
				resulted = false;
				decimal1 = false;
				decimal2 = false;

			}
		});
		panel.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel blanklabel = new JLabel("");
		panel.add(blanklabel);

		JLabel blanklabel2 = new JLabel("");
		panel.add(blanklabel2);
		panel.add(btnC);

		// Back button
		JButton button_3 = new JButton("<=");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num2 == false) {
					if (temp == "0") {
					} else if (temp.length() == 1) {
						temp = "0";
						numberArea.setText(temp);
						num1 = false;
					} else {
						temp = temp.substring(0, temp.length() - 1);
						numberArea.setText(temp);
					}
				} else {
					if (temp2 == "0") {
					} else if (temp2.length() == 1) {
						temp2 = "0";
						numberArea.setText(temp2);
						num2 = false;
					} else {
						temp2 = temp2.substring(0, temp2.length() - 1);
						numberArea.setText(temp2);
					}
				}

			}
		});
		button_3.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel.add(button_3);

		JPanel panel_2 = new JPanel();
		panel_3.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 4, 0, 0));

		// Number 7
		JButton seven = new JButton("7");
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num1 == false && operator == false) {
					num1 = true;
					temp = "7";
					numberArea.setText("7");
				} else if (num1 == true && operator == false) {
					temp = temp + "7";
					numberArea.setText(temp);
				} else if (num2 == false && operator == true) {
					temp2 = "7";
					numberArea.setText(temp2);
					num2 = true;
				} else if (num2 == true && operator == true) {
					temp2 = temp2 + "7";
					numberArea.setText(temp2);
				}
			}
		});
		panel_2.add(seven);

		// Number 8
		JButton eight = new JButton("8");
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num1 == false && operator == false) {
					num1 = true;
					temp = "8";
					numberArea.setText("8");
				} else if (num1 == true && operator == false) {
					temp = temp + "8";
					numberArea.setText(temp);
				} else if (num2 == false && operator == true) {
					temp2 = "8";
					numberArea.setText(temp2);
					num2 = true;
				} else if (num2 == true && operator == true) {
					temp2 = temp2 + "8";
					numberArea.setText(temp2);
				}
			}
		});
		panel_2.add(eight);

		// Number 9
		JButton nine = new JButton("9");
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num1 == false && operator == false) {
					num1 = true;
					temp = "9";
					numberArea.setText("9");
				} else if (num1 == true && operator == false) {
					temp = temp + "9";
					numberArea.setText(temp);
				} else if (num2 == false && operator == true) {
					temp2 = "9";
					numberArea.setText(temp2);
					num2 = true;
				} else if (num2 == true && operator == true) {
					temp2 = temp2 + "9";
					numberArea.setText(temp2);
				}
			}
		});
		panel_2.add(nine);

		// DIVISION SIGN
		JButton division = new JButton("�");
		division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operator == false) {
					operator = true;
					num1 = true;
					op = "�";
					topNumberArea.setText(temp + " " + op);
					if (resulted == true) {
						numberArea.setText(temp);
					} else {
						numberArea.setText(temp2);
					}
					equalbutton = false;

				}

			}
		});
		panel_2.add(division);

		// Number 4
		JButton four = new JButton("4");
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num1 == false && operator == false) {
					num1 = true;
					temp = "4";
					numberArea.setText("4");
				} else if (num1 == true && operator == false) {
					temp = temp + "4";
					numberArea.setText(temp);
				} else if (num2 == false && operator == true) {
					temp2 = "4";
					numberArea.setText(temp2);
					num2 = true;
				} else if (num2 == true && operator == true) {
					temp2 = temp2 + "4";
					numberArea.setText(temp2);
				}
			}
		});
		panel_2.add(four);

		// Number 5
		JButton five = new JButton("5");
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num1 == false && operator == false) {
					num1 = true;
					temp = "5";
					numberArea.setText("5");
				} else if (num1 == true && operator == false) {
					temp = temp + "5";
					numberArea.setText(temp);
				} else if (num2 == false && operator == true) {
					temp2 = "5";
					numberArea.setText(temp2);
					num2 = true;
				} else if (num2 == true && operator == true) {
					temp2 = temp2 + "5";
					numberArea.setText(temp2);
				}
			}
		});
		panel_2.add(five);

		// Number 6
		JButton six = new JButton("6");
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num1 == false && operator == false) {
					num1 = true;
					temp = "6";
					numberArea.setText("6");
				} else if (num1 == true && operator == false) {
					temp = temp + "6";
					numberArea.setText(temp);
				} else if (num2 == false && operator == true) {
					temp2 = "6";
					numberArea.setText(temp2);
					num2 = true;
				} else if (num2 == true && operator == true) {
					temp2 = temp2 + "6";
					numberArea.setText(temp2);
				}
			}
		});
		panel_2.add(six);

		// MULTIPLY SIGN
		JButton multiply = new JButton("x");
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operator == false) {
					operator = true;
					num1 = true;
					op = "x";
					topNumberArea.setText(temp + " " + op);
					if (resulted == true) {
						numberArea.setText(temp);
					} else {
						numberArea.setText(temp2);
					}
					equalbutton = false;

				}

			}
		});

		panel_2.add(multiply);

		// Number 1
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

		// Number 2
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

		// Number 3
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

		// SUBTRACT SIGN
		JButton subtract = new JButton("-");
		subtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operator == false) {
					operator = true;
					num1 = true;
					op = "-";
					topNumberArea.setText(temp + " " + op);
					if (resulted == true) {
						numberArea.setText(temp);
					} else {
						numberArea.setText(temp2);
					}
					equalbutton = false;

				}

			}
		});

		panel_2.add(subtract);

		// DECIMAL SIGN
		JButton decimal = new JButton(".");
		decimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (decimal1 == false && num1 == true && operator == false && num2 == false) {
					decimal1 = true;
					temp = temp + ".";
					numberArea.setText(temp);
					// if they only press . at start
				} else if (decimal1 == false && num1 == false && operator == false && num2 == false) {
					decimal1 = true;
					num1 = true;
					temp = temp + ".";
					numberArea.setText(temp);
				} else if (decimal2 == false && decimal1 == true && num1 == true && num2 == true && operator == true
						&& equalbutton == false) {
					decimal2 = true;
					temp2 = temp2 + ".";
					numberArea.setText(temp2);
				} else if (decimal2 == false && num2 == false && operator == true && num1 == true
						&& equalbutton == false) {
					decimal2 = true;
					num2 = true;
					temp2 = temp2 + ".";
					numberArea.setText(temp2);
				} else if (decimal1 == false && num1 == true && operator == true && num2 == true
						&& equalbutton == false) {
					decimal2 = true;
					num2 = true;
					temp2 = temp2 + ".";
					numberArea.setText(temp2);
				}

			}
		});

		panel_2.add(decimal);

		// Number 0
		JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num1 == false && operator == false) {
					num1 = true;
					temp = "0";
					numberArea.setText("0");
				} else if (num1 == true && operator == false) {
					temp = temp + "0";
					numberArea.setText(temp);
				} else if (num2 == false && operator == true) {
					temp2 = "0";
					numberArea.setText(temp2);
					num2 = true;
				} else if (num2 == true && operator == true) {
					temp2 = temp2 + "0";
					numberArea.setText(temp2);
				}
			}
		});
		panel_2.add(zero);

		// EQUAL SIGN
		JButton equal = new JButton("=");
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (equalbutton == false && num1 == true && num2 == true && operator == true) {
					equalbutton = true;
					num2 = false;
					topNumberArea.setText(temp + " " + op + " " + temp2 + " = ");

					if (op == "+") {
						result = Functions.addition(Double.parseDouble(temp), Double.parseDouble(temp2));
					} else if (op == "-") {
						result = Functions.subtract(Double.parseDouble(temp), Double.parseDouble(temp2));
					} else if (op == "x") {
						result = Functions.multiplication(Double.parseDouble(temp), Double.parseDouble(temp2));
					} else if (op == "�") {
						result = Functions.division(Double.parseDouble(temp), Double.parseDouble(temp2));
					}
					numberArea.setText(Double.toString(result));
					temp = Double.toString(result);
					operator = false;
					op = " ";
					resulted = true;
					// decimal1 = false; ?? not sure if include
					decimal2 = false;
					temp2 = "0";
				}

			}
		});
		panel_2.add(equal);

		// ADDITION SIGN
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operator == false) {
					operator = true;
					num1 = true;
					op = "+";
					topNumberArea.setText(temp + " " + op);
					if (resulted == true) {
						numberArea.setText(temp);
					} else {
						numberArea.setText(temp2);
					}
					equalbutton = false;

				}

			}
		});
		panel_2.add(plus);

		frmCalculator.setVisible(true);

	}
}