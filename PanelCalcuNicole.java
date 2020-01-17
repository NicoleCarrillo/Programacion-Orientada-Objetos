import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class PanelCalcuNicole extends JFrame implements ActionListener{
	private JButton bSuma;
	private JButton	bResta;
	private JButton	bMulti;
	private JButton	bDiv;
	private JButton	bIgual;
	private JButton	bBorrar;
	private JButton	bPunto;
	private JButton	b0;
	private JButton	b1;
	private JButton	b2;
	private JButton	b3;
	private JButton	b4;
	private JButton	b5;
	private JButton	b6;
	private JButton	b7;
	private JButton	b8;
	private JButton	b9;
	
	private JTextField textField;

	private JPanel panelBotones,panelOperadores,panelEspecial, panelPrincipal;
	
	public PanelCalcuNicole(String titulo) {
		
		super(titulo);
		setSize(800, 800);
		setLocation(100, 100);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		bSuma=new JButton("+");
		bResta=new JButton("-");
		bMulti=new JButton("*");
		bDiv=new JButton("/");
		bIgual=new JButton("=");
		bBorrar=new JButton("Borrar");
		bPunto=new JButton(".");
		b0=new JButton("0");
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");		
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");		
		b9=new JButton("9");		
		textField=new JTextField();


		panelPrincipal.setLayout(new GridLayout(1,2));
		panelBotones.setLayout(new GridLayout(3,3));
		panelOperadores.setLayout(new GridLayout(2,2));
		panelEspecial.setLayout(new GridLayout(1,4));

		panelBotones.add(b1);
		panelBotones.add(b2);
		panelBotones.add(b3);
		panelBotones.add(b4);
		panelBotones.add(b5);
		panelBotones.add(b6);
		panelBotones.add(b7);
		panelBotones.add(b8);
		panelBotones.add(b9);

		panelOperadores.add(bSuma);
		panelOperadores.add(bResta);
		panelOperadores.add(bMulti);
		panelOperadores.add(bDiv);

		panelEspecial.add(b0);
		panelEspecial.add(bPunto);
		panelEspecial.add(bBorrar);
		panelEspecial.add(bIgual);

		panelPrincipal.add(panelBotones);
		panelPrincipal.add(panelOperadores);

		add(textField, BorderLayout.NORTH);
		add(panelPrincipal, BorderLayout.CENTER);
		add(panelEspecial, BorderLayout.SOUTH);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		bDiv.addActionListener(this);
		bMulti.addActionListener(this);
		bSuma.addActionListener(this);
		bResta.addActionListener(this);
		bIgual.addActionListener(this);
		bBorrar.addActionListener(this);
		bPunto.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			if(textField.getText()=="") {
				textField.setText("1");
			}
			else {
				textField.setText(textField.getText()+"1");
			}
		}
		if(e.getSource()==b2) {
			if(textField.getText()=="") {
				textField.setText("2");
			}
			else {
				textField.setText(textField.getText()+"2");
			}
		}
		if(e.getSource()==b3) {
			if(textField.getText()=="") {
				textField.setText("3");
			}
			else {
				textField.setText(textField.getText()+"3");
			}
		}
		if(e.getSource()==b4) {
			if(textField.getText()=="") {
				textField.setText("4");
			}
			else {
				textField.setText(textField.getText()+"4");
			}
		}
		if(e.getSource()==b5) {
			if(textField.getText()=="") {
				textField.setText("5");
			}
			else {
				textField.setText(textField.getText()+"5");
			}
		}
		if(e.getSource()==b6) {
			if(textField.getText()=="") {
				textField.setText("6");
			}
			else {
				textField.setText(textField.getText()+"6");
			}
		}
		if(e.getSource()==b7) {
			if(textField.getText()=="") {
				textField.setText("7");
			}
			else {
				textField.setText(textField.getText()+"7");
			}
		}
		if(e.getSource()==b8) {
			if(textField.getText()=="") {
				textField.setText("8");
			}
			else {
				textField.setText(textField.getText()+"8");
			}
		}
		if(e.getSource()==b9) {
			if(textField.getText()=="") {
				textField.setText("9");
			}
			else {
				textField.setText(textField.getText()+"9");
			}
		}
		if(e.getSource()==b0) {
			if(textField.getText()=="") {
				textField.setText("0");
			}
			else {
				textField.setText(textField.getText()+"0");
			}
		}
		if(e.getSource()==bSuma) {
			if(textField.getText()=="") {
				textField.setText("+");
			}
			else {
				textField.setText(textField.getText()+"+");
			}
		}
		if(e.getSource()==bResta) {
			if(textField.getText()=="") {
				textField.setText("-");
			}
			else {
				textField.setText(textField.getText()+"-");
			}
		}
		if(e.getSource()==bMulti) {
			if(textField.getText()=="") {
				textField.setText("*");
			}
			else {
				textField.setText(textField.getText()+"*");
			}
		}
		if(e.getSource()==bDiv) {
			if(textField.getText()=="") {
				textField.setText("/");
			}
			else {
				textField.setText(textField.getText()+"/");
			}
		}
		if(e.getSource()==bPunto) {
			if(textField.getText()=="") {
				textField.setText(".");
			}
			else {
				textField.setText(textField.getText()+".");
			}
		}

		if(e.getSource()==bBorrar) {
			textField.setText("");
		}
/*
		if(e.getSource()==bIgual) {
			String cad=textField.getText();
			for(int i=0;i<cad.length();i++) {
				char sim=cad.charAt(i);
				if(sim=='+') {
					String parte1=cad.substring(0,i);
					String parte2=cad.substring(i+1,cad.length());
					double resul=Double.parseDouble(parte1)+ Double.parseDouble(parte2);
					textField.setText(Double.toString(resul));
				}
				if(sim=='-') {
					String parte1=cad.substring(0,i);
					String parte2=cad.substring(i+1,cad.length());
					double resul=Double.parseDouble(parte1)- Double.parseDouble(parte2);
					textField.setText(Double.toString(resul));
				}
				if(sim=='*') {
					String parte1=cad.substring(0,i);
					String parte2=cad.substring(i+1,cad.length());
					double resul=Double.parseDouble(parte1)* Double.parseDouble(parte2);
					textField.setText(Double.toString(resul));
				}
				if(sim=='/') {
					String parte1=cad.substring(0,i);
					String parte2=cad.substring(i+1,cad.length());
					
					double cerapio=Double.parseDouble(parte2);
					if(cerapio==0) {
						JOptionPane.showMessageDialog(null,"HELP!!!");
					}
					else {
						double resultado=Double.parseDouble(parte1)/ Double.parseDouble(parte2);
						//textField.setText(Double.toString(resul));
					}
					
				}
			}
		}*/
	}
}
	
	