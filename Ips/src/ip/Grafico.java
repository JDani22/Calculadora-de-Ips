package ip;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Grafico extends JFrame {
	public JPanel panel;
	public JTextField PrimerOcteto;
	public JTextField SegundoOcteto;
	public JTextField TercerOcteto;
	public JTextField CuartoOcteto;
	public JTextField MaskPrimerOcteto;
	public JTextField MaskSegundoOcteto;
	public JTextField MaskTercerOcteto;
	public JTextField MaskCuartoOcteto;
	public JTextField PublioPrivText;
	public JTextField TextFPublioPriv;	
	public JTextField txtAPIPA;
	public JTextField txtClasesIp;
	public JTextField txtIpReservadas;
	public JTextField txtIpMulBroUni;
	public JTextField txtIpRed;
	public JTextField txtHosts;
	public JTextField labelIpRed1;
	public JTextField txt2Hosts;
	public JTextField txtRango;
	public JLabel labelIpRed2;
	public JLabel labelIpRed3;
	public JLabel labelIpRed4;
	public JTextField labelBroadcast1;
	public JLabel labelBroadcast2;
	public JLabel labelBroadcast3;
	public JLabel labelBroadcast4;
	public JTextField txtGateway1;
	public JLabel txtGateway2;
	public JLabel txtGateway3;
	public JLabel txtGateway4;
	public JTextField IngresarIpv6;
	public JTextField MaskIpv6;
	public int Entero1;
	public int Entero2;
	public int Entero3;
	public int Entero4;
	public int MaskEntero1;
	public int MaskEntero2;
	public int MaskEntero3;
	public int MaskEntero4;
	public String Masktext1;
	public String Masktext2;
	public String Masktext3;
	public String Masktext4;
	public String text1;
	public String text2;
	public String text3;
	public String text4;
	public String TextoFPublioPriv;
	public int Hosts;
	public int S;
	//
	public String H;
	public String txtIpv6;
	public String TtxtIpv6;
	public String[] SeparacionIpv6;
	public String Part1Ipv6;
	public String Part2Ipv6;
	public String Part3Ipv6;
	public String Part4Ipv6;
	public String Part5Ipv6;
	public String Part6Ipv6;
	public String Part7Ipv6;
	public String Part8Ipv6;
	public StringBuilder Ipv6Dios;
	public JTextField Prueba;
 
	public Grafico() {
		this.setTitle("Ips");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		IniciarInterfaz();
		this.setLocationRelativeTo(null);

	}
	public void IniciarInterfaz() {
		ColocarPanel();
		PrimerOcteto();
		SegundoOcteto();
		TercerOcteto();
		CuartoOcteto();
		PublioPriv();
		TextFPublioPriv();
		txtAPIPA();
		BotonAPIPA();
		txtClasesIp();
		BotonClasesIp();
		txtIpReservadas();
		BotonIpReservadas();
		MaskPrimerOcteto();
		MaskSegundoOcteto();
		MaskTercerOcteto();
		MaskCuartoOcteto();
		txtIpMulBroUni();
		BotonIpMulBroUni();
		txtIpRed();
		BotonIpRed();
		txtBroadcast();
		BotonBroadcast();
		txtGateway();
		BotonGateway();
		txtHosts();
		BotonHosts();
		txtRango();
		BotonRango();
		IngresarIpv6();
		BotonIpv6();
		MaskIpv6();
		Nota();
	}
	public void ColocarPanel()  {
	panel = new JPanel();
	panel.setLayout(null);
	this.getContentPane().add(panel);
	JLabel Titulo = new JLabel();
	Titulo.setText("Ips");
	Titulo.setBounds(600,10,100,30);
	Titulo.setForeground(Color.RED);
	Titulo.setFont(new Font("arial",1,20));
	panel.add(Titulo);
	}
	public void PrimerOcteto() {
		PrimerOcteto = new JTextField("0");
		PrimerOcteto.setBounds(200,100, 100, 40);
		panel.add(PrimerOcteto);
		JLabel TextoDeIngresarIp = new JLabel();
		TextoDeIngresarIp.setBounds(40, 100, 200, 40);
		TextoDeIngresarIp.setText("Ingrese el Primer Octeto");
		panel.add(TextoDeIngresarIp);
		 //text1 = PrimerOcteto.getText();
		 //Entero1 = Integer.parseInt(PrimerOcteto.getText());
		
		
	}
	public void SegundoOcteto() {
		SegundoOcteto = new JTextField("0");
		SegundoOcteto.setBounds(200,150, 100, 40);
		panel.add(SegundoOcteto);
		JLabel TextoDeIngresarIp2 = new JLabel();
		TextoDeIngresarIp2.setBounds(40, 150, 200, 40);
		TextoDeIngresarIp2.setText("Ingrese el Segundo Octeto");
		panel.add(TextoDeIngresarIp2);
		 //text2 = SegundoOcteto.getText();
		 //Entero2 = Integer.parseInt(SegundoOcteto.getText());
		
		
	}
	public void TercerOcteto() {
		TercerOcteto = new JTextField("0");
		TercerOcteto.setBounds(200,200, 100, 40);
		panel.add(TercerOcteto);
		JLabel TextoDeIngresarIp3 = new JLabel();
		TextoDeIngresarIp3.setBounds(40, 200, 200, 40);
		TextoDeIngresarIp3.setText("Ingrese el Tercer Octeto");
		panel.add(TextoDeIngresarIp3);
		 //text3 = SegundoOcteto.getText(); 
		 //Entero3 = Integer.parseInt(TercerOcteto.getText());
		
	}
	public void CuartoOcteto() {
		CuartoOcteto = new JTextField("0");
		CuartoOcteto.setBounds(200,250, 100, 40);
		panel.add(CuartoOcteto);
		JLabel TextoDeIngresarIp4 = new JLabel();
		TextoDeIngresarIp4.setBounds(40, 250, 200, 40);
		TextoDeIngresarIp4.setText("Ingrese el Cuarto Octeto");
		panel.add(TextoDeIngresarIp4);
		 //text4 = CuartoOcteto.getText();
		 //Entero4 = Integer.parseInt(text4);
	
		
	}
	public void MaskPrimerOcteto() {
		MaskPrimerOcteto = new JTextField("0");
		MaskPrimerOcteto.setBounds(200, 350, 100, 40);
		panel.add(MaskPrimerOcteto);
		JLabel Mascara = new JLabel();
		Mascara.setBounds(200, 300,100, 40);
		Mascara.setText("Mascara");
		panel.add(Mascara);
		JLabel txtMask1 = new JLabel();
		txtMask1.setBounds(40,350,200 ,40);
		txtMask1.setText("Ingrese el Primer Octeto");
		panel.add(txtMask1);
		//Masktext1= MaskPrimerOcteto.getText();
		//MaskEntero1 = Integer.parseInt(Masktext1);
		
	}
	public void MaskSegundoOcteto() {
		MaskSegundoOcteto = new JTextField("0");
		MaskSegundoOcteto.setBounds(200, 400, 100, 40);
		panel.add(MaskSegundoOcteto);
		JLabel txtMask2 = new JLabel();
		txtMask2.setBounds(40, 400, 200, 40);
		txtMask2.setText("Ingrese el Segundo Octeto");
		panel.add(txtMask2);
		//Masktext2= MaskSegundoOcteto.getText();
		//MaskEntero2 = Integer.parseInt(Masktext2);
	}
	public void MaskTercerOcteto() {
		MaskTercerOcteto = new JTextField("0");
		MaskTercerOcteto.setBounds(200,450,100,40);
		panel.add(MaskTercerOcteto);
		JLabel txtMask3 = new JLabel();
		txtMask3.setBounds(40, 450, 200, 40);
		txtMask3.setText("Ingrese el Tercer Octeto");
		panel.add(txtMask3);
		//Masktext3= MaskTercerOcteto.getText();
		//MaskEntero3 = Integer.parseInt(Masktext3);
	}
	public void MaskCuartoOcteto() {
		MaskCuartoOcteto = new JTextField("0");
		MaskCuartoOcteto.setBounds(200,500,100,40);
		panel.add(MaskCuartoOcteto);
		JLabel txtMask4 = new JLabel();
		txtMask4.setBounds(40, 500, 200, 40);
		txtMask4.setText("Ingrese el Cuarto Octeto");
		panel.add(txtMask4);
		//Masktext4= MaskCuartoOcteto.getText();
		//MaskEntero4 = Integer.parseInt(Masktext4);
	}
	public void TextFPublioPriv() {
		TextFPublioPriv = new JTextField();
		TextFPublioPriv.setBounds(350,100, 100, 40);
		panel.add(TextFPublioPriv);
		 JLabel PoPriv = new JLabel();
		 PoPriv.setBounds(350,60, 100, 40);
		 PoPriv.setText("Publica o Privada");
		 panel.add(PoPriv);
		 TextFPublioPriv.setEnabled(false);
		
	}	
		
	
	
	
	
	public void PublioPriv() {
		JButton PublioPriv = new JButton();
		PublioPriv.setBounds(350, 150, 100, 40);
		PublioPriv.setText("Enter");
		panel.add(PublioPriv);
		JLabel PublioPrivText = new JLabel();
		PublioPrivText.setBounds(600, 500, 200, 100);
		panel.add(PublioPrivText);
		
		ActionListener BotonBuscarPublioPriv = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1 = PrimerOcteto.getText();
				 Entero1 = Integer.parseInt(PrimerOcteto.getText());
				 text2 = SegundoOcteto.getText();
				 Entero2 = Integer.parseInt(SegundoOcteto.getText());
				if(Entero1 == 10) {
					
					TextFPublioPriv.setText("Privado");
					
				}else {
					if((Entero1==172)&&(Entero2<=31)&&(Entero2>=16)) {
						TextFPublioPriv.setText("Privado");
					
					}else {
						if((Entero1==192)&&(Entero2==168)) {
							TextFPublioPriv.setText("Privado");
						}else {
							TextFPublioPriv.setText("Publico");
						}
					}
				}
			}
			
		};
		PublioPriv.addActionListener(BotonBuscarPublioPriv);
	}	
	public void txtAPIPA() {
		txtAPIPA = new JTextField();
		txtAPIPA.setBounds(350,400, 100, 40);
		panel.add(txtAPIPA);
		txtAPIPA.setEnabled(false);
		JLabel APIPAlabel = new JLabel();
		APIPAlabel.setBounds(350, 350, 100, 40);
		APIPAlabel.setText("APIPA");
		panel.add(APIPAlabel);
	}
	public void BotonAPIPA() {
		JButton BotonAPIPA = new JButton();
		BotonAPIPA.setBounds(350,450, 100, 40);
		BotonAPIPA.setText("Enter");
		panel.add(BotonAPIPA);
		ActionListener BotonAccBotonAPIPA = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1 = PrimerOcteto.getText();
			    Entero1 = Integer.parseInt(PrimerOcteto.getText());
			    text2 = SegundoOcteto.getText();
				Entero2 = Integer.parseInt(SegundoOcteto.getText());
				text3 = SegundoOcteto.getText(); 
				Entero3 = Integer.parseInt(TercerOcteto.getText());
				text4 = CuartoOcteto.getText();
				Entero4 = Integer.parseInt(text4);
				if((Entero1==169)&&(Entero2==254)&&(Entero3>=0)&&(Entero3<=255)&&(Entero4>=1)&&(Entero4<=254)) {
					txtAPIPA.setText("Es APIPA");
				}else {
					txtAPIPA.setText("No es APIPA");
				}
				
				
				
			}
			
		};
		BotonAPIPA.addActionListener(BotonAccBotonAPIPA);
	}
	public void txtClasesIp() {
		txtClasesIp = new JTextField();
		txtClasesIp.setBounds(350, 250, 100, 40);
		txtClasesIp.setEnabled(false);
		panel.add(txtClasesIp);
		JLabel labelClasesIp = new JLabel();
		labelClasesIp.setBounds(350, 200, 100, 40);
		labelClasesIp.setText("Clase de Ip");
		
		panel.add(labelClasesIp);
		
	}
	public void BotonClasesIp() {
		JButton BotonClasesIp = new JButton();
		BotonClasesIp.setBounds(350, 300, 100, 40);
		BotonClasesIp.setText("Enter");
		panel.add(BotonClasesIp);
		ActionListener BotonAccBotonClasesIp = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1 = PrimerOcteto.getText();
			    Entero1 = Integer.parseInt(PrimerOcteto.getText());
			    text2 = SegundoOcteto.getText();
				Entero2 = Integer.parseInt(SegundoOcteto.getText());
				text3 = SegundoOcteto.getText(); 
				Entero3 = Integer.parseInt(TercerOcteto.getText());
				text4 = CuartoOcteto.getText();
				Entero4 = Integer.parseInt(text4);
				if((Entero1>=0)&&(Entero1<=127)&&(Entero2>=0)&&(Entero2<=255)&&(Entero3>=0)&&(Entero3<=255)&&(Entero4>=0)&&(Entero4<=255)) {
					txtClasesIp.setText("Clase A");
				}else {
					if((Entero1>=128)&&(Entero1<=191)&&(Entero2>=0)&&(Entero2<=255)&&(Entero3>=0)&&(Entero3<=255)&&(Entero4>=0)&&(Entero4<=255)) {
						txtClasesIp.setText("Clase B");
					}else {
						if((Entero1>=192)&&(Entero1<=223)&&(Entero2>=0)&&(Entero2<=255)&&(Entero3>=0)&&(Entero3<=255)&&(Entero4>=0)&&(Entero4<=255)) {
							txtClasesIp.setText("Clase C");
						}else {
							if((Entero1>=224)&&(Entero1<=239)&&(Entero2>=0)&&(Entero2<=255)&&(Entero3>=0)&&(Entero3<=255)&&(Entero4>=0)&&(Entero4<=255)) {
								txtClasesIp.setText("Clase D");
							}else {
								if((Entero1>=240)&&(Entero1<=255)&&(Entero2>=0)&&(Entero2<=255)&&(Entero3>=0)&&(Entero3<=255)&&(Entero4>=0)&&(Entero4<=255)) {
									txtClasesIp.setText("Clase F");
								}else {
									txtClasesIp.setText("Ip mal puesta");
								}
							}
						}
					}
				}
					
			}
			
		};
		BotonClasesIp.addActionListener(BotonAccBotonClasesIp);
	}
	public void txtIpReservadas() {
		txtIpReservadas = new JTextField();
		txtIpReservadas.setBounds(350, 550, 220, 40);
		txtIpReservadas.setEnabled(false);
		panel.add(txtIpReservadas);
		JLabel labelIpReservadas = new JLabel();
		labelIpReservadas.setBounds(350, 500, 100, 40);
		labelIpReservadas.setText("Ips Reservadas");
		panel.add(labelIpReservadas);
				
	}
	public void BotonIpReservadas() {
		JButton BotonIpReservadas = new JButton();
		BotonIpReservadas.setBounds(350, 600, 100, 40);
		BotonIpReservadas.setText("Enter");
		panel.add(BotonIpReservadas);
		
		ActionListener BotonAccIpReservadas = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1 = PrimerOcteto.getText();
			    Entero1 = Integer.parseInt(PrimerOcteto.getText());
			    text2 = SegundoOcteto.getText();
				Entero2 = Integer.parseInt(SegundoOcteto.getText());
				text3 = SegundoOcteto.getText(); 
				Entero3 = Integer.parseInt(TercerOcteto.getText());
				text4 = CuartoOcteto.getText();
				Entero4 = Integer.parseInt(text4);
				if((Entero1==10)&&(Entero2>=0)&&(Entero2<=255)&&(Entero3>=0)&&(Entero3<=255)&&(Entero4>=0)&&(Entero4<=255)) {
					txtIpReservadas.setText("Reservada: Red Privada");
				}else {
					if((Entero1==100)&&(Entero2>=64)&&(Entero2<=127)&&(Entero3>=0)&&(Entero3<=255)&&(Entero4>=0)&&(Entero4<=255)) {
						txtIpReservadas.setText("Reservada: Red Privada");
					}else {
						if((Entero1==172)&&(Entero2>=16)&&(Entero2<=31)&&(Entero3>=0)&&(Entero3<=255)&&(Entero4>=0)&&(Entero4<=255)) {
							txtIpReservadas.setText("Reservada: Red Privada");
						}else {
							if((Entero1==192)&&(Entero2==0)&&(Entero3==0)&&(Entero4>=0)&&(Entero4<=255)) {
								txtIpReservadas.setText("Reservada: Red Privada");
							}else {
								if((Entero1==192)&&(Entero2==168)&&(Entero3>=0)&&(Entero3<=255)&&(Entero4>=0)&&(Entero4<=255)) {
									txtIpReservadas.setText("Reservada: Red Privada");
								}else {
									if((Entero1==198)&&(Entero2>=18)&&(Entero2<=19)&&(Entero3>=0)&&(Entero3<=255)&&(Entero4>=0)&&(Entero4<=255)) {
										txtIpReservadas.setText("Reservada: Red Privada");
									}else {
										if((Entero1==0)&&(Entero2>=0)&&(Entero2<=255)&&(Entero3>=0)&&(Entero3<=255)&&(Entero4>=0)&&(Entero4<=255)) {
											txtIpReservadas.setText("Reservada: Software ");
										}else {
											if((Entero1==127)&&(Entero2>=0)&&(Entero2<=255)&&(Entero3>=0)&&(Entero3<=255)&&(Entero4>=0)&&(Entero4<=255)) {
												txtIpReservadas.setText("Reservada: Host ");
											}else {
												if((Entero1==169)&&(Entero2==254)&&(Entero3>=0)&&(Entero3<=255)&&(Entero4>=0)&&(Entero4<=255)) {
													txtIpReservadas.setText("Reservada: Subnet ");
												}else {
													if((Entero1==192)&&(Entero2==0)&&(Entero3==2)&&(Entero4>=0)&&(Entero4<=255)) {
														txtIpReservadas.setText("Reservada: Documentacion ");
													}else {
														if((Entero1==203)&&(Entero2==0)&&(Entero3==113)&&(Entero4>=0)&&(Entero4<=255)) {
															txtIpReservadas.setText("Reservada: Documentacion ");
														}else {
															if((Entero1==198)&&(Entero2==51)&&(Entero3==100)&&(Entero4>=0)&&(Entero4<=255)) {
																txtIpReservadas.setText("Reservada: Documentacion ");
															}else{
																if((Entero1==192)&&(Entero2==88)&&(Entero3==99)&&(Entero4>=0)&&(Entero4<=255)) {
																	txtIpReservadas.setText("Reservada: Internet ");
																}else {
																	if((Entero1>=224)&&(Entero1<=239)&&(Entero2>=0)&&(Entero2<=255)&&(Entero3>=0)&&(Entero3<=255)&&(Entero4>=0)&&(Entero4<=255)) {
																		txtIpReservadas.setText("Reservada: Internet ");
																	}else {
																		if((Entero1>=240)&&(Entero1<=255)&&(Entero2>=0)&&(Entero2<=255)&&(Entero3>=0)&&(Entero3<=255)&&(Entero4>=0)&&(Entero4<=254)) {
																			txtIpReservadas.setText("Reservada: Internet ");
																		}else {
																			if((Entero1==55)&&(Entero2==255)&&(Entero3==255)&&(Entero4==255)) {
																				txtIpReservadas.setText("Reservada: Subnet Limited Broadcast ");
																			}else {
																				txtIpReservadas.setText("No es Ip reservada ");
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			
		};
		BotonIpReservadas.addActionListener(BotonAccIpReservadas);
		
	}
	public void txtIpMulBroUni() {
		txtIpMulBroUni = new JTextField();
		txtIpMulBroUni.setBounds(350, 700, 100, 40);
		txtIpMulBroUni.setEnabled(false);
		panel.add(txtIpMulBroUni);
		JLabel labelIpMulBroUni = new JLabel();
		labelIpMulBroUni.setBounds(350, 650, 200, 40);
		labelIpMulBroUni.setText("Broadcast, Unicast o Multicast");
		panel.add(labelIpMulBroUni);
	}
	public void BotonIpMulBroUni() {
		JButton BotonIpMulBroUni = new JButton();
		BotonIpMulBroUni.setBounds(350, 750, 100, 40);
		BotonIpMulBroUni.setText("Enter");
		panel.add(BotonIpMulBroUni);
		
		ActionListener BotonAccIpMulBroUni = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Masktext1= MaskPrimerOcteto.getText();
				MaskEntero1 = Integer.parseInt(Masktext1);
				Masktext2= MaskSegundoOcteto.getText();
				MaskEntero2 = Integer.parseInt(Masktext2);
				Masktext3= MaskTercerOcteto.getText();
				MaskEntero3 = Integer.parseInt(Masktext3);
				Masktext4= MaskCuartoOcteto.getText();
				MaskEntero4 = Integer.parseInt(Masktext4);
				text1 = PrimerOcteto.getText();
			    Entero1 = Integer.parseInt(PrimerOcteto.getText());
			    text2 = SegundoOcteto.getText();
				Entero2 = Integer.parseInt(SegundoOcteto.getText());
				text3 = SegundoOcteto.getText(); 
				Entero3 = Integer.parseInt(TercerOcteto.getText());
				text4 = CuartoOcteto.getText();
				Entero4 = Integer.parseInt(text4);
				Masktext1= MaskPrimerOcteto.getText();
				MaskEntero1 = Integer.parseInt(Masktext1);
				Masktext2= MaskSegundoOcteto.getText();
				MaskEntero2 = Integer.parseInt(Masktext2);
				Masktext3= MaskTercerOcteto.getText();
				MaskEntero3 = Integer.parseInt(Masktext3);
				Masktext4= MaskCuartoOcteto.getText();
				MaskEntero4 = Integer.parseInt(Masktext4);
				text1 = PrimerOcteto.getText();
			    Entero1 = Integer.parseInt(PrimerOcteto.getText());
			    text2 = SegundoOcteto.getText();
				Entero2 = Integer.parseInt(SegundoOcteto.getText());
				text3 = SegundoOcteto.getText(); 
				Entero3 = Integer.parseInt(TercerOcteto.getText());
				text4 = CuartoOcteto.getText();
				Entero4 = Integer.parseInt(text4);
				int n1 = ~MaskEntero1 & 0xff;
				int n2 = ~MaskEntero2 & 0xff;
				int n3 = ~MaskEntero3 & 0xff;
				int n4 = ~MaskEntero4 & 0xff;
				int BroPriOcteto = (n1 | Entero1);
				int BroSegOcteto = (n2 | Entero2);
				int BroTerOcteto = (n3 | Entero3) ;
				int BroCuaOcteto = (n4 | Entero4) ;
				if((Entero1>=224)&&(Entero1<=239)&&(Entero2>=0)&&(Entero2<=255)&&(Entero3>=0)&&(Entero3<=255)&&(Entero4>=0)&&(Entero4<=255)) {
					txtIpMulBroUni.setText("Multicast");
				}else {
					if((Entero1==169)&&(Entero2==254)&&(Entero3>0)&&(Entero3<=255)&&(Entero4>=1)&&(Entero4<=254)) {
						txtIpMulBroUni.setText("Unicast");
					}else {
						if((Entero1==BroPriOcteto)&&(Entero2==BroSegOcteto)&&(Entero3==BroTerOcteto)&&(Entero4==BroCuaOcteto)) {
							txtIpMulBroUni.setText("Broadcast");
						}else {
							txtIpMulBroUni.setText("Ninguna de las anteriores");
						}
					}
				}
				
			}
			
		};
		BotonIpMulBroUni.addActionListener(BotonAccIpMulBroUni);
	}
	public void txtIpRed() {
		
		JLabel labelIpRed =  new JLabel();
		labelIpRed.setBounds(620, 50, 100, 40);
		labelIpRed.setText("Red");
		panel.add(labelIpRed);
		 labelIpRed1 = new JTextField();		 
		labelIpRed1.setBounds(620, 100, 100, 40);
		labelIpRed1.setEnabled(false);
		panel.add(labelIpRed1);
		
		
	}
	public void BotonIpRed() {
		JButton BotonIpRed = new JButton();
		BotonIpRed.setBounds(620, 150, 100, 40);
		BotonIpRed.setText("Enter");
		panel.add(BotonIpRed);
		
		ActionListener BotonAccBotonIpRed = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Masktext1= MaskPrimerOcteto.getText();
				MaskEntero1 = Integer.parseInt(Masktext1);
				Masktext2= MaskSegundoOcteto.getText();
				MaskEntero2 = Integer.parseInt(Masktext2);
				Masktext3= MaskTercerOcteto.getText();
				MaskEntero3 = Integer.parseInt(Masktext3);
				Masktext4= MaskCuartoOcteto.getText();
				MaskEntero4 = Integer.parseInt(Masktext4);
				text1 = PrimerOcteto.getText();
			    Entero1 = Integer.parseInt(PrimerOcteto.getText());
			    text2 = SegundoOcteto.getText();
				Entero2 = Integer.parseInt(SegundoOcteto.getText());
				text3 = SegundoOcteto.getText(); 
				Entero3 = Integer.parseInt(TercerOcteto.getText());
				text4 = CuartoOcteto.getText();
				Entero4 = Integer.parseInt(text4);
			
				int IpPrimerOctetoNegado = (MaskEntero1 & Entero1);
				int IpSegundoOctetoNegado = (MaskEntero2 & Entero2);
				int IpTercerOctetoNegado = (MaskEntero3 & Entero3) ;
				int IpCuartoOctetoNegado = (MaskEntero4 & Entero4) ;
				String IpRed1 = IpPrimerOctetoNegado+"";
				String IpRed2 = IpSegundoOctetoNegado+"";
				String IpRed3 = IpTercerOctetoNegado+"";
				String IpRed4 = IpCuartoOctetoNegado+"";
				
				labelIpRed1.setText(""+IpRed1+"."+IpRed2+"."+IpRed3+"."+IpRed4);
			
				
				
				
				
				
				
			}
			
		};
		BotonIpRed.addActionListener(BotonAccBotonIpRed);
	}
	public void txtBroadcast() {
		JLabel labelIBroadcast =  new JLabel();
		labelIBroadcast.setBounds(620, 200, 100, 40);
		labelIBroadcast.setText("Broadcast");
		panel.add(labelIBroadcast);
		 labelBroadcast1 = new JTextField();
		 labelBroadcast1.setEnabled(false);
		 labelBroadcast1.setBounds(620, 250, 100, 40);
		 labelBroadcast1.setEnabled(false);
		panel.add(labelBroadcast1);
		
	}
	public void BotonBroadcast() {
		JButton BotonBroadcast = new JButton();
		BotonBroadcast.setBounds(620, 300, 100, 40);
		BotonBroadcast.setText("Enter");
		panel.add(BotonBroadcast);
		
		ActionListener BotonAccBotonBroadcast = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Masktext1= MaskPrimerOcteto.getText();
				MaskEntero1 = Integer.parseInt(Masktext1);
				Masktext2= MaskSegundoOcteto.getText();
				MaskEntero2 = Integer.parseInt(Masktext2);
				Masktext3= MaskTercerOcteto.getText();
				MaskEntero3 = Integer.parseInt(Masktext3);
				Masktext4= MaskCuartoOcteto.getText();
				MaskEntero4 = Integer.parseInt(Masktext4);
				text1 = PrimerOcteto.getText();
			    Entero1 = Integer.parseInt(PrimerOcteto.getText());
			    text2 = SegundoOcteto.getText();
				Entero2 = Integer.parseInt(SegundoOcteto.getText());
				text3 = SegundoOcteto.getText(); 
				Entero3 = Integer.parseInt(TercerOcteto.getText());
				text4 = CuartoOcteto.getText();
				Entero4 = Integer.parseInt(text4);
				int n1 = ~MaskEntero1 & 0xff;
				int n2 = ~MaskEntero2 & 0xff;
				int n3 = ~MaskEntero3 & 0xff;
				int n4 = ~MaskEntero4 & 0xff;
				int BroPriOcteto = (n1 | Entero1);
				int BroSegOcteto = (n2 | Entero2);
				int BroTerOcteto = (n3 | Entero3) ;
				int BroCuaOcteto = (n4 | Entero4) ;
				String IpRed1 = BroPriOcteto+"";
				String IpRed2 = BroSegOcteto+"";
				String IpRed3 = BroTerOcteto+"";
				String IpRed4 = BroCuaOcteto+"";
				
				labelBroadcast1.setText(""+IpRed1+"."+IpRed2+"."+IpRed3+"."+IpRed4);
			
				
				
				
				
				
				
				
			}
			
		};
		BotonBroadcast.addActionListener(BotonAccBotonBroadcast);
	}
	public void txtGateway() {
		JLabel txtGateway =  new JLabel();
		txtGateway.setBounds(620, 350, 100, 40);
		txtGateway.setText("Gateway");
		panel.add(txtGateway);
		txtGateway1 = new JTextField();
		txtGateway1.setEnabled(false);
		txtGateway1.setBounds(620, 400, 100, 40);
		panel.add(txtGateway1);
		
		
	}
	public void BotonGateway() {
		JButton BotonGateway = new JButton();
		BotonGateway.setBounds(620, 450, 100, 40);
		BotonGateway.setText("Enter");
		panel.add(BotonGateway);
		
		ActionListener BotonAccGateway = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Masktext1= MaskPrimerOcteto.getText();
				MaskEntero1 = Integer.parseInt(Masktext1);
				Masktext2= MaskSegundoOcteto.getText();
				MaskEntero2 = Integer.parseInt(Masktext2);
				Masktext3= MaskTercerOcteto.getText();
				MaskEntero3 = Integer.parseInt(Masktext3);
				Masktext4= MaskCuartoOcteto.getText();
				MaskEntero4 = Integer.parseInt(Masktext4);
				text1 = PrimerOcteto.getText();
			    Entero1 = Integer.parseInt(PrimerOcteto.getText());
			    text2 = SegundoOcteto.getText();
				Entero2 = Integer.parseInt(SegundoOcteto.getText());
				text3 = SegundoOcteto.getText(); 
				Entero3 = Integer.parseInt(TercerOcteto.getText());
				text4 = CuartoOcteto.getText();
				Entero4 = Integer.parseInt(text4);
			
				int n1 = (MaskEntero1 & Entero1);
				int n2= (MaskEntero2 & Entero2);
				int n3= (MaskEntero3 & Entero3) ;
				int n4= (MaskEntero4 & Entero4) ;
				int N4=n4+1;
				String IpRed1 = n1+"";
				String IpRed2 = n2+"";
				String IpRed3 = n3+"";
				String IpRed4 = N4+"";
				
				txtGateway1.setText(""+IpRed1+"."+IpRed2+"."+IpRed3+"."+IpRed4);
			
				
				
				
				
				
			}
			
		};
		BotonGateway.addActionListener(BotonAccGateway);
		
	}
	public void txtRango() {
		txtRango = new JTextField();
		txtRango.setBounds(620, 550, 200, 40);
		txtRango.setEnabled(false);
		panel.add(txtRango);
		txtRango.setEnabled(false);
		JLabel labelRango = new JLabel();
		labelRango.setBounds(620, 500, 100, 40);
		labelRango.setText("Rango");
		panel.add(labelRango);
	
	}
	public void BotonRango() {
		JButton BotonRango = new JButton();
		BotonRango.setBounds(620,600,100,40);
		BotonRango.setText("Enter");
		panel.add(BotonRango);
		ActionListener BotonAccRango = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Masktext1= MaskPrimerOcteto.getText();
				MaskEntero1 = Integer.parseInt(Masktext1);
				Masktext2= MaskSegundoOcteto.getText();
				MaskEntero2 = Integer.parseInt(Masktext2);
				Masktext3= MaskTercerOcteto.getText();
				MaskEntero3 = Integer.parseInt(Masktext3);
				Masktext4= MaskCuartoOcteto.getText();
				MaskEntero4 = Integer.parseInt(Masktext4);
				text1 = PrimerOcteto.getText();
			    Entero1 = Integer.parseInt(PrimerOcteto.getText());
			    text2 = SegundoOcteto.getText();
				Entero2 = Integer.parseInt(SegundoOcteto.getText());
				text3 = SegundoOcteto.getText(); 
				Entero3 = Integer.parseInt(TercerOcteto.getText());
				text4 = CuartoOcteto.getText();
				Entero4 = Integer.parseInt(text4);
			
				int n1 = (MaskEntero1 & Entero1);
				int n2= (MaskEntero2 & Entero2);
				int n3= (MaskEntero3 & Entero3) ;
				int n4= (MaskEntero4 & Entero4) ;
				int N4=n4+1;
				String IpGat1 = n1+"";  //gateway
				String IpGat2 = n2+"";
				String IpGat3 = n3+"";
				String IpGat4 = N4+"";
				
				
				
				int m1 = ~MaskEntero1 & 0xff;
				int m2 = ~MaskEntero2 & 0xff;
				int m3 = ~MaskEntero3 & 0xff;		//Broadcast
				int m4 = ~MaskEntero4 & 0xff;
				int BroPriOcteto = (m1 | Entero1);
				int BroSegOcteto = (m2 | Entero2);
				int BroTerOcteto = (m3 | Entero3) ;
				int BroCuaOcteto = (m4 | Entero4) ;
				int A= BroCuaOcteto-1;
				String Bro1 = BroPriOcteto+"";
				String Bro2 = BroSegOcteto+"";
				String Bro3 = BroTerOcteto+"";
				String Bro4 = A+"";
				
				txtRango.setText(IpGat1+"."+IpGat2+"."+IpGat3+"."+IpGat4+"  Hasta  "+BroPriOcteto+"."+BroSegOcteto+"."+BroTerOcteto+"."+A);
				
			}
			
		};
		BotonRango.addActionListener(BotonAccRango);
	}
	public void txtHosts() {
		txtHosts = new JTextField("0");
		txtHosts.setBounds(800, 100, 100, 40);
		panel.add(txtHosts);
		H= txtHosts.getText();
		Hosts = Integer.parseInt(H);
		JLabel labelHosts = new JLabel();
		labelHosts.setBounds(800,50,200,40);
		labelHosts.setText("Ingrese Numero de Hosts");
		panel.add(labelHosts);
		
	}
	public void BotonHosts() {
		JButton BotonHosts = new JButton();
		BotonHosts.setBounds(800, 250, 100, 40);
		BotonHosts.setText("Enter");
		panel.add(BotonHosts);
		txt2Hosts = new JTextField();
		txt2Hosts.setBounds(800, 200, 100, 40);
		txt2Hosts.setEnabled(false);
		panel.add(txt2Hosts);
		JLabel labelHosts= new JLabel();
		labelHosts.setBounds(800, 150, 150, 40);
		labelHosts.setText("La demanda de ip es:");
		panel.add(labelHosts);
		
		ActionListener BotonAccHosts = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				H= txtHosts.getText();
				Hosts = Integer.parseInt(H);
				int Z = (int)((-Math.log10(Hosts+2)/Math.log10(2))+32);
				if((Z>=24)&&(Z<30)) {
					txt2Hosts.setText("192.168.0.0/"+Z);
				}else {
					if((Z>=16)&&(Z<24)) {
						txt2Hosts.setText("172.16.0.0/"+Z);
					}else {
						if((Z>=8)&&(Z<16)) {
							txt2Hosts.setText("10.0.0.0/"+Z);
						}else {
							txt2Hosts.setText("Error");
						}
					}
				}
			}
			
		};
		BotonHosts.addActionListener(BotonAccHosts);
		
	}
	public void IngresarIpv6() {
		IngresarIpv6 =new JTextField("0:0:0:0:0:0:0:0");
		IngresarIpv6.setBounds(1100, 100, 300,40 );
		panel.add(IngresarIpv6);
		JLabel ipv6x = new JLabel();
		ipv6x.setBounds(1100, 50, 200, 40); 
		ipv6x.setText("Ingresa la Ipv6");
		panel.add(ipv6x);
		
		Prueba = new JTextField();
		Prueba.setEnabled(false);
		Prueba.setBounds(1100, 300, 300,40 );
		panel.add(Prueba);
		JLabel TipoIpv6 = new JLabel();
		TipoIpv6.setBounds(1100,250,100,40);
		TipoIpv6.setText("Tipo de Ipv6");
		panel.add(TipoIpv6);
		
	}
	public void BotonIpv6() {
		JButton BotonIpv6 = new JButton();
		BotonIpv6.setBounds(1100,350, 100, 40);
		BotonIpv6.setText("Enter");
		panel.add(BotonIpv6);
		
		ActionListener BotonAccIpv6 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			
			String string = IngresarIpv6.getText();								//me quierp matar esto no es un meme
			SeparacionIpv6 =string.split("[:]",string.length() );
			String Pdiablo = string;
			Pdiablo=Pdiablo.replace("::", ":");
			StringBuilder Dios= new StringBuilder(Pdiablo);
			int en = string.indexOf("::");
			if(en>0&&en<string.length()) {
			for(int i=0;i<8-(SeparacionIpv6.length-1);i++) {
			Dios.insert(en, ":0000");
			
			}
			Pdiablo =Dios.toString();
			}
		
			String DefIpv6[]= Pdiablo.split("[:]",8);
			Part1Ipv6 = DefIpv6[0];
			Part2Ipv6 = DefIpv6[1];
			Part3Ipv6 = DefIpv6[2];
			Part4Ipv6 = DefIpv6[3];
			Part5Ipv6 = DefIpv6[4];
			Part6Ipv6 = DefIpv6[5];
			Part7Ipv6 = DefIpv6[6];
			Part8Ipv6 = DefIpv6[7];
			
			
			//System.out.println(Part1Ipv6+":"+Part2Ipv6+":"+Part3Ipv6+":"+Part4Ipv6+":"+Part5Ipv6+":"+Part6Ipv6+":"+Part7Ipv6+":"+Part8Ipv6);
			String q1 =Part1Ipv6;
			
			int v1 = Integer.parseInt(q1,16);
			String q2 =Part2Ipv6;
			
			int v2 = Integer.parseInt(q2,16);
			String q3 =Part3Ipv6;
			
			int v3 = Integer.parseInt(q3,16);
			String q4 =Part4Ipv6;
			
			int v4 = Integer.parseInt(q4,16);
			String q5 =Part5Ipv6;
			
			int v5 = Integer.parseInt(q5,16);
			String q6 =Part6Ipv6;
			int v6 = Integer.parseInt(q6,16);
			String q7 =Part7Ipv6;
			
			int v7 = Integer.parseInt(q7,16);
			String q8 =Part8Ipv6;
			
			int v8 = Integer.parseInt(q8,16);
			
			String Mask =MaskIpv6.getText();
			int vmas= Integer.parseInt(Mask);
			if((v1>=65152)&&(v1<=65215)&&(v2>=0)&&(v2<=65535)&&(v3>=0)&&(v3<=65535)&&(v4>=0)&&(v4<=65535)&&(v5>=0)&&(v5<=65535)&&(v6>=0)&&(v6<=65535)&&(v7>=0)&&(v7<=65535)&&(v8>=0)&&(v8<=65535)) {
				Prueba.setText("Unicast: link local");
			}else {
				if((v1>=64512)&&(v1<=65023)&&(v2>=0)&&(v2<=65535)&&(v3>=0)&&(v3<=65535)&&(v4>=0)&&(v4<=65535)&&(v5>=0)&&(v5<=65535)&&(v6>=0)&&(v6<=65535)&&(v7>=0)&&(v7<=65535)&&(v8>=0)&&(v8<=65535)) {
					Prueba.setText("Unicast: unique local");
				}else{
					if((v1>=8192)&&(v1<=16383)&&(v2>=0)&&(v2<=65535)&&(v3>=0)&&(v3<=65535)&&(v4>=0)&&(v4<=65535)&&(v5>=0)&&(v5<=65535)&&(v6>=0)&&(v6<=65535)&&(v7>=0)&&(v7<=65535)&&(v8>=0)&&(v8<=65535)) {
						Prueba.setText("Global de unicast y anycast");
					}else {
						if((v1>=65280)&&(v1<=65295)&&(v2<=65535)&&(v3>=0)&&(v3<=65535)&&(v4>=0)&&(v4<=65535)&&(v5>=0)&&(v5<=65535)&&(v6>=0)&&(v6<=65535)&&(v7>=0)&&(v7<=65535)&&(v8>=0)&&(v8<=65535)) {
							Prueba.setText("Multicast: Well-Known");
						}else {
							if((v1>=65296)&&(v1<=65311)&&(v2<=65535)&&(v3>=0)&&(v3<=65535)&&(v4>=0)&&(v4<=65535)&&(v5>=0)&&(v5<=65535)&&(v6>=0)&&(v6<=65535)&&(v7>=0)&&(v7<=65535)&&(v8>=0)&&(v8<=65535)) {
								Prueba.setText("Multicast: Transient");
								
							}else {
								if((v1==65282)&&(v2==0)&&(v3==0)&&(v4==0)&&(v5==0)&&(v6==1)&&(v7>=65280)&&(v7<=65535)&&(v8>=0)&&(v8<=65535)) {
									Prueba.setText("Multicast: Solicited-Node");
								}else {
									if(vmas==128) {
										Prueba.setText("Unicast: Loopback");
									}else {
										Prueba.setText("No esta en ninguno de los tipos contemplados");
									}
								}
								
							}
						}
					}
				}
			}
			
			
			
			
				
				
			}
			
		};
		BotonIpv6.addActionListener(BotonAccIpv6);
	}
	public void MaskIpv6(){
		MaskIpv6 = new JTextField("0");
		MaskIpv6.setBounds(1100,200,100,40);
		panel.add(MaskIpv6);
		JLabel txtMaskIpv6 = new JLabel();
		txtMaskIpv6.setBounds(1100,150,200,40);
		txtMaskIpv6.setText("Ingrese la mascara de la Ipv6");
		panel.add(txtMaskIpv6);
	}
	public void Nota() {
		JLabel Nota = new JLabel();
		Nota.setBounds(1100,500,500,40);
		Nota.setText("Nota: cada vez que se ingrese una ip ya sea ipv4 o ipv6 o el host ,");
		panel.add(Nota);
		JLabel Nota1 = new JLabel();
		Nota1.setBounds(1100,520,400,40);
		Nota1.setText("Actualize cada boton de cada campo");
		panel.add(Nota1);
	}
}
