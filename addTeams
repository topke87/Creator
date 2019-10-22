import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Label;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addTeams extends JFrame {

	private JPanel contentPane;
	private JTextField txtTeam1;
	private JTextField txtTeam2;
	private JTextField txtTeam3;
	private JTextField txtTeam4;
	private JTextField txtTeam5;
	private JTextField txtTeam6;
	private JTextField txtTeam7;
	private JTextField txtTeam8;
	private JTextField txtTeam9;
	private JTextField txtTeam10;
	private JTextField txtTeam11;
	private List<JTextField> list= new ArrayList<>();
	private List<JTextField> list1= new ArrayList<>();
	private List<JTextField> list2= new ArrayList<>();
	private List<JTextField> list3= new ArrayList<>();
	private List<JTextField> list4= new ArrayList<>();
	private List<JTextField> list5= new ArrayList<>();
	private List<JTextField> list6= new ArrayList<>();
	
	public static String teamA1; public static String teamA2; public static String teamA3; public static String teamA4; public static String teamA5;
	public static String teamA6; public static String teamB1; public static String teamB2; public static String teamB3; public static String teamB4;
	public static String teamB5;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addTeams frame = new addTeams();
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
	public addTeams() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 813, 663);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTourPlace = new JLabel();
		lblTourPlace.setBounds(180, 46, 180, 25);
		lblTourPlace.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTourPlace.setText(Creator.tourPlace.getText());
		contentPane.add(lblTourPlace);
		
		JLabel lblTourName = new JLabel();
		lblTourName.setHorizontalAlignment(SwingConstants.CENTER);
		lblTourName.setBounds(253, 10, 180, 25);
		lblTourName.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblTourName.setText(Creator.tourName.getText());
		contentPane.add(lblTourName);
		
		JLabel lblTourDate = new JLabel();
		lblTourDate.setBounds(501, 46, 180, 25);
		lblTourDate.setFont(new Font("Times New Roman", Font.BOLD, 15));
		contentPane.add(lblTourDate);
		lblTourDate.setText(Creator.dateTour);
		
		JLabel lblNewLabel = new JLabel("Place of tournament:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 46, 180, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Date:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(443, 46, 48, 25);
		contentPane.add(lblNewLabel_1);
						
		JLabel lblTeam1 = new JLabel("Team 1");
		lblTeam1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblTeam1.setBounds(10, 100, 55, 25);
		lblTeam1.setVisible(false);
		if(Creator.numTeamsValue>=5) {
			lblTeam1.setVisible(true);
		}
		contentPane.add(lblTeam1);
		
		JLabel lblTeam2 = new JLabel("Team 2");
		lblTeam2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblTeam2.setBounds(10, 145, 55, 25);
		lblTeam2.setVisible(false);
		if(Creator.numTeamsValue>=5) {
			lblTeam2.setVisible(true);
		}
		contentPane.add(lblTeam2);
		
		JLabel lblTeam3 = new JLabel("Team 3");
		lblTeam3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblTeam3.setBounds(10, 190, 55, 25);
		lblTeam3.setVisible(false);
		if(Creator.numTeamsValue>=5) {
			lblTeam3.setVisible(true);
		}
		contentPane.add(lblTeam3);
		
		JLabel lblTeam4 = new JLabel("Team 4");
		lblTeam4.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblTeam4.setBounds(10, 235, 55, 25);
		lblTeam4.setVisible(false);
		if(Creator.numTeamsValue>=5) {
			lblTeam4.setVisible(true);
		}
		contentPane.add(lblTeam4);
		
		JLabel lblTeam5 = new JLabel("Team 5");
		lblTeam5.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblTeam5.setBounds(10, 280, 55, 25);
		lblTeam5.setVisible(false);
		if(Creator.numTeamsValue>=5) {
			lblTeam5.setVisible(true);
		}
		contentPane.add(lblTeam5);
		
		JLabel lblTeam6 = new JLabel("Team 6");
		lblTeam6.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblTeam6.setBounds(10, 325, 55, 25);
		lblTeam6.setVisible(false);
		if(Creator.numTeamsValue>=6) {
			lblTeam6.setVisible(true);
		}
		contentPane.add(lblTeam6);
		
		JLabel lblTeam7 = new JLabel("Team 7");
		lblTeam7.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblTeam7.setBounds(10, 370, 55, 25);
		lblTeam7.setVisible(false);
		if(Creator.numTeamsValue>=7) {
			lblTeam7.setVisible(true);
		}
		contentPane.add(lblTeam7);
		
		JLabel lblTeam8 = new JLabel("Team 8");
		lblTeam8.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblTeam8.setBounds(10, 415, 55, 25);
		lblTeam8.setVisible(false);
		if(Creator.numTeamsValue>=8) {
			lblTeam8.setVisible(true);
		}
		contentPane.add(lblTeam8);
		
		JLabel lblTeam9 = new JLabel("Team 9");
		lblTeam9.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblTeam9.setBounds(10, 460, 55, 25);
		lblTeam9.setVisible(false);
		if(Creator.numTeamsValue>=9) {
			lblTeam9.setVisible(true);
		}
		contentPane.add(lblTeam9);
		
		JLabel lblTeam10 = new JLabel("Team 10");
		lblTeam10.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblTeam10.setBounds(10, 505, 55, 25);
		lblTeam10.setVisible(false);
		if(Creator.numTeamsValue>=10) {
			lblTeam10.setVisible(true);
		}
		contentPane.add(lblTeam10);
		
		JLabel lblTeam11 = new JLabel("Team 11");
		lblTeam11.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblTeam11.setBounds(10, 550, 55, 25);
		lblTeam11.setVisible(false);
		if(Creator.numTeamsValue>=11) {
			lblTeam11.setVisible(true);
		}
		contentPane.add(lblTeam11);
		
		txtTeam1 = new JTextField();
		txtTeam1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtTeam1.setBounds(93, 100, 180, 25);
		contentPane.add(txtTeam1);
		txtTeam1.setVisible(false);
		if(Creator.numTeamsValue>=5) {
			txtTeam1.setVisible(true);
		}
		txtTeam1.setColumns(10);
		
		txtTeam2 = new JTextField();
		txtTeam2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtTeam2.setColumns(10);
		txtTeam2.setBounds(93, 145, 180, 25);
		txtTeam2.setVisible(false);
		if(Creator.numTeamsValue>=5) {
			txtTeam2.setVisible(true);
		}
		contentPane.add(txtTeam2);
		
		txtTeam3 = new JTextField();
		txtTeam3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtTeam3.setColumns(10);
		txtTeam3.setBounds(93, 190, 180, 25);
		txtTeam3.setVisible(false);
		if(Creator.numTeamsValue>=5) {
			txtTeam3.setVisible(true);
		}
		contentPane.add(txtTeam3);
		
		txtTeam4 = new JTextField();
		txtTeam4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtTeam4.setColumns(10);
		txtTeam4.setBounds(93, 235, 180, 25);
		txtTeam4.setVisible(false);
		if(Creator.numTeamsValue>=5) {
			txtTeam4.setVisible(true);
		}
		contentPane.add(txtTeam4);
		
		txtTeam5 = new JTextField();
		txtTeam5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtTeam5.setColumns(10);
		txtTeam5.setBounds(93, 280, 180, 25);
		txtTeam5.setVisible(false);
		if(Creator.numTeamsValue>=5) {
			txtTeam5.setVisible(true);
		}
		contentPane.add(txtTeam5);
		
		txtTeam6 = new JTextField();
		txtTeam6.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtTeam6.setColumns(10);
		txtTeam6.setBounds(93, 325, 180, 25);
		txtTeam6.setVisible(false);
		if(Creator.numTeamsValue>=6) {
			txtTeam6.setVisible(true);
		}
		contentPane.add(txtTeam6);
		
		txtTeam7 = new JTextField();
		txtTeam7.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtTeam7.setColumns(10);
		txtTeam7.setBounds(93, 370, 180, 25);
		txtTeam7.setVisible(false);
		if(Creator.numTeamsValue>=7) {
			txtTeam7.setVisible(true);
		}
		contentPane.add(txtTeam7);
		
		txtTeam8 = new JTextField();
		txtTeam8.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtTeam8.setColumns(10);
		txtTeam8.setBounds(93, 415, 180, 25);
		txtTeam8.setVisible(false);
		if(Creator.numTeamsValue>=8) {
			txtTeam8.setVisible(true);
		}
		contentPane.add(txtTeam8);
		
		txtTeam9 = new JTextField();
		txtTeam9.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtTeam9.setColumns(10);
		txtTeam9.setBounds(93, 460, 180, 25);
		txtTeam9.setVisible(false);
		if(Creator.numTeamsValue>=9) {
			txtTeam9.setVisible(true);
		}
		contentPane.add(txtTeam9);
		
		txtTeam10 = new JTextField();
		txtTeam10.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtTeam10.setColumns(10);
		txtTeam10.setBounds(93, 505, 180, 25);
		txtTeam10.setVisible(false);
		if(Creator.numTeamsValue>=10) {
			txtTeam10.setVisible(true);
		}
		contentPane.add(txtTeam10);
		
		txtTeam11 = new JTextField();
		txtTeam11.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtTeam11.setColumns(10);
		txtTeam11.setBounds(93, 550, 180, 25);
		txtTeam11.setVisible(false);
		if(Creator.numTeamsValue>=11) {
			txtTeam11.setVisible(true);
		}
		contentPane.add(txtTeam11);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Creator.numTeamsValue==6) {
					Groups g = new Groups();
					dispose();
					g.setVisible(true);
				}
				if(Creator.numTeamsValue==7) {
					Groups7 g = new Groups7();
					dispose();
					g.setVisible(true);
				}
				if(Creator.numTeamsValue==8) {
					Groups8 g = new Groups8();
					dispose();
					g.setVisible(true);
				}
				if(Creator.numTeamsValue==9) {
					Groups9 g = new Groups9();
					dispose();
					g.setVisible(true);
				}
				if(Creator.numTeamsValue==10) {
					Groups10 g = new Groups10();
					dispose();
					g.setVisible(true);
				}
				if(Creator.numTeamsValue==11) {
					Groups11 g = new Groups11();
					dispose();
					g.setVisible(true);
				}
				if(Creator.numTeamsValue==5) {
					League l= new League();
					dispose();
					l.setVisible(true);
				}
			}
		});
		btnNext.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNext.setBounds(645, 581, 104, 30);
		btnNext.setEnabled(false);
		contentPane.add(btnNext);
		
		JButton btnDraw = new JButton("Draw");
		btnDraw.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnDraw.setBounds(501, 581, 104, 30);
		btnDraw.setEnabled(false);
		if(Creator.numTeamsValue==5) {
			btnDraw.setVisible(false);
		}
		contentPane.add(btnDraw);
		
		JLabel lblGroupA = new JLabel("Group A");
		lblGroupA.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblGroupA.setBounds(344, 81, 57, 25);
		lblGroupA.setVisible(false);
		contentPane.add(lblGroupA);
		
		JLabel lblGroupB = new JLabel("Group B");
		lblGroupB.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblGroupB.setBounds(583, 81, 57, 25);
		lblGroupB.setVisible(false);
		contentPane.add(lblGroupB);
		
		JLabel lblTeamA1 = new JLabel();
		lblTeamA1.setText("New label");
		lblTeamA1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblTeamA1.setBounds(344, 110, 180, 25);
		lblTeamA1.setVisible(false);
		contentPane.add(lblTeamA1);
		
		JLabel lblTeamA2 = new JLabel("New label");
		lblTeamA2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblTeamA2.setBounds(344, 140, 180, 25);
		lblTeamA2.setVisible(false);
        contentPane.add(lblTeamA2);
		
		JLabel lblTeamA3 = new JLabel("New label");
		lblTeamA3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblTeamA3.setBounds(344, 170, 180, 25);
		lblTeamA3.setVisible(false);
		contentPane.add(lblTeamA3);
		
		JLabel lblTeamA4 = new JLabel("New label");
		lblTeamA4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblTeamA4.setBounds(344, 200, 180, 25);
		lblTeamA4.setVisible(false);
		contentPane.add(lblTeamA4);
		
		JLabel lblTeamA5 = new JLabel("New label");
		lblTeamA5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblTeamA5.setBounds(344, 230, 180, 25);
		lblTeamA5.setVisible(false);
		contentPane.add(lblTeamA5);
		
		JLabel lblTeamA6 = new JLabel("New label");
		lblTeamA6.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblTeamA6.setBounds(344, 260, 180, 25);
		lblTeamA6.setVisible(false);
		contentPane.add(lblTeamA6);
		
		JLabel lblTeamB1 = new JLabel("New label");
		lblTeamB1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblTeamB1.setBounds(583, 110, 180, 25);
		lblTeamB1.setVisible(false);
		contentPane.add(lblTeamB1);
		
		JLabel lblTeamB2 = new JLabel("New label");
		lblTeamB2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblTeamB2.setBounds(583, 140, 180, 25);
		lblTeamB2.setVisible(false);
		contentPane.add(lblTeamB2);
		
		JLabel lblTeamB3 = new JLabel("New label");
		lblTeamB3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblTeamB3.setBounds(583, 170, 180, 25);
		lblTeamB3.setVisible(false);
		contentPane.add(lblTeamB3);
		
		JLabel lblTeamB4 = new JLabel("New label");
		lblTeamB4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblTeamB4.setBounds(583, 200, 180, 25);
		lblTeamB4.setVisible(false);
		contentPane.add(lblTeamB4);
		
		JLabel lblTeamB5 = new JLabel("New label");
		lblTeamB5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblTeamB5.setBounds(583, 230, 180, 25);
		lblTeamB5.setVisible(false);
		contentPane.add(lblTeamB5);
		
		list1.add(txtTeam1); list1.add(txtTeam2); list1.add(txtTeam3); list1.add(txtTeam4); list1.add(txtTeam5);
		list.add(txtTeam1); list.add(txtTeam2); list.add(txtTeam3); list.add(txtTeam4); list.add(txtTeam5); list.add(txtTeam6); 
		list2.add(txtTeam1); list2.add(txtTeam2); list2.add(txtTeam3); list2.add(txtTeam4); list2.add(txtTeam5); list2.add(txtTeam6); list2.add(txtTeam7);
		list3.add(txtTeam1); list3.add(txtTeam2); list3.add(txtTeam3); list3.add(txtTeam4); list3.add(txtTeam5); list3.add(txtTeam6); list3.add(txtTeam7); list3.add(txtTeam8);
		list4.add(txtTeam1); list4.add(txtTeam2); list4.add(txtTeam3); list4.add(txtTeam4); list4.add(txtTeam5); list4.add(txtTeam6); list4.add(txtTeam7); list4.add(txtTeam8); list4.add(txtTeam9);
		list5.add(txtTeam1); list5.add(txtTeam2); list5.add(txtTeam3); list5.add(txtTeam4); list5.add(txtTeam5); list5.add(txtTeam6); list5.add(txtTeam7); list5.add(txtTeam8); list5.add(txtTeam9); list5.add(txtTeam10);
		list6.add(txtTeam1); list6.add(txtTeam2); list6.add(txtTeam3); list6.add(txtTeam4); list6.add(txtTeam5); list6.add(txtTeam6); list6.add(txtTeam7); list6.add(txtTeam8); list6.add(txtTeam9); list6.add(txtTeam10); list6.add(txtTeam11);
		
		DocumentListener listener = new DocumentListener() {
		    @Override
		    public void removeUpdate(DocumentEvent e) { changedUpdate(e);}
		    @Override
		    public void insertUpdate(DocumentEvent e) { changedUpdate(e); }

		    @Override
		    public void changedUpdate(DocumentEvent e) {
		    	boolean canEnable = true;
		        for (JTextField tf1 : list1) {
		            if (tf1.getText().trim().isEmpty() && Creator.numTeamsValue==5) {
		            	btnNext.setEnabled(canEnable);
		            }
		        }
		    	for (JTextField tf : list) {
		            if (tf.getText().trim().isEmpty() && Creator.numTeamsValue==6) {
		            	canEnable = false;
		            }
		            btnDraw.setEnabled(canEnable);
		        }
		        for(JTextField tf2 : list2) {
		        	if (tf2.getText().trim().isEmpty() && Creator.numTeamsValue==7) {
		            	canEnable = false;
		            }
		        	btnDraw.setEnabled(canEnable);
		        }
		        for(JTextField tf3 : list3) {
		        	if (tf3.getText().trim().isEmpty() && Creator.numTeamsValue==8) {
		            	canEnable = false;
		            }
		        	btnDraw.setEnabled(canEnable);
		        }
		        for(JTextField tf4 : list4) {
		        	if (tf4.getText().trim().isEmpty() && Creator.numTeamsValue==9) {
		            	canEnable = false;
		            }
		        	btnDraw.setEnabled(canEnable);
		        }
		        for(JTextField tf5 : list5) {
		        	if (tf5.getText().trim().isEmpty() && Creator.numTeamsValue==10) {
		            	canEnable = false;
		            }
		        	btnDraw.setEnabled(canEnable);
		        }
		        for(JTextField tf6 : list6) {
		        	if (tf6.getText().trim().isEmpty() && Creator.numTeamsValue==11) {
		            	canEnable = false;
		            }
		        	btnDraw.setEnabled(canEnable);
		        }
		    }
		};
		for (JTextField tf1 : list1) {
		    tf1.getDocument().addDocumentListener(listener);
		}
		for (JTextField tf : list) {
		    tf.getDocument().addDocumentListener(listener);
		}
		for (JTextField tf2 : list2) {
		    tf2.getDocument().addDocumentListener(listener);
		}
		for (JTextField tf3 : list3) {
		    tf3.getDocument().addDocumentListener(listener);
		}
		for (JTextField tf4 : list4) {
		    tf4.getDocument().addDocumentListener(listener);
		}
		for (JTextField tf5 : list5) {
		    tf5.getDocument().addDocumentListener(listener);
		}
		for (JTextField tf6 : list6) {
		    tf6.getDocument().addDocumentListener(listener);
		}
		
		btnDraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<String>  mylist = new ArrayList<String>();
			    btnNext.setEnabled(true);
			    lblGroupA.setVisible(true);
			    lblGroupB.setVisible(true);
			    btnDraw.setEnabled(false);
				if(Creator.numTeamsValue==6) {
					lblTeamA1.setVisible(true); lblTeamB1.setVisible(true);
			        lblTeamA2.setVisible(true); lblTeamB2.setVisible(true);
			        lblTeamA3.setVisible(true); lblTeamB3.setVisible(true);
		           	mylist.add(txtTeam1.getText()); mylist.add(txtTeam5.getText());
		        	mylist.add(txtTeam2.getText()); mylist.add(txtTeam4.getText());
		        	mylist.add(txtTeam3.getText()); mylist.add(txtTeam6.getText());
		        	Collections.shuffle(mylist);
		        	lblTeamA1.setText(mylist.get(0)); lblTeamB1.setText(mylist.get(3));
			        lblTeamA2.setText(mylist.get(1)); lblTeamB2.setText(mylist.get(4));
			        lblTeamA3.setText(mylist.get(2)); lblTeamB3.setText(mylist.get(5));
			        teamA1=String.valueOf(lblTeamA1.getText()); teamA2=String.valueOf(lblTeamA2.getText()); teamA3=String.valueOf(lblTeamA3.getText());
			        teamB1=String.valueOf(lblTeamB1.getText()); teamB2=String.valueOf(lblTeamB2.getText()); teamB3=String.valueOf(lblTeamB3.getText());
			        
			    }
				if(Creator.numTeamsValue==7) {
					lblTeamA1.setVisible(true); lblTeamB1.setVisible(true);
			        lblTeamA2.setVisible(true); lblTeamB2.setVisible(true);
			        lblTeamA3.setVisible(true); lblTeamB3.setVisible(true);
			        lblTeamA4.setVisible(true);
					mylist.add(txtTeam1.getText()); mylist.add(txtTeam5.getText());
		        	mylist.add(txtTeam2.getText()); mylist.add(txtTeam4.getText());
		        	mylist.add(txtTeam3.getText()); mylist.add(txtTeam6.getText());
		        	mylist.add(txtTeam7.getText());
		        	Collections.shuffle(mylist);
		        	lblTeamA1.setText(mylist.get(0)); lblTeamB1.setText(mylist.get(4));
			        lblTeamA2.setText(mylist.get(1)); lblTeamB2.setText(mylist.get(5));
			        lblTeamA3.setText(mylist.get(2)); lblTeamB3.setText(mylist.get(6));
			        lblTeamA4.setText(mylist.get(3));
			        teamA1=String.valueOf(lblTeamA1.getText()); teamA2=String.valueOf(lblTeamA2.getText()); teamA3=String.valueOf(lblTeamA3.getText());
			        teamA4=String.valueOf(lblTeamA4.getText()); 
			        teamB1=String.valueOf(lblTeamB1.getText()); teamB2=String.valueOf(lblTeamB2.getText()); teamB3=String.valueOf(lblTeamB3.getText());
			    }
				if(Creator.numTeamsValue==8) {
					lblTeamA1.setVisible(true); lblTeamB1.setVisible(true);
			        lblTeamA2.setVisible(true); lblTeamB2.setVisible(true);
			        lblTeamA3.setVisible(true); lblTeamB3.setVisible(true);
			        lblTeamA4.setVisible(true); lblTeamB4.setVisible(true);
					mylist.add(txtTeam1.getText()); mylist.add(txtTeam5.getText());
		        	mylist.add(txtTeam2.getText()); mylist.add(txtTeam4.getText());
		        	mylist.add(txtTeam3.getText()); mylist.add(txtTeam6.getText());
		        	mylist.add(txtTeam7.getText()); mylist.add(txtTeam8.getText());
		        	Collections.shuffle(mylist);
		        	lblTeamA1.setText(mylist.get(0)); lblTeamB1.setText(mylist.get(4));
			        lblTeamA2.setText(mylist.get(1)); lblTeamB2.setText(mylist.get(5));
			        lblTeamA3.setText(mylist.get(2)); lblTeamB3.setText(mylist.get(6));
			        lblTeamA4.setText(mylist.get(3)); lblTeamB4.setText(mylist.get(7));
			        teamA1=String.valueOf(lblTeamA1.getText()); teamA2=String.valueOf(lblTeamA2.getText()); teamA3=String.valueOf(lblTeamA3.getText());
			        teamA4=String.valueOf(lblTeamA4.getText()); 
			        teamB1=String.valueOf(lblTeamB1.getText()); teamB2=String.valueOf(lblTeamB2.getText()); teamB3=String.valueOf(lblTeamB3.getText());
			        teamB4=String.valueOf(lblTeamB4.getText());
			    }
				if(Creator.numTeamsValue==9) {
					lblTeamA1.setVisible(true); lblTeamB1.setVisible(true);
			        lblTeamA2.setVisible(true); lblTeamB2.setVisible(true);
			        lblTeamA3.setVisible(true); lblTeamB3.setVisible(true);
			        lblTeamA4.setVisible(true); lblTeamB4.setVisible(true);
			        lblTeamA5.setVisible(true);
					mylist.add(txtTeam1.getText()); mylist.add(txtTeam5.getText());
		        	mylist.add(txtTeam2.getText()); mylist.add(txtTeam4.getText());
		        	mylist.add(txtTeam3.getText()); mylist.add(txtTeam6.getText());
		        	mylist.add(txtTeam7.getText()); mylist.add(txtTeam8.getText());
		        	mylist.add(txtTeam9.getText());
		        	Collections.shuffle(mylist);
		        	lblTeamA1.setText(mylist.get(0)); lblTeamB1.setText(mylist.get(4));
			        lblTeamA2.setText(mylist.get(1)); lblTeamB2.setText(mylist.get(5));
			        lblTeamA3.setText(mylist.get(2)); lblTeamB3.setText(mylist.get(6));
			        lblTeamA4.setText(mylist.get(3)); lblTeamB4.setText(mylist.get(7));
			        lblTeamA5.setText(mylist.get(8));
			        teamA1=String.valueOf(lblTeamA1.getText()); teamA2=String.valueOf(lblTeamA2.getText()); teamA3=String.valueOf(lblTeamA3.getText());
			        teamA4=String.valueOf(lblTeamA4.getText()); teamA5=String.valueOf(lblTeamA5.getText()); 
			        teamB1=String.valueOf(lblTeamB1.getText()); teamB2=String.valueOf(lblTeamB2.getText()); teamB3=String.valueOf(lblTeamB3.getText());
			        teamB4=String.valueOf(lblTeamB4.getText());
				}
				if(Creator.numTeamsValue==10) {
					lblTeamA1.setVisible(true); lblTeamB1.setVisible(true);
			        lblTeamA2.setVisible(true); lblTeamB2.setVisible(true);
			        lblTeamA3.setVisible(true); lblTeamB3.setVisible(true);
			        lblTeamA4.setVisible(true); lblTeamB4.setVisible(true);
			        lblTeamA5.setVisible(true); lblTeamB5.setVisible(true);
					mylist.add(txtTeam1.getText()); mylist.add(txtTeam5.getText());
		        	mylist.add(txtTeam2.getText()); mylist.add(txtTeam4.getText());
		        	mylist.add(txtTeam3.getText()); mylist.add(txtTeam6.getText());
		        	mylist.add(txtTeam7.getText()); mylist.add(txtTeam8.getText());
		        	mylist.add(txtTeam9.getText()); mylist.add(txtTeam10.getText());
		        	Collections.shuffle(mylist);
		        	lblTeamA1.setText(mylist.get(0)); lblTeamB1.setText(mylist.get(4));
			        lblTeamA2.setText(mylist.get(1)); lblTeamB2.setText(mylist.get(5));
			        lblTeamA3.setText(mylist.get(2)); lblTeamB3.setText(mylist.get(6));
			        lblTeamA4.setText(mylist.get(3)); lblTeamB4.setText(mylist.get(8));
			        lblTeamA5.setText(mylist.get(7)); lblTeamB5.setText(mylist.get(9));
			        teamA1=String.valueOf(lblTeamA1.getText()); teamA2=String.valueOf(lblTeamA2.getText()); teamA3=String.valueOf(lblTeamA3.getText());
			        teamA4=String.valueOf(lblTeamA4.getText()); teamA5=String.valueOf(lblTeamA5.getText()); 
			        teamB1=String.valueOf(lblTeamB1.getText()); teamB2=String.valueOf(lblTeamB2.getText()); teamB3=String.valueOf(lblTeamB3.getText());
			        teamB4=String.valueOf(lblTeamB4.getText()); teamB5=String.valueOf(lblTeamB5.getText());
			    }
				if(Creator.numTeamsValue==11) {
					lblTeamA1.setVisible(true); lblTeamB1.setVisible(true);
			        lblTeamA2.setVisible(true); lblTeamB2.setVisible(true);
			        lblTeamA3.setVisible(true); lblTeamB3.setVisible(true);
			        lblTeamA4.setVisible(true); lblTeamB4.setVisible(true);
			        lblTeamA5.setVisible(true); lblTeamB5.setVisible(true);
			        lblTeamA6.setVisible(true);
					mylist.add(txtTeam1.getText()); mylist.add(txtTeam5.getText());
		        	mylist.add(txtTeam2.getText()); mylist.add(txtTeam4.getText());
		        	mylist.add(txtTeam3.getText()); mylist.add(txtTeam6.getText());
		        	mylist.add(txtTeam7.getText()); mylist.add(txtTeam10.getText());
		        	mylist.add(txtTeam8.getText()); mylist.add(txtTeam11.getText());
		        	mylist.add(txtTeam9.getText());
		        	Collections.shuffle(mylist);
		        	lblTeamA1.setText(mylist.get(0)); lblTeamB1.setText(mylist.get(4));
			        lblTeamA2.setText(mylist.get(1)); lblTeamB2.setText(mylist.get(5));
			        lblTeamA3.setText(mylist.get(2)); lblTeamB3.setText(mylist.get(6));
			        lblTeamA4.setText(mylist.get(3)); lblTeamB4.setText(mylist.get(7));
			        lblTeamA5.setText(mylist.get(9)); lblTeamB5.setText(mylist.get(8));
			        lblTeamA6.setText(mylist.get(10));
			        teamA1=String.valueOf(lblTeamA1.getText()); teamA2=String.valueOf(lblTeamA2.getText()); teamA3=String.valueOf(lblTeamA3.getText());
			        teamA4=String.valueOf(lblTeamA4.getText()); teamA5=String.valueOf(lblTeamA5.getText()); teamA6=String.valueOf(lblTeamA6.getText());
			        teamB1=String.valueOf(lblTeamB1.getText()); teamB2=String.valueOf(lblTeamB2.getText()); teamB3=String.valueOf(lblTeamB3.getText());
			        teamB4=String.valueOf(lblTeamB4.getText()); teamB5=String.valueOf(lblTeamB5.getText());
			     }
		        
		        		  
		     }
		});
		
		
	}
}
