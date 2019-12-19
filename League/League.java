import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.NumberFormatter;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.text.NumberFormat;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class League extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					League frame = new League();
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
	public League() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1026, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		setTitle("Name of tournament: "+Creator.tourName.getText()+" "+" "+" "+" "+" "+" "+"Place of tournament: "+Creator.tourPlace.getText()+" "+" "+" "+" "+" "+" "+"Date: "+Creator.dateTour);
		Image photo = new ImageIcon(this.getClass().getResource("images/arrowReset.png")).getImage();
		
		//Tabela---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
				JLabel lblLeague = new JLabel("League");
				lblLeague.setHorizontalAlignment(SwingConstants.CENTER);
				lblLeague.setFont(new Font("Times New Roman", Font.BOLD, 15));
				lblLeague.setBounds(141, 11, 180, 25);
				contentPane.add(lblLeague);
				
				JLabel label_29 = new JLabel("#");
				label_29.setHorizontalAlignment(SwingConstants.CENTER);
				label_29.setFont(new Font("Tahoma", Font.BOLD, 12));
				label_29.setBounds(10, 40, 29, 14);
				contentPane.add(label_29);
				
				JLabel label_30 = new JLabel("Team");
				label_30.setHorizontalAlignment(SwingConstants.CENTER);
				label_30.setFont(new Font("Tahoma", Font.BOLD, 12));
				label_30.setBounds(49, 40, 71, 14);
				contentPane.add(label_30);
				
				JLabel label_31 = new JLabel("P");
				label_31.setHorizontalAlignment(SwingConstants.CENTER);
				label_31.setFont(new Font("Tahoma", Font.BOLD, 12));
				label_31.setBounds(172, 40, 29, 14);
				contentPane.add(label_31);
				
				JLabel label_32 = new JLabel("W");
				label_32.setHorizontalAlignment(SwingConstants.CENTER);
				label_32.setFont(new Font("Tahoma", Font.BOLD, 12));
				label_32.setBounds(205, 40, 29, 14);
				contentPane.add(label_32);
				
				JLabel label_33 = new JLabel("D");
				label_33.setHorizontalAlignment(SwingConstants.CENTER);
				label_33.setFont(new Font("Tahoma", Font.BOLD, 12));
				label_33.setBounds(238, 40, 29, 14);
				contentPane.add(label_33);
				
				JLabel label_34 = new JLabel("L");
				label_34.setHorizontalAlignment(SwingConstants.CENTER);
				label_34.setFont(new Font("Tahoma", Font.BOLD, 12));
				label_34.setBounds(271, 40, 29, 14);
				contentPane.add(label_34);
				
				JLabel label_35 = new JLabel("GF");
				label_35.setHorizontalAlignment(SwingConstants.CENTER);
				label_35.setFont(new Font("Tahoma", Font.BOLD, 12));
				label_35.setBounds(304, 40, 29, 14);
				contentPane.add(label_35);
				
				JLabel label_36 = new JLabel("GA");
				label_36.setHorizontalAlignment(SwingConstants.CENTER);
				label_36.setFont(new Font("Tahoma", Font.BOLD, 12));
				label_36.setBounds(337, 40, 29, 14);
				contentPane.add(label_36);
				
				JLabel label_37 = new JLabel("GD");
				label_37.setHorizontalAlignment(SwingConstants.CENTER);
				label_37.setFont(new Font("Tahoma", Font.BOLD, 12));
				label_37.setBounds(370, 40, 29, 14);
				contentPane.add(label_37);
				
				JLabel label_38 = new JLabel("PTS");
				label_38.setHorizontalAlignment(SwingConstants.CENTER);
				label_38.setFont(new Font("Tahoma", Font.BOLD, 12));
				label_38.setBounds(403, 40, 29, 14);
				contentPane.add(label_38);
				
				JLabel lblTeamL1 = new JLabel();
				lblTeamL1.setBounds(36, 68, 125, 14);
				lblTeamL1.setText(addTeams.txtTeam1.getText());
				contentPane.add(lblTeamL1);
				
				JLabel lblTeamL2 = new JLabel();
				lblTeamL2.setBounds(36, 86, 125, 14);
				lblTeamL2.setText(addTeams.txtTeam2.getText());
				contentPane.add(lblTeamL2);
				
				JLabel lblTeamL3 = new JLabel();
				lblTeamL3.setBounds(36, 104, 125, 14);
				lblTeamL3.setText(addTeams.txtTeam3.getText());
				contentPane.add(lblTeamL3);
				
				JLabel lblTeamL4 = new JLabel();
				lblTeamL4.setBounds(35, 122, 125, 14);
				lblTeamL4.setText(addTeams.txtTeam4.getText());
				contentPane.add(lblTeamL4);
				
				JLabel lblTeamL5 = new JLabel();
				lblTeamL5.setBounds(35, 140, 125, 14);
				lblTeamL5.setText(addTeams.txtTeam5.getText());
				contentPane.add(lblTeamL5);
				
				JLabel lblPlayedL1 = new JLabel("0");
				lblPlayedL1.setHorizontalAlignment(SwingConstants.CENTER);
				lblPlayedL1.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblPlayedL1.setBounds(171, 68, 29, 14);
				contentPane.add(lblPlayedL1);
				
				JLabel lblWinsL1 = new JLabel("0");
				lblWinsL1.setHorizontalAlignment(SwingConstants.CENTER);
				lblWinsL1.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblWinsL1.setBounds(204, 68, 29, 14);
				contentPane.add(lblWinsL1);
				
				JLabel lblDrawsL1 = new JLabel("0");
				lblDrawsL1.setHorizontalAlignment(SwingConstants.CENTER);
				lblDrawsL1.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblDrawsL1.setBounds(237, 68, 29, 14);
				contentPane.add(lblDrawsL1);
				
				JLabel lblLostL1 = new JLabel("0");
				lblLostL1.setHorizontalAlignment(SwingConstants.CENTER);
				lblLostL1.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblLostL1.setBounds(270, 68, 29, 14);
				contentPane.add(lblLostL1);
				
				JLabel lblGFL1 = new JLabel("0");
				lblGFL1.setHorizontalAlignment(SwingConstants.CENTER);
				lblGFL1.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblGFL1.setBounds(303, 68, 29, 14);
				contentPane.add(lblGFL1);
				
				JLabel lblGAL1 = new JLabel("0");
				lblGAL1.setHorizontalAlignment(SwingConstants.CENTER);
				lblGAL1.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblGAL1.setBounds(336, 68, 29, 14);
				contentPane.add(lblGAL1);
				
				JLabel lblGDL1 = new JLabel("0");
				lblGDL1.setHorizontalAlignment(SwingConstants.CENTER);
				lblGDL1.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblGDL1.setBounds(369, 68, 29, 14);
				contentPane.add(lblGDL1);
				
				JLabel lblPtsL1 = new JLabel("0");
				lblPtsL1.setHorizontalAlignment(SwingConstants.CENTER);
				lblPtsL1.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblPtsL1.setBounds(402, 68, 29, 14);
				contentPane.add(lblPtsL1);
				
				JLabel lblPlayedL2 = new JLabel("0");
				lblPlayedL2.setHorizontalAlignment(SwingConstants.CENTER);
				lblPlayedL2.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblPlayedL2.setBounds(171, 86, 29, 14);
				contentPane.add(lblPlayedL2);
				
				JLabel lblWinsL2 = new JLabel("0");
				lblWinsL2.setHorizontalAlignment(SwingConstants.CENTER);
				lblWinsL2.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblWinsL2.setBounds(204, 86, 29, 14);
				contentPane.add(lblWinsL2);
				
				JLabel lblDrawsL2 = new JLabel("0");
				lblDrawsL2.setHorizontalAlignment(SwingConstants.CENTER);
				lblDrawsL2.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblDrawsL2.setBounds(237, 86, 29, 14);
				contentPane.add(lblDrawsL2);
				
				JLabel lblLostL2 = new JLabel("0");
				lblLostL2.setHorizontalAlignment(SwingConstants.CENTER);
				lblLostL2.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblLostL2.setBounds(270, 86, 29, 14);
				contentPane.add(lblLostL2);
				
				JLabel lblGFL2 = new JLabel("0");
				lblGFL2.setHorizontalAlignment(SwingConstants.CENTER);
				lblGFL2.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblGFL2.setBounds(303, 86, 29, 14);
				contentPane.add(lblGFL2);
				
				JLabel lblGAL2 = new JLabel("0");
				lblGAL2.setHorizontalAlignment(SwingConstants.CENTER);
				lblGAL2.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblGAL2.setBounds(336, 86, 29, 14);
				contentPane.add(lblGAL2);
				
				JLabel lblGDL2 = new JLabel("0");
				lblGDL2.setHorizontalAlignment(SwingConstants.CENTER);
				lblGDL2.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblGDL2.setBounds(369, 86, 29, 14);
				contentPane.add(lblGDL2);
				
				JLabel lblPtsL2 = new JLabel("0");
				lblPtsL2.setHorizontalAlignment(SwingConstants.CENTER);
				lblPtsL2.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblPtsL2.setBounds(402, 86, 29, 14);
				contentPane.add(lblPtsL2);
				
				JLabel lblPlayedL3 = new JLabel("0");
				lblPlayedL3.setHorizontalAlignment(SwingConstants.CENTER);
				lblPlayedL3.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblPlayedL3.setBounds(171, 104, 29, 14);
				contentPane.add(lblPlayedL3);
				
				JLabel lblWinsL3 = new JLabel("0");
				lblWinsL3.setHorizontalAlignment(SwingConstants.CENTER);
				lblWinsL3.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblWinsL3.setBounds(204, 104, 29, 14);
				contentPane.add(lblWinsL3);
				
				JLabel lblDrawsL3 = new JLabel("0");
				lblDrawsL3.setHorizontalAlignment(SwingConstants.CENTER);
				lblDrawsL3.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblDrawsL3.setBounds(237, 104, 29, 14);
				contentPane.add(lblDrawsL3);
				
				JLabel lblLostL3 = new JLabel("0");
				lblLostL3.setHorizontalAlignment(SwingConstants.CENTER);
				lblLostL3.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblLostL3.setBounds(270, 104, 29, 14);
				contentPane.add(lblLostL3);
				
				JLabel lblGFL3 = new JLabel("0");
				lblGFL3.setHorizontalAlignment(SwingConstants.CENTER);
				lblGFL3.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblGFL3.setBounds(303, 104, 29, 14);
				contentPane.add(lblGFL3);
				
				JLabel lblGAL3 = new JLabel("0");
				lblGAL3.setHorizontalAlignment(SwingConstants.CENTER);
				lblGAL3.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblGAL3.setBounds(336, 104, 29, 14);
				contentPane.add(lblGAL3);
				
				JLabel lblGDL3 = new JLabel("0");
				lblGDL3.setHorizontalAlignment(SwingConstants.CENTER);
				lblGDL3.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblGDL3.setBounds(369, 104, 29, 14);
				contentPane.add(lblGDL3);
				
				JLabel lblPtsL3 = new JLabel("0");
				lblPtsL3.setHorizontalAlignment(SwingConstants.CENTER);
				lblPtsL3.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblPtsL3.setBounds(402, 104, 29, 14);
				contentPane.add(lblPtsL3);
				
				JLabel lblPlayedL4 = new JLabel("0");
				lblPlayedL4.setHorizontalAlignment(SwingConstants.CENTER);
				lblPlayedL4.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblPlayedL4.setBounds(171, 124, 29, 14);
				contentPane.add(lblPlayedL4);
				
				JLabel lblWinsL4 = new JLabel("0");
				lblWinsL4.setHorizontalAlignment(SwingConstants.CENTER);
				lblWinsL4.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblWinsL4.setBounds(204, 124, 29, 14);
				contentPane.add(lblWinsL4);
				
				JLabel lblDrawsL4 = new JLabel("0");
				lblDrawsL4.setHorizontalAlignment(SwingConstants.CENTER);
				lblDrawsL4.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblDrawsL4.setBounds(237, 124, 29, 14);
				contentPane.add(lblDrawsL4);
				
				JLabel lblLostL4 = new JLabel("0");
				lblLostL4.setHorizontalAlignment(SwingConstants.CENTER);
				lblLostL4.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblLostL4.setBounds(270, 124, 29, 14);
				contentPane.add(lblLostL4);
				
				JLabel lblGFL4 = new JLabel("0");
				lblGFL4.setHorizontalAlignment(SwingConstants.CENTER);
				lblGFL4.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblGFL4.setBounds(303, 124, 29, 14);
				contentPane.add(lblGFL4);
				
				JLabel lblGAL4 = new JLabel("0");
				lblGAL4.setHorizontalAlignment(SwingConstants.CENTER);
				lblGAL4.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblGAL4.setBounds(336, 124, 29, 14);
				contentPane.add(lblGAL4);
				
				JLabel lblGDL4 = new JLabel("0");
				lblGDL4.setHorizontalAlignment(SwingConstants.CENTER);
				lblGDL4.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblGDL4.setBounds(369, 124, 29, 14);
				contentPane.add(lblGDL4);
				
				JLabel lblPtsL4 = new JLabel("0");
				lblPtsL4.setHorizontalAlignment(SwingConstants.CENTER);
				lblPtsL4.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblPtsL4.setBounds(402, 124, 29, 14);
				contentPane.add(lblPtsL4);
				
				JLabel lblPlayedL5 = new JLabel("0");
				lblPlayedL5.setHorizontalAlignment(SwingConstants.CENTER);
				lblPlayedL5.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblPlayedL5.setBounds(171, 142, 29, 14);
				contentPane.add(lblPlayedL5);
				
				JLabel lblWinsL5 = new JLabel("0");
				lblWinsL5.setHorizontalAlignment(SwingConstants.CENTER);
				lblWinsL5.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblWinsL5.setBounds(204, 142, 29, 14);
				contentPane.add(lblWinsL5);
				
				JLabel lblDrawsL5 = new JLabel("0");
				lblDrawsL5.setHorizontalAlignment(SwingConstants.CENTER);
				lblDrawsL5.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblDrawsL5.setBounds(237, 142, 29, 14);
				contentPane.add(lblDrawsL5);
				
				JLabel lblLostL5 = new JLabel("0");
				lblLostL5.setHorizontalAlignment(SwingConstants.CENTER);
				lblLostL5.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblLostL5.setBounds(270, 142, 29, 14);
				contentPane.add(lblLostL5);
				
				JLabel lblGFL5 = new JLabel("0");
				lblGFL5.setHorizontalAlignment(SwingConstants.CENTER);
				lblGFL5.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblGFL5.setBounds(303, 142, 29, 14);
				contentPane.add(lblGFL5);
				
				JLabel lblGAL5 = new JLabel("0");
				lblGAL5.setHorizontalAlignment(SwingConstants.CENTER);
				lblGAL5.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblGAL5.setBounds(336, 142, 29, 14);
				contentPane.add(lblGAL5);
				
				JLabel lblGDL5 = new JLabel("0");
				lblGDL5.setHorizontalAlignment(SwingConstants.CENTER);
				lblGDL5.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblGDL5.setBounds(369, 142, 29, 14);
				contentPane.add(lblGDL5);
				
				JLabel lblPtsL5 = new JLabel("0");
				lblPtsL5.setHorizontalAlignment(SwingConstants.CENTER);
				lblPtsL5.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblPtsL5.setBounds(402, 142, 29, 14);
				contentPane.add(lblPtsL5);
		
		//FORMATIRANJE JFORMATTEDFIELDa-----------------------------------------------------------------------------------------------------------------------------
		NumberFormat format = NumberFormat.getNumberInstance();
	    NumberFormatter formatter = new NumberFormatter(format);
	    formatter.setValueClass(Integer.class);
	    formatter.setAllowsInvalid(true);
	    formatter.setCommitsOnValidEdit(true);
	    
	    //FORMATTEDFIELD rezultati-----------------------------------------------------------------------------------------------------------------------------------
	    JLabel label_1 = new JLabel("Fixtures");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(20, 185, 352, 25);
		contentPane.add(label_1);
	    
	    JFormattedTextField resultL1G1 = new JFormattedTextField(formatter);
		resultL1G1.setHorizontalAlignment(SwingConstants.CENTER);
		resultL1G1.setBounds(166, 218, 23, 17);
		contentPane.add(resultL1G1);
		
		JFormattedTextField resultL1G2 = new JFormattedTextField(formatter);
		resultL1G2.setHorizontalAlignment(SwingConstants.CENTER);
		resultL1G2.setBounds(199, 274, 23, 17);
		contentPane.add(resultL1G2);
		
		JFormattedTextField resultL1G3 = new JFormattedTextField(formatter);
		resultL1G3.setHorizontalAlignment(SwingConstants.CENTER);
		resultL1G3.setBounds(166, 330, 23, 17);
		contentPane.add(resultL1G3);
		
		JFormattedTextField resultL1G4 = new JFormattedTextField(formatter);
		resultL1G4.setHorizontalAlignment(SwingConstants.CENTER);
		resultL1G4.setBounds(199, 386, 23, 17);
		contentPane.add(resultL1G4);
		
		JFormattedTextField resultL2G1 = new JFormattedTextField(formatter);
		resultL2G1.setHorizontalAlignment(SwingConstants.CENTER);
		resultL2G1.setBounds(199, 218, 23, 17);
		contentPane.add(resultL2G1);
		
		JFormattedTextField resultL2G2 = new JFormattedTextField(formatter);
		resultL2G2.setHorizontalAlignment(SwingConstants.CENTER);
		resultL2G2.setBounds(166, 358, 23, 17);
		contentPane.add(resultL2G2);
		
		JFormattedTextField resultL2G3 = new JFormattedTextField(formatter);
		resultL2G3.setHorizontalAlignment(SwingConstants.CENTER);
		resultL2G3.setBounds(199, 414, 23, 17);
		contentPane.add(resultL2G3);
		
		JFormattedTextField resultL2G4 = new JFormattedTextField(formatter);
		resultL2G4.setHorizontalAlignment(SwingConstants.CENTER);
		resultL2G4.setBounds(166, 442, 23, 17);
		contentPane.add(resultL2G4);
		
		JFormattedTextField resultL3G1 = new JFormattedTextField(formatter);
		resultL3G1.setHorizontalAlignment(SwingConstants.CENTER);
		resultL3G1.setBounds(199, 246, 23, 17);
		contentPane.add(resultL3G1);
		
		JFormattedTextField resultL3G2 = new JFormattedTextField(formatter);
		resultL3G2.setHorizontalAlignment(SwingConstants.CENTER);
		resultL3G2.setBounds(166, 274, 23, 17);
		contentPane.add(resultL3G2);
		
		JFormattedTextField resultL3G3 = new JFormattedTextField(formatter);
		resultL3G3.setHorizontalAlignment(SwingConstants.CENTER);
		resultL3G3.setBounds(199, 358, 23, 17);
		contentPane.add(resultL3G3);
		
		JFormattedTextField resultL3G4 = new JFormattedTextField(formatter);
		resultL3G4.setHorizontalAlignment(SwingConstants.CENTER);
		resultL3G4.setBounds(166, 470, 23, 17);
		contentPane.add(resultL3G4);
		
		JFormattedTextField resultL4G1 = new JFormattedTextField(formatter);
		resultL4G1.setHorizontalAlignment(SwingConstants.CENTER);
		resultL4G1.setBounds(166, 302, 23, 17);
		contentPane.add(resultL4G1);
		
		JFormattedTextField resultL4G2 = new JFormattedTextField(formatter);
		resultL4G2.setHorizontalAlignment(SwingConstants.CENTER);
		resultL4G2.setBounds(199, 330, 23, 17);
		contentPane.add(resultL4G2);
		
		JFormattedTextField resultL4G3 = new JFormattedTextField(formatter);
		resultL4G3.setHorizontalAlignment(SwingConstants.CENTER);
		resultL4G3.setBounds(166, 414, 23, 17);
		contentPane.add(resultL4G3);
		
		JFormattedTextField resultL4G4 = new JFormattedTextField(formatter);
		resultL4G4.setHorizontalAlignment(SwingConstants.CENTER);
		resultL4G4.setBounds(199, 470, 23, 17);
		contentPane.add(resultL4G4);
		
		JFormattedTextField resultL5G1 = new JFormattedTextField(formatter);
		resultL5G1.setHorizontalAlignment(SwingConstants.CENTER);
		resultL5G1.setBounds(166, 246, 23, 17);
		contentPane.add(resultL5G1);
		
		JFormattedTextField resultL5G2 = new JFormattedTextField(formatter);
		resultL5G2.setHorizontalAlignment(SwingConstants.CENTER);
		resultL5G2.setBounds(199, 302, 23, 17);
		contentPane.add(resultL5G2);
		
		JFormattedTextField resultL5G3 = new JFormattedTextField(formatter);
		resultL5G3.setHorizontalAlignment(SwingConstants.CENTER);
		resultL5G3.setBounds(166, 386, 23, 17);
		contentPane.add(resultL5G3);
		
		JFormattedTextField resultL5G4 = new JFormattedTextField(formatter);
		resultL5G4.setHorizontalAlignment(SwingConstants.CENTER);
		resultL5G4.setBounds(199, 442, 23, 17);
		contentPane.add(resultL5G4);
		
		JLabel lblTeamL1G1 = new JLabel((String) null);
		lblTeamL1G1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeamL1G1.setBounds(20, 218, 118, 14);
		lblTeamL1G1.setText(addTeams.txtTeam1.getText());
		contentPane.add(lblTeamL1G1);
		
		JLabel lblTeamL1G2 = new JLabel((String) null);
		lblTeamL1G2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeamL1G2.setBounds(244, 274, 118, 14);
		lblTeamL1G2.setText(addTeams.txtTeam1.getText());
		contentPane.add(lblTeamL1G2);
		
		JLabel lblTeamL1G3 = new JLabel((String) null);
		lblTeamL1G3.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeamL1G3.setBounds(20, 330, 118, 14);
		lblTeamL1G3.setText(addTeams.txtTeam1.getText());
		contentPane.add(lblTeamL1G3);
		
		JLabel lblTeamL1G4 = new JLabel((String) null);
		lblTeamL1G4.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeamL1G4.setBounds(244, 386, 118, 14);
		lblTeamL1G4.setText(addTeams.txtTeam1.getText());
		contentPane.add(lblTeamL1G4);
		
		JLabel lblTeamL2G1 = new JLabel((String) null);
		lblTeamL2G1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeamL2G1.setBounds(244, 218, 118, 14);
		lblTeamL2G1.setText(addTeams.txtTeam2.getText());
		contentPane.add(lblTeamL2G1);
		
		JLabel lblTeamL2G2 = new JLabel((String) null);
		lblTeamL2G2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeamL2G2.setBounds(20, 358, 118, 14);
		lblTeamL2G2.setText(addTeams.txtTeam2.getText());
		contentPane.add(lblTeamL2G2);
		
		JLabel lblTeamL2G3 = new JLabel((String) null);
		lblTeamL2G3.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeamL2G3.setBounds(244, 414, 118, 14);
		lblTeamL2G3.setText(addTeams.txtTeam2.getText());
		contentPane.add(lblTeamL2G3);
		
		JLabel lblTeamL2G4 = new JLabel((String) null);
		lblTeamL2G4.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeamL2G4.setBounds(20, 442, 118, 14);
		lblTeamL2G4.setText(addTeams.txtTeam2.getText());
		contentPane.add(lblTeamL2G4);
		
		JLabel lblTeamL3G1 = new JLabel((String) null);
		lblTeamL3G1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeamL3G1.setBounds(244, 246, 118, 14);
		lblTeamL3G1.setText(addTeams.txtTeam3.getText());
		contentPane.add(lblTeamL3G1);
		
		JLabel lblTeamL3G2 = new JLabel((String) null);
		lblTeamL3G2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeamL3G2.setBounds(20, 274, 118, 14);
		lblTeamL3G2.setText(addTeams.txtTeam3.getText());
		contentPane.add(lblTeamL3G2);
		
		JLabel lblTeamL3G3 = new JLabel((String) null);
		lblTeamL3G3.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeamL3G3.setBounds(244, 358, 118, 14);
		lblTeamL3G3.setText(addTeams.txtTeam3.getText());
		contentPane.add(lblTeamL3G3);
		
		JLabel lblTeamL3G4 = new JLabel((String) null);
		lblTeamL3G4.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeamL3G4.setBounds(20, 470, 118, 14);
		lblTeamL3G4.setText(addTeams.txtTeam3.getText());
		contentPane.add(lblTeamL3G4);
		
		JLabel lblTeamL4G1 = new JLabel((String) null);
		lblTeamL4G1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeamL4G1.setBounds(20, 302, 118, 14);
		lblTeamL4G1.setText(addTeams.txtTeam4.getText());
		contentPane.add(lblTeamL4G1);
		
		JLabel lblTeamL4G2 = new JLabel((String) null);
		lblTeamL4G2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeamL4G2.setBounds(244, 330, 118, 14);
		lblTeamL4G2.setText(addTeams.txtTeam4.getText());
		contentPane.add(lblTeamL4G2);
		
		JLabel lblTeamL4G3 = new JLabel((String) null);
		lblTeamL4G3.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeamL4G3.setBounds(20, 414, 118, 14);
		lblTeamL4G3.setText(addTeams.txtTeam4.getText());
		contentPane.add(lblTeamL4G3);
		
		JLabel lblTeamL4G4 = new JLabel((String) null);
		lblTeamL4G4.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeamL4G4.setBounds(244, 470, 118, 14);
		lblTeamL4G4.setText(addTeams.txtTeam4.getText());
		contentPane.add(lblTeamL4G4);
		
		JLabel lblTeamL5G1 = new JLabel((String) null);
		lblTeamL5G1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeamL5G1.setBounds(20, 246, 118, 14);
		lblTeamL5G1.setText(addTeams.txtTeam5.getText());
		contentPane.add(lblTeamL5G1);
		
		JLabel lblTeamL5G2 = new JLabel((String) null);
		lblTeamL5G2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeamL5G2.setBounds(244, 302, 118, 14);
		lblTeamL5G2.setText(addTeams.txtTeam5.getText());
		contentPane.add(lblTeamL5G2);
		
		JLabel lblTeamL5G3 = new JLabel((String) null);
		lblTeamL5G3.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeamL5G3.setBounds(20, 386, 118, 14);
		lblTeamL5G3.setText(addTeams.txtTeam5.getText());
		contentPane.add(lblTeamL5G3);
		
		JLabel lblTeamL5G4 = new JLabel((String) null);
		lblTeamL5G4.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeamL5G4.setBounds(244, 442, 118, 14);
		lblTeamL5G4.setText(addTeams.txtTeam5.getText());
		contentPane.add(lblTeamL5G4);
		
		//AddResults buttons-------------------------------------------------------------------------------------------------------------------------------------------
		JButton btnG1 = new JButton("AddResult");
		btnG1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnG1.setBounds(372, 218, 89, 17);
		contentPane.add(btnG1);
		
		JButton btnG2 = new JButton("AddResult");
		btnG2.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnG2.setBounds(372, 246, 89, 17);
		contentPane.add(btnG2);
		
		JButton btnG3 = new JButton("AddResult");
		btnG3.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnG3.setBounds(372, 274, 89, 17);
		contentPane.add(btnG3);
		
		JButton btnG4 = new JButton("AddResult");
		btnG4.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnG4.setBounds(372, 302, 89, 17);
		contentPane.add(btnG4);
		
		JButton btnG5 = new JButton("AddResult");
		btnG5.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnG5.setBounds(372, 330, 89, 17);
		contentPane.add(btnG5);
		
		JButton btnG6 = new JButton("AddResult");
		btnG6.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnG6.setBounds(372, 358, 89, 17);
		contentPane.add(btnG6);
		
		JButton btnG7 = new JButton("AddResult");
		btnG7.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnG7.setBounds(372, 386, 89, 17);
		contentPane.add(btnG7);
		
		JButton btnG8 = new JButton("AddResult");
		btnG8.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnG8.setBounds(372, 414, 89, 17);
		contentPane.add(btnG8);
		
		JButton btnG9 = new JButton("AddResult");
		btnG9.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnG9.setBounds(372, 442, 89, 17);
		contentPane.add(btnG9);
		
		JButton btnG10 = new JButton("AddResult");
		btnG10.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnG10.setBounds(372, 470, 89, 17);
		contentPane.add(btnG10);
		
		//Reset Buttons----------------------------------------------------------------------------------------------------------------------------------------
		JButton resetG1 = new JButton("");
		resetG1.setForeground(Color.WHITE);
		resetG1.setBackground(Color.WHITE);
		resetG1.setBounds(471, 218, 25, 17);
		resetG1.setIcon(new ImageIcon(photo));
		contentPane.add(resetG1);
		
		JButton resetG2 = new JButton("");
		resetG2.setForeground(Color.WHITE);
		resetG2.setBackground(Color.WHITE);
		resetG2.setBounds(471, 246, 25, 17);
		resetG2.setIcon(new ImageIcon(photo));
		contentPane.add(resetG2);
		
		JButton resetG3 = new JButton("");
		resetG3.setForeground(Color.WHITE);
		resetG3.setBackground(Color.WHITE);
		resetG3.setBounds(471, 274, 25, 17);
		resetG3.setIcon(new ImageIcon(photo));
		contentPane.add(resetG3);
		
		JButton resetG4 = new JButton("");
		resetG4.setForeground(Color.WHITE);
		resetG4.setBackground(Color.WHITE);
		resetG4.setBounds(471, 302, 25, 17);
		resetG4.setIcon(new ImageIcon(photo));
		contentPane.add(resetG4);
		
		JButton resetG5 = new JButton("");
		resetG5.setForeground(Color.WHITE);
		resetG5.setBackground(Color.WHITE);
		resetG5.setBounds(471, 330, 25, 17);
		resetG5.setIcon(new ImageIcon(photo));
		contentPane.add(resetG5);
		
		JButton resetG6 = new JButton("");
		resetG6.setForeground(Color.WHITE);
		resetG6.setBackground(Color.WHITE);
		resetG6.setBounds(471, 358, 25, 17);
		resetG6.setIcon(new ImageIcon(photo));
		contentPane.add(resetG6);
		
		JButton resetG7 = new JButton("");
		resetG7.setForeground(Color.WHITE);
		resetG7.setBackground(Color.WHITE);
		resetG7.setBounds(471, 386, 25, 17);
		resetG7.setIcon(new ImageIcon(photo));
		contentPane.add(resetG7);
		
		JButton resetG8 = new JButton("");
		resetG8.setForeground(Color.WHITE);
		resetG8.setBackground(Color.WHITE);
		resetG8.setBounds(471, 414, 25, 17);
		resetG8.setIcon(new ImageIcon(photo));
		contentPane.add(resetG8);
		
		JButton resetG9 = new JButton("");
		resetG9.setForeground(Color.WHITE);
		resetG9.setBackground(Color.WHITE);
		resetG9.setBounds(471, 442, 25, 17);
		resetG9.setIcon(new ImageIcon(photo));
		contentPane.add(resetG9);
		
		JButton resetG10 = new JButton("");
		resetG10.setForeground(Color.WHITE);
		resetG10.setBackground(Color.WHITE);
		resetG10.setBounds(471, 470, 25, 17);
		resetG10.setIcon(new ImageIcon(photo));
		contentPane.add(resetG10);
		
		//PlayOff games--------------------------------------------------------------------------------------------------------------------------------------------------------------
		JPanel panelPlayoff = new JPanel();
		panelPlayoff.setBackground(new Color(173, 216, 230));
		panelPlayoff.setBounds(506, 168, 501, 334);
		contentPane.add(panelPlayoff);
		panelPlayoff.setVisible(false);
		panelPlayoff.setLayout(null);
		
		//TABLE POSITIONS-------------------------------------------------------------------------------------------------------------------------------------------------------------
		JLabel lblPosition1League = new JLabel("1");
		lblPosition1League.setOpaque(true);
		lblPosition1League.setHorizontalAlignment(SwingConstants.LEFT);
		lblPosition1League.setForeground(Color.BLACK);
		lblPosition1League.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPosition1League.setBackground(new Color(0, 204, 102));
		lblPosition1League.setBounds(20, 65, 412, 20);
		contentPane.add(lblPosition1League);
		
		JLabel lblPosition2League = new JLabel("2");
		lblPosition2League.setOpaque(true);
		lblPosition2League.setHorizontalAlignment(SwingConstants.LEFT);
		lblPosition2League.setForeground(Color.BLACK);
		lblPosition2League.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPosition2League.setBackground(Color.WHITE);
		lblPosition2League.setBounds(20, 83, 412, 20);
		contentPane.add(lblPosition2League);
		
		JLabel lblPosition3League = new JLabel("3");
		lblPosition3League.setOpaque(true);
		lblPosition3League.setHorizontalAlignment(SwingConstants.LEFT);
		lblPosition3League.setForeground(Color.BLACK);
		lblPosition3League.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPosition3League.setBackground(Color.WHITE);
		lblPosition3League.setBounds(20, 101, 412, 20);
		contentPane.add(lblPosition3League);
		
		JLabel lblPosition4League = new JLabel("4");
		lblPosition4League.setOpaque(true);
		lblPosition4League.setHorizontalAlignment(SwingConstants.LEFT);
		lblPosition4League.setForeground(Color.BLACK);
		lblPosition4League.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPosition4League.setBackground(Color.WHITE);
		lblPosition4League.setBounds(20, 119, 412, 20);
		contentPane.add(lblPosition4League);
		
		JLabel lblPosition5League = new JLabel("5");
		lblPosition5League.setOpaque(true);
		lblPosition5League.setHorizontalAlignment(SwingConstants.LEFT);
		lblPosition5League.setForeground(Color.BLACK);
		lblPosition5League.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPosition5League.setBackground(Color.WHITE);
		lblPosition5League.setBounds(20, 137, 412, 20);
		contentPane.add(lblPosition5League);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
