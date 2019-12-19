import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.NumberFormatter;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.text.NumberFormat;
import java.util.ArrayList;

import java.util.Collections;

import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;



public class Groups extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JPanel tabelaAPlayoff = new JPanel();
	JLabel lblPOG1TeamA1 = new JLabel(); JLabel lblPOG1TeamA2 = new JLabel(); JLabel lblPOG1TeamA3 = new JLabel();
	JLabel lblPOG2TeamA1 = new JLabel(); JLabel lblPOG2TeamA2 = new JLabel(); JLabel lblPOG2TeamA3 = new JLabel();
	JLabel lblPOG4TeamA1 = new JLabel(); JLabel lblPOG4TeamA2 = new JLabel(); JLabel lblPOG5TeamA2 = new JLabel(); JLabel lblPOG5TeamA3 = new JLabel();
	
	JFormattedTextField resG1POTeamA1; JFormattedTextField resG1POTeamA2; JFormattedTextField resG1POTeamA3;
	JFormattedTextField resG2POTeamA1; JFormattedTextField resG2POTeamA2; JFormattedTextField resG2POTeamA3;
	JFormattedTextField resG4POTeamA1; JFormattedTextField resG4POTeamA2; JFormattedTextField resG5POTeamA2; JFormattedTextField resG5POTeamA3;
	
	int gfTA1G1; int gfTA2G1; int gfTA3G1; int wTA1G1; int lTA1G1; int wTA2G1; int lTA2G1; int wTA3G1; int lTA3G1;
	int gfTA1G2; int gfTA2G2; int gfTA3G2; int wTA1G2; int lTA1G2; int wTA2G2; int lTA2G2; int wTA3G2; int lTA3G2;
	
	JButton btnAG1PlayOff = new JButton("AddResult"); JButton btnAG2PlayOff = new JButton("AddResult"); JButton btnAG3PlayOff = new JButton("AddResult"); 
	JButton btnAG4PlayOff = new JButton("AddResult"); JButton btnAG5PlayOff = new JButton("AddResult");
	JButton resetAG1PlayOff = new JButton(""); JButton resetAG2PlayOff = new JButton(""); JButton resetAG3PlayOff = new JButton("");
	JButton resetAG4PlayOff = new JButton(""); JButton resetAG5PlayOff = new JButton("");
	
	JPanel tabelaBPlayoff = new JPanel();
	JLabel lblPOG1TeamB1 = new JLabel(); JLabel lblPOG1TeamB2 = new JLabel(); JLabel lblPOG1TeamB3 = new JLabel();
	JLabel lblPOG2TeamB1 = new JLabel(); JLabel lblPOG2TeamB2 = new JLabel(); JLabel lblPOG2TeamB3 = new JLabel();
	JLabel lblPOG4TeamB1 = new JLabel(); JLabel lblPOG4TeamB2 = new JLabel(); JLabel lblPOG5TeamB2 = new JLabel(); JLabel lblPOG5TeamB3 = new JLabel();
	
	JFormattedTextField resG1POTeamB1; JFormattedTextField resG1POTeamB2; JFormattedTextField resG1POTeamB3;
	JFormattedTextField resG2POTeamB1; JFormattedTextField resG2POTeamB2; JFormattedTextField resG2POTeamB3;
	JFormattedTextField resG4POTeamB1; JFormattedTextField resG4POTeamB2; JFormattedTextField resG5POTeamB2; JFormattedTextField resG5POTeamB3;
	
	int gfTB1G1; int gfTB2G1; int gfTB3G1; int wTB1G1; int lTB1G1; int wTB2G1; int lTB2G1; int wTB3G1; int lTB3G1;
	int gfTB1G2; int gfTB2G2; int gfTB3G2; int wTB1G2; int lTB1G2; int wTB2G2; int lTB2G2; int wTB3G2; int lTB3G2;
	
	JButton btnBG1PlayOff = new JButton("AddResult"); JButton btnBG2PlayOff = new JButton("AddResult"); JButton btnBG3PlayOff = new JButton("AddResult"); 
	JButton btnBG4PlayOff = new JButton("AddResult"); JButton btnBG5PlayOff = new JButton("AddResult");
	JButton resetBG1PlayOff = new JButton(""); JButton resetBG2PlayOff = new JButton(""); JButton resetBG3PlayOff = new JButton("");
	JButton resetBG4PlayOff = new JButton(""); JButton resetBG5PlayOff = new JButton("");
	
	static JButton btnGrpAG4 = new JButton("AddResult");  static JButton btnGrpBG4 = new JButton("AddResult");
	static JButton btnGrpAG5 = new JButton("AddResult");  static JButton btnGrpBG5 = new JButton("AddResult");
	static JButton btnGrpAG6 = new JButton("AddResult");  static JButton btnGrpBG6 = new JButton("AddResult");
	static JButton resetAG4 = new JButton("");			  static JButton resetBG4 = new JButton("");
	static JButton resetAG5 = new JButton("");			  static JButton resetBG5 = new JButton("");
	static JButton resetAG6 = new JButton("");     		  static JButton resetBG6 = new JButton("");
		
	public static String teamA1; public static String teamA2; public static String teamA3;
	public static String teamB1; public static String teamB2; public static String teamB3;
	
	static JLabel lblGrpTeamA1 = new JLabel("New label"); static JLabel lblGrpTeamA2 = new JLabel("New label"); static JLabel lblGrpTeamA3 = new JLabel("New label");
	static JLabel lblGrpTeamB1 = new JLabel("New label"); static JLabel lblGrpTeamB2 = new JLabel("New label"); static JLabel lblGrpTeamB3 = new JLabel("New label");
	
	int wA1G1; int wA1G2; int wA1G3; int wA1G4; int dA1G1; int dA1G2; int dA1G3; int dA1G4; int lA1G1; int lA1G2; int lA1G3; int lA1G4;
	int gfA1G1; int gfA1G2; int gfA1G3; int gfA1G4; int gaA1G1; int gaA1G2; int gaA1G3; int gaA1G4;
	
	int wA2G1; int wA2G2; int wA2G3; int wA2G4; int dA2G1; int dA2G2;  int dA2G3; int dA2G4; int lA2G1; int lA2G2; int lA2G3; int lA2G4;
	int gfA2G1; int gfA2G2; int gfA2G3; int gfA2G4; int gaA2G1; int gaA2G2; int gaA2G3; int gaA2G4;
	
	int wA3G1; int wA3G2; int wA3G3; int wA3G4; int dA3G1; int dA3G2; int dA3G3; int dA3G4; int lA3G1; int lA3G2; int lA3G3; int lA3G4;
	int gfA3G1; int gfA3G2; int gfA3G3; int gfA3G4; int gaA3G1; int gaA3G2; int gaA3G3; int gaA3G4;
	
	int uwA1=wA1G1+wA1G2+wA1G3+wA1G4; int udA1=dA1G1+dA1G2+dA1G3+dA1G4;  int ulA1=lA1G1+lA1G2+lA1G3+lA1G4;
	int uwA2=wA2G1+wA2G2+wA2G3+wA2G4; int udA2=dA2G1+dA2G2+dA2G3+dA2G4;  int ulA2=lA2G1+lA2G2+lA2G3+lA2G4;
	int uwA3=wA3G1+wA3G2+wA3G3+wA3G4; int udA3=dA3G1+dA3G2+dA3G3+dA3G4;  int ulA3=lA3G1+lA3G2+lA3G3+lA3G4;
	
	int upA1=uwA1+udA1+ulA1; int ugfA1=gfA1G1+gfA1G2+gfA1G3+gfA1G4; int ugaA1=gaA1G1+gaA1G2+gaA1G3+gaA1G4; int ugdA1=ugfA1-ugaA1; int ptsuA1=3*uwA1+udA1;
	int upA2=uwA2+udA2+ulA2; int ugfA2=gfA2G1+gfA2G2+gfA2G3+gfA2G4; int ugaA2=gaA2G1+gaA2G2+gaA2G3+gaA2G4; int ugdA2=ugfA2-ugaA2; int ptsuA2=3*uwA2+udA2;
	int upA3=uwA3+udA3+ulA3; int ugfA3=gfA3G1+gfA3G2+gfA3G3+gfA3G4; int ugaA3=gaA3G1+gaA3G2+gaA3G3+gaA3G4; int ugdA3=ugfA3-ugaA3; int ptsuA3=3*uwA3+udA3;
	
	private String pA1=String.valueOf(upA1); private String wA1=String.valueOf(uwA1); private String dA1=String.valueOf(udA1); private String lA1=String.valueOf(ulA1); private String gfA1=String.valueOf(ugfA1); private String gaA1=String.valueOf(ugaA1); private String gdA1=String.valueOf(ugdA1); private String ptsA1=String.valueOf(ptsuA1);
	private String pA2=String.valueOf(upA2); private String wA2=String.valueOf(uwA2); private String dA2=String.valueOf(udA2); private String lA2=String.valueOf(ulA2); private String gfA2=String.valueOf(ugfA2); private String gaA2=String.valueOf(ugaA2); private String gdA2=String.valueOf(ugdA2); private String ptsA2=String.valueOf(ptsuA2);
	private String pA3=String.valueOf(upA3); private String wA3=String.valueOf(uwA3); private String dA3=String.valueOf(udA3); private String lA3=String.valueOf(ulA3); private String gfA3=String.valueOf(ugfA3); private String gaA3=String.valueOf(ugaA3); private String gdA3=String.valueOf(ugdA3); private String ptsA3=String.valueOf(ptsuA3);

	int wB1G1; int wB1G2; int wB1G3; int wB1G4; int dB1G1; int dB1G2; int dB1G3; int dB1G4; int lB1G1;  int lB1G2; int lB1G3; int lB1G4;
	int gfB1G1; int gfB1G2; int gfB1G3; int gfB1G4; int gaB1G1;  int gaB1G2; int gaB1G3; int gaB1G4;
	
	int wB2G1; int wB2G2; int wB2G3; int wB2G4; int dB2G1; int dB2G2; int dB2G3; int dB2G4; int lB2G1; int lB2G2; int lB2G3; int lB2G4;
	int gfB2G1; int gfB2G2; int gfB2G3; int gfB2G4; int gaB2G1; int gaB2G2; int gaB2G3; int gaB2G4;
	
	int wB3G1; int wB3G2; int wB3G3; int wB3G4; int dB3G1; int dB3G2; int dB3G3; int dB3G4; int lB3G1; int lB3G2; int lB3G3; int lB3G4;
	int gfB3G1; int gfB3G2; int gfB3G3; int gfB3G4; int gaB3G1; int gaB3G2; int gaB3G3; int gaB3G4;
	
	int uwB1=wB1G1+wB1G2+wB1G3+wB1G4; int udB1=dB1G1+dB1G2+dB1G3+dB1G4; int ulB1=lB1G1+lB1G2+lB1G3+lB1G4;
	int uwB2=wB2G1+wB2G2+wB2G3+wB2G4; int udB2=dB2G1+dB2G2+dB2G3+dB2G4; int ulB2=lB2G1+lB2G2+lB2G3+lB2G4;
	int uwB3=wB3G1+wB3G2+wB3G3+wB3G4; int udB3=dB3G1+dB3G2+dB3G3+dB3G4; int ulB3=lB3G1+lB3G2+lB3G3+lB3G4;
	
	int upB1=uwB1+udB1+ulB1; int ugfB1=gfB1G1+gfB1G2+gfB1G3+gfB1G4; int ugaB1=gaB1G1+gaB1G2+gaB1G3+gaB1G4; int ugdB1=ugfB1-ugaB1; int ptsuB1=3*uwB1+udB1;
	int upB2=uwB2+udB2+ulB2; int ugfB2=gfB2G1+gfB2G2+gfB2G3+gfB2G4; int ugaB2=gaB2G1+gaB2G2+gaB2G3+gaB2G4; int ugdB2=ugfB2-ugaB2; int ptsuB2=3*uwB2+udB2;
	int upB3=uwB3+udB3+ulB3; int ugfB3=gfB3G1+gfB3G2+gfB3G3+gfB3G4; int ugaB3=gaB3G1+gaB3G2+gaB3G3+gaB3G4; int ugdB3=ugfB3-ugaB3; int ptsuB3=3*uwB3+udB3;
	
	private String pB1=String.valueOf(upB1); private String wB1=String.valueOf(uwB1); private String dB1=String.valueOf(udB1); private String lB1=String.valueOf(ulB1); private String gfB1=String.valueOf(ugfB1); private String gaB1=String.valueOf(ugaB1); private String gdB1=String.valueOf(ugdB1); private String ptsB1=String.valueOf(ptsuB1);
	private String pB2=String.valueOf(upB2); private String wB2=String.valueOf(uwB2); private String dB2=String.valueOf(udB2); private String lB2=String.valueOf(ulB2); private String gfB2=String.valueOf(ugfB2); private String gaB2=String.valueOf(ugaB2); private String gdB2=String.valueOf(ugdB2); private String ptsB2=String.valueOf(ptsuB2);
	private String pB3=String.valueOf(upB3); private String wB3=String.valueOf(uwB3); private String dB3=String.valueOf(udB3); private String lB3=String.valueOf(ulB3); private String gfB3=String.valueOf(ugfB3); private String gaB3=String.valueOf(ugaB3); private String gdB3=String.valueOf(ugdB3); private String ptsB3=String.valueOf(ptsuB3);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Groups frame = new Groups();
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
	public Groups() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 1128, 708);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Name of tournament: "+Creator.tourName.getText()+" "+" "+" "+" "+" "+" "+"Place of tournament: "+Creator.tourPlace.getText()+" "+" "+" "+" "+" "+" "+"Date: "+Creator.dateTour);
				
				JLabel lblGroupA = new JLabel("Group A");
				lblGroupA.setBounds(141, 60, 180, 25);
				lblGroupA.setHorizontalAlignment(SwingConstants.CENTER);
				lblGroupA.setFont(new Font("Times New Roman", Font.BOLD, 15));
				contentPane.add(lblGroupA);
				
				JLabel lblGroupB = new JLabel("Group B");
				lblGroupB.setBounds(658, 60, 180, 25);
				lblGroupB.setHorizontalAlignment(SwingConstants.CENTER);
				lblGroupB.setFont(new Font("Times New Roman", Font.BOLD, 15));
				contentPane.add(lblGroupB);
				
				JLabel lblNewLabel = new JLabel("Fixtures");
				lblNewLabel.setBounds(26, 185, 352, 25);
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				contentPane.add(lblNewLabel);
				
				JLabel label = new JLabel("Fixtures");
				label.setBounds(569, 185, 352, 25);
				label.setHorizontalAlignment(SwingConstants.CENTER);
				contentPane.add(label);
				
		//FORMATIRANJE JFORMATTEDFIELDa-----------------------------------------------------------------------------------------------------------------------------
				NumberFormat format = NumberFormat.getNumberInstance();
			    NumberFormatter formatter = new NumberFormatter(format);
			    formatter.setValueClass(Integer.class);
			    formatter.setAllowsInvalid(true);
			    formatter.setCommitsOnValidEdit(true);
		
		//IMENA TIMOVA-----------------------------------------------------------------------------------------------------------
			    
			    lblGrpTeamA1.setBounds(36, 117, 125, 14);			lblGrpTeamA2.setBounds(36, 135, 125, 14);
			    lblGrpTeamA1.setText(addTeams.teamA1);				lblGrpTeamA2.setText(addTeams.teamA2);
			    contentPane.add(lblGrpTeamA1);						contentPane.add(lblGrpTeamA2);
			    
			    lblGrpTeamA3.setBounds(36, 153, 125, 14);
			    lblGrpTeamA3.setText(addTeams.teamA3);
			    contentPane.add(lblGrpTeamA3);
		
			    lblGrpTeamB1.setBounds(595, 117, 125, 14);			lblGrpTeamB2.setBounds(595, 135, 125, 14);
			    lblGrpTeamB1.setText(addTeams.teamB1);				lblGrpTeamB2.setText(addTeams.teamB2);
			    contentPane.add(lblGrpTeamB1);						contentPane.add(lblGrpTeamB2);
			    
			    lblGrpTeamB3.setBounds(595, 153, 125, 14);
			    lblGrpTeamB3.setText(addTeams.teamB3);
			    contentPane.add(lblGrpTeamB3);
		
		//TEAM B1 STATISTIKA-----------------------------------------------------------------------------------------------------		
			    JLabel lblPlayedB1 = new JLabel("P");						JLabel lblWinsB1 = new JLabel("W");
			    lblPlayedB1.setHorizontalAlignment(SwingConstants.CENTER);	lblWinsB1.setHorizontalAlignment(SwingConstants.CENTER);
			    lblPlayedB1.setFont(new Font("Tahoma", Font.BOLD, 12));		lblWinsB1.setFont(new Font("Tahoma", Font.BOLD, 12));
			    lblPlayedB1.setBounds(731, 117, 29, 14);					lblWinsB1.setBounds(764, 117, 29, 14);
			    lblPlayedB1.setText(pB1);                                   lblWinsB1.setText(wB1);
			    contentPane.add(lblPlayedB1);								contentPane.add(lblWinsB1);
		
			    JLabel lblDrawsB1 = new JLabel("D");						JLabel lblLostB1 = new JLabel("L");
			    lblDrawsB1.setHorizontalAlignment(SwingConstants.CENTER);	lblLostB1.setHorizontalAlignment(SwingConstants.CENTER);
			    lblDrawsB1.setFont(new Font("Tahoma", Font.BOLD, 12));  	lblLostB1.setFont(new Font("Tahoma", Font.BOLD, 12));
			    lblDrawsB1.setBounds(797, 117, 29, 14);						lblLostB1.setBounds(830, 117, 29, 14);
			    lblDrawsB1.setText(dB1); 									lblLostB1.setText(lB1);
			    contentPane.add(lblDrawsB1);								contentPane.add(lblLostB1);
		
			    JLabel lblGFB1 = new JLabel("GF");							JLabel lblGAB1 = new JLabel("GA");							
			    lblGFB1.setHorizontalAlignment(SwingConstants.CENTER);		lblGAB1.setHorizontalAlignment(SwingConstants.CENTER);		
			    lblGFB1.setFont(new Font("Tahoma", Font.BOLD, 12));			lblGAB1.setFont(new Font("Tahoma", Font.BOLD, 12));			
			    lblGFB1.setBounds(863, 117, 29, 14);						lblGAB1.setBounds(896, 117, 29, 14);
			    lblGFB1.setText(gfB1); 										lblGAB1.setText(gaB1);
			    contentPane.add(lblGFB1);									contentPane.add(lblGAB1);									
		
			    JLabel lblGDB1 = new JLabel("GD");							JLabel lblPtsB1 = new JLabel("PTS");
			    lblGDB1.setHorizontalAlignment(SwingConstants.CENTER);		lblPtsB1.setHorizontalAlignment(SwingConstants.CENTER);
			    lblGDB1.setFont(new Font("Tahoma", Font.BOLD, 12));			lblPtsB1.setFont(new Font("Tahoma", Font.BOLD, 12));
			    lblGDB1.setBounds(929, 117, 29, 14);						lblPtsB1.setBounds(962, 117, 29, 14);
			    lblGDB1.setText(gdB1); 										lblPtsB1.setText(ptsB1);
			    contentPane.add(lblGDB1);									contentPane.add(lblPtsB1);
		
		//TEAM B2 STATISTIKA-----------------------------------------------------------------------------------------------------
			    JLabel lblPlayedB2 = new JLabel("P");							JLabel lblWinsB2 = new JLabel("W");
			    lblPlayedB2.setHorizontalAlignment(SwingConstants.CENTER);		lblWinsB2.setHorizontalAlignment(SwingConstants.CENTER);
			    lblPlayedB2.setFont(new Font("Tahoma", Font.BOLD, 12));			lblWinsB2.setFont(new Font("Tahoma", Font.BOLD, 12));
			    lblPlayedB2.setBounds(731, 135, 29, 14);						lblWinsB2.setBounds(764, 135, 29, 14);
			    lblPlayedB2.setText(pB2);                                   	lblWinsB2.setText(wB2);
			    contentPane.add(lblPlayedB2);									contentPane.add(lblWinsB2);
		
			    JLabel lblDrawsB2 = new JLabel("D");							JLabel lblLostB2 = new JLabel("L");
			    lblDrawsB2.setHorizontalAlignment(SwingConstants.CENTER);		lblLostB2.setHorizontalAlignment(SwingConstants.CENTER);
			    lblDrawsB2.setFont(new Font("Tahoma", Font.BOLD, 12));			lblLostB2.setFont(new Font("Tahoma", Font.BOLD, 12));
			    lblDrawsB2.setBounds(797, 135, 29, 14);							lblLostB2.setBounds(830, 135, 29, 14);
			    lblDrawsB2.setText(dB2); 										lblLostB2.setText(lB2);
			    contentPane.add(lblDrawsB2);									contentPane.add(lblLostB2);
		
			    JLabel lblGFB2 = new JLabel("GF");								JLabel lblGAB2 = new JLabel("GA");
			    lblGFB2.setHorizontalAlignment(SwingConstants.CENTER);			lblGAB2.setHorizontalAlignment(SwingConstants.CENTER);
			    lblGFB2.setFont(new Font("Tahoma", Font.BOLD, 12));				lblGAB2.setFont(new Font("Tahoma", Font.BOLD, 12));
			    lblGFB2.setBounds(863, 135, 29, 14);							lblGAB2.setBounds(896, 135, 29, 14);
			    lblGFB2.setText(gfB2); 											lblGAB2.setText(gaB2);
			    contentPane.add(lblGFB2);										contentPane.add(lblGAB2);
		
			    JLabel lblGDB2 = new JLabel("GD");								JLabel lblPtsB2 = new JLabel("PTS");
			    lblGDB2.setHorizontalAlignment(SwingConstants.CENTER);			lblPtsB2.setHorizontalAlignment(SwingConstants.CENTER);
			    lblGDB2.setFont(new Font("Tahoma", Font.BOLD, 12));				lblPtsB2.setFont(new Font("Tahoma", Font.BOLD, 12));
			    lblGDB2.setBounds(929, 135, 29, 14);							lblPtsB2.setBounds(962, 135, 29, 14);
			    lblGDB2.setText(gdB2); 											lblPtsB2.setText(ptsB2);
			    contentPane.add(lblGDB2);										contentPane.add(lblPtsB2);
		
		//TEAM B3 STATISTIKA-----------------------------------------------------------------------------------------------------
			    JLabel lblPlayedB3 = new JLabel("P");						JLabel lblWinsB3 = new JLabel("W");
			    lblPlayedB3.setHorizontalAlignment(SwingConstants.CENTER);	lblWinsB3.setHorizontalAlignment(SwingConstants.CENTER);
			    lblPlayedB3.setFont(new Font("Tahoma", Font.BOLD, 12));		lblWinsB3.setFont(new Font("Tahoma", Font.BOLD, 12));
			    lblPlayedB3.setBounds(731, 153, 29, 14);					lblWinsB3.setBounds(764, 153, 29, 14);
			    lblPlayedB3.setText(pB3);                                   lblWinsB3.setText(wB3);
			    contentPane.add(lblPlayedB3);								contentPane.add(lblWinsB3);
		
			    JLabel lblDrawsB3 = new JLabel("D");						JLabel lblLostB3 = new JLabel("L");
			    lblDrawsB3.setHorizontalAlignment(SwingConstants.CENTER);	lblLostB3.setHorizontalAlignment(SwingConstants.CENTER);
			    lblDrawsB3.setFont(new Font("Tahoma", Font.BOLD, 12));		lblLostB3.setFont(new Font("Tahoma", Font.BOLD, 12));
			    lblDrawsB3.setBounds(797, 153, 29, 14);						lblLostB3.setBounds(830, 153, 29, 14);
			    lblDrawsB3.setText(dB3); 									lblLostB3.setText(lB3);
			    contentPane.add(lblDrawsB3);								contentPane.add(lblLostB3);
		
			    JLabel lblGFB3 = new JLabel("GF");							JLabel lblGAB3 = new JLabel("GA");
			    lblGFB3.setHorizontalAlignment(SwingConstants.CENTER);		lblGAB3.setHorizontalAlignment(SwingConstants.CENTER);	
			    lblGFB3.setFont(new Font("Tahoma", Font.BOLD, 12));			lblGAB3.setFont(new Font("Tahoma", Font.BOLD, 12));
			    lblGFB3.setBounds(863, 153, 29, 14);						lblGAB3.setBounds(896, 153, 29, 14);
			    lblGFB3.setText(gfB3); 										lblGAB3.setText(gaB3);
			    contentPane.add(lblGFB3);									contentPane.add(lblGAB3);
		
			    JLabel lblGDB3 = new JLabel("GD");							JLabel lblPtsB3 = new JLabel("PTS");
			    lblGDB3.setHorizontalAlignment(SwingConstants.CENTER);		lblPtsB3.setHorizontalAlignment(SwingConstants.CENTER);
			    lblGDB3.setFont(new Font("Tahoma", Font.BOLD, 12));			lblPtsB3.setFont(new Font("Tahoma", Font.BOLD, 12));
			    lblGDB3.setBounds(929, 153, 29, 14);						lblPtsB3.setBounds(962, 153, 29, 14);
			    lblGDB3.setText(gdB3); 										lblPtsB3.setText(ptsB3);
			    contentPane.add(lblGDB3);									contentPane.add(lblPtsB3);
		
		//TEAM A3 STATISTIKA-----------------------------------------------------------------------------------------------------
			    JLabel lblPlayedA3 = new JLabel("P");							JLabel lblWinsA3 = new JLabel("W");
			    lblPlayedA3.setHorizontalAlignment(SwingConstants.CENTER);		lblWinsA3.setHorizontalAlignment(SwingConstants.CENTER);
			    lblPlayedA3.setFont(new Font("Tahoma", Font.BOLD, 12));			lblWinsA3.setFont(new Font("Tahoma", Font.BOLD, 12));
			    lblPlayedA3.setBounds(171, 153, 29, 14);						lblWinsA3.setBounds(204, 153, 29, 14);
			    lblPlayedA3.setText(pA3); 										lblWinsA3.setText(wA3);
			    contentPane.add(lblPlayedA3);									contentPane.add(lblWinsA3);
		
			    JLabel lblDrawsA3 = new JLabel("D");							JLabel lblLostA3 = new JLabel("L");
			    lblDrawsA3.setHorizontalAlignment(SwingConstants.CENTER);		lblLostA3.setHorizontalAlignment(SwingConstants.CENTER);
			    lblDrawsA3.setFont(new Font("Tahoma", Font.BOLD, 12));			lblLostA3.setFont(new Font("Tahoma", Font.BOLD, 12));
			    lblDrawsA3.setBounds(237, 153, 29, 14);							lblLostA3.setBounds(270, 153, 29, 14);
			    lblDrawsA3.setText(dA3); 										lblLostA3.setText(lA3);
			    contentPane.add(lblDrawsA3);									contentPane.add(lblLostA3);
		
			    JLabel lblGFA3 = new JLabel("GF");								JLabel lblGAA3 = new JLabel("GA");
			    lblGFA3.setHorizontalAlignment(SwingConstants.CENTER);			lblGAA3.setHorizontalAlignment(SwingConstants.CENTER);
			    lblGFA3.setFont(new Font("Tahoma", Font.BOLD, 12));				lblGAA3.setFont(new Font("Tahoma", Font.BOLD, 12));
			    lblGFA3.setBounds(303, 153, 29, 14);							lblGAA3.setBounds(336, 153, 29, 14);
			    lblGFA3.setText(gfA3); 											lblGAA3.setText(gaA3);
			    contentPane.add(lblGFA3);										contentPane.add(lblGAA3);
		
			    JLabel lblGDA3 = new JLabel("GD");								JLabel lblPtsA3 = new JLabel("PTS");
			    lblGDA3.setHorizontalAlignment(SwingConstants.CENTER);			lblPtsA3.setHorizontalAlignment(SwingConstants.CENTER);
			    lblGDA3.setFont(new Font("Tahoma", Font.BOLD, 12));				lblPtsA3.setFont(new Font("Tahoma", Font.BOLD, 12));
			    lblGDA3.setBounds(369, 153, 29, 14);							lblPtsA3.setBounds(402, 153, 29, 14);
			    lblGDA3.setText(gdA3); 											lblPtsA3.setText(ptsA3);
			    contentPane.add(lblGDA3);										contentPane.add(lblPtsA3);
		
		//TEAM A2 STATISTIKA----------------------------------------------------------------------------------------------------
			    JLabel lblPlayedA2 = new JLabel("P");							JLabel lblWinsA2 = new JLabel("W");
			    lblPlayedA2.setHorizontalAlignment(SwingConstants.CENTER);		lblWinsA2.setHorizontalAlignment(SwingConstants.CENTER);
			    lblPlayedA2.setFont(new Font("Tahoma", Font.BOLD, 12));			lblWinsA2.setFont(new Font("Tahoma", Font.BOLD, 12));
			    lblPlayedA2.setBounds(171, 135, 29, 14);						lblWinsA2.setBounds(204, 135, 29, 14);
			    lblPlayedA2.setText(pA2); 										lblWinsA2.setText(wA2);
			    contentPane.add(lblPlayedA2);									contentPane.add(lblWinsA2);
		
			    JLabel lblDrawsA2 = new JLabel("D");							JLabel lblLostA2 = new JLabel("L");
			    lblDrawsA2.setHorizontalAlignment(SwingConstants.CENTER);		lblLostA2.setHorizontalAlignment(SwingConstants.CENTER);
			    lblDrawsA2.setFont(new Font("Tahoma", Font.BOLD, 12));			lblLostA2.setFont(new Font("Tahoma", Font.BOLD, 12));
			    lblDrawsA2.setBounds(237, 135, 29, 14);							lblLostA2.setBounds(270, 135, 29, 14);
			    lblDrawsA2.setText(dA2); 										lblLostA2.setText(lA2);
			    contentPane.add(lblDrawsA2);									contentPane.add(lblLostA2);
		
			    JLabel lblGFA2 = new JLabel("GF");								JLabel lblGAA2 = new JLabel("GA");
			    lblGFA2.setHorizontalAlignment(SwingConstants.CENTER);			lblGAA2.setHorizontalAlignment(SwingConstants.CENTER);
			    lblGFA2.setFont(new Font("Tahoma", Font.BOLD, 12));				lblGAA2.setFont(new Font("Tahoma", Font.BOLD, 12));
			    lblGFA2.setBounds(303, 135, 29, 14);							lblGAA2.setBounds(336, 135, 29, 14);
			    lblGFA2.setText(gfA2); 											lblGAA2.setText(gaA2);
			    contentPane.add(lblGFA2);										contentPane.add(lblGAA2);		
		
			    JLabel lblGDA2 = new JLabel("GD");								JLabel lblPtsA2 = new JLabel("PTS");
			    lblGDA2.setHorizontalAlignment(SwingConstants.CENTER);			lblPtsA2.setHorizontalAlignment(SwingConstants.CENTER);
			    lblGDA2.setFont(new Font("Tahoma", Font.BOLD, 12));				lblPtsA2.setFont(new Font("Tahoma", Font.BOLD, 12));
			    lblGDA2.setBounds(369, 135, 29, 14);							lblPtsA2.setBounds(402, 135, 29, 14);
			    lblGDA2.setText(gdA2); 											lblPtsA2.setText(ptsA2);
			    contentPane.add(lblGDA2);										contentPane.add(lblPtsA2);
		
		//TEAM A1 STATISTIKA----------------------------------------------------------------------------------------------------
			    JLabel lblPlayedA1 = new JLabel("P");							JLabel lblWinsA1 = new JLabel("W");
			    lblPlayedA1.setHorizontalAlignment(SwingConstants.CENTER);		lblWinsA1.setHorizontalAlignment(SwingConstants.CENTER);
			    lblPlayedA1.setFont(new Font("Tahoma", Font.BOLD, 12));			lblWinsA1.setFont(new Font("Tahoma", Font.BOLD, 12));
			    lblPlayedA1.setBounds(171, 117, 29, 14);						lblWinsA1.setBounds(204, 117, 29, 14);
			    lblPlayedA1.setText(pA1); 										lblWinsA1.setText(wA1);
			    contentPane.add(lblPlayedA1);									contentPane.add(lblWinsA1);
		
			    JLabel lblDrawsA1 = new JLabel("D");							JLabel lblLostA1 = new JLabel("L");
			    lblDrawsA1.setHorizontalAlignment(SwingConstants.CENTER);		lblLostA1.setHorizontalAlignment(SwingConstants.CENTER);
			    lblDrawsA1.setFont(new Font("Tahoma", Font.BOLD, 12));			lblLostA1.setFont(new Font("Tahoma", Font.BOLD, 12));
			    lblDrawsA1.setBounds(237, 117, 29, 14);							lblLostA1.setBounds(270, 117, 29, 14);
			    lblDrawsA1.setText(dA1); 										lblLostA1.setText(lA1);
			    contentPane.add(lblDrawsA1);									contentPane.add(lblLostA1);
		
			    JLabel lblGFA1 = new JLabel("GF");								JLabel lblGAA1 = new JLabel("GA");
			    lblGFA1.setHorizontalAlignment(SwingConstants.CENTER);			lblGAA1.setHorizontalAlignment(SwingConstants.CENTER);
			    lblGFA1.setFont(new Font("Tahoma", Font.BOLD, 12));				lblGAA1.setFont(new Font("Tahoma", Font.BOLD, 12));
			    lblGFA1.setBounds(303, 117, 29, 14);							lblGAA1.setBounds(336, 117, 29, 14);
			    lblGFA1.setText(gfA1); 											lblGAA1.setText(gaA1);
			    contentPane.add(lblGFA1);										contentPane.add(lblGAA1);
		
			    JLabel lblGDA1 = new JLabel("GD");								JLabel lblPtsA1 = new JLabel("PTS");
			    lblGDA1.setHorizontalAlignment(SwingConstants.CENTER);			lblPtsA1.setHorizontalAlignment(SwingConstants.CENTER);
			    lblGDA1.setFont(new Font("Tahoma", Font.BOLD, 12));				lblPtsA1.setFont(new Font("Tahoma", Font.BOLD, 12));
			    lblGDA1.setBounds(369, 117, 29, 14);							lblPtsA1.setBounds(402, 117, 29, 14);
			    lblGDA1.setText(gdA1);  										lblPtsA1.setText(ptsA1);
			    contentPane.add(lblGDA1);										contentPane.add(lblPtsA1);
		
		//TABELA A--------------------------------------------------------------------------------------------------------------------------------------------------
			    JLabel lblPositionA = new JLabel("#");								JLabel lblTeamA = new JLabel("Team");
			    lblPositionA.setFont(new Font("Tahoma", Font.BOLD, 12));			lblTeamA.setHorizontalAlignment(SwingConstants.CENTER);
			    lblPositionA.setHorizontalAlignment(SwingConstants.CENTER);			lblTeamA.setFont(new Font("Tahoma", Font.BOLD, 12));
			    lblPositionA.setBounds(10, 89, 29, 14);							lblTeamA.setBounds(49, 89, 71, 14);
			    contentPane.add(lblPositionA);										contentPane.add(lblTeamA);
		  
			    JLabel lblPA = new JLabel("P");										JLabel lblWA = new JLabel("W");
			    lblPA.setHorizontalAlignment(SwingConstants.CENTER);				lblWA.setHorizontalAlignment(SwingConstants.CENTER);
			    lblPA.setFont(new Font("Tahoma", Font.BOLD, 12));					lblWA.setFont(new Font("Tahoma", Font.BOLD, 12));
			    lblPA.setBounds(172, 89, 29, 14);									lblWA.setBounds(205, 89, 29, 14);
			    contentPane.add(lblPA);												contentPane.add(lblWA);
		  
			    JLabel lblDA = new JLabel("D");										JLabel lblLA = new JLabel("L");
			    lblDA.setHorizontalAlignment(SwingConstants.CENTER);				lblLA.setHorizontalAlignment(SwingConstants.CENTER);
			    lblDA.setFont(new Font("Tahoma", Font.BOLD, 12));					lblLA.setFont(new Font("Tahoma", Font.BOLD, 12));
			    lblDA.setBounds(238, 89, 29, 14);									lblLA.setBounds(271, 89, 29, 14);
			    contentPane.add(lblDA);												contentPane.add(lblLA);
		  
			    JLabel lblGfA = new JLabel("GF");									JLabel lblGaA = new JLabel("GA");
			    lblGfA.setHorizontalAlignment(SwingConstants.CENTER);				lblGaA.setHorizontalAlignment(SwingConstants.CENTER);
			    lblGfA.setFont(new Font("Tahoma", Font.BOLD, 12));					lblGaA.setFont(new Font("Tahoma", Font.BOLD, 12));
			    lblGfA.setBounds(304, 89, 29, 14);									lblGaA.setBounds(337, 89, 29, 14);
			    contentPane.add(lblGfA);											contentPane.add(lblGaA);
		  
			    JLabel lblGdA = new JLabel("GD");									JLabel lblPtsA = new JLabel("PTS");
			    lblGdA.setHorizontalAlignment(SwingConstants.CENTER);				lblPtsA.setHorizontalAlignment(SwingConstants.CENTER);
			    lblGdA.setFont(new Font("Tahoma", Font.BOLD, 12));					lblPtsA.setFont(new Font("Tahoma", Font.BOLD, 12));
			    lblGdA.setBounds(370, 89, 29, 14);									lblPtsA.setBounds(403, 89, 29, 14);
			    contentPane.add(lblGdA);											contentPane.add(lblPtsA);
		  
			    JLabel lblPosition1GrpA = new JLabel("1");							JLabel lblPosition2GrpA = new JLabel("2");
			    lblPosition1GrpA.setOpaque(true);									lblPosition2GrpA.setOpaque(true);
			    lblPosition1GrpA.setForeground(new Color(0, 0, 0));					lblPosition2GrpA.setHorizontalAlignment(SwingConstants.LEFT);
			    lblPosition1GrpA.setBackground(new Color(0, 204, 102));				lblPosition2GrpA.setForeground(Color.BLACK);
			    lblPosition1GrpA.setFont(new Font("Tahoma", Font.BOLD, 12));		lblPosition2GrpA.setFont(new Font("Tahoma", Font.BOLD, 12));
			    lblPosition1GrpA.setHorizontalAlignment(SwingConstants.LEFT);		lblPosition2GrpA.setBackground(new Color(0, 204, 102));
			    lblPosition1GrpA.setBounds(20, 114, 412, 20);						lblPosition2GrpA.setBounds(20, 132, 412, 20);
			    contentPane.add(lblPosition1GrpA);									contentPane.add(lblPosition2GrpA);
		  
			    JLabel lblPosition3GrpA = new JLabel("3");
			    lblPosition3GrpA.setOpaque(true);
			    lblPosition3GrpA.setHorizontalAlignment(SwingConstants.LEFT);
			    lblPosition3GrpA.setForeground(Color.BLACK);
			    lblPosition3GrpA.setFont(new Font("Tahoma", Font.BOLD, 12));
			    lblPosition3GrpA.setBackground(Color.WHITE);
			    lblPosition3GrpA.setBounds(20, 150, 412, 20);
			    contentPane.add(lblPosition3GrpA);
		  
		  //REZULTATI A-------------------------------------------------------------------------------------------------------------------------------------
			    JFormattedTextField resultA1G1 = new JFormattedTextField(formatter);  JFormattedTextField resultA1G2 = new JFormattedTextField(formatter);
			    resultA1G1.setHorizontalAlignment(SwingConstants.CENTER);             resultA1G2.setHorizontalAlignment(SwingConstants.CENTER);
			    resultA1G1.setBounds(172, 218, 23, 17);								  resultA1G2.setBounds(205, 246, 23, 17);
			    contentPane.add(resultA1G1);										  contentPane.add(resultA1G2);
  	  	    	  	  
			    JFormattedTextField resultA2G1 = new JFormattedTextField(formatter);  JFormattedTextField resultA2G2 = new JFormattedTextField(formatter);
			    resultA2G1.setHorizontalAlignment(SwingConstants.CENTER);			  resultA2G2.setHorizontalAlignment(SwingConstants.CENTER);
			    resultA2G1.setBounds(205, 218, 23, 17);								  resultA2G2.setBounds(172, 274, 23, 17);
			    contentPane.add(resultA2G1);										  contentPane.add(resultA2G2);
		  		  
			    JFormattedTextField resultA3G1 = new JFormattedTextField(formatter);  JFormattedTextField resultA3G2 = new JFormattedTextField(formatter);
			    resultA3G1.setHorizontalAlignment(SwingConstants.CENTER);			  resultA3G2.setHorizontalAlignment(SwingConstants.CENTER);
			    resultA3G1.setBounds(172, 246, 23, 17);								  resultA3G2.setBounds(205, 274, 23, 17);
			    contentPane.add(resultA3G1);										  contentPane.add(resultA3G2);
		  
			    JFormattedTextField resultA2G3 = new JFormattedTextField(formatter);  JFormattedTextField resultA2G4 = new JFormattedTextField(formatter);
			    resultA2G3.setHorizontalAlignment(SwingConstants.CENTER);			  resultA2G4.setHorizontalAlignment(SwingConstants.CENTER);
			    resultA2G3.setBounds(172, 302, 23, 17);								  resultA2G4.setBounds(205, 358, 23, 17);
			    contentPane.add(resultA2G3);										  contentPane.add(resultA2G4);
			    if(Creator.rdbtnNo.isSelected()) { resultA2G3.setVisible(false); }    if(Creator.rdbtnNo.isSelected()) { resultA2G4.setVisible(false);}
			
			    JFormattedTextField resultA3G3 = new JFormattedTextField(formatter);  JFormattedTextField resultA3G4 = new JFormattedTextField(formatter);
			    resultA3G3.setHorizontalAlignment(SwingConstants.CENTER);			  resultA3G4.setHorizontalAlignment(SwingConstants.CENTER);
			    resultA3G3.setBounds(205, 330, 23, 17);								  resultA3G4.setBounds(172, 358, 23, 17);
			    contentPane.add(resultA3G3);										  contentPane.add(resultA3G4);
			    if(Creator.rdbtnNo.isSelected()) { resultA3G3.setVisible(false); }    if(Creator.rdbtnNo.isSelected()) { resultA3G4.setVisible(false);}
			  
			    JFormattedTextField resultA1G3 = new JFormattedTextField(formatter);  JFormattedTextField resultA1G4 = new JFormattedTextField(formatter);
			    resultA1G3.setHorizontalAlignment(SwingConstants.CENTER);			  resultA1G4.setHorizontalAlignment(SwingConstants.CENTER);
			    resultA1G3.setBounds(205, 302, 23, 17);								  resultA1G4.setBounds(172, 330, 23, 17);
			    contentPane.add(resultA1G3);										  contentPane.add(resultA1G4);
			    if(Creator.rdbtnNo.isSelected()) { resultA1G3.setVisible(false); }    if(Creator.rdbtnNo.isSelected()) { resultA1G4.setVisible(false);}
		  
			    JLabel lblTeamA1G1 = new JLabel("New label"); 						JLabel lblTeamA1G2 = new JLabel("New label");
			    lblTeamA1G1.setHorizontalAlignment(SwingConstants.CENTER);			lblTeamA1G2.setHorizontalAlignment(SwingConstants.CENTER);
			    lblTeamA1G1.setBounds(26, 218, 118, 14);      						lblTeamA1G2.setBounds(250, 246, 118, 14);
			    lblTeamA1G1.setText(addTeams.teamA1);  				  				lblTeamA1G2.setText(addTeams.teamA1);
			    contentPane.add(lblTeamA1G1); 				  						contentPane.add(lblTeamA1G2);
	        
			    JLabel lblTeamA2G1 = new JLabel("New label"); 						JLabel lblTeamA2G2 = new JLabel("New label");
			    lblTeamA2G1.setHorizontalAlignment(SwingConstants.CENTER);			lblTeamA2G2.setHorizontalAlignment(SwingConstants.CENTER);
			    lblTeamA2G1.setBounds(250, 218, 118, 14);     						lblTeamA2G2.setBounds(26, 274, 118, 14);
			    lblTeamA2G1.setText(addTeams.teamA2);				  				lblTeamA2G2.setText(addTeams.teamA2);
			    contentPane.add(lblTeamA2G1);                				    	contentPane.add(lblTeamA2G2);
	        	        
			    JLabel lblTeamA3G1 = new JLabel("New label"); 						JLabel lblTeamA3G2 = new JLabel("New label");
			    lblTeamA3G1.setHorizontalAlignment(SwingConstants.CENTER);			lblTeamA3G2.setHorizontalAlignment(SwingConstants.CENTER);
			    lblTeamA3G1.setBounds(26, 246, 118, 14);      						lblTeamA3G2.setBounds(250, 274, 118, 14);
			    lblTeamA3G1.setText(addTeams.teamA3);  				  				lblTeamA3G2.setText(addTeams.teamA3);
			    contentPane.add(lblTeamA3G1);                 						contentPane.add(lblTeamA3G2);
	      
			    JLabel lblTeamA2G3 = new JLabel((String) null);						JLabel lblTeamA2G4 = new JLabel((String) null);
			    lblTeamA2G3.setHorizontalAlignment(SwingConstants.CENTER);			lblTeamA2G4.setHorizontalAlignment(SwingConstants.CENTER);
			    lblTeamA2G3.setBounds(26, 302, 118, 14);							lblTeamA2G4.setBounds(250, 358, 118, 14);
			    lblTeamA2G3.setText(addTeams.teamA2);								lblTeamA2G4.setText(addTeams.teamA2);
			    contentPane.add(lblTeamA2G3);										contentPane.add(lblTeamA2G4);
			    if(Creator.rdbtnNo.isSelected()) { lblTeamA2G3.setVisible(false); } if(Creator.rdbtnNo.isSelected()) { lblTeamA2G4.setVisible(false);}
			  
			    JLabel lblTeamA3G3 = new JLabel((String) null);						JLabel lblTeamA3G4 = new JLabel((String) null);
			    lblTeamA3G3.setHorizontalAlignment(SwingConstants.CENTER);			lblTeamA3G4.setHorizontalAlignment(SwingConstants.CENTER);
			    lblTeamA3G3.setBounds(250, 330, 118, 14);							lblTeamA3G4.setBounds(26, 358, 118, 14);
			    lblTeamA3G3.setText(addTeams.teamA3);								lblTeamA3G4.setText(addTeams.teamA3);
			    contentPane.add(lblTeamA3G3);										contentPane.add(lblTeamA3G4);
			    if(Creator.rdbtnNo.isSelected()) { lblTeamA3G3.setVisible(false); } if(Creator.rdbtnNo.isSelected()) { lblTeamA3G4.setVisible(false);}
			  
			    JLabel lblTeamA1G3 = new JLabel((String) null);						JLabel lblTeamA1G4 = new JLabel((String) null);
			    lblTeamA1G3.setHorizontalAlignment(SwingConstants.CENTER);			lblTeamA1G4.setHorizontalAlignment(SwingConstants.CENTER);
			    lblTeamA1G3.setBounds(250, 302, 118, 14);							lblTeamA1G4.setBounds(26, 330, 118, 14);
			    lblTeamA1G3.setText(addTeams.teamA1); 								lblTeamA1G4.setText(addTeams.teamA1);
			    contentPane.add(lblTeamA1G3);										contentPane.add(lblTeamA1G4);
			    if(Creator.rdbtnNo.isSelected()) { lblTeamA1G3.setVisible(false); } if(Creator.rdbtnNo.isSelected()) { lblTeamA1G4.setVisible(false);}
	      
			    JButton btnGrpAG1 = new JButton("AddResult");
			    btnGrpAG1.setBounds(378, 218, 89, 17);
			    btnGrpAG1.setFont(new Font("Tahoma", Font.BOLD, 10));
			    contentPane.add(btnGrpAG1);
			    btnGrpAG1.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
	        		gfA1G1=Integer.parseInt(resultA1G1.getText());
	        		gfA2G1=Integer.parseInt(resultA2G1.getText());
	          		
	          		if(gfA1G1>gfA2G1) {
	          			wA1G1=1; dA1G1=0; lA1G1=0; uwA1=wA1G1+wA1G2+wA1G3+wA1G4; udA1=dA1G1+dA1G2+dA1G3+dA1G4; ulA1=lA1G1+lA1G2+lA1G3+lA1G4; upA1=uwA1+udA1+ulA1; ptsuA1=3*uwA1+udA1;
	          			wA2G1=0; dA2G1=0; lA2G1=1; uwA2=wA2G1+wA2G2+wA2G3+wA2G4; udA2=dA2G1+dA2G2+dA2G3+dA2G4; ulA2=lA2G1+lA2G2+lA2G3+lA2G4; upA2=uwA2+udA2+ulA2; ptsuA2=3*uwA2+udA2;
         			}
	          		else if(gfA1G1<gfA2G1) {
	          			wA1G1=0; dA1G1=0; lA1G1=1; uwA1=wA1G1+wA1G2+wA1G3+wA1G4; udA1=dA1G1+dA1G2+dA1G3+dA1G4; ulA1=lA1G1+lA1G2+lA1G3+lA1G4; upA1=uwA1+udA1+ulA1; ptsuA1=3*uwA1+udA1; 
	          			wA2G1=1; dA2G1=0; lA2G1=0; uwA2=wA2G1+wA2G2+wA2G3+wA2G4; udA2=dA2G1+dA2G2+dA2G3+dA2G4; ulA2=lA2G1+lA2G2+lA2G3+lA2G4; upA2=uwA2+udA2+ulA2; ptsuA2=3*uwA2+udA2;
	          		}
	          		else if(gfA1G1==gfA2G1) {
	          			dA1G1=1; wA1G1=0; lA1G1=0; uwA1=wA1G1+wA1G2+wA1G3+wA1G4; udA1=dA1G1+dA1G2+dA1G3+dA1G4; ulA1=lA1G1+lA1G2+lA1G3+lA1G4; upA1=uwA1+udA1+ulA1; ptsuA1=3*uwA1+udA1;
	          			dA2G1=1; wA2G1=0; lA2G1=0; uwA2=wA2G1+wA2G2+wA2G3+wA2G4; udA2=dA2G1+dA2G2+dA2G3+dA2G4; ulA2=lA2G1+lA2G2+lA2G3+lA2G4; upA2=uwA2+udA2+ulA2; ptsuA2=3*uwA2+udA2;
	          		}
	          		btnGrpAG1.setEnabled(false);
	          		resultA1G1.setEditable(false);
	          		resultA2G1.setEditable(false);
	          		
	          		ArrayList<TableSort> ar = new ArrayList<TableSort>();
	          			ar.add(new TableSort(String.valueOf(addTeams.teamA1),upA1,uwA1,udA1,ulA1,gfA1G1+gfA1G2+gfA1G3+gfA1G4,gfA2G1+gfA3G1+gfA2G3+gfA3G3,(gfA1G1+gfA1G2+gfA1G3+gfA1G4)-(gfA2G1+gfA3G1+gfA2G3+gfA3G3),ptsuA1));
	          			ar.add(new TableSort(String.valueOf(addTeams.teamA2),upA2,uwA2,udA2,ulA2,gfA2G1+gfA2G2+gfA2G3+gfA2G4,gfA1G1+gfA3G2+gfA1G3+gfA3G4,(gfA2G1+gfA2G2+gfA2G3+gfA2G4)-(gfA1G1+gfA3G2+gfA1G3+gfA3G4),ptsuA2));
	          			ar.add(new TableSort(String.valueOf(addTeams.teamA3),upA3,uwA3,udA3,ulA3,gfA3G1+gfA3G2+gfA3G3+gfA3G4,gfA1G2+gfA2G2+gfA1G4+gfA2G4,(gfA3G1+gfA3G2+gfA3G3+gfA3G4)-(gfA1G2+gfA2G2+gfA1G4+gfA2G4),ptsuA3));
	          			
	          			Collections.sort(ar, new SortByPts());
	          			
	          			lblGrpTeamA1.setText(ar.get(0).getteamName()); lblPlayedA1.setText(String.valueOf(ar.get(0).getPlayed())); lblWinsA1.setText(String.valueOf(ar.get(0).getWins())); lblDrawsA1.setText(String.valueOf(ar.get(0).getDraws()));   lblLostA1.setText(String.valueOf(ar.get(0).getLoses())); lblGFA1.setText(String.valueOf(ar.get(0).getGF())); lblGAA1.setText(String.valueOf(ar.get(0).getGA())); lblGDA1.setText(String.valueOf(ar.get(0).getGD())); lblPtsA1.setText(String.valueOf(ar.get(0).getPoints()));
	          			lblGrpTeamA2.setText(ar.get(1).getteamName()); lblPlayedA2.setText(String.valueOf(ar.get(1).getPlayed())); lblWinsA2.setText(String.valueOf(ar.get(1).getWins())); lblDrawsA2.setText(String.valueOf(ar.get(1).getDraws()));   lblLostA2.setText(String.valueOf(ar.get(1).getLoses())); lblGFA2.setText(String.valueOf(ar.get(1).getGF())); lblGAA2.setText(String.valueOf(ar.get(1).getGA())); lblGDA2.setText(String.valueOf(ar.get(1).getGD())); lblPtsA2.setText(String.valueOf(ar.get(1).getPoints()));
	          			lblGrpTeamA3.setText(ar.get(2).getteamName()); lblPlayedA3.setText(String.valueOf(ar.get(2).getPlayed())); lblWinsA3.setText(String.valueOf(ar.get(2).getWins())); lblDrawsA3.setText(String.valueOf(ar.get(2).getDraws()));   lblLostA3.setText(String.valueOf(ar.get(2).getLoses())); lblGFA3.setText(String.valueOf(ar.get(2).getGF())); lblGAA3.setText(String.valueOf(ar.get(2).getGA())); lblGDA3.setText(String.valueOf(ar.get(2).getGD())); lblPtsA3.setText(String.valueOf(ar.get(2).getPoints()));
	          			 
	          			if(Creator.rdbtnNo.isSelected() && 
	              				ar.get(0).getPoints()==ar.get(1).getPoints() && ar.get(0).getGD()==ar.get(1).getGD() && ar.get(0).getGF() == ar.get(1).getGF() && ar.get(0).getWins() == ar.get(1).getWins() && ar.get(0).getGA() == ar.get(1).getGA() &&
	              				ar.get(1).getPoints()==ar.get(2).getPoints() && ar.get(1).getGD()==ar.get(2).getGD() && ar.get(1).getGF() == ar.get(2).getGF() && ar.get(1).getWins() == ar.get(2).getWins() && ar.get(1).getGA() == ar.get(2).getGA() &&
	              			    ar.get(0).getPoints()==ar.get(2).getPoints() && ar.get(0).getGD()==ar.get(2).getGD() && ar.get(0).getGF() == ar.get(2).getGF() && ar.get(0).getWins() == ar.get(2).getWins() && ar.get(0).getGA() == ar.get(2).getGA()) {
	              				tabelaAPlayoff.setVisible(true);
	    	          			lblPOG1TeamA1.setVisible(true); lblPOG2TeamA1.setVisible(true);
	    	          			lblPOG1TeamA2.setVisible(true); lblPOG2TeamA2.setVisible(true);
	    	          			lblPOG1TeamA3.setVisible(true); lblPOG2TeamA3.setVisible(true);
	    	          			resG1POTeamA1.setVisible(true); resG2POTeamA1.setVisible(true);
	    	          			resG1POTeamA2.setVisible(true); resG2POTeamA2.setVisible(true);
	    	          			resG1POTeamA3.setVisible(true); resG2POTeamA3.setVisible(true);
	    	          			btnAG1PlayOff.setVisible(true); btnAG2PlayOff.setVisible(true); btnAG3PlayOff.setVisible(true);
	    	          			resetAG1PlayOff.setVisible(true); resetAG2PlayOff.setVisible(true); resetAG3PlayOff.setVisible(true);
	    	          			
	    	          			lblPOG1TeamA1.setText(ar.get(0).getteamName()); lblPOG2TeamA1.setText(ar.get(0).getteamName());
	    	          			lblPOG1TeamA2.setText(ar.get(1).getteamName()); lblPOG2TeamA2.setText(ar.get(1).getteamName());
	    	          			lblPOG1TeamA3.setText(ar.get(2).getteamName()); lblPOG2TeamA3.setText(ar.get(2).getteamName());
	    	          			
	    	          			lblPOG4TeamA1.setVisible(false);
	    	          			lblPOG4TeamA2.setVisible(false);
	    	          			resG4POTeamA1.setVisible(false);
	    	          			resG4POTeamA2.setVisible(false);
	    	          			btnAG4PlayOff.setVisible(false);
	    	          			resetAG4PlayOff.setVisible(false);
	    	          			
	    	          			lblPOG5TeamA2.setVisible(false);
	    	          			lblPOG5TeamA3.setVisible(false);
	    	          			resG5POTeamA2.setVisible(false);
	    	          			resG5POTeamA3.setVisible(false);
	    	          			btnAG5PlayOff.setVisible(false);
	    	          			resetAG5PlayOff.setVisible(false);
	    	          			
	    	          			
	              			}
	              			
	              			else if(Creator.rdbtnNo.isSelected() && ar.get(0).getPoints()==ar.get(1).getPoints() && ar.get(0).getGD()==ar.get(1).getGD() && ar.get(0).getGF() == ar.get(1).getGF() && ar.get(0).getWins() == ar.get(1).getWins() && ar.get(0).getGA() == ar.get(1).getGA() ){
	    	          			tabelaAPlayoff.setVisible(true);
	    	          			lblPOG4TeamA1.setVisible(true);
	    	          			lblPOG4TeamA2.setVisible(true);
	    	          			resG4POTeamA1.setVisible(true);
	    	          			resG4POTeamA2.setVisible(true);
	    	          			btnAG4PlayOff.setVisible(true);
	    	          			resetAG4PlayOff.setVisible(true);
	    	          			lblPOG4TeamA1.setText(ar.get(0).getteamName());
	    	          			lblPOG4TeamA2.setText(ar.get(1).getteamName());
	    	          			
	    	          			lblPOG1TeamA1.setVisible(false); lblPOG2TeamA1.setVisible(false);
	    	          			lblPOG1TeamA2.setVisible(false); lblPOG2TeamA2.setVisible(false);
	    	          			lblPOG1TeamA3.setVisible(false); lblPOG2TeamA3.setVisible(false);
	    	          			resG1POTeamA1.setVisible(false); resG2POTeamA1.setVisible(false);
	    	          			resG1POTeamA2.setVisible(false); resG2POTeamA2.setVisible(false);
	    	          			resG1POTeamA3.setVisible(false); resG2POTeamA3.setVisible(false);
	    	          			btnAG1PlayOff.setVisible(false); btnAG2PlayOff.setVisible(false); btnAG3PlayOff.setVisible(false);
	    	          			resetAG1PlayOff.setVisible(false); resetAG2PlayOff.setVisible(false); resetAG3PlayOff.setVisible(false);
	    	          			
	    	          			lblPOG5TeamA2.setVisible(false);
	    	          			lblPOG5TeamA3.setVisible(false);
	    	          			resG5POTeamA2.setVisible(false);
	    	          			resG5POTeamA3.setVisible(false);
	    	          			btnAG5PlayOff.setVisible(false);
	    	          			resetAG5PlayOff.setVisible(false);
	    	          			
	    	          		}
	              			else if(Creator.rdbtnNo.isSelected() && ar.get(1).getPoints()==ar.get(2).getPoints() && ar.get(1).getGD()==ar.get(2).getGD() && ar.get(1).getGF() == ar.get(2).getGF() && ar.get(1).getWins() == ar.get(2).getWins() && ar.get(1).getGA() == ar.get(2).getGA() ){
	    	          			tabelaAPlayoff.setVisible(true);
	    	          			lblPOG5TeamA2.setVisible(true);
	    	          			lblPOG5TeamA3.setVisible(true);
	    	          			resG5POTeamA2.setVisible(true);
	    	          			resG5POTeamA3.setVisible(true);
	    	          			btnAG5PlayOff.setVisible(true);
	    	          			resetAG5PlayOff.setVisible(true);
	    	          			lblPOG5TeamA2.setText(ar.get(1).getteamName());
	    	          			lblPOG5TeamA3.setText(ar.get(2).getteamName());
	    	          			
	    	          			lblPOG1TeamA1.setVisible(false); lblPOG2TeamA1.setVisible(false);
	    	          			lblPOG1TeamA2.setVisible(false); lblPOG2TeamA2.setVisible(false);
	    	          			lblPOG1TeamA3.setVisible(false); lblPOG2TeamA3.setVisible(false);
	    	          			resG1POTeamA1.setVisible(false); resG2POTeamA1.setVisible(false);
	    	          			resG1POTeamA2.setVisible(false); resG2POTeamA2.setVisible(false);
	    	          			resG1POTeamA3.setVisible(false); resG2POTeamA3.setVisible(false);
	    	          			btnAG1PlayOff.setVisible(false); btnAG2PlayOff.setVisible(false); btnAG3PlayOff.setVisible(false);
	    	          			resetAG1PlayOff.setVisible(false); resetAG2PlayOff.setVisible(false); resetAG3PlayOff.setVisible(false);
	    	          			
	    	          			lblPOG4TeamA1.setVisible(false);
	    	          			lblPOG4TeamA2.setVisible(false);
	    	          			resG4POTeamA1.setVisible(false);
	    	          			resG4POTeamA2.setVisible(false);
	    	          			btnAG4PlayOff.setVisible(false);
	    	          			resetAG4PlayOff.setVisible(false);
	    	          		}
	              			
	          	}
	         });
	          
			    JButton btnGrpAG2 = new JButton("AddResult");
			    btnGrpAG2.setFont(new Font("Tahoma", Font.BOLD, 10));
			    btnGrpAG2.setBounds(378, 246, 89, 17);
			    contentPane.add(btnGrpAG2);
			    btnGrpAG2.addActionListener(new ActionListener() {
	        	  public void actionPerformed(ActionEvent e) {
	        		    gfA1G2=Integer.parseInt(resultA1G2.getText());
		          		gfA3G1=Integer.parseInt(resultA3G1.getText());
		          			          		
		          		if(gfA1G2>gfA3G1) {
		          			wA1G2=1; dA1G2=0; lA1G2=0; uwA1=wA1G1+wA1G2+wA1G3+wA1G4; udA1=dA1G1+dA1G2+dA1G3+dA1G4; ulA1=lA1G1+lA1G2+lA1G3+lA1G4; upA1=uwA1+udA1+ulA1; ptsuA1=3*uwA1+udA1;
		          			wA3G1=0; dA3G1=0; lA3G1=1; uwA3=wA3G1+wA3G2+wA3G3+wA3G4; udA3=dA3G1+dA3G2+dA3G3+dA3G4; ulA3=lA3G1+lA3G2+lA3G3+lA3G4; upA3=uwA3+udA3+ulA3; ptsuA3=3*uwA3+udA3;
		          		}
		          		else if(gfA1G2<gfA3G1) {
		          			wA1G2=0; dA1G2=0; lA1G2=1; uwA1=wA1G1+wA1G2+wA1G3+wA1G4; udA1=dA1G1+dA1G2+dA1G3+dA1G4; ulA1=lA1G1+lA1G2+lA1G3+lA1G4; upA1=uwA1+udA1+ulA1; ptsuA1=3*uwA1+udA1;
		          			wA3G1=1; dA3G1=0; lA3G1=0; uwA3=wA3G1+wA3G2+wA3G3+wA3G4; udA3=dA3G1+dA3G2+dA3G3+dA3G4; ulA3=lA3G1+lA3G2+lA3G3+lA3G4; upA3=uwA3+udA3+ulA3; ptsuA3=3*uwA3+udA3;
		          		}
		          		else if(gfA1G2==gfA3G1) {
		          			dA1G2=1; wA1G2=0; lA1G2=0; uwA1=wA1G1+wA1G2+wA1G3+wA1G4; udA1=dA1G1+dA1G2+dA1G3+dA1G4; ulA1=lA1G1+lA1G2+lA1G3+lA1G4; upA1=uwA1+udA1+ulA1; ptsuA1=3*uwA1+udA1;
		          			dA3G1=1; wA3G1=0; lA3G1=0; uwA3=wA3G1+wA3G2+wA3G3+wA3G4; udA3=dA3G1+dA3G2+dA3G3+dA3G4; ulA3=lA3G1+lA3G2+lA3G3+lA3G4; upA3=uwA3+udA3+ulA3; ptsuA3=3*uwA3+udA3;
		          		}
		          		btnGrpAG2.setEnabled(false);
		          		resultA1G2.setEditable(false);
		          		resultA3G1.setEditable(false);
		          		
		          		ArrayList<TableSort> ar = new ArrayList<TableSort>();
		          		ar.add(new TableSort(String.valueOf(addTeams.teamA1),upA1,uwA1,udA1,ulA1,gfA1G1+gfA1G2+gfA1G3+gfA1G4,gfA2G1+gfA3G1+gfA2G3+gfA3G3,(gfA1G1+gfA1G2+gfA1G3+gfA1G4)-(gfA2G1+gfA3G1+gfA2G3+gfA3G3),ptsuA1));
	          			ar.add(new TableSort(String.valueOf(addTeams.teamA2),upA2,uwA2,udA2,ulA2,gfA2G1+gfA2G2+gfA2G3+gfA2G4,gfA1G1+gfA3G2+gfA1G3+gfA3G4,(gfA2G1+gfA2G2+gfA2G3+gfA2G4)-(gfA1G1+gfA3G2+gfA1G3+gfA3G4),ptsuA2));
	          			ar.add(new TableSort(String.valueOf(addTeams.teamA3),upA3,uwA3,udA3,ulA3,gfA3G1+gfA3G2+gfA3G3+gfA3G4,gfA1G2+gfA2G2+gfA1G4+gfA2G4,(gfA3G1+gfA3G2+gfA3G3+gfA3G4)-(gfA1G2+gfA2G2+gfA1G4+gfA2G4),ptsuA3));
	          			
	          			Collections.sort(ar, new SortByPts());
	          			
	          			lblGrpTeamA1.setText(ar.get(0).getteamName()); lblPlayedA1.setText(String.valueOf(ar.get(0).getPlayed())); lblWinsA1.setText(String.valueOf(ar.get(0).getWins())); lblDrawsA1.setText(String.valueOf(ar.get(0).getDraws()));   lblLostA1.setText(String.valueOf(ar.get(0).getLoses())); lblGFA1.setText(String.valueOf(ar.get(0).getGF())); lblGAA1.setText(String.valueOf(ar.get(0).getGA())); lblGDA1.setText(String.valueOf(ar.get(0).getGD())); lblPtsA1.setText(String.valueOf(ar.get(0).getPoints()));
	          			lblGrpTeamA2.setText(ar.get(1).getteamName()); lblPlayedA2.setText(String.valueOf(ar.get(1).getPlayed())); lblWinsA2.setText(String.valueOf(ar.get(1).getWins())); lblDrawsA2.setText(String.valueOf(ar.get(1).getDraws()));   lblLostA2.setText(String.valueOf(ar.get(1).getLoses())); lblGFA2.setText(String.valueOf(ar.get(1).getGF())); lblGAA2.setText(String.valueOf(ar.get(1).getGA())); lblGDA2.setText(String.valueOf(ar.get(1).getGD())); lblPtsA2.setText(String.valueOf(ar.get(1).getPoints()));
	          			lblGrpTeamA3.setText(ar.get(2).getteamName()); lblPlayedA3.setText(String.valueOf(ar.get(2).getPlayed())); lblWinsA3.setText(String.valueOf(ar.get(2).getWins())); lblDrawsA3.setText(String.valueOf(ar.get(2).getDraws()));   lblLostA3.setText(String.valueOf(ar.get(2).getLoses())); lblGFA3.setText(String.valueOf(ar.get(2).getGF())); lblGAA3.setText(String.valueOf(ar.get(2).getGA())); lblGDA3.setText(String.valueOf(ar.get(2).getGD())); lblPtsA3.setText(String.valueOf(ar.get(2).getPoints()));
	          			
	          				          			
	          			if(Creator.rdbtnNo.isSelected() && 
	              				ar.get(0).getPoints()==ar.get(1).getPoints() && ar.get(0).getGD()==ar.get(1).getGD() && ar.get(0).getGF() == ar.get(1).getGF() && ar.get(0).getWins() == ar.get(1).getWins() && ar.get(0).getGA() == ar.get(1).getGA() &&
	              				ar.get(1).getPoints()==ar.get(2).getPoints() && ar.get(1).getGD()==ar.get(2).getGD() && ar.get(1).getGF() == ar.get(2).getGF() && ar.get(1).getWins() == ar.get(2).getWins() && ar.get(1).getGA() == ar.get(2).getGA() &&
	              			    ar.get(0).getPoints()==ar.get(2).getPoints() && ar.get(0).getGD()==ar.get(2).getGD() && ar.get(0).getGF() == ar.get(2).getGF() && ar.get(0).getWins() == ar.get(2).getWins() && ar.get(0).getGA() == ar.get(2).getGA()) {
	              				tabelaAPlayoff.setVisible(true);
	    	          			lblPOG1TeamA1.setVisible(true); lblPOG2TeamA1.setVisible(true);
	    	          			lblPOG1TeamA2.setVisible(true); lblPOG2TeamA2.setVisible(true);
	    	          			lblPOG1TeamA3.setVisible(true); lblPOG2TeamA3.setVisible(true);
	    	          			resG1POTeamA1.setVisible(true); resG2POTeamA1.setVisible(true);
	    	          			resG1POTeamA2.setVisible(true); resG2POTeamA2.setVisible(true);
	    	          			resG1POTeamA3.setVisible(true); resG2POTeamA3.setVisible(true);
	    	          			btnAG1PlayOff.setVisible(true); btnAG2PlayOff.setVisible(true); btnAG3PlayOff.setVisible(true);
	    	          			resetAG1PlayOff.setVisible(true); resetAG2PlayOff.setVisible(true); resetAG3PlayOff.setVisible(true);
	    	          			
	    	          			lblPOG1TeamA1.setText(ar.get(0).getteamName()); lblPOG2TeamA1.setText(ar.get(0).getteamName());
	    	          			lblPOG1TeamA2.setText(ar.get(1).getteamName()); lblPOG2TeamA2.setText(ar.get(1).getteamName());
	    	          			lblPOG1TeamA3.setText(ar.get(2).getteamName()); lblPOG2TeamA3.setText(ar.get(2).getteamName());
	    	          			
	    	          			lblPOG4TeamA1.setVisible(false);
	    	          			lblPOG4TeamA2.setVisible(false);
	    	          			resG4POTeamA1.setVisible(false);
	    	          			resG4POTeamA2.setVisible(false);
	    	          			btnAG4PlayOff.setVisible(false);
	    	          			resetAG4PlayOff.setVisible(false);
	    	          			
	    	          			lblPOG5TeamA2.setVisible(false);
	    	          			lblPOG5TeamA3.setVisible(false);
	    	          			resG5POTeamA2.setVisible(false);
	    	          			resG5POTeamA3.setVisible(false);
	    	          			btnAG5PlayOff.setVisible(false);
	    	          			resetAG5PlayOff.setVisible(false);
	    	          			
	              			}
	              			
	              			else if(Creator.rdbtnNo.isSelected() && ar.get(0).getPoints()==ar.get(1).getPoints() && ar.get(0).getGD()==ar.get(1).getGD() && ar.get(0).getGF() == ar.get(1).getGF() && ar.get(0).getWins() == ar.get(1).getWins() && ar.get(0).getGA() == ar.get(1).getGA() ){
	    	          			tabelaAPlayoff.setVisible(true);
	    	          			lblPOG4TeamA1.setVisible(true);
	    	          			lblPOG4TeamA2.setVisible(true);
	    	          			resG4POTeamA1.setVisible(true);
	    	          			resG4POTeamA2.setVisible(true);
	    	          			btnAG4PlayOff.setVisible(true);
	    	          			resetAG4PlayOff.setVisible(true);
	    	          			lblPOG4TeamA1.setText(ar.get(0).getteamName());
	    	          			lblPOG4TeamA2.setText(ar.get(1).getteamName());
	    	          			
	    	          			lblPOG1TeamA1.setVisible(false); lblPOG2TeamA1.setVisible(false);
	    	          			lblPOG1TeamA2.setVisible(false); lblPOG2TeamA2.setVisible(false);
	    	          			lblPOG1TeamA3.setVisible(false); lblPOG2TeamA3.setVisible(false);
	    	          			resG1POTeamA1.setVisible(false); resG2POTeamA1.setVisible(false);
	    	          			resG1POTeamA2.setVisible(false); resG2POTeamA2.setVisible(false);
	    	          			resG1POTeamA3.setVisible(false); resG2POTeamA3.setVisible(false);
	    	          			btnAG1PlayOff.setVisible(false); btnAG2PlayOff.setVisible(false); btnAG3PlayOff.setVisible(false);
	    	          			resetAG1PlayOff.setVisible(false); resetAG2PlayOff.setVisible(false); resetAG3PlayOff.setVisible(false);
	    	          			
	    	          			lblPOG5TeamA2.setVisible(false);
	    	          			lblPOG5TeamA3.setVisible(false);
	    	          			resG5POTeamA2.setVisible(false);
	    	          			resG5POTeamA3.setVisible(false);
	    	          			btnAG5PlayOff.setVisible(false);
	    	          			resetAG5PlayOff.setVisible(false);
	    	          			
	    	          		}
	              			else if(Creator.rdbtnNo.isSelected() && ar.get(1).getPoints()==ar.get(2).getPoints() && ar.get(1).getGD()==ar.get(2).getGD() && ar.get(1).getGF() == ar.get(2).getGF() && ar.get(1).getWins() == ar.get(2).getWins() && ar.get(1).getGA() == ar.get(2).getGA() ){
	    	          			tabelaAPlayoff.setVisible(true);
	    	          			lblPOG5TeamA2.setVisible(true);
	    	          			lblPOG5TeamA3.setVisible(true);
	    	          			resG5POTeamA2.setVisible(true);
	    	          			resG5POTeamA3.setVisible(true);
	    	          			btnAG5PlayOff.setVisible(true);
	    	          			resetAG5PlayOff.setVisible(true);
	    	          			lblPOG5TeamA2.setText(ar.get(1).getteamName());
	    	          			lblPOG5TeamA3.setText(ar.get(2).getteamName());
	    	          			
	    	          			lblPOG1TeamA1.setVisible(false); lblPOG2TeamA1.setVisible(false);
	    	          			lblPOG1TeamA2.setVisible(false); lblPOG2TeamA2.setVisible(false);
	    	          			lblPOG1TeamA3.setVisible(false); lblPOG2TeamA3.setVisible(false);
	    	          			resG1POTeamA1.setVisible(false); resG2POTeamA1.setVisible(false);
	    	          			resG1POTeamA2.setVisible(false); resG2POTeamA2.setVisible(false);
	    	          			resG1POTeamA3.setVisible(false); resG2POTeamA3.setVisible(false);
	    	          			btnAG1PlayOff.setVisible(false); btnAG2PlayOff.setVisible(false); btnAG3PlayOff.setVisible(false);
	    	          			resetAG1PlayOff.setVisible(false); resetAG2PlayOff.setVisible(false); resetAG3PlayOff.setVisible(false);
	    	          			
	    	          			lblPOG4TeamA1.setVisible(false);
	    	          			lblPOG4TeamA2.setVisible(false);
	    	          			resG4POTeamA1.setVisible(false);
	    	          			resG4POTeamA2.setVisible(false);
	    	          			btnAG4PlayOff.setVisible(false);
	    	          			resetAG4PlayOff.setVisible(false);
	    	          		}
	          	}
	          });
	     	  
			    JButton btnGrpAG3 = new JButton("AddResult");
			    btnGrpAG3.setFont(new Font("Tahoma", Font.BOLD, 10));
			    btnGrpAG3.setBounds(378, 274, 89, 17);
			    contentPane.add(btnGrpAG3);
			    btnGrpAG3.addActionListener(new ActionListener() {
			     public void actionPerformed(ActionEvent e) {
			  		gfA2G2=Integer.parseInt(resultA2G2.getText());
	          		gfA3G2=Integer.parseInt(resultA3G2.getText());

	          		if(gfA2G2>gfA3G2) {
	          			wA2G2=1; dA2G2=0; lA2G2=0; uwA2=wA2G1+wA2G2+wA2G3+wA2G4; udA2=dA2G1+dA2G2+dA2G3+dA2G4; ulA2=lA2G1+lA2G2+lA2G3+lA2G4; upA2=uwA2+udA2+ulA2; ptsuA2=3*uwA2+udA2;
	          			wA3G2=0; dA3G2=0; lA3G2=1; uwA3=wA3G1+wA3G2+wA3G3+wA3G4; udA3=dA3G1+dA3G2+dA3G3+dA3G4; ulA3=lA3G1+lA3G2+lA3G3+lA3G4; upA3=uwA3+udA3+ulA3; ptsuA3=3*uwA3+udA3;
	          		}
	          		else if(gfA2G2<gfA3G2) {
	          			wA2G2=0; dA2G2=0; lA2G2=1; uwA2=wA2G1+wA2G2+wA2G3+wA2G4; udA2=dA2G1+dA2G2+dA2G3+dA2G4; ulA2=lA2G1+lA2G2+lA2G3+lA2G4; upA2=uwA2+udA2+ulA2; ptsuA2=3*uwA2+udA2;
	          			wA3G2=1; dA3G2=0; lA3G2=0; uwA3=wA3G1+wA3G2+wA3G3+wA3G4; udA3=dA3G1+dA3G2+dA3G3+dA3G4; ulA3=lA3G1+lA3G2+lA3G3+lA3G4; upA3=uwA3+udA3+ulA3; ptsuA3=3*uwA3+udA3;
	          		}
	          		else if(gfA2G2==gfA3G2) {
	          			dA2G2=1; wA2G2=0; lA2G2=0; uwA2=wA2G1+wA2G2+wA2G3+wA2G4; udA2=dA2G1+dA2G2+dA2G3+dA2G4; ulA2=lA2G1+lA2G2+lA2G3+lA2G4; upA2=uwA2+udA2+ulA2; ptsuA2=3*uwA2+udA2;
	          			dA3G2=1; wA3G2=0; lA3G2=0; uwA3=wA3G1+wA3G2+wA3G3+wA3G4; udA3=dA3G1+dA3G2+dA3G3+dA3G4; ulA3=lA3G1+lA3G2+lA3G3+lA3G4; upA3=uwA3+udA3+ulA3; ptsuA3=3*uwA3+udA3;
	          		}
	          		
	          		btnGrpAG3.setEnabled(false);
	          		resultA2G2.setEditable(false);
	          		resultA3G2.setEditable(false);
	          		
	          		ArrayList<TableSort> ar = new ArrayList<TableSort>();
	          		ar.add(new TableSort(String.valueOf(addTeams.teamA1),upA1,uwA1,udA1,ulA1,gfA1G1+gfA1G2+gfA1G3+gfA1G4,gfA2G1+gfA3G1+gfA2G3+gfA3G3,(gfA1G1+gfA1G2+gfA1G3+gfA1G4)-(gfA2G1+gfA3G1+gfA2G3+gfA3G3),ptsuA1));
          			ar.add(new TableSort(String.valueOf(addTeams.teamA2),upA2,uwA2,udA2,ulA2,gfA2G1+gfA2G2+gfA2G3+gfA2G4,gfA1G1+gfA3G2+gfA1G3+gfA3G4,(gfA2G1+gfA2G2+gfA2G3+gfA2G4)-(gfA1G1+gfA3G2+gfA1G3+gfA3G4),ptsuA2));
          			ar.add(new TableSort(String.valueOf(addTeams.teamA3),upA3,uwA3,udA3,ulA3,gfA3G1+gfA3G2+gfA3G3+gfA3G4,gfA1G2+gfA2G2+gfA1G4+gfA2G4,(gfA3G1+gfA3G2+gfA3G3+gfA3G4)-(gfA1G2+gfA2G2+gfA1G4+gfA2G4),ptsuA3));
          			
          			Collections.sort(ar, new SortByPts());
          			
          			lblGrpTeamA1.setText(ar.get(0).getteamName()); lblPlayedA1.setText(String.valueOf(ar.get(0).getPlayed())); lblWinsA1.setText(String.valueOf(ar.get(0).getWins())); lblDrawsA1.setText(String.valueOf(ar.get(0).getDraws()));   lblLostA1.setText(String.valueOf(ar.get(0).getLoses())); lblGFA1.setText(String.valueOf(ar.get(0).getGF())); lblGAA1.setText(String.valueOf(ar.get(0).getGA())); lblGDA1.setText(String.valueOf(ar.get(0).getGD())); lblPtsA1.setText(String.valueOf(ar.get(0).getPoints()));
          			lblGrpTeamA2.setText(ar.get(1).getteamName()); lblPlayedA2.setText(String.valueOf(ar.get(1).getPlayed())); lblWinsA2.setText(String.valueOf(ar.get(1).getWins())); lblDrawsA2.setText(String.valueOf(ar.get(1).getDraws()));   lblLostA2.setText(String.valueOf(ar.get(1).getLoses())); lblGFA2.setText(String.valueOf(ar.get(1).getGF())); lblGAA2.setText(String.valueOf(ar.get(1).getGA())); lblGDA2.setText(String.valueOf(ar.get(1).getGD())); lblPtsA2.setText(String.valueOf(ar.get(1).getPoints()));
          			lblGrpTeamA3.setText(ar.get(2).getteamName()); lblPlayedA3.setText(String.valueOf(ar.get(2).getPlayed())); lblWinsA3.setText(String.valueOf(ar.get(2).getWins())); lblDrawsA3.setText(String.valueOf(ar.get(2).getDraws()));   lblLostA3.setText(String.valueOf(ar.get(2).getLoses())); lblGFA3.setText(String.valueOf(ar.get(2).getGF())); lblGAA3.setText(String.valueOf(ar.get(2).getGA())); lblGDA3.setText(String.valueOf(ar.get(2).getGD())); lblPtsA3.setText(String.valueOf(ar.get(2).getPoints()));
          			
          			if(Creator.rdbtnNo.isSelected() && 
          				ar.get(0).getPoints()==ar.get(1).getPoints() && ar.get(0).getGD()==ar.get(1).getGD() && ar.get(0).getGF() == ar.get(1).getGF() && ar.get(0).getWins() == ar.get(1).getWins() && ar.get(0).getGA() == ar.get(1).getGA() &&
          				ar.get(1).getPoints()==ar.get(2).getPoints() && ar.get(1).getGD()==ar.get(2).getGD() && ar.get(1).getGF() == ar.get(2).getGF() && ar.get(1).getWins() == ar.get(2).getWins() && ar.get(1).getGA() == ar.get(2).getGA() &&
          			    ar.get(0).getPoints()==ar.get(2).getPoints() && ar.get(0).getGD()==ar.get(2).getGD() && ar.get(0).getGF() == ar.get(2).getGF() && ar.get(0).getWins() == ar.get(2).getWins() && ar.get(0).getGA() == ar.get(2).getGA()) {
          				tabelaAPlayoff.setVisible(true);
	          			lblPOG1TeamA1.setVisible(true); lblPOG2TeamA1.setVisible(true);
	          			lblPOG1TeamA2.setVisible(true); lblPOG2TeamA2.setVisible(true);
	          			lblPOG1TeamA3.setVisible(true); lblPOG2TeamA3.setVisible(true);
	          			resG1POTeamA1.setVisible(true); resG2POTeamA1.setVisible(true);
	          			resG1POTeamA2.setVisible(true); resG2POTeamA2.setVisible(true);
	          			resG1POTeamA3.setVisible(true); resG2POTeamA3.setVisible(true);
	          			btnAG1PlayOff.setVisible(true); btnAG2PlayOff.setVisible(true); btnAG3PlayOff.setVisible(true);
	          			resetAG1PlayOff.setVisible(true); resetAG2PlayOff.setVisible(true); resetAG3PlayOff.setVisible(true);
	          			
	          			lblPOG1TeamA1.setText(ar.get(0).getteamName()); lblPOG2TeamA1.setText(ar.get(0).getteamName());
	          			lblPOG1TeamA2.setText(ar.get(1).getteamName()); lblPOG2TeamA2.setText(ar.get(1).getteamName());
	          			lblPOG1TeamA3.setText(ar.get(2).getteamName()); lblPOG2TeamA3.setText(ar.get(2).getteamName());
	          			
	          			lblPOG4TeamA1.setVisible(false);
	          			lblPOG4TeamA2.setVisible(false);
	          			resG4POTeamA1.setVisible(false);
	          			resG4POTeamA2.setVisible(false);
	          			btnAG4PlayOff.setVisible(false);
	          			resetAG4PlayOff.setVisible(false);
	          			
	          			lblPOG5TeamA2.setVisible(false);
	          			lblPOG5TeamA3.setVisible(false);
	          			resG5POTeamA2.setVisible(false);
	          			resG5POTeamA3.setVisible(false);
	          			btnAG5PlayOff.setVisible(false);
	          			resetAG5PlayOff.setVisible(false);
	          			
          			}
          			
          			else if(Creator.rdbtnNo.isSelected() && ar.get(0).getPoints()==ar.get(1).getPoints() && ar.get(0).getGD()==ar.get(1).getGD() && ar.get(0).getGF() == ar.get(1).getGF() && ar.get(0).getWins() == ar.get(1).getWins() && ar.get(0).getGA() == ar.get(1).getGA() ){
	          			tabelaAPlayoff.setVisible(true);
	          			lblPOG4TeamA1.setVisible(true);
	          			lblPOG4TeamA2.setVisible(true);
	          			resG4POTeamA1.setVisible(true);
	          			resG4POTeamA2.setVisible(true);
	          			btnAG4PlayOff.setVisible(true);
	          			resetAG4PlayOff.setVisible(true);
	          			lblPOG4TeamA1.setText(ar.get(0).getteamName());
	          			lblPOG4TeamA2.setText(ar.get(1).getteamName());
	          			
	          			lblPOG1TeamA1.setVisible(false); lblPOG2TeamA1.setVisible(false);
	          			lblPOG1TeamA2.setVisible(false); lblPOG2TeamA2.setVisible(false);
	          			lblPOG1TeamA3.setVisible(false); lblPOG2TeamA3.setVisible(false);
	          			resG1POTeamA1.setVisible(false); resG2POTeamA1.setVisible(false);
	          			resG1POTeamA2.setVisible(false); resG2POTeamA2.setVisible(false);
	          			resG1POTeamA3.setVisible(false); resG2POTeamA3.setVisible(false);
	          			btnAG1PlayOff.setVisible(false); btnAG2PlayOff.setVisible(false); btnAG3PlayOff.setVisible(false);
	          			resetAG1PlayOff.setVisible(false); resetAG2PlayOff.setVisible(false); resetAG3PlayOff.setVisible(false);
	          			
	          			lblPOG5TeamA2.setVisible(false);
	          			lblPOG5TeamA3.setVisible(false);
	          			resG5POTeamA2.setVisible(false);
	          			resG5POTeamA3.setVisible(false);
	          			btnAG5PlayOff.setVisible(false);
	          			resetAG5PlayOff.setVisible(false);
	          			
	          		}
          			else if(Creator.rdbtnNo.isSelected() && ar.get(1).getPoints()==ar.get(2).getPoints() && ar.get(1).getGD()==ar.get(2).getGD() && ar.get(1).getGF() == ar.get(2).getGF() && ar.get(1).getWins() == ar.get(2).getWins() && ar.get(1).getGA() == ar.get(2).getGA() ){
	          			tabelaAPlayoff.setVisible(true);
	          			lblPOG5TeamA2.setVisible(true);
	          			lblPOG5TeamA3.setVisible(true);
	          			resG5POTeamA2.setVisible(true);
	          			resG5POTeamA3.setVisible(true);
	          			btnAG5PlayOff.setVisible(true);
	          			resetAG5PlayOff.setVisible(true);
	          			lblPOG5TeamA2.setText(ar.get(1).getteamName());
	          			lblPOG5TeamA3.setText(ar.get(2).getteamName());
	          			
	          			lblPOG1TeamA1.setVisible(false); lblPOG2TeamA1.setVisible(false);
	          			lblPOG1TeamA2.setVisible(false); lblPOG2TeamA2.setVisible(false);
	          			lblPOG1TeamA3.setVisible(false); lblPOG2TeamA3.setVisible(false);
	          			resG1POTeamA1.setVisible(false); resG2POTeamA1.setVisible(false);
	          			resG1POTeamA2.setVisible(false); resG2POTeamA2.setVisible(false);
	          			resG1POTeamA3.setVisible(false); resG2POTeamA3.setVisible(false);
	          			btnAG1PlayOff.setVisible(false); btnAG2PlayOff.setVisible(false); btnAG3PlayOff.setVisible(false);
	          			resetAG1PlayOff.setVisible(false); resetAG2PlayOff.setVisible(false); resetAG3PlayOff.setVisible(false);
	          			
	          			lblPOG4TeamA1.setVisible(false);
	          			lblPOG4TeamA2.setVisible(false);
	          			resG4POTeamA1.setVisible(false);
	          			resG4POTeamA2.setVisible(false);
	          			btnAG4PlayOff.setVisible(false);
	          			resetAG4PlayOff.setVisible(false);
	          		}
          			
			  	}
		       });
		
			    btnGrpAG4.setFont(new Font("Tahoma", Font.BOLD, 10));		
			    btnGrpAG4.setBounds(378, 302, 89, 17);
			    contentPane.add(btnGrpAG4);
			    btnGrpAG4.addActionListener(new ActionListener() {
		          	public void actionPerformed(ActionEvent e) {
		          		gfA1G3=Integer.parseInt(resultA1G3.getText());
		          		gfA2G3=Integer.parseInt(resultA2G3.getText());
		          			          		
		          		if(gfA1G3>gfA2G3) {
		          			wA1G3=1; dA1G3=0; lA1G3=0; uwA1=wA1G1+wA1G2+wA1G3+wA1G4; udA1=dA1G1+dA1G2+dA1G3+dA1G4; ulA1=lA1G1+lA1G2+lA1G3+lA1G4; upA1=uwA1+udA1+ulA1; ptsuA1=3*uwA1+udA1;
		          			wA2G3=0; dA2G3=0; lA2G3=1; uwA2=wA2G1+wA2G2+wA2G3+wA2G4; udA2=dA2G1+dA2G2+dA2G3+dA2G4; ulA2=lA2G1+lA2G2+lA2G3+lA2G4; upA2=uwA2+udA2+ulA2; ptsuA2=3*uwA2+udA2;
		          		}
		          		else if(gfA1G3<gfA2G3) {
		          			wA1G3=0; dA1G3=0; lA1G3=1; uwA1=wA1G1+wA1G2+wA1G3+wA1G4; udA1=dA1G1+dA1G2+dA1G3+dA1G4; ulA1=lA1G1+lA1G2+lA1G3+lA1G4; upA1=uwA1+udA1+ulA1; ptsuA1=3*uwA1+udA1;
		          			wA2G3=1; dA2G3=0; lA2G3=0; uwA2=wA2G1+wA2G2+wA2G3+wA2G4; udA2=dA2G1+dA2G2+dA2G3+dA2G4; ulA2=lA2G1+lA2G2+lA2G3+lA2G4; upA2=uwA2+udA2+ulA2; ptsuA2=3*uwA2+udA2;
		          		}
		          		else if(gfA1G3==gfA2G3) {
		          			dA1G3=1; wA1G3=0; lA1G3=0; uwA1=wA1G1+wA1G2+wA1G3+wA1G4; udA1=dA1G1+dA1G2+dA1G3+dA1G4; ulA1=lA1G1+lA1G2+lA1G3+lA1G4; upA1=uwA1+udA1+ulA1; ptsuA1=3*uwA1+udA1;
		          			dA2G3=1; wA2G3=0; lA2G3=0; uwA2=wA2G1+wA2G2+wA2G3+wA2G4; udA2=dA2G1+dA2G2+dA2G3+dA2G4; ulA2=lA2G1+lA2G2+lA2G3+lA2G4; upA2=uwA2+udA2+ulA2; ptsuA2=3*uwA2+udA2;
		          		}
		          		btnGrpAG4.setEnabled(false);
		          		resultA1G3.setEditable(false);
		          		resultA2G3.setEditable(false);
		          		
		          		ArrayList<TableSort> ar = new ArrayList<TableSort>();
		          		ar.add(new TableSort(String.valueOf(addTeams.teamA1),upA1,uwA1,udA1,ulA1,gfA1G1+gfA1G2+gfA1G3+gfA1G4,gfA2G1+gfA3G1+gfA2G3+gfA3G3,(gfA1G1+gfA1G2+gfA1G3+gfA1G4)-(gfA2G1+gfA3G1+gfA2G3+gfA3G3),ptsuA1));
	          			ar.add(new TableSort(String.valueOf(addTeams.teamA2),upA2,uwA2,udA2,ulA2,gfA2G1+gfA2G2+gfA2G3+gfA2G4,gfA1G1+gfA3G2+gfA1G3+gfA3G4,(gfA2G1+gfA2G2+gfA2G3+gfA2G4)-(gfA1G1+gfA3G2+gfA1G3+gfA3G4),ptsuA2));
	          			ar.add(new TableSort(String.valueOf(addTeams.teamA3),upA3,uwA3,udA3,ulA3,gfA3G1+gfA3G2+gfA3G3+gfA3G4,gfA1G2+gfA2G2+gfA1G4+gfA2G4,(gfA3G1+gfA3G2+gfA3G3+gfA3G4)-(gfA1G2+gfA2G2+gfA1G4+gfA2G4),ptsuA3));
	          			
	          			Collections.sort(ar, new SortByPts());
	          			
	          			lblGrpTeamA1.setText(ar.get(0).getteamName()); lblPlayedA1.setText(String.valueOf(ar.get(0).getPlayed())); lblWinsA1.setText(String.valueOf(ar.get(0).getWins())); lblDrawsA1.setText(String.valueOf(ar.get(0).getDraws()));   lblLostA1.setText(String.valueOf(ar.get(0).getLoses())); lblGFA1.setText(String.valueOf(ar.get(0).getGF())); lblGAA1.setText(String.valueOf(ar.get(0).getGA())); lblGDA1.setText(String.valueOf(ar.get(0).getGD())); lblPtsA1.setText(String.valueOf(ar.get(0).getPoints()));
	          			lblGrpTeamA2.setText(ar.get(1).getteamName()); lblPlayedA2.setText(String.valueOf(ar.get(1).getPlayed())); lblWinsA2.setText(String.valueOf(ar.get(1).getWins())); lblDrawsA2.setText(String.valueOf(ar.get(1).getDraws()));   lblLostA2.setText(String.valueOf(ar.get(1).getLoses())); lblGFA2.setText(String.valueOf(ar.get(1).getGF())); lblGAA2.setText(String.valueOf(ar.get(1).getGA())); lblGDA2.setText(String.valueOf(ar.get(1).getGD())); lblPtsA2.setText(String.valueOf(ar.get(1).getPoints()));
	          			lblGrpTeamA3.setText(ar.get(2).getteamName()); lblPlayedA3.setText(String.valueOf(ar.get(2).getPlayed())); lblWinsA3.setText(String.valueOf(ar.get(2).getWins())); lblDrawsA3.setText(String.valueOf(ar.get(2).getDraws()));   lblLostA3.setText(String.valueOf(ar.get(2).getLoses())); lblGFA3.setText(String.valueOf(ar.get(2).getGF())); lblGAA3.setText(String.valueOf(ar.get(2).getGA())); lblGDA3.setText(String.valueOf(ar.get(2).getGD())); lblPtsA3.setText(String.valueOf(ar.get(2).getPoints()));
	          			
	          			if(Creator.rdbtnYes.isSelected() && 
	              				ar.get(0).getPoints()==ar.get(1).getPoints() && ar.get(0).getGD()==ar.get(1).getGD() && ar.get(0).getGF() == ar.get(1).getGF() && ar.get(0).getWins() == ar.get(1).getWins() && ar.get(0).getGA() == ar.get(1).getGA() &&
	              				ar.get(1).getPoints()==ar.get(2).getPoints() && ar.get(1).getGD()==ar.get(2).getGD() && ar.get(1).getGF() == ar.get(2).getGF() && ar.get(1).getWins() == ar.get(2).getWins() && ar.get(1).getGA() == ar.get(2).getGA() &&
	              			    ar.get(0).getPoints()==ar.get(2).getPoints() && ar.get(0).getGD()==ar.get(2).getGD() && ar.get(0).getGF() == ar.get(2).getGF() && ar.get(0).getWins() == ar.get(2).getWins() && ar.get(0).getGA() == ar.get(2).getGA()) {
	              				tabelaAPlayoff.setVisible(true);
	    	          			lblPOG1TeamA1.setVisible(true); lblPOG2TeamA1.setVisible(true);
	    	          			lblPOG1TeamA2.setVisible(true); lblPOG2TeamA2.setVisible(true);
	    	          			lblPOG1TeamA3.setVisible(true); lblPOG2TeamA3.setVisible(true);
	    	          			resG1POTeamA1.setVisible(true); resG2POTeamA1.setVisible(true);
	    	          			resG1POTeamA2.setVisible(true); resG2POTeamA2.setVisible(true);
	    	          			resG1POTeamA3.setVisible(true); resG2POTeamA3.setVisible(true);
	    	          			btnAG1PlayOff.setVisible(true); btnAG2PlayOff.setVisible(true); btnAG3PlayOff.setVisible(true);
	    	          			resetAG1PlayOff.setVisible(true); resetAG2PlayOff.setVisible(true); resetAG3PlayOff.setVisible(true);
	    	          			
	    	          			lblPOG1TeamA1.setText(ar.get(0).getteamName()); lblPOG2TeamA1.setText(ar.get(0).getteamName());
	    	          			lblPOG1TeamA2.setText(ar.get(1).getteamName()); lblPOG2TeamA2.setText(ar.get(1).getteamName());
	    	          			lblPOG1TeamA3.setText(ar.get(2).getteamName()); lblPOG2TeamA3.setText(ar.get(2).getteamName());
	    	          			
	    	          			lblPOG4TeamA1.setVisible(false);
	    	          			lblPOG4TeamA2.setVisible(false);
	    	          			resG4POTeamA1.setVisible(false);
	    	          			resG4POTeamA2.setVisible(false);
	    	          			btnAG4PlayOff.setVisible(false);
	    	          			resetAG4PlayOff.setVisible(false);
	    	          			
	    	          			lblPOG5TeamA2.setVisible(false);
	    	          			lblPOG5TeamA3.setVisible(false);
	    	          			resG5POTeamA2.setVisible(false);
	    	          			resG5POTeamA3.setVisible(false);
	    	          			btnAG5PlayOff.setVisible(false);
	    	          			resetAG5PlayOff.setVisible(false);
	    	          			
	              			}
	              			
	              			else if(Creator.rdbtnYes.isSelected() && ar.get(0).getPoints()==ar.get(1).getPoints() && ar.get(0).getGD()==ar.get(1).getGD() && ar.get(0).getGF() == ar.get(1).getGF() && ar.get(0).getWins() == ar.get(1).getWins() && ar.get(0).getGA() == ar.get(1).getGA() ){
	    	          			tabelaAPlayoff.setVisible(true);
	    	          			lblPOG4TeamA1.setVisible(true);
	    	          			lblPOG4TeamA2.setVisible(true);
	    	          			resG4POTeamA1.setVisible(true);
	    	          			resG4POTeamA2.setVisible(true);
	    	          			btnAG4PlayOff.setVisible(true);
	    	          			resetAG4PlayOff.setVisible(true);
	    	          			lblPOG4TeamA1.setText(ar.get(0).getteamName());
	    	          			lblPOG4TeamA2.setText(ar.get(1).getteamName());
	    	          			
	    	          			lblPOG1TeamA1.setVisible(false); lblPOG2TeamA1.setVisible(false);
	    	          			lblPOG1TeamA2.setVisible(false); lblPOG2TeamA2.setVisible(false);
	    	          			lblPOG1TeamA3.setVisible(false); lblPOG2TeamA3.setVisible(false);
	    	          			resG1POTeamA1.setVisible(false); resG2POTeamA1.setVisible(false);
	    	          			resG1POTeamA2.setVisible(false); resG2POTeamA2.setVisible(false);
	    	          			resG1POTeamA3.setVisible(false); resG2POTeamA3.setVisible(false);
	    	          			btnAG1PlayOff.setVisible(false); btnAG2PlayOff.setVisible(false); btnAG3PlayOff.setVisible(false);
	    	          			resetAG1PlayOff.setVisible(false); resetAG2PlayOff.setVisible(false); resetAG3PlayOff.setVisible(false);
	    	          			
	    	          			lblPOG5TeamA2.setVisible(false);
	    	          			lblPOG5TeamA3.setVisible(false);
	    	          			resG5POTeamA2.setVisible(false);
	    	          			resG5POTeamA3.setVisible(false);
	    	          			btnAG5PlayOff.setVisible(false);
	    	          			resetAG5PlayOff.setVisible(false);
	    	          			
	    	          		}
	              			else if(Creator.rdbtnYes.isSelected() && ar.get(1).getPoints()==ar.get(2).getPoints() && ar.get(1).getGD()==ar.get(2).getGD() && ar.get(1).getGF() == ar.get(2).getGF() && ar.get(1).getWins() == ar.get(2).getWins() && ar.get(1).getGA() == ar.get(2).getGA() ){
	    	          			tabelaAPlayoff.setVisible(true);
	    	          			lblPOG5TeamA2.setVisible(true);
	    	          			lblPOG5TeamA3.setVisible(true);
	    	          			resG5POTeamA2.setVisible(true);
	    	          			resG5POTeamA3.setVisible(true);
	    	          			btnAG5PlayOff.setVisible(true);
	    	          			resetAG5PlayOff.setVisible(true);
	    	          			lblPOG5TeamA2.setText(ar.get(1).getteamName());
	    	          			lblPOG5TeamA3.setText(ar.get(2).getteamName());
	    	          			
	    	          			lblPOG1TeamA1.setVisible(false); lblPOG2TeamA1.setVisible(false);
	    	          			lblPOG1TeamA2.setVisible(false); lblPOG2TeamA2.setVisible(false);
	    	          			lblPOG1TeamA3.setVisible(false); lblPOG2TeamA3.setVisible(false);
	    	          			resG1POTeamA1.setVisible(false); resG2POTeamA1.setVisible(false);
	    	          			resG1POTeamA2.setVisible(false); resG2POTeamA2.setVisible(false);
	    	          			resG1POTeamA3.setVisible(false); resG2POTeamA3.setVisible(false);
	    	          			btnAG1PlayOff.setVisible(false); btnAG2PlayOff.setVisible(false); btnAG3PlayOff.setVisible(false);
	    	          			resetAG1PlayOff.setVisible(false); resetAG2PlayOff.setVisible(false); resetAG3PlayOff.setVisible(false);
	    	          			
	    	          			lblPOG4TeamA1.setVisible(false);
	    	          			lblPOG4TeamA2.setVisible(false);
	    	          			resG4POTeamA1.setVisible(false);
	    	          			resG4POTeamA2.setVisible(false);
	    	          			btnAG4PlayOff.setVisible(false);
	    	          			resetAG4PlayOff.setVisible(false);
	    	          		}
	  
		          	}
		          });
			  
			    btnGrpAG5.setFont(new Font("Tahoma", Font.BOLD, 10));
			    btnGrpAG5.setBounds(378, 330, 89, 17);
			    contentPane.add(btnGrpAG5);
			    btnGrpAG5.addActionListener(new ActionListener() {
		          	public void actionPerformed(ActionEvent e) {
		          		gfA1G4=Integer.parseInt(resultA1G4.getText());
		          		gfA3G3=Integer.parseInt(resultA3G3.getText());
		          			          		
		          		if(gfA1G4>gfA3G3) {
		          			wA1G4=1; dA1G4=0; lA1G4=0; uwA1=wA1G1+wA1G2+wA1G3+wA1G4; udA1=dA1G1+dA1G2+dA1G3+dA1G4; ulA1=lA1G1+lA1G2+lA1G3+lA1G4; upA1=uwA1+udA1+ulA1; ptsuA1=3*uwA1+udA1;
		          			wA3G3=0; dA3G3=0; lA3G3=1; uwA3=wA3G1+wA3G2+wA3G3+wA3G4; udA3=dA3G1+dA3G2+dA3G3+dA3G4; ulA3=lA3G1+lA3G2+lA3G3+lA3G4; upA3=uwA3+udA3+ulA3; ptsuA3=3*uwA3+udA3;
		          		}
		          		else if(gfA1G4<gfA3G3) {
		          			wA1G4=0; dA1G4=0; lA1G4=1; uwA1=wA1G1+wA1G2+wA1G3+wA1G4; udA1=dA1G1+dA1G2+dA1G3+dA1G4; ulA1=lA1G1+lA1G2+lA1G3+lA1G4; upA1=uwA1+udA1+ulA1; ptsuA1=3*uwA1+udA1;
		          			wA3G3=1; dA3G3=0; lA3G3=0; uwA3=wA3G1+wA3G2+wA3G3+wA3G4; udA3=dA3G1+dA3G2+dA3G3+dA3G4; ulA3=lA3G1+lA3G2+lA3G3+lA3G4; upA3=uwA3+udA3+ulA3; ptsuA3=3*uwA3+udA3;
		          		}
		          		else if(gfA1G4==gfA3G3) {
		          			dA1G4=1; wA1G4=0; lA1G4=0; uwA1=wA1G1+wA1G2+wA1G3+wA1G4; udA1=dA1G1+dA1G2+dA1G3+dA1G4; ulA1=lA1G1+lA1G2+lA1G3+lA1G4; upA1=uwA1+udA1+ulA1; ptsuA1=3*uwA1+udA1;
		          			dA3G3=1; wA3G3=0; lA3G3=0; uwA3=wA3G1+wA3G2+wA3G3+wA3G4; udA3=dA3G1+dA3G2+dA3G3+dA3G4; ulA3=lA3G1+lA3G2+lA3G3+lA3G4; upA3=uwA3+udA3+ulA3; ptsuA3=3*uwA3+udA3;
		          		}
		          		btnGrpAG5.setEnabled(false);
		          		resultA1G4.setEditable(false);
		          		resultA3G3.setEditable(false);
		          		
		          		ArrayList<TableSort> ar = new ArrayList<TableSort>();
		          		ar.add(new TableSort(String.valueOf(addTeams.teamA1),upA1,uwA1,udA1,ulA1,gfA1G1+gfA1G2+gfA1G3+gfA1G4,gfA2G1+gfA3G1+gfA2G3+gfA3G3,(gfA1G1+gfA1G2+gfA1G3+gfA1G4)-(gfA2G1+gfA3G1+gfA2G3+gfA3G3),ptsuA1));
	          			ar.add(new TableSort(String.valueOf(addTeams.teamA2),upA2,uwA2,udA2,ulA2,gfA2G1+gfA2G2+gfA2G3+gfA2G4,gfA1G1+gfA3G2+gfA1G3+gfA3G4,(gfA2G1+gfA2G2+gfA2G3+gfA2G4)-(gfA1G1+gfA3G2+gfA1G3+gfA3G4),ptsuA2));
	          			ar.add(new TableSort(String.valueOf(addTeams.teamA3),upA3,uwA3,udA3,ulA3,gfA3G1+gfA3G2+gfA3G3+gfA3G4,gfA1G2+gfA2G2+gfA1G4+gfA2G4,(gfA3G1+gfA3G2+gfA3G3+gfA3G4)-(gfA1G2+gfA2G2+gfA1G4+gfA2G4),ptsuA3));
	          			
	          			Collections.sort(ar, new SortByPts());
	          			
	          			lblGrpTeamA1.setText(ar.get(0).getteamName()); lblPlayedA1.setText(String.valueOf(ar.get(0).getPlayed())); lblWinsA1.setText(String.valueOf(ar.get(0).getWins())); lblDrawsA1.setText(String.valueOf(ar.get(0).getDraws()));   lblLostA1.setText(String.valueOf(ar.get(0).getLoses())); lblGFA1.setText(String.valueOf(ar.get(0).getGF())); lblGAA1.setText(String.valueOf(ar.get(0).getGA())); lblGDA1.setText(String.valueOf(ar.get(0).getGD())); lblPtsA1.setText(String.valueOf(ar.get(0).getPoints()));
	          			lblGrpTeamA2.setText(ar.get(1).getteamName()); lblPlayedA2.setText(String.valueOf(ar.get(1).getPlayed())); lblWinsA2.setText(String.valueOf(ar.get(1).getWins())); lblDrawsA2.setText(String.valueOf(ar.get(1).getDraws()));   lblLostA2.setText(String.valueOf(ar.get(1).getLoses())); lblGFA2.setText(String.valueOf(ar.get(1).getGF())); lblGAA2.setText(String.valueOf(ar.get(1).getGA())); lblGDA2.setText(String.valueOf(ar.get(1).getGD())); lblPtsA2.setText(String.valueOf(ar.get(1).getPoints()));
	          			lblGrpTeamA3.setText(ar.get(2).getteamName()); lblPlayedA3.setText(String.valueOf(ar.get(2).getPlayed())); lblWinsA3.setText(String.valueOf(ar.get(2).getWins())); lblDrawsA3.setText(String.valueOf(ar.get(2).getDraws()));   lblLostA3.setText(String.valueOf(ar.get(2).getLoses())); lblGFA3.setText(String.valueOf(ar.get(2).getGF())); lblGAA3.setText(String.valueOf(ar.get(2).getGA())); lblGDA3.setText(String.valueOf(ar.get(2).getGD())); lblPtsA3.setText(String.valueOf(ar.get(2).getPoints()));
	          			
	          			if(Creator.rdbtnYes.isSelected() && 
	              				ar.get(0).getPoints()==ar.get(1).getPoints() && ar.get(0).getGD()==ar.get(1).getGD() && ar.get(0).getGF() == ar.get(1).getGF() && ar.get(0).getWins() == ar.get(1).getWins() && ar.get(0).getGA() == ar.get(1).getGA() &&
	              				ar.get(1).getPoints()==ar.get(2).getPoints() && ar.get(1).getGD()==ar.get(2).getGD() && ar.get(1).getGF() == ar.get(2).getGF() && ar.get(1).getWins() == ar.get(2).getWins() && ar.get(1).getGA() == ar.get(2).getGA() &&
	              			    ar.get(0).getPoints()==ar.get(2).getPoints() && ar.get(0).getGD()==ar.get(2).getGD() && ar.get(0).getGF() == ar.get(2).getGF() && ar.get(0).getWins() == ar.get(2).getWins() && ar.get(0).getGA() == ar.get(2).getGA()) {
	              				tabelaAPlayoff.setVisible(true);
	    	          			lblPOG1TeamA1.setVisible(true); lblPOG2TeamA1.setVisible(true);
	    	          			lblPOG1TeamA2.setVisible(true); lblPOG2TeamA2.setVisible(true);
	    	          			lblPOG1TeamA3.setVisible(true); lblPOG2TeamA3.setVisible(true);
	    	          			resG1POTeamA1.setVisible(true); resG2POTeamA1.setVisible(true);
	    	          			resG1POTeamA2.setVisible(true); resG2POTeamA2.setVisible(true);
	    	          			resG1POTeamA3.setVisible(true); resG2POTeamA3.setVisible(true);
	    	          			btnAG1PlayOff.setVisible(true); btnAG2PlayOff.setVisible(true); btnAG3PlayOff.setVisible(true);
	    	          			resetAG1PlayOff.setVisible(true); resetAG2PlayOff.setVisible(true); resetAG3PlayOff.setVisible(true);
	    	          			
	    	          			lblPOG1TeamA1.setText(ar.get(0).getteamName()); lblPOG2TeamA1.setText(ar.get(0).getteamName());
	    	          			lblPOG1TeamA2.setText(ar.get(1).getteamName()); lblPOG2TeamA2.setText(ar.get(1).getteamName());
	    	          			lblPOG1TeamA3.setText(ar.get(2).getteamName()); lblPOG2TeamA3.setText(ar.get(2).getteamName());
	    	          			
	    	          			lblPOG4TeamA1.setVisible(false);
	    	          			lblPOG4TeamA2.setVisible(false);
	    	          			resG4POTeamA1.setVisible(false);
	    	          			resG4POTeamA2.setVisible(false);
	    	          			btnAG4PlayOff.setVisible(false);
	    	          			resetAG4PlayOff.setVisible(false);
	    	          			
	    	          			lblPOG5TeamA2.setVisible(false);
	    	          			lblPOG5TeamA3.setVisible(false);
	    	          			resG5POTeamA2.setVisible(false);
	    	          			resG5POTeamA3.setVisible(false);
	    	          			btnAG5PlayOff.setVisible(false);
	    	          			resetAG5PlayOff.setVisible(false);
	    	          			
	              			}
	              			
	              			else if(Creator.rdbtnYes.isSelected() && ar.get(0).getPoints()==ar.get(1).getPoints() && ar.get(0).getGD()==ar.get(1).getGD() && ar.get(0).getGF() == ar.get(1).getGF() && ar.get(0).getWins() == ar.get(1).getWins() && ar.get(0).getGA() == ar.get(1).getGA() ){
	    	          			tabelaAPlayoff.setVisible(true);
	    	          			lblPOG4TeamA1.setVisible(true);
	    	          			lblPOG4TeamA2.setVisible(true);
	    	          			resG4POTeamA1.setVisible(true);
	    	          			resG4POTeamA2.setVisible(true);
	    	          			btnAG4PlayOff.setVisible(true);
	    	          			resetAG4PlayOff.setVisible(true);
	    	          			lblPOG4TeamA1.setText(ar.get(0).getteamName());
	    	          			lblPOG4TeamA2.setText(ar.get(1).getteamName());
	    	          			
	    	          			lblPOG1TeamA1.setVisible(false); lblPOG2TeamA1.setVisible(false);
	    	          			lblPOG1TeamA2.setVisible(false); lblPOG2TeamA2.setVisible(false);
	    	          			lblPOG1TeamA3.setVisible(false); lblPOG2TeamA3.setVisible(false);
	    	          			resG1POTeamA1.setVisible(false); resG2POTeamA1.setVisible(false);
	    	          			resG1POTeamA2.setVisible(false); resG2POTeamA2.setVisible(false);
	    	          			resG1POTeamA3.setVisible(false); resG2POTeamA3.setVisible(false);
	    	          			btnAG1PlayOff.setVisible(false); btnAG2PlayOff.setVisible(false); btnAG3PlayOff.setVisible(false);
	    	          			resetAG1PlayOff.setVisible(false); resetAG2PlayOff.setVisible(false); resetAG3PlayOff.setVisible(false);
	    	          			
	    	          			lblPOG5TeamA2.setVisible(false);
	    	          			lblPOG5TeamA3.setVisible(false);
	    	          			resG5POTeamA2.setVisible(false);
	    	          			resG5POTeamA3.setVisible(false);
	    	          			btnAG5PlayOff.setVisible(false);
	    	          			resetAG5PlayOff.setVisible(false);
	    	          			
	    	          		}
	              			else if(Creator.rdbtnYes.isSelected() && ar.get(1).getPoints()==ar.get(2).getPoints() && ar.get(1).getGD()==ar.get(2).getGD() && ar.get(1).getGF() == ar.get(2).getGF() && ar.get(1).getWins() == ar.get(2).getWins() && ar.get(1).getGA() == ar.get(2).getGA() ){
	    	          			tabelaAPlayoff.setVisible(true);
	    	          			lblPOG5TeamA2.setVisible(true);
	    	          			lblPOG5TeamA3.setVisible(true);
	    	          			resG5POTeamA2.setVisible(true);
	    	          			resG5POTeamA3.setVisible(true);
	    	          			btnAG5PlayOff.setVisible(true);
	    	          			resetAG5PlayOff.setVisible(true);
	    	          			lblPOG5TeamA2.setText(ar.get(1).getteamName());
	    	          			lblPOG5TeamA3.setText(ar.get(2).getteamName());
	    	          			
	    	          			lblPOG1TeamA1.setVisible(false); lblPOG2TeamA1.setVisible(false);
	    	          			lblPOG1TeamA2.setVisible(false); lblPOG2TeamA2.setVisible(false);
	    	          			lblPOG1TeamA3.setVisible(false); lblPOG2TeamA3.setVisible(false);
	    	          			resG1POTeamA1.setVisible(false); resG2POTeamA1.setVisible(false);
	    	          			resG1POTeamA2.setVisible(false); resG2POTeamA2.setVisible(false);
	    	          			resG1POTeamA3.setVisible(false); resG2POTeamA3.setVisible(false);
	    	          			btnAG1PlayOff.setVisible(false); btnAG2PlayOff.setVisible(false); btnAG3PlayOff.setVisible(false);
	    	          			resetAG1PlayOff.setVisible(false); resetAG2PlayOff.setVisible(false); resetAG3PlayOff.setVisible(false);
	    	          			
	    	          			lblPOG4TeamA1.setVisible(false);
	    	          			lblPOG4TeamA2.setVisible(false);
	    	          			resG4POTeamA1.setVisible(false);
	    	          			resG4POTeamA2.setVisible(false);
	    	          			btnAG4PlayOff.setVisible(false);
	    	          			resetAG4PlayOff.setVisible(false);
	    	          		}
		          	}
		          });
			  
			    btnGrpAG6.setFont(new Font("Tahoma", Font.BOLD, 10));
			    btnGrpAG6.setBounds(378, 358, 89, 17);
			    contentPane.add(btnGrpAG6);
			    btnGrpAG6.addActionListener(new ActionListener() {
		          	public void actionPerformed(ActionEvent e) {
		          		gfA2G4=Integer.parseInt(resultA2G4.getText());
		          		gfA3G4=Integer.parseInt(resultA3G4.getText());
		          			          		
		          		if(gfA2G4>gfA3G4) {
		          			wA2G4=1; dA2G4=0; lA2G4=0; uwA2=wA2G1+wA2G2+wA2G3+wA2G4; udA2=dA2G1+dA2G2+dA2G3+dA2G4; ulA2=lA2G1+lA2G2+lA2G3+lA2G4; upA2=uwA2+udA2+ulA2; ptsuA2=3*uwA2+udA2;
		          			wA3G4=0; dA3G4=0; lA3G4=1; uwA3=wA3G1+wA3G2+wA3G3+wA3G4; udA3=dA3G1+dA3G2+dA3G3+dA3G4; ulA3=lA3G1+lA3G2+lA3G3+lA3G4; upA3=uwA3+udA3+ulA3; ptsuA3=3*uwA3+udA3;
		          		}
		          		else if(gfA2G4<gfA3G4) {
		          			wA2G4=0; dA2G4=0; lA2G4=1; uwA2=wA2G1+wA2G2+wA2G3+wA2G4; udA2=dA2G1+dA2G2+dA2G3+dA2G4; ulA2=lA2G1+lA2G2+lA2G3+lA2G4; upA2=uwA2+udA2+ulA2; ptsuA2=3*uwA2+udA2;
		          			wA3G4=1; dA3G4=0; lA3G4=0; uwA3=wA3G1+wA3G2+wA3G3+wA3G4; udA3=dA3G1+dA3G2+dA3G3+dA3G4; ulA3=lA3G1+lA3G2+lA3G3+lA3G4; upA3=uwA3+udA3+ulA3; ptsuA3=3*uwA3+udA3;
		          		}
		          		else if(gfA2G4==gfA3G4) {
		          			dA2G4=1; wA2G4=0; lA2G4=0; uwA2=wA2G1+wA2G2+wA2G3+wA2G4; udA2=dA2G1+dA2G2+dA2G3+dA2G4; ulA2=lA2G1+lA2G2+lA2G3+lA2G4; upA2=uwA2+udA2+ulA2; ptsuA2=3*uwA2+udA2;
		          			dA3G4=1; wA3G4=0; lA3G4=0; uwA3=wA3G1+wA3G2+wA3G3+wA3G4; udA3=dA3G1+dA3G2+dA3G3+dA3G4; ulA3=lA3G1+lA3G2+lA3G3+lA3G4; upA3=uwA3+udA3+ulA3; ptsuA3=3*uwA3+udA3;
		          		}
		          		btnGrpAG6.setEnabled(false);
		          		resultA2G4.setEditable(false);
		          		resultA3G4.setEditable(false);
		          		
		          		ArrayList<TableSort> ar = new ArrayList<TableSort>();
		          		ar.add(new TableSort(String.valueOf(addTeams.teamA1),upA1,uwA1,udA1,ulA1,gfA1G1+gfA1G2+gfA1G3+gfA1G4,gfA2G1+gfA3G1+gfA2G3+gfA3G3,(gfA1G1+gfA1G2+gfA1G3+gfA1G4)-(gfA2G1+gfA3G1+gfA2G3+gfA3G3),ptsuA1));
	          			ar.add(new TableSort(String.valueOf(addTeams.teamA2),upA2,uwA2,udA2,ulA2,gfA2G1+gfA2G2+gfA2G3+gfA2G4,gfA1G1+gfA3G2+gfA1G3+gfA3G4,(gfA2G1+gfA2G2+gfA2G3+gfA2G4)-(gfA1G1+gfA3G2+gfA1G3+gfA3G4),ptsuA2));
	          			ar.add(new TableSort(String.valueOf(addTeams.teamA3),upA3,uwA3,udA3,ulA3,gfA3G1+gfA3G2+gfA3G3+gfA3G4,gfA1G2+gfA2G2+gfA1G4+gfA2G4,(gfA3G1+gfA3G2+gfA3G3+gfA3G4)-(gfA1G2+gfA2G2+gfA1G4+gfA2G4),ptsuA3));
	          			
	          			Collections.sort(ar, new SortByPts());
	          			
	          			lblGrpTeamA1.setText(ar.get(0).getteamName()); lblPlayedA1.setText(String.valueOf(ar.get(0).getPlayed())); lblWinsA1.setText(String.valueOf(ar.get(0).getWins())); lblDrawsA1.setText(String.valueOf(ar.get(0).getDraws()));   lblLostA1.setText(String.valueOf(ar.get(0).getLoses())); lblGFA1.setText(String.valueOf(ar.get(0).getGF())); lblGAA1.setText(String.valueOf(ar.get(0).getGA())); lblGDA1.setText(String.valueOf(ar.get(0).getGD())); lblPtsA1.setText(String.valueOf(ar.get(0).getPoints()));
	          			lblGrpTeamA2.setText(ar.get(1).getteamName()); lblPlayedA2.setText(String.valueOf(ar.get(1).getPlayed())); lblWinsA2.setText(String.valueOf(ar.get(1).getWins())); lblDrawsA2.setText(String.valueOf(ar.get(1).getDraws()));   lblLostA2.setText(String.valueOf(ar.get(1).getLoses())); lblGFA2.setText(String.valueOf(ar.get(1).getGF())); lblGAA2.setText(String.valueOf(ar.get(1).getGA())); lblGDA2.setText(String.valueOf(ar.get(1).getGD())); lblPtsA2.setText(String.valueOf(ar.get(1).getPoints()));
	          			lblGrpTeamA3.setText(ar.get(2).getteamName()); lblPlayedA3.setText(String.valueOf(ar.get(2).getPlayed())); lblWinsA3.setText(String.valueOf(ar.get(2).getWins())); lblDrawsA3.setText(String.valueOf(ar.get(2).getDraws()));   lblLostA3.setText(String.valueOf(ar.get(2).getLoses())); lblGFA3.setText(String.valueOf(ar.get(2).getGF())); lblGAA3.setText(String.valueOf(ar.get(2).getGA())); lblGDA3.setText(String.valueOf(ar.get(2).getGD())); lblPtsA3.setText(String.valueOf(ar.get(2).getPoints()));
	          			
	          			if(Creator.rdbtnYes.isSelected() && 
	              				ar.get(0).getPoints()==ar.get(1).getPoints() && ar.get(0).getGD()==ar.get(1).getGD() && ar.get(0).getGF() == ar.get(1).getGF() && ar.get(0).getWins() == ar.get(1).getWins() && ar.get(0).getGA() == ar.get(1).getGA() &&
	              				ar.get(1).getPoints()==ar.get(2).getPoints() && ar.get(1).getGD()==ar.get(2).getGD() && ar.get(1).getGF() == ar.get(2).getGF() && ar.get(1).getWins() == ar.get(2).getWins() && ar.get(1).getGA() == ar.get(2).getGA() &&
	              			    ar.get(0).getPoints()==ar.get(2).getPoints() && ar.get(0).getGD()==ar.get(2).getGD() && ar.get(0).getGF() == ar.get(2).getGF() && ar.get(0).getWins() == ar.get(2).getWins() && ar.get(0).getGA() == ar.get(2).getGA()) {
	              				tabelaAPlayoff.setVisible(true);
	    	          			lblPOG1TeamA1.setVisible(true); lblPOG2TeamA1.setVisible(true);
	    	          			lblPOG1TeamA2.setVisible(true); lblPOG2TeamA2.setVisible(true);
	    	          			lblPOG1TeamA3.setVisible(true); lblPOG2TeamA3.setVisible(true);
	    	          			resG1POTeamA1.setVisible(true); resG2POTeamA1.setVisible(true);
	    	          			resG1POTeamA2.setVisible(true); resG2POTeamA2.setVisible(true);
	    	          			resG1POTeamA3.setVisible(true); resG2POTeamA3.setVisible(true);
	    	          			btnAG1PlayOff.setVisible(true); btnAG2PlayOff.setVisible(true); btnAG3PlayOff.setVisible(true);
	    	          			resetAG1PlayOff.setVisible(true); resetAG2PlayOff.setVisible(true); resetAG3PlayOff.setVisible(true);
	    	          			
	    	          			lblPOG1TeamA1.setText(ar.get(0).getteamName()); lblPOG2TeamA1.setText(ar.get(0).getteamName());
	    	          			lblPOG1TeamA2.setText(ar.get(1).getteamName()); lblPOG2TeamA2.setText(ar.get(1).getteamName());
	    	          			lblPOG1TeamA3.setText(ar.get(2).getteamName()); lblPOG2TeamA3.setText(ar.get(2).getteamName());
	    	          			
	    	          			lblPOG4TeamA1.setVisible(false);
	    	          			lblPOG4TeamA2.setVisible(false);
	    	          			resG4POTeamA1.setVisible(false);
	    	          			resG4POTeamA2.setVisible(false);
	    	          			btnAG4PlayOff.setVisible(false);
	    	          			resetAG4PlayOff.setVisible(false);
	    	          			
	    	          			lblPOG5TeamA2.setVisible(false);
	    	          			lblPOG5TeamA3.setVisible(false);
	    	          			resG5POTeamA2.setVisible(false);
	    	          			resG5POTeamA3.setVisible(false);
	    	          			btnAG5PlayOff.setVisible(false);
	    	          			resetAG5PlayOff.setVisible(false);
	    	          			
	              			}
	              			
	              			else if(Creator.rdbtnYes.isSelected() && ar.get(0).getPoints()==ar.get(1).getPoints() && ar.get(0).getGD()==ar.get(1).getGD() && ar.get(0).getGF() == ar.get(1).getGF() && ar.get(0).getWins() == ar.get(1).getWins() && ar.get(0).getGA() == ar.get(1).getGA() ){
	    	          			tabelaAPlayoff.setVisible(true);
	    	          			lblPOG4TeamA1.setVisible(true);
	    	          			lblPOG4TeamA2.setVisible(true);
	    	          			resG4POTeamA1.setVisible(true);
	    	          			resG4POTeamA2.setVisible(true);
	    	          			btnAG4PlayOff.setVisible(true);
	    	          			resetAG4PlayOff.setVisible(true);
	    	          			lblPOG4TeamA1.setText(ar.get(0).getteamName());
	    	          			lblPOG4TeamA2.setText(ar.get(1).getteamName());
	    	          			
	    	          			lblPOG1TeamA1.setVisible(false); lblPOG2TeamA1.setVisible(false);
	    	          			lblPOG1TeamA2.setVisible(false); lblPOG2TeamA2.setVisible(false);
	    	          			lblPOG1TeamA3.setVisible(false); lblPOG2TeamA3.setVisible(false);
	    	          			resG1POTeamA1.setVisible(false); resG2POTeamA1.setVisible(false);
	    	          			resG1POTeamA2.setVisible(false); resG2POTeamA2.setVisible(false);
	    	          			resG1POTeamA3.setVisible(false); resG2POTeamA3.setVisible(false);
	    	          			btnAG1PlayOff.setVisible(false); btnAG2PlayOff.setVisible(false); btnAG3PlayOff.setVisible(false);
	    	          			resetAG1PlayOff.setVisible(false); resetAG2PlayOff.setVisible(false); resetAG3PlayOff.setVisible(false);
	    	          			
	    	          			lblPOG5TeamA2.setVisible(false);
	    	          			lblPOG5TeamA3.setVisible(false);
	    	          			resG5POTeamA2.setVisible(false);
	    	          			resG5POTeamA3.setVisible(false);
	    	          			btnAG5PlayOff.setVisible(false);
	    	          			resetAG5PlayOff.setVisible(false);
	    	          			
	    	          		}
	              			else if(Creator.rdbtnYes.isSelected() && ar.get(1).getPoints()==ar.get(2).getPoints() && ar.get(1).getGD()==ar.get(2).getGD() && ar.get(1).getGF() == ar.get(2).getGF() && ar.get(1).getWins() == ar.get(2).getWins() && ar.get(1).getGA() == ar.get(2).getGA() ){
	    	          			tabelaAPlayoff.setVisible(true);
	    	          			lblPOG5TeamA2.setVisible(true);
	    	          			lblPOG5TeamA3.setVisible(true);
	    	          			resG5POTeamA2.setVisible(true);
	    	          			resG5POTeamA3.setVisible(true);
	    	          			btnAG5PlayOff.setVisible(true);
	    	          			resetAG5PlayOff.setVisible(true);
	    	          			lblPOG5TeamA2.setText(ar.get(1).getteamName());
	    	          			lblPOG5TeamA3.setText(ar.get(2).getteamName());
	    	          			
	    	          			lblPOG1TeamA1.setVisible(false); lblPOG2TeamA1.setVisible(false);
	    	          			lblPOG1TeamA2.setVisible(false); lblPOG2TeamA2.setVisible(false);
	    	          			lblPOG1TeamA3.setVisible(false); lblPOG2TeamA3.setVisible(false);
	    	          			resG1POTeamA1.setVisible(false); resG2POTeamA1.setVisible(false);
	    	          			resG1POTeamA2.setVisible(false); resG2POTeamA2.setVisible(false);
	    	          			resG1POTeamA3.setVisible(false); resG2POTeamA3.setVisible(false);
	    	          			btnAG1PlayOff.setVisible(false); btnAG2PlayOff.setVisible(false); btnAG3PlayOff.setVisible(false);
	    	          			resetAG1PlayOff.setVisible(false); resetAG2PlayOff.setVisible(false); resetAG3PlayOff.setVisible(false);
	    	          			
	    	          			lblPOG4TeamA1.setVisible(false);
	    	          			lblPOG4TeamA2.setVisible(false);
	    	          			resG4POTeamA1.setVisible(false);
	    	          			resG4POTeamA2.setVisible(false);
	    	          			btnAG4PlayOff.setVisible(false);
	    	          			resetAG4PlayOff.setVisible(false);
	    	          		}
	          			
		          	}
		          });
			  
			  
		 //TABELA B-------------------------------------------------------------------------------------------------------------------------------------------  
			  JLabel lblPositionB = new JLabel("#");							JLabel lblTeamB = new JLabel("Team");
			  lblPositionB.setHorizontalAlignment(SwingConstants.CENTER);		lblTeamB.setHorizontalAlignment(SwingConstants.CENTER);
			  lblPositionB.setFont(new Font("Tahoma", Font.BOLD, 12));			lblTeamB.setFont(new Font("Tahoma", Font.BOLD, 12));
			  lblPositionB.setBounds(569, 89, 29, 14);							lblTeamB.setBounds(608, 89, 71, 14);
			  contentPane.add(lblPositionB);									contentPane.add(lblTeamB);
			  
			  JLabel lblPB = new JLabel("P");									JLabel lblWB = new JLabel("W");
			  lblPB.setHorizontalAlignment(SwingConstants.CENTER);				lblWB.setHorizontalAlignment(SwingConstants.CENTER);
			  lblPB.setFont(new Font("Tahoma", Font.BOLD, 12));					lblWB.setFont(new Font("Tahoma", Font.BOLD, 12));
			  lblPB.setBounds(731, 89, 29, 14);								lblWB.setBounds(764, 89, 29, 14);
			  contentPane.add(lblPB);											contentPane.add(lblWB);
			  
			  JLabel lblDB = new JLabel("D");									JLabel lblLB = new JLabel("L");
			  lblDB.setHorizontalAlignment(SwingConstants.CENTER);				lblLB.setHorizontalAlignment(SwingConstants.CENTER);
			  lblDB.setFont(new Font("Tahoma", Font.BOLD, 12));					lblLB.setFont(new Font("Tahoma", Font.BOLD, 12));
			  lblDB.setBounds(797, 89, 29, 14);								lblLB.setBounds(830, 89, 29, 14);
			  contentPane.add(lblDB);											contentPane.add(lblLB);
			  
			  JLabel lblGfB = new JLabel("GF");									JLabel lblGaB = new JLabel("GA");
			  lblGfB.setHorizontalAlignment(SwingConstants.CENTER);				lblGaB.setHorizontalAlignment(SwingConstants.CENTER);
			  lblGfB.setFont(new Font("Tahoma", Font.BOLD, 12));				lblGaB.setFont(new Font("Tahoma", Font.BOLD, 12));
			  lblGfB.setBounds(863, 89, 29, 14);								lblGaB.setBounds(896, 89, 29, 14);
			  contentPane.add(lblGfB);											contentPane.add(lblGaB);
			  
			  JLabel lblGdB = new JLabel("GD");									JLabel lblPtsB = new JLabel("PTS");
			  lblGdB.setHorizontalAlignment(SwingConstants.CENTER);				lblPtsB.setHorizontalAlignment(SwingConstants.CENTER);
			  lblGdB.setFont(new Font("Tahoma", Font.BOLD, 12));				lblPtsB.setFont(new Font("Tahoma", Font.BOLD, 12));
			  lblGdB.setBounds(929, 89, 29, 14);								lblPtsB.setBounds(962, 89, 29, 14);
			  contentPane.add(lblGdB);											contentPane.add(lblPtsB);
			  
			  JLabel lblPosition1GrpB = new JLabel("1");						JLabel lblPosition2GrpB = new JLabel("2");
			  lblPosition1GrpB.setOpaque(true);									lblPosition2GrpB.setOpaque(true);
			  lblPosition1GrpB.setHorizontalAlignment(SwingConstants.LEFT);		lblPosition2GrpB.setHorizontalAlignment(SwingConstants.LEFT);
			  lblPosition1GrpB.setForeground(Color.BLACK);						lblPosition2GrpB.setForeground(Color.BLACK);
			  lblPosition1GrpB.setFont(new Font("Tahoma", Font.BOLD, 12));		lblPosition2GrpB.setFont(new Font("Tahoma", Font.BOLD, 12));
			  lblPosition1GrpB.setBackground(new Color(0, 204, 102));			lblPosition2GrpB.setBackground(new Color(0, 204, 102));
			  lblPosition1GrpB.setBounds(579, 114, 412, 20);					lblPosition2GrpB.setBounds(579, 132, 412, 20);
			  contentPane.add(lblPosition1GrpB);								contentPane.add(lblPosition2GrpB);
			 
			  JLabel lblPosition3GrpB = new JLabel("3");
			  lblPosition3GrpB.setOpaque(true);
			  lblPosition3GrpB.setHorizontalAlignment(SwingConstants.LEFT);
			  lblPosition3GrpB.setForeground(Color.BLACK);
			  lblPosition3GrpB.setFont(new Font("Tahoma", Font.BOLD, 12));
			  lblPosition3GrpB.setBackground(Color.WHITE);
			  lblPosition3GrpB.setBounds(579, 150, 412, 20);
			  contentPane.add(lblPosition3GrpB);
			  
		//REZULTATI B--------------------------------------------------------------------------------------------------------------------------------------- 
			  JFormattedTextField resultB1G1 = new JFormattedTextField(formatter);		JFormattedTextField resultB1G2 = new JFormattedTextField(formatter);
			  resultB1G1.setHorizontalAlignment(SwingConstants.CENTER);					resultB1G2.setHorizontalAlignment(SwingConstants.CENTER);
			  resultB1G1.setBounds(718, 218, 23, 17);									resultB1G2.setBounds(751, 246, 23, 17);
			  contentPane.add(resultB1G1);												contentPane.add(resultB1G2);
			  
			  JFormattedTextField resultB2G1 = new JFormattedTextField(formatter);		JFormattedTextField resultB2G2 = new JFormattedTextField(formatter);
			  resultB2G1.setHorizontalAlignment(SwingConstants.CENTER);					resultB2G2.setHorizontalAlignment(SwingConstants.CENTER);
			  resultB2G1.setBounds(751, 218, 23, 17);									resultB2G2.setBounds(718, 274, 23, 17);
			  contentPane.add(resultB2G1);												contentPane.add(resultB2G2);
			  
			  JFormattedTextField resultB3G1 = new JFormattedTextField(formatter);		JFormattedTextField resultB3G2 = new JFormattedTextField(formatter);
			  resultB3G1.setHorizontalAlignment(SwingConstants.CENTER);					resultB3G2.setHorizontalAlignment(SwingConstants.CENTER);
			  resultB3G1.setBounds(718, 246, 23, 17);									resultB3G2.setBounds(751, 274, 23, 17);
			  contentPane.add(resultB3G1);												contentPane.add(resultB3G2);
			  
			  JFormattedTextField resultB2G3 = new JFormattedTextField(formatter);		JFormattedTextField resultB2G4 = new JFormattedTextField(formatter);
			  resultB2G3.setHorizontalAlignment(SwingConstants.CENTER);					resultB2G4.setHorizontalAlignment(SwingConstants.CENTER);
			  resultB2G3.setBounds(718, 302, 23, 17);									resultB2G4.setBounds(751, 358, 23, 17);
			  contentPane.add(resultB2G3);												contentPane.add(resultB2G4);
			  if(Creator.rdbtnNo.isSelected()) { resultB2G3.setVisible(false); }        if(Creator.rdbtnNo.isSelected()) { resultB2G4.setVisible(false);}
			  
			  JFormattedTextField resultB3G3 = new JFormattedTextField(formatter);		JFormattedTextField resultB3G4 = new JFormattedTextField(formatter);
			  resultB3G3.setHorizontalAlignment(SwingConstants.CENTER);					resultB3G4.setHorizontalAlignment(SwingConstants.CENTER);
			  resultB3G3.setBounds(751, 330, 23, 17);									resultB3G4.setBounds(718, 358, 23, 17);
			  contentPane.add(resultB3G3);												contentPane.add(resultB3G4);
			  if(Creator.rdbtnNo.isSelected()) { resultB3G3.setVisible(false); }        if(Creator.rdbtnNo.isSelected()) { resultB3G4.setVisible(false);}
			  
			  JFormattedTextField resultB1G3 = new JFormattedTextField(formatter);		JFormattedTextField resultB1G4 = new JFormattedTextField(formatter);
			  resultB1G3.setHorizontalAlignment(SwingConstants.CENTER);					resultB1G4.setHorizontalAlignment(SwingConstants.CENTER);
			  resultB1G3.setBounds(751, 302, 23, 17);									resultB1G4.setBounds(718, 330, 23, 17);
			  contentPane.add(resultB1G3);												contentPane.add(resultB1G4);
			  if(Creator.rdbtnNo.isSelected()) { resultB1G3.setVisible(false); }        if(Creator.rdbtnNo.isSelected()) { resultB1G4.setVisible(false);}
			  
			  JLabel lblTeamB1G1 = new JLabel("New label"); 				JLabel lblTeamB1G2 = new JLabel("New label");
			  lblTeamB1G1.setHorizontalAlignment(SwingConstants.CENTER);	lblTeamB1G2.setHorizontalAlignment(SwingConstants.CENTER);
			  lblTeamB1G1.setBounds(569, 218, 118, 14);     				lblTeamB1G2.setBounds(828, 246, 118, 14);
			  lblTeamB1G1.setText(addTeams.teamB1); 				  		lblTeamB1G2.setText(addTeams.teamB1);
			  contentPane.add(lblTeamB1G1);				  					contentPane.add(lblTeamB1G2);
	        
			  JLabel lblTeamB2G2 = new JLabel("New label"); 				JLabel lblTeamB2G1 = new JLabel("New label");
			  lblTeamB2G2.setHorizontalAlignment(SwingConstants.CENTER);	lblTeamB2G1.setHorizontalAlignment(SwingConstants.CENTER);
			  lblTeamB2G2.setBounds(569, 274, 118, 14);     				lblTeamB2G1.setBounds(828, 218, 118, 14);
			  lblTeamB2G2.setText(addTeams.teamB2);  				  		lblTeamB2G1.setText(addTeams.teamB2);
			  contentPane.add(lblTeamB2G2);				  					contentPane.add(lblTeamB2G1);
	        
			  JLabel lblTeamB3G1 = new JLabel("New label"); 				JLabel lblTeamB3G2 = new JLabel("New label");
			  lblTeamB3G1.setHorizontalAlignment(SwingConstants.CENTER);	lblTeamB3G2.setHorizontalAlignment(SwingConstants.CENTER);
			  lblTeamB3G1.setBounds(569, 246, 118, 14);	  					lblTeamB3G2.setBounds(828, 274, 118, 14);
			  lblTeamB3G1.setText(addTeams.teamB3);  				  		lblTeamB3G2.setText(addTeams.teamB3);
			  contentPane.add(lblTeamB3G1);				  					contentPane.add(lblTeamB3G2);
			  
			  JLabel lblTeamB1G3 = new JLabel((String) null);							JLabel lblTeamB1G4 = new JLabel((String) null);
			  lblTeamB1G3.setHorizontalAlignment(SwingConstants.CENTER);				lblTeamB1G4.setHorizontalAlignment(SwingConstants.CENTER);
			  lblTeamB1G3.setBounds(828, 302, 118, 14);									lblTeamB1G4.setBounds(569, 330, 118, 14);
			  lblTeamB1G3.setText(addTeams.teamB1); 									lblTeamB1G4.setText(addTeams.teamB1);
			  contentPane.add(lblTeamB1G3);												contentPane.add(lblTeamB1G4);
			  if(Creator.rdbtnNo.isSelected()) { lblTeamB1G3.setVisible(false); }       if(Creator.rdbtnNo.isSelected()) { lblTeamB1G4.setVisible(false);}
			  
			  JLabel lblTeamB2G3 = new JLabel((String) null);							JLabel lblTeamB2G4 = new JLabel((String) null);
			  lblTeamB2G3.setHorizontalAlignment(SwingConstants.CENTER);				lblTeamB2G4.setHorizontalAlignment(SwingConstants.CENTER);
			  lblTeamB2G3.setBounds(569, 302, 118, 14);									lblTeamB2G4.setBounds(828, 358, 118, 14);
			  lblTeamB2G3.setText(addTeams.teamB2);										lblTeamB2G4.setText(addTeams.teamB2);
			  contentPane.add(lblTeamB2G3);												contentPane.add(lblTeamB2G4);
			  if(Creator.rdbtnNo.isSelected()) { lblTeamB2G3.setVisible(false); }       if(Creator.rdbtnNo.isSelected()) { lblTeamB2G4.setVisible(false);}
			  
			  JLabel lblTeamB3G3 = new JLabel((String) null);							JLabel lblTeamB3G4 = new JLabel((String) null);
			  lblTeamB3G3.setHorizontalAlignment(SwingConstants.CENTER);				lblTeamB3G4.setHorizontalAlignment(SwingConstants.CENTER);
			  lblTeamB3G3.setBounds(828, 330, 118, 14);									lblTeamB3G4.setBounds(569, 358, 118, 14);
			  lblTeamB3G3.setText(addTeams.teamB3); 									lblTeamB3G4.setText(addTeams.teamB3);
			  contentPane.add(lblTeamB3G3);												contentPane.add(lblTeamB3G4);
			  if(Creator.rdbtnNo.isSelected()) { lblTeamB3G3.setVisible(false); }       if(Creator.rdbtnNo.isSelected()) { lblTeamB3G4.setVisible(false);}
			   
				  JButton btnGrpBG1 = new JButton("AddResult"); 
				  btnGrpBG1.addActionListener(new ActionListener() {
			          	public void actionPerformed(ActionEvent e) {
			          		gfB1G1=Integer.parseInt(resultB1G1.getText());
			          		gfB2G1=Integer.parseInt(resultB2G1.getText());
			          					          			          		
			          		if(gfB1G1>gfB2G1) {
			          			wB1G1=1; dB1G1=0; lB1G1=0; uwB1=wB1G1+wB1G2+wB1G3+wB1G4; udB1=dB1G1+dB1G2+dB1G3+dB1G4; ulB1=lB1G1+lB1G2+lB1G3+lB1G4; upB1=uwB1+udB1+ulB1; ptsuB1=3*uwB1+udB1;
			          			wB2G1=0; dB2G1=0; lB2G1=1; uwB2=wB2G1+wB2G2+wB2G3+wB2G4; udB2=dB2G1+dB2G2+dB2G3+dB2G4; ulB2=lB2G1+lB2G2+lB2G3+lB2G4; upB2=uwB2+udB2+ulB2; ptsuB2=3*uwB2+udB2;
			          		}
			          		else if(gfB1G1<gfB2G1) {
			          			wB1G1=0; dB1G1=0; lB1G1=1; uwB1=wB1G1+wB1G2+wB1G3+wB1G4; udB1=dB1G1+dB1G2+dB1G3+dB1G4; ulB1=lB1G1+lB1G2+lB1G3+lB1G4; upB1=uwB1+udB1+ulB1; ptsuB1=3*uwB1+udB1;
			          			wB2G1=1; dB2G1=0; lB2G1=0; uwB2=wB2G1+wB2G2+wB2G3+wB2G4; udB2=dB2G1+dB2G2+dB2G3+dB2G4; ulB2=lB2G1+lB2G2+lB2G3+lB2G4; upB2=uwB2+udB2+ulB2; ptsuB2=3*uwB2+udB2; 
			          		}
			          		else if(gfB1G1==gfB2G1) {
			          			dB1G1=1; wB1G1=0; lB1G1=0; uwB1=wB1G1+wB1G2+wB1G3+wB1G4; udB1=dB1G1+dB1G2+dB1G3+dB1G4; ulB1=lB1G1+lB1G2+lB1G3+lB1G4; upB1=uwB1+udB1+ulB1; ptsuB1=3*uwB1+udB1;
			          			dB2G1=1; wB2G1=0; lB2G1=0; uwB2=wB2G1+wB2G2+wB2G3+wB2G4; udB2=dB2G1+dB2G2+dB2G3+dB2G4; ulB2=lB2G1+lB2G2+lB2G3+lB2G4; upB2=uwB2+udB2+ulB2; ptsuB2=3*uwB2+udB2;
			          		}
			          		btnGrpBG1.setEnabled(false);
			          		resultB1G1.setEditable(false);
			          		resultB2G1.setEditable(false);
			          		
			          		ArrayList<TableSort> ar = new ArrayList<TableSort>();
			          		ar.add(new TableSort(String.valueOf(addTeams.teamB1),upB1,uwB1,udB1,ulB1,gfB1G1+gfB1G2+gfB1G3+gfB1G4,gfB2G1+gfB3G1+gfB2G3+gfB3G3,(gfB1G1+gfB1G2+gfB1G3+gfB1G4)-(gfB2G1+gfB3G1+gfB2G3+gfB3G3),ptsuB1));
		          			ar.add(new TableSort(String.valueOf(addTeams.teamB2),upB2,uwB2,udB2,ulB2,gfB2G1+gfB2G2+gfB2G3+gfB2G4,gfB1G1+gfB3G2+gfB1G3+gfB3G4,(gfB2G1+gfB2G2+gfB2G3+gfB2G4)-(gfB1G1+gfB3G2+gfB1G3+gfB3G4),ptsuB2));
		          			ar.add(new TableSort(String.valueOf(addTeams.teamB3),upB3,uwB3,udB3,ulB3,gfB3G1+gfB3G2+gfB3G3+gfB3G4,gfB1G2+gfB2G2+gfB1G4+gfB2G4,(gfB3G1+gfB3G2+gfB3G3+gfB3G4)-(gfB1G2+gfB2G2+gfB1G4+gfB2G4),ptsuB3));
		          			
		          			Collections.sort(ar, new SortByPts());
		          			
		          			lblGrpTeamB1.setText(ar.get(0).getteamName()); lblPlayedB1.setText(String.valueOf(ar.get(0).getPlayed())); lblWinsB1.setText(String.valueOf(ar.get(0).getWins())); lblDrawsB1.setText(String.valueOf(ar.get(0).getDraws()));   lblLostB1.setText(String.valueOf(ar.get(0).getLoses())); lblGFB1.setText(String.valueOf(ar.get(0).getGF())); lblGAB1.setText(String.valueOf(ar.get(0).getGA())); lblGDB1.setText(String.valueOf(ar.get(0).getGD())); lblPtsB1.setText(String.valueOf(ar.get(0).getPoints()));
		          			lblGrpTeamB2.setText(ar.get(1).getteamName()); lblPlayedB2.setText(String.valueOf(ar.get(1).getPlayed())); lblWinsB2.setText(String.valueOf(ar.get(1).getWins())); lblDrawsB2.setText(String.valueOf(ar.get(1).getDraws()));   lblLostB2.setText(String.valueOf(ar.get(1).getLoses())); lblGFB2.setText(String.valueOf(ar.get(1).getGF())); lblGAB2.setText(String.valueOf(ar.get(1).getGA())); lblGDB2.setText(String.valueOf(ar.get(1).getGD())); lblPtsB2.setText(String.valueOf(ar.get(1).getPoints()));
		          			lblGrpTeamB3.setText(ar.get(2).getteamName()); lblPlayedB3.setText(String.valueOf(ar.get(2).getPlayed())); lblWinsB3.setText(String.valueOf(ar.get(2).getWins())); lblDrawsB3.setText(String.valueOf(ar.get(2).getDraws()));   lblLostB3.setText(String.valueOf(ar.get(2).getLoses())); lblGFB3.setText(String.valueOf(ar.get(2).getGF())); lblGAB3.setText(String.valueOf(ar.get(2).getGA())); lblGDB3.setText(String.valueOf(ar.get(2).getGD())); lblPtsB3.setText(String.valueOf(ar.get(2).getPoints()));
			          		
		          			if(Creator.rdbtnNo.isSelected() && 
		              				ar.get(0).getPoints()==ar.get(1).getPoints() && ar.get(0).getGD()==ar.get(1).getGD() && ar.get(0).getGF() == ar.get(1).getGF() && ar.get(0).getWins() == ar.get(1).getWins() && ar.get(0).getGA() == ar.get(1).getGA() &&
		              				ar.get(1).getPoints()==ar.get(2).getPoints() && ar.get(1).getGD()==ar.get(2).getGD() && ar.get(1).getGF() == ar.get(2).getGF() && ar.get(1).getWins() == ar.get(2).getWins() && ar.get(1).getGA() == ar.get(2).getGA() &&
		              			    ar.get(0).getPoints()==ar.get(2).getPoints() && ar.get(0).getGD()==ar.get(2).getGD() && ar.get(0).getGF() == ar.get(2).getGF() && ar.get(0).getWins() == ar.get(2).getWins() && ar.get(0).getGA() == ar.get(2).getGA()) {
		              				tabelaBPlayoff.setVisible(true);
		    	          			lblPOG1TeamB1.setVisible(true); lblPOG2TeamB1.setVisible(true);
		    	          			lblPOG1TeamB2.setVisible(true); lblPOG2TeamB2.setVisible(true);
		    	          			lblPOG1TeamB3.setVisible(true); lblPOG2TeamB3.setVisible(true);
		    	          			resG1POTeamB1.setVisible(true); resG2POTeamB1.setVisible(true);
		    	          			resG1POTeamB2.setVisible(true); resG2POTeamB2.setVisible(true);
		    	          			resG1POTeamB3.setVisible(true); resG2POTeamB3.setVisible(true);
		    	          			btnBG1PlayOff.setVisible(true); btnBG2PlayOff.setVisible(true); btnBG3PlayOff.setVisible(true);
		    	          			resetBG1PlayOff.setVisible(true); resetBG2PlayOff.setVisible(true); resetBG3PlayOff.setVisible(true);
		    	          			
		    	          			lblPOG1TeamB1.setText(ar.get(0).getteamName()); lblPOG2TeamB1.setText(ar.get(0).getteamName());
		    	          			lblPOG1TeamB2.setText(ar.get(1).getteamName()); lblPOG2TeamB2.setText(ar.get(1).getteamName());
		    	          			lblPOG1TeamB3.setText(ar.get(2).getteamName()); lblPOG2TeamB3.setText(ar.get(2).getteamName());
		    	          			
		    	          			lblPOG4TeamB1.setVisible(false);
		    	          			lblPOG4TeamB2.setVisible(false);
		    	          			resG4POTeamB1.setVisible(false);
		    	          			resG4POTeamB2.setVisible(false);
		    	          			btnBG4PlayOff.setVisible(false);
		    	          			resetBG4PlayOff.setVisible(false);
		    	          			
		    	          			lblPOG5TeamB2.setVisible(false);
		    	          			lblPOG5TeamB3.setVisible(false);
		    	          			resG5POTeamB2.setVisible(false);
		    	          			resG5POTeamB3.setVisible(false);
		    	          			btnBG5PlayOff.setVisible(false);
		    	          			resetBG5PlayOff.setVisible(false);
		    	          			
		              			}
		              			
		              			else if(Creator.rdbtnNo.isSelected() && ar.get(0).getPoints()==ar.get(1).getPoints() && ar.get(0).getGD()==ar.get(1).getGD() && ar.get(0).getGF() == ar.get(1).getGF() && ar.get(0).getWins() == ar.get(1).getWins() && ar.get(0).getGA() == ar.get(1).getGA() ){
		    	          			tabelaBPlayoff.setVisible(true);
		    	          			lblPOG4TeamB1.setVisible(true);
		    	          			lblPOG4TeamB2.setVisible(true);
		    	          			resG4POTeamB1.setVisible(true);
		    	          			resG4POTeamB2.setVisible(true);
		    	          			btnBG4PlayOff.setVisible(true);
		    	          			resetBG4PlayOff.setVisible(true);
		    	          			lblPOG4TeamB1.setText(ar.get(0).getteamName());
		    	          			lblPOG4TeamB2.setText(ar.get(1).getteamName());
		    	          			
		    	          			lblPOG1TeamB1.setVisible(false); lblPOG2TeamB1.setVisible(false);
		    	          			lblPOG1TeamB2.setVisible(false); lblPOG2TeamB2.setVisible(false);
		    	          			lblPOG1TeamB3.setVisible(false); lblPOG2TeamB3.setVisible(false);
		    	          			resG1POTeamB1.setVisible(false); resG2POTeamB1.setVisible(false);
		    	          			resG1POTeamB2.setVisible(false); resG2POTeamB2.setVisible(false);
		    	          			resG1POTeamB3.setVisible(false); resG2POTeamB3.setVisible(false);
		    	          			btnBG1PlayOff.setVisible(false); btnBG2PlayOff.setVisible(false); btnBG3PlayOff.setVisible(false);
		    	          			resetBG1PlayOff.setVisible(false); resetBG2PlayOff.setVisible(false); resetBG3PlayOff.setVisible(false);
		    	          			
		    	          			lblPOG5TeamB2.setVisible(false);
		    	          			lblPOG5TeamB3.setVisible(false);
		    	          			resG5POTeamB2.setVisible(false);
		    	          			resG5POTeamB3.setVisible(false);
		    	          			btnBG5PlayOff.setVisible(false);
		    	          			resetBG5PlayOff.setVisible(false);
		    	          			
		    	          		}
		              			else if(Creator.rdbtnNo.isSelected() && ar.get(1).getPoints()==ar.get(2).getPoints() && ar.get(1).getGD()==ar.get(2).getGD() && ar.get(1).getGF() == ar.get(2).getGF() && ar.get(1).getWins() == ar.get(2).getWins() && ar.get(1).getGA() == ar.get(2).getGA() ){
		    	          			tabelaBPlayoff.setVisible(true);
		    	          			lblPOG5TeamB2.setVisible(true);
		    	          			lblPOG5TeamB3.setVisible(true);
		    	          			resG5POTeamB2.setVisible(true);
		    	          			resG5POTeamB3.setVisible(true);
		    	          			btnBG5PlayOff.setVisible(true);
		    	          			resetBG5PlayOff.setVisible(true);
		    	          			lblPOG5TeamB2.setText(ar.get(1).getteamName());
		    	          			lblPOG5TeamB3.setText(ar.get(2).getteamName());
		    	          			
		    	          			lblPOG1TeamB1.setVisible(false); lblPOG2TeamB1.setVisible(false);
		    	          			lblPOG1TeamB2.setVisible(false); lblPOG2TeamB2.setVisible(false);
		    	          			lblPOG1TeamB3.setVisible(false); lblPOG2TeamB3.setVisible(false);
		    	          			resG1POTeamB1.setVisible(false); resG2POTeamB1.setVisible(false);
		    	          			resG1POTeamB2.setVisible(false); resG2POTeamB2.setVisible(false);
		    	          			resG1POTeamB3.setVisible(false); resG2POTeamB3.setVisible(false);
		    	          			btnBG1PlayOff.setVisible(false); btnBG2PlayOff.setVisible(false); btnBG3PlayOff.setVisible(false);
		    	          			resetBG1PlayOff.setVisible(false); resetBG2PlayOff.setVisible(false); resetBG3PlayOff.setVisible(false);
		    	          			
		    	          			lblPOG4TeamB1.setVisible(false);
		    	          			lblPOG4TeamB2.setVisible(false);
		    	          			resG4POTeamB1.setVisible(false);
		    	          			resG4POTeamB2.setVisible(false);
		    	          			btnBG4PlayOff.setVisible(false);
		    	          			resetBG4PlayOff.setVisible(false);
		    	          		}
			          	}
			          });
				  btnGrpBG1.setFont(new Font("Tahoma", Font.BOLD, 10));			
				  btnGrpBG1.setBounds(964, 218, 89, 17);					
				  contentPane.add(btnGrpBG1);								
				  
				  JButton btnGrpBG2 = new JButton("AddResult");
				  btnGrpBG2.addActionListener(new ActionListener() {
		        	  public void actionPerformed(ActionEvent e) {
		        		    gfB1G2=Integer.parseInt(resultB1G2.getText());
			          		gfB3G1=Integer.parseInt(resultB3G1.getText());
			          				          			          		
			          		if(gfB1G2>gfB3G1) {
			          			wB1G2=1; dB1G2=0; lB1G2=0; uwB1=wB1G1+wB1G2+wB1G3+wB1G4; udB1=dB1G1+dB1G2+dB1G3+dB1G4; ulB1=lB1G1+lB1G2+lB1G3+lB1G4; upB1=uwB1+udB1+ulB1; ptsuB1=3*uwB1+udB1;
			          			wB3G1=0; dB3G1=0; lB3G1=1; uwB3=wB3G1+wB3G2+wB3G3+wB3G4; udB3=dB3G1+dB3G2+dB3G3+dB3G4; ulB3=lB3G1+lB3G2+lB3G3+lB3G4; upB3=uwB3+udB3+ulB3; ptsuB3=3*uwB3+udB3;
			          		}
			          		else if(gfB1G2<gfB3G1) {
			          			wB1G2=0; dB1G2=0; lB1G2=1; uwB1=wB1G1+wB1G2+wB1G3+wB1G4; udB1=dB1G1+dB1G2+dB1G3+dB1G4; ulB1=lB1G1+lB1G2+lB1G3+lB1G4; upB1=uwB1+udB1+ulB1; ptsuB1=3*uwB1+udB1;
			          			wB3G1=1; dB3G1=0; lB3G1=0; uwB3=wB3G1+wB3G2+wB3G3+wB3G4; udB3=dB3G1+dB3G2+dB3G3+dB3G4; ulB3=lB3G1+lB3G2+lB3G3+lB3G4; upB3=uwB3+udB3+ulB3; ptsuB3=3*uwB3+udB3;
			          		}
			          		else if(gfB1G2==gfB3G1) {
			          			dB1G2=1; wB1G2=0; lB1G2=0; uwB1=wB1G1+wB1G2+wB1G3+wB1G4; udB1=dB1G1+dB1G2+dB1G3+dB1G4; ulB1=lB1G1+lB1G2+lB1G3+lB1G4; upB1=uwB1+udB1+ulB1; ptsuB1=3*uwB1+udB1;
			          			dB3G1=1; wB3G1=0; lB3G1=0; uwB3=wB3G1+wB3G2+wB3G3+wB3G4; udB3=dB3G1+dB3G2+dB3G3+dB3G4; ulB3=lB3G1+lB3G2+lB3G3+lB3G4; upB3=uwB3+udB3+ulB3; ptsuB3=3*uwB3+udB3;
			          		}
			          		btnGrpBG2.setEnabled(false);
			          		resultB1G2.setEditable(false);
			          		resultB3G1.setEditable(false);
			          		
			          		ArrayList<TableSort> ar = new ArrayList<TableSort>();
			          		ar.add(new TableSort(String.valueOf(addTeams.teamB1),upB1,uwB1,udB1,ulB1,gfB1G1+gfB1G2+gfB1G3+gfB1G4,gfB2G1+gfB3G1+gfB2G3+gfB3G3,(gfB1G1+gfB1G2+gfB1G3+gfB1G4)-(gfB2G1+gfB3G1+gfB2G3+gfB3G3),ptsuB1));
		          			ar.add(new TableSort(String.valueOf(addTeams.teamB2),upB2,uwB2,udB2,ulB2,gfB2G1+gfB2G2+gfB2G3+gfB2G4,gfB1G1+gfB3G2+gfB1G3+gfB3G4,(gfB2G1+gfB2G2+gfB2G3+gfB2G4)-(gfB1G1+gfB3G2+gfB1G3+gfB3G4),ptsuB2));
		          			ar.add(new TableSort(String.valueOf(addTeams.teamB3),upB3,uwB3,udB3,ulB3,gfB3G1+gfB3G2+gfB3G3+gfB3G4,gfB1G2+gfB2G2+gfB1G4+gfB2G4,(gfB3G1+gfB3G2+gfB3G3+gfB3G4)-(gfB1G2+gfB2G2+gfB1G4+gfB2G4),ptsuB3));
		          			
		          			Collections.sort(ar, new SortByPts());
		          			
		          			lblGrpTeamB1.setText(ar.get(0).getteamName()); lblPlayedB1.setText(String.valueOf(ar.get(0).getPlayed())); lblWinsB1.setText(String.valueOf(ar.get(0).getWins())); lblDrawsB1.setText(String.valueOf(ar.get(0).getDraws()));   lblLostB1.setText(String.valueOf(ar.get(0).getLoses())); lblGFB1.setText(String.valueOf(ar.get(0).getGF())); lblGAB1.setText(String.valueOf(ar.get(0).getGA())); lblGDB1.setText(String.valueOf(ar.get(0).getGD())); lblPtsB1.setText(String.valueOf(ar.get(0).getPoints()));
		          			lblGrpTeamB2.setText(ar.get(1).getteamName()); lblPlayedB2.setText(String.valueOf(ar.get(1).getPlayed())); lblWinsB2.setText(String.valueOf(ar.get(1).getWins())); lblDrawsB2.setText(String.valueOf(ar.get(1).getDraws()));   lblLostB2.setText(String.valueOf(ar.get(1).getLoses())); lblGFB2.setText(String.valueOf(ar.get(1).getGF())); lblGAB2.setText(String.valueOf(ar.get(1).getGA())); lblGDB2.setText(String.valueOf(ar.get(1).getGD())); lblPtsB2.setText(String.valueOf(ar.get(1).getPoints()));
		          			lblGrpTeamB3.setText(ar.get(2).getteamName()); lblPlayedB3.setText(String.valueOf(ar.get(2).getPlayed())); lblWinsB3.setText(String.valueOf(ar.get(2).getWins())); lblDrawsB3.setText(String.valueOf(ar.get(2).getDraws()));   lblLostB3.setText(String.valueOf(ar.get(2).getLoses())); lblGFB3.setText(String.valueOf(ar.get(2).getGF())); lblGAB3.setText(String.valueOf(ar.get(2).getGA())); lblGDB3.setText(String.valueOf(ar.get(2).getGD())); lblPtsB3.setText(String.valueOf(ar.get(2).getPoints()));
			          		
		          			if(Creator.rdbtnNo.isSelected() && 
		              				ar.get(0).getPoints()==ar.get(1).getPoints() && ar.get(0).getGD()==ar.get(1).getGD() && ar.get(0).getGF() == ar.get(1).getGF() && ar.get(0).getWins() == ar.get(1).getWins() && ar.get(0).getGA() == ar.get(1).getGA() &&
		              				ar.get(1).getPoints()==ar.get(2).getPoints() && ar.get(1).getGD()==ar.get(2).getGD() && ar.get(1).getGF() == ar.get(2).getGF() && ar.get(1).getWins() == ar.get(2).getWins() && ar.get(1).getGA() == ar.get(2).getGA() &&
		              			    ar.get(0).getPoints()==ar.get(2).getPoints() && ar.get(0).getGD()==ar.get(2).getGD() && ar.get(0).getGF() == ar.get(2).getGF() && ar.get(0).getWins() == ar.get(2).getWins() && ar.get(0).getGA() == ar.get(2).getGA()) {
		              				tabelaBPlayoff.setVisible(true);
		    	          			lblPOG1TeamB1.setVisible(true); lblPOG2TeamB1.setVisible(true);
		    	          			lblPOG1TeamB2.setVisible(true); lblPOG2TeamB2.setVisible(true);
		    	          			lblPOG1TeamB3.setVisible(true); lblPOG2TeamB3.setVisible(true);
		    	          			resG1POTeamB1.setVisible(true); resG2POTeamB1.setVisible(true);
		    	          			resG1POTeamB2.setVisible(true); resG2POTeamB2.setVisible(true);
		    	          			resG1POTeamB3.setVisible(true); resG2POTeamB3.setVisible(true);
		    	          			btnBG1PlayOff.setVisible(true); btnBG2PlayOff.setVisible(true); btnBG3PlayOff.setVisible(true);
		    	          			resetBG1PlayOff.setVisible(true); resetBG2PlayOff.setVisible(true); resetBG3PlayOff.setVisible(true);
		    	          			
		    	          			lblPOG1TeamB1.setText(ar.get(0).getteamName()); lblPOG2TeamB1.setText(ar.get(0).getteamName());
		    	          			lblPOG1TeamB2.setText(ar.get(1).getteamName()); lblPOG2TeamB2.setText(ar.get(1).getteamName());
		    	          			lblPOG1TeamB3.setText(ar.get(2).getteamName()); lblPOG2TeamB3.setText(ar.get(2).getteamName());
		    	          			
		    	          			lblPOG4TeamB1.setVisible(false);
		    	          			lblPOG4TeamB2.setVisible(false);
		    	          			resG4POTeamB1.setVisible(false);
		    	          			resG4POTeamB2.setVisible(false);
		    	          			btnBG4PlayOff.setVisible(false);
		    	          			resetBG4PlayOff.setVisible(false);
		    	          			
		    	          			lblPOG5TeamB2.setVisible(false);
		    	          			lblPOG5TeamB3.setVisible(false);
		    	          			resG5POTeamB2.setVisible(false);
		    	          			resG5POTeamB3.setVisible(false);
		    	          			btnBG5PlayOff.setVisible(false);
		    	          			resetBG5PlayOff.setVisible(false);
		    	          			
		              			}
		              			
		              			else if(Creator.rdbtnNo.isSelected() && ar.get(0).getPoints()==ar.get(1).getPoints() && ar.get(0).getGD()==ar.get(1).getGD() && ar.get(0).getGF() == ar.get(1).getGF() && ar.get(0).getWins() == ar.get(1).getWins() && ar.get(0).getGA() == ar.get(1).getGA() ){
		    	          			tabelaBPlayoff.setVisible(true);
		    	          			lblPOG4TeamB1.setVisible(true);
		    	          			lblPOG4TeamB2.setVisible(true);
		    	          			resG4POTeamB1.setVisible(true);
		    	          			resG4POTeamB2.setVisible(true);
		    	          			btnBG4PlayOff.setVisible(true);
		    	          			resetBG4PlayOff.setVisible(true);
		    	          			lblPOG4TeamB1.setText(ar.get(0).getteamName());
		    	          			lblPOG4TeamB2.setText(ar.get(1).getteamName());
		    	          			
		    	          			lblPOG1TeamB1.setVisible(false); lblPOG2TeamB1.setVisible(false);
		    	          			lblPOG1TeamB2.setVisible(false); lblPOG2TeamB2.setVisible(false);
		    	          			lblPOG1TeamB3.setVisible(false); lblPOG2TeamB3.setVisible(false);
		    	          			resG1POTeamB1.setVisible(false); resG2POTeamB1.setVisible(false);
		    	          			resG1POTeamB2.setVisible(false); resG2POTeamB2.setVisible(false);
		    	          			resG1POTeamB3.setVisible(false); resG2POTeamB3.setVisible(false);
		    	          			btnBG1PlayOff.setVisible(false); btnBG2PlayOff.setVisible(false); btnBG3PlayOff.setVisible(false);
		    	          			resetBG1PlayOff.setVisible(false); resetBG2PlayOff.setVisible(false); resetBG3PlayOff.setVisible(false);
		    	          			
		    	          			lblPOG5TeamB2.setVisible(false);
		    	          			lblPOG5TeamB3.setVisible(false);
		    	          			resG5POTeamB2.setVisible(false);
		    	          			resG5POTeamB3.setVisible(false);
		    	          			btnBG5PlayOff.setVisible(false);
		    	          			resetBG5PlayOff.setVisible(false);
		    	          			
		    	          		}
		              			else if(Creator.rdbtnNo.isSelected() && ar.get(1).getPoints()==ar.get(2).getPoints() && ar.get(1).getGD()==ar.get(2).getGD() && ar.get(1).getGF() == ar.get(2).getGF() && ar.get(1).getWins() == ar.get(2).getWins() && ar.get(1).getGA() == ar.get(2).getGA() ){
		    	          			tabelaBPlayoff.setVisible(true);
		    	          			lblPOG5TeamB2.setVisible(true);
		    	          			lblPOG5TeamB3.setVisible(true);
		    	          			resG5POTeamB2.setVisible(true);
		    	          			resG5POTeamB3.setVisible(true);
		    	          			btnBG5PlayOff.setVisible(true);
		    	          			resetBG5PlayOff.setVisible(true);
		    	          			lblPOG5TeamB2.setText(ar.get(1).getteamName());
		    	          			lblPOG5TeamB3.setText(ar.get(2).getteamName());
		    	          			
		    	          			lblPOG1TeamB1.setVisible(false); lblPOG2TeamB1.setVisible(false);
		    	          			lblPOG1TeamB2.setVisible(false); lblPOG2TeamB2.setVisible(false);
		    	          			lblPOG1TeamB3.setVisible(false); lblPOG2TeamB3.setVisible(false);
		    	          			resG1POTeamB1.setVisible(false); resG2POTeamB1.setVisible(false);
		    	          			resG1POTeamB2.setVisible(false); resG2POTeamB2.setVisible(false);
		    	          			resG1POTeamB3.setVisible(false); resG2POTeamB3.setVisible(false);
		    	          			btnBG1PlayOff.setVisible(false); btnBG2PlayOff.setVisible(false); btnBG3PlayOff.setVisible(false);
		    	          			resetBG1PlayOff.setVisible(false); resetBG2PlayOff.setVisible(false); resetBG3PlayOff.setVisible(false);
		    	          			
		    	          			lblPOG4TeamB1.setVisible(false);
		    	          			lblPOG4TeamB2.setVisible(false);
		    	          			resG4POTeamB1.setVisible(false);
		    	          			resG4POTeamB2.setVisible(false);
		    	          			btnBG4PlayOff.setVisible(false);
		    	          			resetBG4PlayOff.setVisible(false);
		    	          		}
		        	  }
		          });
				  btnGrpBG2.setFont(new Font("Tahoma", Font.BOLD, 10));
				  btnGrpBG2.setBounds(964, 246, 89, 17);
				  contentPane.add(btnGrpBG2);
				  
				  JButton btnGrpBG3 = new JButton("AddResult");
				  btnGrpBG3.addActionListener(new ActionListener() {
					  	public void actionPerformed(ActionEvent e) {
					  		gfB2G2=Integer.parseInt(resultB2G2.getText());
			          		gfB3G2=Integer.parseInt(resultB3G2.getText());
			          					          		
			          		if(gfB2G2>gfB3G2) {
			          			wB2G2=1; dB2G2=0; lB2G2=0; uwB2=wB2G1+wB2G2+wB2G3+wB2G4; udB2=dB2G1+dB2G2+dB2G3+dB2G4; ulB2=lB2G1+lB2G2+lB2G3+lB2G4; upB2=uwB2+udB2+ulB2; ptsuB2=3*uwB2+udB2;
			          			wB3G2=0; dB3G2=0; lB3G2=1; uwB3=wB3G1+wB3G2+wB3G3+wB3G4; udB3=dB3G1+dB3G2+dB3G3+dB3G4; ulB3=lB3G1+lB3G2+lB3G3+lB3G4; upB3=uwB3+udB3+ulB3; ptsuB3=3*uwB3+udB3;
			          		}
			          		else if(gfB2G2<gfB3G2) {
			          			wB2G2=0; dB2G2=0; lB2G2=1; uwB2=wB2G1+wB2G2+wB2G3+wB2G4; udB2=dB2G1+dB2G2+dB2G3+dB2G4; ulB2=lB2G1+lB2G2+lB2G3+lB2G4; upB2=uwB2+udB2+ulB2; ptsuB2=3*uwB2+udB2;
			          			wB3G2=1; dB3G2=0; lB3G2=0; uwB3=wB3G1+wB3G2+wB3G3+wB3G4; udB3=dB3G1+dB3G2+dB3G3+dB3G4; ulB3=lB3G1+lB3G2+lB3G3+lB3G4; upB3=uwB3+udB3+ulB3; ptsuB3=3*uwB3+udB3;
			          		}
			          		else if(gfB2G2==gfB3G2) {
			          			dB2G2=1; wB2G2=0; lB2G2=0; uwB2=wB2G1+wB2G2+wB2G3+wB2G4; udB2=dB2G1+dB2G2+dB2G3+dB2G4; ulB2=lB2G1+lB2G2+lB2G3+lB2G4; upB2=uwB2+udB2+ulB2; ptsuB2=3*uwB2+udB2;
			          			dB3G2=1; wB3G2=0; lB3G2=0; uwB3=wB3G1+wB3G2+wB3G3+wB3G4; udB3=dB3G1+dB3G2+dB3G3+dB3G4; ulB3=lB3G1+lB3G2+lB3G3+lB3G4; upB3=uwB3+udB3+ulB3; ptsuB3=3*uwB3+udB3;
			          		}
			          		btnGrpBG3.setEnabled(false);
			          		resultB2G2.setEditable(false);
			          		resultB3G2.setEditable(false);
			          		
			          		ArrayList<TableSort> ar = new ArrayList<TableSort>();
			          		ar.add(new TableSort(String.valueOf(addTeams.teamB1),upB1,uwB1,udB1,ulB1,gfB1G1+gfB1G2+gfB1G3+gfB1G4,gfB2G1+gfB3G1+gfB2G3+gfB3G3,(gfB1G1+gfB1G2+gfB1G3+gfB1G4)-(gfB2G1+gfB3G1+gfB2G3+gfB3G3),ptsuB1));
		          			ar.add(new TableSort(String.valueOf(addTeams.teamB2),upB2,uwB2,udB2,ulB2,gfB2G1+gfB2G2+gfB2G3+gfB2G4,gfB1G1+gfB3G2+gfB1G3+gfB3G4,(gfB2G1+gfB2G2+gfB2G3+gfB2G4)-(gfB1G1+gfB3G2+gfB1G3+gfB3G4),ptsuB2));
		          			ar.add(new TableSort(String.valueOf(addTeams.teamB3),upB3,uwB3,udB3,ulB3,gfB3G1+gfB3G2+gfB3G3+gfB3G4,gfB1G2+gfB2G2+gfB1G4+gfB2G4,(gfB3G1+gfB3G2+gfB3G3+gfB3G4)-(gfB1G2+gfB2G2+gfB1G4+gfB2G4),ptsuB3));
		          			
		          			Collections.sort(ar, new SortByPts());
		          			
		          			lblGrpTeamB1.setText(ar.get(0).getteamName()); lblPlayedB1.setText(String.valueOf(ar.get(0).getPlayed())); lblWinsB1.setText(String.valueOf(ar.get(0).getWins())); lblDrawsB1.setText(String.valueOf(ar.get(0).getDraws()));   lblLostB1.setText(String.valueOf(ar.get(0).getLoses())); lblGFB1.setText(String.valueOf(ar.get(0).getGF())); lblGAB1.setText(String.valueOf(ar.get(0).getGA())); lblGDB1.setText(String.valueOf(ar.get(0).getGD())); lblPtsB1.setText(String.valueOf(ar.get(0).getPoints()));
		          			lblGrpTeamB2.setText(ar.get(1).getteamName()); lblPlayedB2.setText(String.valueOf(ar.get(1).getPlayed())); lblWinsB2.setText(String.valueOf(ar.get(1).getWins())); lblDrawsB2.setText(String.valueOf(ar.get(1).getDraws()));   lblLostB2.setText(String.valueOf(ar.get(1).getLoses())); lblGFB2.setText(String.valueOf(ar.get(1).getGF())); lblGAB2.setText(String.valueOf(ar.get(1).getGA())); lblGDB2.setText(String.valueOf(ar.get(1).getGD())); lblPtsB2.setText(String.valueOf(ar.get(1).getPoints()));
		          			lblGrpTeamB3.setText(ar.get(2).getteamName()); lblPlayedB3.setText(String.valueOf(ar.get(2).getPlayed())); lblWinsB3.setText(String.valueOf(ar.get(2).getWins())); lblDrawsB3.setText(String.valueOf(ar.get(2).getDraws()));   lblLostB3.setText(String.valueOf(ar.get(2).getLoses())); lblGFB3.setText(String.valueOf(ar.get(2).getGF())); lblGAB3.setText(String.valueOf(ar.get(2).getGA())); lblGDB3.setText(String.valueOf(ar.get(2).getGD())); lblPtsB3.setText(String.valueOf(ar.get(2).getPoints()));
		          			
		          			if(Creator.rdbtnNo.isSelected() && 
		              				ar.get(0).getPoints()==ar.get(1).getPoints() && ar.get(0).getGD()==ar.get(1).getGD() && ar.get(0).getGF() == ar.get(1).getGF() && ar.get(0).getWins() == ar.get(1).getWins() && ar.get(0).getGA() == ar.get(1).getGA() &&
		              				ar.get(1).getPoints()==ar.get(2).getPoints() && ar.get(1).getGD()==ar.get(2).getGD() && ar.get(1).getGF() == ar.get(2).getGF() && ar.get(1).getWins() == ar.get(2).getWins() && ar.get(1).getGA() == ar.get(2).getGA() &&
		              			    ar.get(0).getPoints()==ar.get(2).getPoints() && ar.get(0).getGD()==ar.get(2).getGD() && ar.get(0).getGF() == ar.get(2).getGF() && ar.get(0).getWins() == ar.get(2).getWins() && ar.get(0).getGA() == ar.get(2).getGA()) {
		              				tabelaBPlayoff.setVisible(true);
		    	          			lblPOG1TeamB1.setVisible(true); lblPOG2TeamB1.setVisible(true);
		    	          			lblPOG1TeamB2.setVisible(true); lblPOG2TeamB2.setVisible(true);
		    	          			lblPOG1TeamB3.setVisible(true); lblPOG2TeamB3.setVisible(true);
		    	          			resG1POTeamB1.setVisible(true); resG2POTeamB1.setVisible(true);
		    	          			resG1POTeamB2.setVisible(true); resG2POTeamB2.setVisible(true);
		    	          			resG1POTeamB3.setVisible(true); resG2POTeamB3.setVisible(true);
		    	          			btnBG1PlayOff.setVisible(true); btnBG2PlayOff.setVisible(true); btnBG3PlayOff.setVisible(true);
		    	          			resetBG1PlayOff.setVisible(true); resetBG2PlayOff.setVisible(true); resetBG3PlayOff.setVisible(true);
		    	          			
		    	          			lblPOG1TeamB1.setText(ar.get(0).getteamName()); lblPOG2TeamB1.setText(ar.get(0).getteamName());
		    	          			lblPOG1TeamB2.setText(ar.get(1).getteamName()); lblPOG2TeamB2.setText(ar.get(1).getteamName());
		    	          			lblPOG1TeamB3.setText(ar.get(2).getteamName()); lblPOG2TeamB3.setText(ar.get(2).getteamName());
		    	          			
		    	          			lblPOG4TeamB1.setVisible(false);
		    	          			lblPOG4TeamB2.setVisible(false);
		    	          			resG4POTeamB1.setVisible(false);
		    	          			resG4POTeamB2.setVisible(false);
		    	          			btnBG4PlayOff.setVisible(false);
		    	          			resetBG4PlayOff.setVisible(false);
		    	          			
		    	          			lblPOG5TeamB2.setVisible(false);
		    	          			lblPOG5TeamB3.setVisible(false);
		    	          			resG5POTeamB2.setVisible(false);
		    	          			resG5POTeamB3.setVisible(false);
		    	          			btnBG5PlayOff.setVisible(false);
		    	          			resetBG5PlayOff.setVisible(false);
		    	          			
		              			}
		              			
		              			else if(Creator.rdbtnNo.isSelected() && ar.get(0).getPoints()==ar.get(1).getPoints() && ar.get(0).getGD()==ar.get(1).getGD() && ar.get(0).getGF() == ar.get(1).getGF() && ar.get(0).getWins() == ar.get(1).getWins() && ar.get(0).getGA() == ar.get(1).getGA() ){
		    	          			tabelaBPlayoff.setVisible(true);
		    	          			lblPOG4TeamB1.setVisible(true);
		    	          			lblPOG4TeamB2.setVisible(true);
		    	          			resG4POTeamB1.setVisible(true);
		    	          			resG4POTeamB2.setVisible(true);
		    	          			btnBG4PlayOff.setVisible(true);
		    	          			resetBG4PlayOff.setVisible(true);
		    	          			lblPOG4TeamB1.setText(ar.get(0).getteamName());
		    	          			lblPOG4TeamB2.setText(ar.get(1).getteamName());
		    	          			
		    	          			lblPOG1TeamB1.setVisible(false); lblPOG2TeamB1.setVisible(false);
		    	          			lblPOG1TeamB2.setVisible(false); lblPOG2TeamB2.setVisible(false);
		    	          			lblPOG1TeamB3.setVisible(false); lblPOG2TeamB3.setVisible(false);
		    	          			resG1POTeamB1.setVisible(false); resG2POTeamB1.setVisible(false);
		    	          			resG1POTeamB2.setVisible(false); resG2POTeamB2.setVisible(false);
		    	          			resG1POTeamB3.setVisible(false); resG2POTeamB3.setVisible(false);
		    	          			btnBG1PlayOff.setVisible(false); btnBG2PlayOff.setVisible(false); btnBG3PlayOff.setVisible(false);
		    	          			resetBG1PlayOff.setVisible(false); resetBG2PlayOff.setVisible(false); resetBG3PlayOff.setVisible(false);
		    	          			
		    	          			lblPOG5TeamB2.setVisible(false);
		    	          			lblPOG5TeamB3.setVisible(false);
		    	          			resG5POTeamB2.setVisible(false);
		    	          			resG5POTeamB3.setVisible(false);
		    	          			btnBG5PlayOff.setVisible(false);
		    	          			resetBG5PlayOff.setVisible(false);
		    	          			
		    	          		}
		              			else if(Creator.rdbtnNo.isSelected() && ar.get(1).getPoints()==ar.get(2).getPoints() && ar.get(1).getGD()==ar.get(2).getGD() && ar.get(1).getGF() == ar.get(2).getGF() && ar.get(1).getWins() == ar.get(2).getWins() && ar.get(1).getGA() == ar.get(2).getGA() ){
		    	          			tabelaBPlayoff.setVisible(true);
		    	          			lblPOG5TeamB2.setVisible(true);
		    	          			lblPOG5TeamB3.setVisible(true);
		    	          			resG5POTeamB2.setVisible(true);
		    	          			resG5POTeamB3.setVisible(true);
		    	          			btnBG5PlayOff.setVisible(true);
		    	          			resetBG5PlayOff.setVisible(true);
		    	          			lblPOG5TeamB2.setText(ar.get(1).getteamName());
		    	          			lblPOG5TeamB3.setText(ar.get(2).getteamName());
		    	          			
		    	          			lblPOG1TeamB1.setVisible(false); lblPOG2TeamB1.setVisible(false);
		    	          			lblPOG1TeamB2.setVisible(false); lblPOG2TeamB2.setVisible(false);
		    	          			lblPOG1TeamB3.setVisible(false); lblPOG2TeamB3.setVisible(false);
		    	          			resG1POTeamB1.setVisible(false); resG2POTeamB1.setVisible(false);
		    	          			resG1POTeamB2.setVisible(false); resG2POTeamB2.setVisible(false);
		    	          			resG1POTeamB3.setVisible(false); resG2POTeamB3.setVisible(false);
		    	          			btnBG1PlayOff.setVisible(false); btnBG2PlayOff.setVisible(false); btnBG3PlayOff.setVisible(false);
		    	          			resetBG1PlayOff.setVisible(false); resetBG2PlayOff.setVisible(false); resetBG3PlayOff.setVisible(false);
		    	          			
		    	          			lblPOG4TeamB1.setVisible(false);
		    	          			lblPOG4TeamB2.setVisible(false);
		    	          			resG4POTeamB1.setVisible(false);
		    	          			resG4POTeamB2.setVisible(false);
		    	          			btnBG4PlayOff.setVisible(false);
		    	          			resetBG4PlayOff.setVisible(false);
		    	          		}
					  	}
				  });
				  btnGrpBG3.setFont(new Font("Tahoma", Font.BOLD, 10));
				  btnGrpBG3.setBounds(964, 274, 89, 17);
				  contentPane.add(btnGrpBG3);
				  
				  btnGrpBG4.addActionListener(new ActionListener() {
			          	public void actionPerformed(ActionEvent e) {
			          		gfB1G3=Integer.parseInt(resultB1G3.getText());
			          		gfB2G3=Integer.parseInt(resultB2G3.getText());
			          					          			          		
			          		if(gfB1G3>gfB2G3) {
			          			wB1G3=1; dB1G3=0; lB1G3=0; uwB1=wB1G1+wB1G2+wB1G3+wB1G4; udB1=dB1G1+dB1G2+dB1G3+dB1G4; ulB1=lB1G1+lB1G2+lB1G3+lB1G4; upB1=uwB1+udB1+ulB1; ptsuB1=3*uwB1+udB1;
			          			wB2G3=0; dB2G3=0; lB2G3=1; uwB2=wB2G1+wB2G2+wB2G3+wB2G4; udB2=dB2G1+dB2G2+dB2G3+dB2G4; ulB2=lB2G1+lB2G2+lB2G3+lB2G4; upB2=uwB2+udB2+ulB2; ptsuB2=3*uwB2+udB2;
			          		}
			          		else if(gfB1G3<gfB2G3) {
			          			wB1G3=0; dB1G3=0; lB1G3=1; uwB1=wB1G1+wB1G2+wB1G3+wB1G4; udB1=dB1G1+dB1G2+dB1G3+dB1G4; ulB1=lB1G1+lB1G2+lB1G3+lB1G4; upB1=uwB1+udB1+ulB1; ptsuB1=3*uwB1+udB1;
			          			wB2G3=1; dB2G3=0; lB2G3=0; uwB2=wB2G1+wB2G2+wB2G3+wB2G4; udB2=dB2G1+dB2G2+dB2G3+dB2G4; ulB2=lB2G1+lB2G2+lB2G3+lB2G4; upB2=uwB2+udB2+ulB2; ptsuB2=3*uwB2+udB2;
			          		}
			          		else if(gfB1G3==gfB2G3) {
			          			dB1G3=1; wB1G3=0; lB1G3=0; uwB1=wB1G1+wB1G2+wB1G3+wB1G4; udB1=dB1G1+dB1G2+dB1G3+dB1G4; ulB1=lB1G1+lB1G2+lB1G3+lB1G4; upB1=uwB1+udB1+ulB1; ptsuB1=3*uwB1+udB1;
			          			dB2G3=1; wB2G3=0; lB2G3=0; uwB2=wB2G1+wB2G2+wB2G3+wB2G4; udB2=dB2G1+dB2G2+dB2G3+dB2G4; ulB2=lB2G1+lB2G2+lB2G3+lB2G4; upB2=uwB2+udB2+ulB2; ptsuB2=3*uwB2+udB2;
			          		}
			          		btnGrpBG4.setEnabled(false);
			          		resultB1G3.setEditable(false);
			          		resultB2G3.setEditable(false);
			          		
			          		ArrayList<TableSort> ar = new ArrayList<TableSort>();
			          		ar.add(new TableSort(String.valueOf(addTeams.teamB1),upB1,uwB1,udB1,ulB1,gfB1G1+gfB1G2+gfB1G3+gfB1G4,gfB2G1+gfB3G1+gfB2G3+gfB3G3,(gfB1G1+gfB1G2+gfB1G3+gfB1G4)-(gfB2G1+gfB3G1+gfB2G3+gfB3G3),ptsuB1));
		          			ar.add(new TableSort(String.valueOf(addTeams.teamB2),upB2,uwB2,udB2,ulB2,gfB2G1+gfB2G2+gfB2G3+gfB2G4,gfB1G1+gfB3G2+gfB1G3+gfB3G4,(gfB2G1+gfB2G2+gfB2G3+gfB2G4)-(gfB1G1+gfB3G2+gfB1G3+gfB3G4),ptsuB2));
		          			ar.add(new TableSort(String.valueOf(addTeams.teamB3),upB3,uwB3,udB3,ulB3,gfB3G1+gfB3G2+gfB3G3+gfB3G4,gfB1G2+gfB2G2+gfB1G4+gfB2G4,(gfB3G1+gfB3G2+gfB3G3+gfB3G4)-(gfB1G2+gfB2G2+gfB1G4+gfB2G4),ptsuB3));
		          			
		          			Collections.sort(ar, new SortByPts());
		          			
		          			lblGrpTeamB1.setText(ar.get(0).getteamName()); lblPlayedB1.setText(String.valueOf(ar.get(0).getPlayed())); lblWinsB1.setText(String.valueOf(ar.get(0).getWins())); lblDrawsB1.setText(String.valueOf(ar.get(0).getDraws()));   lblLostB1.setText(String.valueOf(ar.get(0).getLoses())); lblGFB1.setText(String.valueOf(ar.get(0).getGF())); lblGAB1.setText(String.valueOf(ar.get(0).getGA())); lblGDB1.setText(String.valueOf(ar.get(0).getGD())); lblPtsB1.setText(String.valueOf(ar.get(0).getPoints()));
		          			lblGrpTeamB2.setText(ar.get(1).getteamName()); lblPlayedB2.setText(String.valueOf(ar.get(1).getPlayed())); lblWinsB2.setText(String.valueOf(ar.get(1).getWins())); lblDrawsB2.setText(String.valueOf(ar.get(1).getDraws()));   lblLostB2.setText(String.valueOf(ar.get(1).getLoses())); lblGFB2.setText(String.valueOf(ar.get(1).getGF())); lblGAB2.setText(String.valueOf(ar.get(1).getGA())); lblGDB2.setText(String.valueOf(ar.get(1).getGD())); lblPtsB2.setText(String.valueOf(ar.get(1).getPoints()));
		          			lblGrpTeamB3.setText(ar.get(2).getteamName()); lblPlayedB3.setText(String.valueOf(ar.get(2).getPlayed())); lblWinsB3.setText(String.valueOf(ar.get(2).getWins())); lblDrawsB3.setText(String.valueOf(ar.get(2).getDraws()));   lblLostB3.setText(String.valueOf(ar.get(2).getLoses())); lblGFB3.setText(String.valueOf(ar.get(2).getGF())); lblGAB3.setText(String.valueOf(ar.get(2).getGA())); lblGDB3.setText(String.valueOf(ar.get(2).getGD())); lblPtsB3.setText(String.valueOf(ar.get(2).getPoints()));
			          		
		          			if(Creator.rdbtnYes.isSelected() && 
		              				ar.get(0).getPoints()==ar.get(1).getPoints() && ar.get(0).getGD()==ar.get(1).getGD() && ar.get(0).getGF() == ar.get(1).getGF() && ar.get(0).getWins() == ar.get(1).getWins() && ar.get(0).getGA() == ar.get(1).getGA() &&
		              				ar.get(1).getPoints()==ar.get(2).getPoints() && ar.get(1).getGD()==ar.get(2).getGD() && ar.get(1).getGF() == ar.get(2).getGF() && ar.get(1).getWins() == ar.get(2).getWins() && ar.get(1).getGA() == ar.get(2).getGA() &&
		              			    ar.get(0).getPoints()==ar.get(2).getPoints() && ar.get(0).getGD()==ar.get(2).getGD() && ar.get(0).getGF() == ar.get(2).getGF() && ar.get(0).getWins() == ar.get(2).getWins() && ar.get(0).getGA() == ar.get(2).getGA()) {
		              				tabelaBPlayoff.setVisible(true);
		    	          			lblPOG1TeamB1.setVisible(true); lblPOG2TeamB1.setVisible(true);
		    	          			lblPOG1TeamB2.setVisible(true); lblPOG2TeamB2.setVisible(true);
		    	          			lblPOG1TeamB3.setVisible(true); lblPOG2TeamB3.setVisible(true);
		    	          			resG1POTeamB1.setVisible(true); resG2POTeamB1.setVisible(true);
		    	          			resG1POTeamB2.setVisible(true); resG2POTeamB2.setVisible(true);
		    	          			resG1POTeamB3.setVisible(true); resG2POTeamB3.setVisible(true);
		    	          			btnBG1PlayOff.setVisible(true); btnBG2PlayOff.setVisible(true); btnBG3PlayOff.setVisible(true);
		    	          			resetBG1PlayOff.setVisible(true); resetBG2PlayOff.setVisible(true); resetBG3PlayOff.setVisible(true);
		    	          			
		    	          			lblPOG1TeamB1.setText(ar.get(0).getteamName()); lblPOG2TeamB1.setText(ar.get(0).getteamName());
		    	          			lblPOG1TeamB2.setText(ar.get(1).getteamName()); lblPOG2TeamB2.setText(ar.get(1).getteamName());
		    	          			lblPOG1TeamB3.setText(ar.get(2).getteamName()); lblPOG2TeamB3.setText(ar.get(2).getteamName());
		    	          			
		    	          			lblPOG4TeamB1.setVisible(false);
		    	          			lblPOG4TeamB2.setVisible(false);
		    	          			resG4POTeamB1.setVisible(false);
		    	          			resG4POTeamB2.setVisible(false);
		    	          			btnBG4PlayOff.setVisible(false);
		    	          			resetBG4PlayOff.setVisible(false);
		    	          			
		    	          			lblPOG5TeamB2.setVisible(false);
		    	          			lblPOG5TeamB3.setVisible(false);
		    	          			resG5POTeamB2.setVisible(false);
		    	          			resG5POTeamB3.setVisible(false);
		    	          			btnBG5PlayOff.setVisible(false);
		    	          			resetBG5PlayOff.setVisible(false);
		    	          			
		              			}
		              			
		              			else if(Creator.rdbtnYes.isSelected() && ar.get(0).getPoints()==ar.get(1).getPoints() && ar.get(0).getGD()==ar.get(1).getGD() && ar.get(0).getGF() == ar.get(1).getGF() && ar.get(0).getWins() == ar.get(1).getWins() && ar.get(0).getGA() == ar.get(1).getGA() ){
		    	          			tabelaBPlayoff.setVisible(true);
		    	          			lblPOG4TeamB1.setVisible(true);
		    	          			lblPOG4TeamB2.setVisible(true);
		    	          			resG4POTeamB1.setVisible(true);
		    	          			resG4POTeamB2.setVisible(true);
		    	          			btnBG4PlayOff.setVisible(true);
		    	          			resetBG4PlayOff.setVisible(true);
		    	          			lblPOG4TeamB1.setText(ar.get(0).getteamName());
		    	          			lblPOG4TeamB2.setText(ar.get(1).getteamName());
		    	          			
		    	          			lblPOG1TeamB1.setVisible(false); lblPOG2TeamB1.setVisible(false);
		    	          			lblPOG1TeamB2.setVisible(false); lblPOG2TeamB2.setVisible(false);
		    	          			lblPOG1TeamB3.setVisible(false); lblPOG2TeamB3.setVisible(false);
		    	          			resG1POTeamB1.setVisible(false); resG2POTeamB1.setVisible(false);
		    	          			resG1POTeamB2.setVisible(false); resG2POTeamB2.setVisible(false);
		    	          			resG1POTeamB3.setVisible(false); resG2POTeamB3.setVisible(false);
		    	          			btnBG1PlayOff.setVisible(false); btnBG2PlayOff.setVisible(false); btnBG3PlayOff.setVisible(false);
		    	          			resetBG1PlayOff.setVisible(false); resetBG2PlayOff.setVisible(false); resetBG3PlayOff.setVisible(false);
		    	          			
		    	          			lblPOG5TeamB2.setVisible(false);
		    	          			lblPOG5TeamB3.setVisible(false);
		    	          			resG5POTeamB2.setVisible(false);
		    	          			resG5POTeamB3.setVisible(false);
		    	          			btnBG5PlayOff.setVisible(false);
		    	          			resetBG5PlayOff.setVisible(false);
		    	          			
		    	          		}
		              			else if(Creator.rdbtnYes.isSelected() && ar.get(1).getPoints()==ar.get(2).getPoints() && ar.get(1).getGD()==ar.get(2).getGD() && ar.get(1).getGF() == ar.get(2).getGF() && ar.get(1).getWins() == ar.get(2).getWins() && ar.get(1).getGA() == ar.get(2).getGA() ){
		    	          			tabelaBPlayoff.setVisible(true);
		    	          			lblPOG5TeamB2.setVisible(true);
		    	          			lblPOG5TeamB3.setVisible(true);
		    	          			resG5POTeamB2.setVisible(true);
		    	          			resG5POTeamB3.setVisible(true);
		    	          			btnBG5PlayOff.setVisible(true);
		    	          			resetBG5PlayOff.setVisible(true);
		    	          			lblPOG5TeamB2.setText(ar.get(1).getteamName());
		    	          			lblPOG5TeamB3.setText(ar.get(2).getteamName());
		    	          			
		    	          			lblPOG1TeamB1.setVisible(false); lblPOG2TeamB1.setVisible(false);
		    	          			lblPOG1TeamB2.setVisible(false); lblPOG2TeamB2.setVisible(false);
		    	          			lblPOG1TeamB3.setVisible(false); lblPOG2TeamB3.setVisible(false);
		    	          			resG1POTeamB1.setVisible(false); resG2POTeamB1.setVisible(false);
		    	          			resG1POTeamB2.setVisible(false); resG2POTeamB2.setVisible(false);
		    	          			resG1POTeamB3.setVisible(false); resG2POTeamB3.setVisible(false);
		    	          			btnBG1PlayOff.setVisible(false); btnBG2PlayOff.setVisible(false); btnBG3PlayOff.setVisible(false);
		    	          			resetBG1PlayOff.setVisible(false); resetBG2PlayOff.setVisible(false); resetBG3PlayOff.setVisible(false);
		    	          			
		    	          			lblPOG4TeamB1.setVisible(false);
		    	          			lblPOG4TeamB2.setVisible(false);
		    	          			resG4POTeamB1.setVisible(false);
		    	          			resG4POTeamB2.setVisible(false);
		    	          			btnBG4PlayOff.setVisible(false);
		    	          			resetBG4PlayOff.setVisible(false);
		    	          		}
			          	}
			      });
				  btnGrpBG4.setFont(new Font("Tahoma", Font.BOLD, 10));		
				  btnGrpBG4.setBounds(964, 302, 89, 17);					
				  contentPane.add(btnGrpBG4);								

				  btnGrpBG5.addActionListener(new ActionListener() {
			          	public void actionPerformed(ActionEvent e) {
			          		gfB1G4=Integer.parseInt(resultB1G4.getText());
			          		gfB3G3=Integer.parseInt(resultB3G3.getText());
			          		
			          		if(gfB1G4>gfB3G3) {
			          			wB1G4=1; dB1G4=0; lB1G4=0; uwB1=wB1G1+wB1G2+wB1G3+wB1G4; udB1=dB1G1+dB1G2+dB1G3+dB1G4; ulB1=lB1G1+lB1G2+lB1G3+lB1G4; upB1=uwB1+udB1+ulB1; ptsuB1=3*uwB1+udB1;
			          			wB3G3=0; dB3G3=0; lB3G3=1; uwB3=wB3G1+wB3G2+wB3G3+wB3G4; udB3=dB3G1+dB3G2+dB3G3+dB3G4; ulB3=lB3G1+lB3G2+lB3G3+lB3G4; upB3=uwB3+udB3+ulB3; ptsuB3=3*uwB3+udB3;
			          		}
			          		else if(gfB1G4<gfB3G3) {
			          			wB1G4=0; dB1G4=0; lB1G4=1; uwB1=wB1G1+wB1G2+wB1G3+wB1G4; udB1=dB1G1+dB1G2+dB1G3+dB1G4; ulB1=lB1G1+lB1G2+lB1G3+lB1G4; upB1=uwB1+udB1+ulB1; ptsuB1=3*uwB1+udB1;
			          			wB3G3=1; dB3G3=0; lB3G3=0; uwB3=wB3G1+wB3G2+wB3G3+wB3G4; udB3=dB3G1+dB3G2+dB3G3+dB3G4; ulB3=lB3G1+lB3G2+lB3G3+lB3G4; upB3=uwB3+udB3+ulB3; ptsuB3=3*uwB3+udB3; 
			          		}
			          		else if(gfB1G4==gfB3G3) {
			          			dB1G4=1; wB1G4=0; lB1G4=0; uwB1=wB1G1+wB1G2+wB1G3+wB1G4; udB1=dB1G1+dB1G2+dB1G3+dB1G4; ulB1=lB1G1+lB1G2+lB1G3+lB1G4; upB1=uwB1+udB1+ulB1; ptsuB1=3*uwB1+udB1;
			          			dB3G3=1; wB3G3=0; lB3G3=0; uwB3=wB3G1+wB3G2+wB3G3+wB3G4; udB3=dB3G1+dB3G2+dB3G3+dB3G4; ulB3=lB3G1+lB3G2+lB3G3+lB3G4; upB3=uwB3+udB3+ulB3; ptsuB3=3*uwB3+udB3;
			          		}
			          		btnGrpBG5.setEnabled(false);
			          		resultB1G4.setEditable(false);
			          		resultB3G3.setEditable(false);
			          		
			          		ArrayList<TableSort> ar = new ArrayList<TableSort>();
			          		ar.add(new TableSort(String.valueOf(addTeams.teamB1),upB1,uwB1,udB1,ulB1,gfB1G1+gfB1G2+gfB1G3+gfB1G4,gfB2G1+gfB3G1+gfB2G3+gfB3G3,(gfB1G1+gfB1G2+gfB1G3+gfB1G4)-(gfB2G1+gfB3G1+gfB2G3+gfB3G3),ptsuB1));
		          			ar.add(new TableSort(String.valueOf(addTeams.teamB2),upB2,uwB2,udB2,ulB2,gfB2G1+gfB2G2+gfB2G3+gfB2G4,gfB1G1+gfB3G2+gfB1G3+gfB3G4,(gfB2G1+gfB2G2+gfB2G3+gfB2G4)-(gfB1G1+gfB3G2+gfB1G3+gfB3G4),ptsuB2));
		          			ar.add(new TableSort(String.valueOf(addTeams.teamB3),upB3,uwB3,udB3,ulB3,gfB3G1+gfB3G2+gfB3G3+gfB3G4,gfB1G2+gfB2G2+gfB1G4+gfB2G4,(gfB3G1+gfB3G2+gfB3G3+gfB3G4)-(gfB1G2+gfB2G2+gfB1G4+gfB2G4),ptsuB3));
		          			
		          			Collections.sort(ar, new SortByPts());
		          			
		          			lblGrpTeamB1.setText(ar.get(0).getteamName()); lblPlayedB1.setText(String.valueOf(ar.get(0).getPlayed())); lblWinsB1.setText(String.valueOf(ar.get(0).getWins())); lblDrawsB1.setText(String.valueOf(ar.get(0).getDraws()));   lblLostB1.setText(String.valueOf(ar.get(0).getLoses())); lblGFB1.setText(String.valueOf(ar.get(0).getGF())); lblGAB1.setText(String.valueOf(ar.get(0).getGA())); lblGDB1.setText(String.valueOf(ar.get(0).getGD())); lblPtsB1.setText(String.valueOf(ar.get(0).getPoints()));
		          			lblGrpTeamB2.setText(ar.get(1).getteamName()); lblPlayedB2.setText(String.valueOf(ar.get(1).getPlayed())); lblWinsB2.setText(String.valueOf(ar.get(1).getWins())); lblDrawsB2.setText(String.valueOf(ar.get(1).getDraws()));   lblLostB2.setText(String.valueOf(ar.get(1).getLoses())); lblGFB2.setText(String.valueOf(ar.get(1).getGF())); lblGAB2.setText(String.valueOf(ar.get(1).getGA())); lblGDB2.setText(String.valueOf(ar.get(1).getGD())); lblPtsB2.setText(String.valueOf(ar.get(1).getPoints()));
		          			lblGrpTeamB3.setText(ar.get(2).getteamName()); lblPlayedB3.setText(String.valueOf(ar.get(2).getPlayed())); lblWinsB3.setText(String.valueOf(ar.get(2).getWins())); lblDrawsB3.setText(String.valueOf(ar.get(2).getDraws()));   lblLostB3.setText(String.valueOf(ar.get(2).getLoses())); lblGFB3.setText(String.valueOf(ar.get(2).getGF())); lblGAB3.setText(String.valueOf(ar.get(2).getGA())); lblGDB3.setText(String.valueOf(ar.get(2).getGD())); lblPtsB3.setText(String.valueOf(ar.get(2).getPoints()));
			          		
		          			if(Creator.rdbtnYes.isSelected() && 
		              				ar.get(0).getPoints()==ar.get(1).getPoints() && ar.get(0).getGD()==ar.get(1).getGD() && ar.get(0).getGF() == ar.get(1).getGF() && ar.get(0).getWins() == ar.get(1).getWins() && ar.get(0).getGA() == ar.get(1).getGA() &&
		              				ar.get(1).getPoints()==ar.get(2).getPoints() && ar.get(1).getGD()==ar.get(2).getGD() && ar.get(1).getGF() == ar.get(2).getGF() && ar.get(1).getWins() == ar.get(2).getWins() && ar.get(1).getGA() == ar.get(2).getGA() &&
		              			    ar.get(0).getPoints()==ar.get(2).getPoints() && ar.get(0).getGD()==ar.get(2).getGD() && ar.get(0).getGF() == ar.get(2).getGF() && ar.get(0).getWins() == ar.get(2).getWins() && ar.get(0).getGA() == ar.get(2).getGA()) {
		              				tabelaBPlayoff.setVisible(true);
		    	          			lblPOG1TeamB1.setVisible(true); lblPOG2TeamB1.setVisible(true);
		    	          			lblPOG1TeamB2.setVisible(true); lblPOG2TeamB2.setVisible(true);
		    	          			lblPOG1TeamB3.setVisible(true); lblPOG2TeamB3.setVisible(true);
		    	          			resG1POTeamB1.setVisible(true); resG2POTeamB1.setVisible(true);
		    	          			resG1POTeamB2.setVisible(true); resG2POTeamB2.setVisible(true);
		    	          			resG1POTeamB3.setVisible(true); resG2POTeamB3.setVisible(true);
		    	          			btnBG1PlayOff.setVisible(true); btnBG2PlayOff.setVisible(true); btnBG3PlayOff.setVisible(true);
		    	          			resetBG1PlayOff.setVisible(true); resetBG2PlayOff.setVisible(true); resetBG3PlayOff.setVisible(true);
		    	          			
		    	          			lblPOG1TeamB1.setText(ar.get(0).getteamName()); lblPOG2TeamB1.setText(ar.get(0).getteamName());
		    	          			lblPOG1TeamB2.setText(ar.get(1).getteamName()); lblPOG2TeamB2.setText(ar.get(1).getteamName());
		    	          			lblPOG1TeamB3.setText(ar.get(2).getteamName()); lblPOG2TeamB3.setText(ar.get(2).getteamName());
		    	          			
		    	          			lblPOG4TeamB1.setVisible(false);
		    	          			lblPOG4TeamB2.setVisible(false);
		    	          			resG4POTeamB1.setVisible(false);
		    	          			resG4POTeamB2.setVisible(false);
		    	          			btnBG4PlayOff.setVisible(false);
		    	          			resetBG4PlayOff.setVisible(false);
		    	          			
		    	          			lblPOG5TeamB2.setVisible(false);
		    	          			lblPOG5TeamB3.setVisible(false);
		    	          			resG5POTeamB2.setVisible(false);
		    	          			resG5POTeamB3.setVisible(false);
		    	          			btnBG5PlayOff.setVisible(false);
		    	          			resetBG5PlayOff.setVisible(false);
		    	          			
		              			}
		              			
		              			else if(Creator.rdbtnYes.isSelected() && ar.get(0).getPoints()==ar.get(1).getPoints() && ar.get(0).getGD()==ar.get(1).getGD() && ar.get(0).getGF() == ar.get(1).getGF() && ar.get(0).getWins() == ar.get(1).getWins() && ar.get(0).getGA() == ar.get(1).getGA() ){
		    	          			tabelaBPlayoff.setVisible(true);
		    	          			lblPOG4TeamB1.setVisible(true);
		    	          			lblPOG4TeamB2.setVisible(true);
		    	          			resG4POTeamB1.setVisible(true);
		    	          			resG4POTeamB2.setVisible(true);
		    	          			btnBG4PlayOff.setVisible(true);
		    	          			resetBG4PlayOff.setVisible(true);
		    	          			lblPOG4TeamB1.setText(ar.get(0).getteamName());
		    	          			lblPOG4TeamB2.setText(ar.get(1).getteamName());
		    	          			
		    	          			lblPOG1TeamB1.setVisible(false); lblPOG2TeamB1.setVisible(false);
		    	          			lblPOG1TeamB2.setVisible(false); lblPOG2TeamB2.setVisible(false);
		    	          			lblPOG1TeamB3.setVisible(false); lblPOG2TeamB3.setVisible(false);
		    	          			resG1POTeamB1.setVisible(false); resG2POTeamB1.setVisible(false);
		    	          			resG1POTeamB2.setVisible(false); resG2POTeamB2.setVisible(false);
		    	          			resG1POTeamB3.setVisible(false); resG2POTeamB3.setVisible(false);
		    	          			btnBG1PlayOff.setVisible(false); btnBG2PlayOff.setVisible(false); btnBG3PlayOff.setVisible(false);
		    	          			resetBG1PlayOff.setVisible(false); resetBG2PlayOff.setVisible(false); resetBG3PlayOff.setVisible(false);
		    	          			
		    	          			lblPOG5TeamB2.setVisible(false);
		    	          			lblPOG5TeamB3.setVisible(false);
		    	          			resG5POTeamB2.setVisible(false);
		    	          			resG5POTeamB3.setVisible(false);
		    	          			btnBG5PlayOff.setVisible(false);
		    	          			resetBG5PlayOff.setVisible(false);
		    	          			
		    	          		}
		              			else if(Creator.rdbtnYes.isSelected() && ar.get(1).getPoints()==ar.get(2).getPoints() && ar.get(1).getGD()==ar.get(2).getGD() && ar.get(1).getGF() == ar.get(2).getGF() && ar.get(1).getWins() == ar.get(2).getWins() && ar.get(1).getGA() == ar.get(2).getGA() ){
		    	          			tabelaBPlayoff.setVisible(true);
		    	          			lblPOG5TeamB2.setVisible(true);
		    	          			lblPOG5TeamB3.setVisible(true);
		    	          			resG5POTeamB2.setVisible(true);
		    	          			resG5POTeamB3.setVisible(true);
		    	          			btnBG5PlayOff.setVisible(true);
		    	          			resetBG5PlayOff.setVisible(true);
		    	          			lblPOG5TeamB2.setText(ar.get(1).getteamName());
		    	          			lblPOG5TeamB3.setText(ar.get(2).getteamName());
		    	          			
		    	          			lblPOG1TeamB1.setVisible(false); lblPOG2TeamB1.setVisible(false);
		    	          			lblPOG1TeamB2.setVisible(false); lblPOG2TeamB2.setVisible(false);
		    	          			lblPOG1TeamB3.setVisible(false); lblPOG2TeamB3.setVisible(false);
		    	          			resG1POTeamB1.setVisible(false); resG2POTeamB1.setVisible(false);
		    	          			resG1POTeamB2.setVisible(false); resG2POTeamB2.setVisible(false);
		    	          			resG1POTeamB3.setVisible(false); resG2POTeamB3.setVisible(false);
		    	          			btnBG1PlayOff.setVisible(false); btnBG2PlayOff.setVisible(false); btnBG3PlayOff.setVisible(false);
		    	          			resetBG1PlayOff.setVisible(false); resetBG2PlayOff.setVisible(false); resetBG3PlayOff.setVisible(false);
		    	          			
		    	          			lblPOG4TeamB1.setVisible(false);
		    	          			lblPOG4TeamB2.setVisible(false);
		    	          			resG4POTeamB1.setVisible(false);
		    	          			resG4POTeamB2.setVisible(false);
		    	          			btnBG4PlayOff.setVisible(false);
		    	          			resetBG4PlayOff.setVisible(false);
		    	          		}
			          	}
			      });
				  btnGrpBG5.setFont(new Font("Tahoma", Font.BOLD, 10));
				  btnGrpBG5.setBounds(964, 330, 89, 17);
				  contentPane.add(btnGrpBG5);
				  
				  btnGrpBG6.addActionListener(new ActionListener() {
			          	public void actionPerformed(ActionEvent e) {
			          		gfB2G4=Integer.parseInt(resultB2G4.getText());
			          		gfB3G4=Integer.parseInt(resultB3G4.getText());
			          					          			          		
			          		if(gfB2G4>gfB3G4) {
			          			wB2G4=1; dB2G4=0; lB2G4=0; uwB2=wB2G1+wB2G2+wB2G3+wB2G4; udB2=dB2G1+dB2G2+dB2G3+dB2G4; ulB2=lB2G1+lB2G2+lB2G3+lB2G4; upB2=uwB2+udB2+ulB2; ptsuB2=3*uwB2+udB2;
			          			wB3G4=0; dB3G4=0; lB3G4=1; uwB3=wB3G1+wB3G2+wB3G3+wB3G4; udB3=dB3G1+dB3G2+dB3G3+dB3G4; ulB3=lB3G1+lB3G2+lB3G3+lB3G4; upB3=uwB3+udB3+ulB3; ptsuB3=3*uwB3+udB3;
			          		}
			          		else if(gfB2G4<gfB3G4) {
			          			wB2G4=0; dB2G4=0; lB2G4=1; uwB2=wB2G1+wB2G2+wB2G3+wB2G4; udB2=dB2G1+dB2G2+dB2G3+dB2G4; ulB2=lB2G1+lB2G2+lB2G3+lB2G4; upB2=uwB2+udB2+ulB2; ptsuB2=3*uwB2+udB2;
			          			wB3G4=1; dB3G4=0; lB3G4=0; uwB3=wB3G1+wB3G2+wB3G3+wB3G4; udB3=dB3G1+dB3G2+dB3G3+dB3G4; ulB3=lB3G1+lB3G2+lB3G3+lB3G4; upB3=uwB3+udB3+ulB3; ptsuB3=3*uwB3+udB3;
			          		}
			          		else if(gfB2G4==gfB3G4) {
			          			dB2G4=1; wB2G4=0; lB2G4=0; uwB2=wB2G1+wB2G2+wB2G3+wB2G4; udB2=dB2G1+dB2G2+dB2G3+dB2G4; ulB2=lB2G1+lB2G2+lB2G3+lB2G4; upB2=uwB2+udB2+ulB2; ptsuB2=3*uwB2+udB2;
			          			dB3G4=1; wB3G4=0; lB3G4=0; uwB3=wB3G1+wB3G2+wB3G3+wB3G4; udB3=dB3G1+dB3G2+dB3G3+dB3G4; ulB3=lB3G1+lB3G2+lB3G3+lB3G4; upB3=uwB3+udB3+ulB3; ptsuB3=3*uwB3+udB3;
			          		}
			          		btnGrpBG6.setEnabled(false);
			          		resultB2G4.setEditable(false);
			          		resultB3G4.setEditable(false);
			          		
			          		ArrayList<TableSort> ar = new ArrayList<TableSort>();
			          		ar.add(new TableSort(String.valueOf(addTeams.teamB1),upB1,uwB1,udB1,ulB1,gfB1G1+gfB1G2+gfB1G3+gfB1G4,gfB2G1+gfB3G1+gfB2G3+gfB3G3,(gfB1G1+gfB1G2+gfB1G3+gfB1G4)-(gfB2G1+gfB3G1+gfB2G3+gfB3G3),ptsuB1));
		          			ar.add(new TableSort(String.valueOf(addTeams.teamB2),upB2,uwB2,udB2,ulB2,gfB2G1+gfB2G2+gfB2G3+gfB2G4,gfB1G1+gfB3G2+gfB1G3+gfB3G4,(gfB2G1+gfB2G2+gfB2G3+gfB2G4)-(gfB1G1+gfB3G2+gfB1G3+gfB3G4),ptsuB2));
		          			ar.add(new TableSort(String.valueOf(addTeams.teamB3),upB3,uwB3,udB3,ulB3,gfB3G1+gfB3G2+gfB3G3+gfB3G4,gfB1G2+gfB2G2+gfB1G4+gfB2G4,(gfB3G1+gfB3G2+gfB3G3+gfB3G4)-(gfB1G2+gfB2G2+gfB1G4+gfB2G4),ptsuB3));
		          			
		          			Collections.sort(ar, new SortByPts());
		          			
		          			lblGrpTeamB1.setText(ar.get(0).getteamName()); lblPlayedB1.setText(String.valueOf(ar.get(0).getPlayed())); lblWinsB1.setText(String.valueOf(ar.get(0).getWins())); lblDrawsB1.setText(String.valueOf(ar.get(0).getDraws()));   lblLostB1.setText(String.valueOf(ar.get(0).getLoses())); lblGFB1.setText(String.valueOf(ar.get(0).getGF())); lblGAB1.setText(String.valueOf(ar.get(0).getGA())); lblGDB1.setText(String.valueOf(ar.get(0).getGD())); lblPtsB1.setText(String.valueOf(ar.get(0).getPoints()));
		          			lblGrpTeamB2.setText(ar.get(1).getteamName()); lblPlayedB2.setText(String.valueOf(ar.get(1).getPlayed())); lblWinsB2.setText(String.valueOf(ar.get(1).getWins())); lblDrawsB2.setText(String.valueOf(ar.get(1).getDraws()));   lblLostB2.setText(String.valueOf(ar.get(1).getLoses())); lblGFB2.setText(String.valueOf(ar.get(1).getGF())); lblGAB2.setText(String.valueOf(ar.get(1).getGA())); lblGDB2.setText(String.valueOf(ar.get(1).getGD())); lblPtsB2.setText(String.valueOf(ar.get(1).getPoints()));
		          			lblGrpTeamB3.setText(ar.get(2).getteamName()); lblPlayedB3.setText(String.valueOf(ar.get(2).getPlayed())); lblWinsB3.setText(String.valueOf(ar.get(2).getWins())); lblDrawsB3.setText(String.valueOf(ar.get(2).getDraws()));   lblLostB3.setText(String.valueOf(ar.get(2).getLoses())); lblGFB3.setText(String.valueOf(ar.get(2).getGF())); lblGAB3.setText(String.valueOf(ar.get(2).getGA())); lblGDB3.setText(String.valueOf(ar.get(2).getGD())); lblPtsB3.setText(String.valueOf(ar.get(2).getPoints()));
			          		
		          			if(Creator.rdbtnYes.isSelected() && 
		              				ar.get(0).getPoints()==ar.get(1).getPoints() && ar.get(0).getGD()==ar.get(1).getGD() && ar.get(0).getGF() == ar.get(1).getGF() && ar.get(0).getWins() == ar.get(1).getWins() && ar.get(0).getGA() == ar.get(1).getGA() &&
		              				ar.get(1).getPoints()==ar.get(2).getPoints() && ar.get(1).getGD()==ar.get(2).getGD() && ar.get(1).getGF() == ar.get(2).getGF() && ar.get(1).getWins() == ar.get(2).getWins() && ar.get(1).getGA() == ar.get(2).getGA() &&
		              			    ar.get(0).getPoints()==ar.get(2).getPoints() && ar.get(0).getGD()==ar.get(2).getGD() && ar.get(0).getGF() == ar.get(2).getGF() && ar.get(0).getWins() == ar.get(2).getWins() && ar.get(0).getGA() == ar.get(2).getGA()) {
		              				tabelaBPlayoff.setVisible(true);
		    	          			lblPOG1TeamB1.setVisible(true); lblPOG2TeamB1.setVisible(true);
		    	          			lblPOG1TeamB2.setVisible(true); lblPOG2TeamB2.setVisible(true);
		    	          			lblPOG1TeamB3.setVisible(true); lblPOG2TeamB3.setVisible(true);
		    	          			resG1POTeamB1.setVisible(true); resG2POTeamB1.setVisible(true);
		    	          			resG1POTeamB2.setVisible(true); resG2POTeamB2.setVisible(true);
		    	          			resG1POTeamB3.setVisible(true); resG2POTeamB3.setVisible(true);
		    	          			btnBG1PlayOff.setVisible(true); btnBG2PlayOff.setVisible(true); btnBG3PlayOff.setVisible(true);
		    	          			resetBG1PlayOff.setVisible(true); resetBG2PlayOff.setVisible(true); resetBG3PlayOff.setVisible(true);
		    	          			
		    	          			lblPOG1TeamB1.setText(ar.get(0).getteamName()); lblPOG2TeamB1.setText(ar.get(0).getteamName());
		    	          			lblPOG1TeamB2.setText(ar.get(1).getteamName()); lblPOG2TeamB2.setText(ar.get(1).getteamName());
		    	          			lblPOG1TeamB3.setText(ar.get(2).getteamName()); lblPOG2TeamB3.setText(ar.get(2).getteamName());
		    	          			
		    	          			lblPOG4TeamB1.setVisible(false);
		    	          			lblPOG4TeamB2.setVisible(false);
		    	          			resG4POTeamB1.setVisible(false);
		    	          			resG4POTeamB2.setVisible(false);
		    	          			btnBG4PlayOff.setVisible(false);
		    	          			resetBG4PlayOff.setVisible(false);
		    	          			
		    	          			lblPOG5TeamB2.setVisible(false);
		    	          			lblPOG5TeamB3.setVisible(false);
		    	          			resG5POTeamB2.setVisible(false);
		    	          			resG5POTeamB3.setVisible(false);
		    	          			btnBG5PlayOff.setVisible(false);
		    	          			resetBG5PlayOff.setVisible(false);
		    	          			
		              			}
		              			
		              			else if(Creator.rdbtnYes.isSelected() && ar.get(0).getPoints()==ar.get(1).getPoints() && ar.get(0).getGD()==ar.get(1).getGD() && ar.get(0).getGF() == ar.get(1).getGF() && ar.get(0).getWins() == ar.get(1).getWins() && ar.get(0).getGA() == ar.get(1).getGA() ){
		    	          			tabelaBPlayoff.setVisible(true);
		    	          			lblPOG4TeamB1.setVisible(true);
		    	          			lblPOG4TeamB2.setVisible(true);
		    	          			resG4POTeamB1.setVisible(true);
		    	          			resG4POTeamB2.setVisible(true);
		    	          			btnBG4PlayOff.setVisible(true);
		    	          			resetBG4PlayOff.setVisible(true);
		    	          			lblPOG4TeamB1.setText(ar.get(0).getteamName());
		    	          			lblPOG4TeamB2.setText(ar.get(1).getteamName());
		    	          			
		    	          			lblPOG1TeamB1.setVisible(false); lblPOG2TeamB1.setVisible(false);
		    	          			lblPOG1TeamB2.setVisible(false); lblPOG2TeamB2.setVisible(false);
		    	          			lblPOG1TeamB3.setVisible(false); lblPOG2TeamB3.setVisible(false);
		    	          			resG1POTeamB1.setVisible(false); resG2POTeamB1.setVisible(false);
		    	          			resG1POTeamB2.setVisible(false); resG2POTeamB2.setVisible(false);
		    	          			resG1POTeamB3.setVisible(false); resG2POTeamB3.setVisible(false);
		    	          			btnBG1PlayOff.setVisible(false); btnBG2PlayOff.setVisible(false); btnBG3PlayOff.setVisible(false);
		    	          			resetBG1PlayOff.setVisible(false); resetBG2PlayOff.setVisible(false); resetBG3PlayOff.setVisible(false);
		    	          			
		    	          			lblPOG5TeamB2.setVisible(false);
		    	          			lblPOG5TeamB3.setVisible(false);
		    	          			resG5POTeamB2.setVisible(false);
		    	          			resG5POTeamB3.setVisible(false);
		    	          			btnBG5PlayOff.setVisible(false);
		    	          			resetBG5PlayOff.setVisible(false);
		    	          			
		    	          		}
		              			else if(Creator.rdbtnYes.isSelected() && ar.get(1).getPoints()==ar.get(2).getPoints() && ar.get(1).getGD()==ar.get(2).getGD() && ar.get(1).getGF() == ar.get(2).getGF() && ar.get(1).getWins() == ar.get(2).getWins() && ar.get(1).getGA() == ar.get(2).getGA() ){
		    	          			tabelaBPlayoff.setVisible(true);
		    	          			lblPOG5TeamB2.setVisible(true);
		    	          			lblPOG5TeamB3.setVisible(true);
		    	          			resG5POTeamB2.setVisible(true);
		    	          			resG5POTeamB3.setVisible(true);
		    	          			btnBG5PlayOff.setVisible(true);
		    	          			resetBG5PlayOff.setVisible(true);
		    	          			lblPOG5TeamB2.setText(ar.get(1).getteamName());
		    	          			lblPOG5TeamB3.setText(ar.get(2).getteamName());
		    	          			
		    	          			lblPOG1TeamB1.setVisible(false); lblPOG2TeamB1.setVisible(false);
		    	          			lblPOG1TeamB2.setVisible(false); lblPOG2TeamB2.setVisible(false);
		    	          			lblPOG1TeamB3.setVisible(false); lblPOG2TeamB3.setVisible(false);
		    	          			resG1POTeamB1.setVisible(false); resG2POTeamB1.setVisible(false);
		    	          			resG1POTeamB2.setVisible(false); resG2POTeamB2.setVisible(false);
		    	          			resG1POTeamB3.setVisible(false); resG2POTeamB3.setVisible(false);
		    	          			btnBG1PlayOff.setVisible(false); btnBG2PlayOff.setVisible(false); btnBG3PlayOff.setVisible(false);
		    	          			resetBG1PlayOff.setVisible(false); resetBG2PlayOff.setVisible(false); resetBG3PlayOff.setVisible(false);
		    	          			
		    	          			lblPOG4TeamB1.setVisible(false);
		    	          			lblPOG4TeamB2.setVisible(false);
		    	          			resG4POTeamB1.setVisible(false);
		    	          			resG4POTeamB2.setVisible(false);
		    	          			btnBG4PlayOff.setVisible(false);
		    	          			resetBG4PlayOff.setVisible(false);
		    	          		}
			          	}
			      });
				  btnGrpBG6.setFont(new Font("Tahoma", Font.BOLD, 10));
				  btnGrpBG6.setBounds(964, 358, 89, 17);
				  contentPane.add(btnGrpBG6);
				  
			//KnockOut button--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	  
				  JButton knockOut = new JButton("Knockout");
				  knockOut.setFont(new Font("Tahoma", Font.BOLD, 13));
				  knockOut.setBounds(500, 635, 111, 25);
				  knockOut.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							KnockOut6 s = new KnockOut6();
							dispose();
							s.setVisible(true);
						}
					});
				  contentPane.add(knockOut);
				  
			//RESET buttons-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	  
				  Image photo = new ImageIcon(this.getClass().getResource("images/arrowReset.png")).getImage();
				  
				  JButton resetAG1 = new JButton("");
				  resetAG1.addActionListener(new ActionListener() {
				  	public void actionPerformed(ActionEvent e) {
				  		btnGrpAG1.setEnabled(true);
		          		resultA1G1.setEditable(true);
		          		resultA2G1.setEditable(true);
		          		tabelaAPlayoff.setVisible(false);
		          		lblGrpTeamA1.setText(addTeams.teamA1); lblPlayedA1.setText(pA1); lblWinsA1.setText(wA1); lblDrawsA1.setText(dA1); lblLostA1.setText(lA1); lblGFA1.setText(gfA1); lblGAA1.setText(gaA1); lblGDA1.setText(gdA1); lblPtsA1.setText(ptsA1);
		          		lblGrpTeamA2.setText(addTeams.teamA2); lblPlayedA2.setText(pA2); lblWinsA2.setText(wA2); lblDrawsA2.setText(dA2); lblLostA2.setText(lA2); lblGFA2.setText(gfA2); lblGAA2.setText(gaA2); lblGDA2.setText(gdA2); lblPtsA2.setText(ptsA2);
		          		lblGrpTeamA3.setText(addTeams.teamA3); lblPlayedA3.setText(pA3); lblWinsA3.setText(wA3); lblDrawsA3.setText(dA3); lblLostA3.setText(lA3); lblGFA3.setText(gfA3); lblGAA3.setText(gaA3); lblGDA3.setText(gdA3); lblPtsA3.setText(ptsA3);
				  	}
				  });
				  resetAG1.setForeground(Color.WHITE);
				  resetAG1.setBackground(Color.WHITE);
				  resetAG1.setIcon(new ImageIcon(photo));
				  resetAG1.setBounds(477, 218, 25, 17);
				  contentPane.add(resetAG1);
				  
				  JButton resetAG2 = new JButton("");
				  resetAG2.addActionListener(new ActionListener() {
				  	public void actionPerformed(ActionEvent e) {
				  		btnGrpAG2.setEnabled(true);
		          		resultA1G2.setEditable(true);
		          		resultA3G1.setEditable(true);
		          		tabelaAPlayoff.setVisible(false);
		          		lblGrpTeamA1.setText(addTeams.teamA1); lblPlayedA1.setText(pA1); lblWinsA1.setText(wA1); lblDrawsA1.setText(dA1); lblLostA1.setText(lA1); lblGFA1.setText(gfA1); lblGAA1.setText(gaA1); lblGDA1.setText(gdA1); lblPtsA1.setText(ptsA1);
		          		lblGrpTeamA2.setText(addTeams.teamA2); lblPlayedA2.setText(pA2); lblWinsA2.setText(wA2); lblDrawsA2.setText(dA2); lblLostA2.setText(lA2); lblGFA2.setText(gfA2); lblGAA2.setText(gaA2); lblGDA2.setText(gdA2); lblPtsA2.setText(ptsA2);
		          		lblGrpTeamA3.setText(addTeams.teamA3); lblPlayedA3.setText(pA3); lblWinsA3.setText(wA3); lblDrawsA3.setText(dA3); lblLostA3.setText(lA3); lblGFA3.setText(gfA3); lblGAA3.setText(gaA3); lblGDA3.setText(gdA3); lblPtsA3.setText(ptsA3);
				  	}
				  });
				  resetAG2.setForeground(Color.WHITE);
				  resetAG2.setBackground(Color.WHITE);
				  resetAG2.setIcon(new ImageIcon(photo));
				  resetAG2.setBounds(477, 246, 25, 17);
				  contentPane.add(resetAG2);
				  
				  JButton resetAG3 = new JButton("");
				  resetAG3.addActionListener(new ActionListener() {
				  	public void actionPerformed(ActionEvent e) {
				  		btnGrpAG3.setEnabled(true);
		          		resultA2G2.setEditable(true);
		          		resultA3G2.setEditable(true);
		          		tabelaAPlayoff.setVisible(false);
		          		lblGrpTeamA1.setText(addTeams.teamA1); lblPlayedA1.setText(pA1); lblWinsA1.setText(wA1); lblDrawsA1.setText(dA1); lblLostA1.setText(lA1); lblGFA1.setText(gfA1); lblGAA1.setText(gaA1); lblGDA1.setText(gdA1); lblPtsA1.setText(ptsA1);
		          		lblGrpTeamA2.setText(addTeams.teamA2); lblPlayedA2.setText(pA2); lblWinsA2.setText(wA2); lblDrawsA2.setText(dA2); lblLostA2.setText(lA2); lblGFA2.setText(gfA2); lblGAA2.setText(gaA2); lblGDA2.setText(gdA2); lblPtsA2.setText(ptsA2);
		          		lblGrpTeamA3.setText(addTeams.teamA3); lblPlayedA3.setText(pA3); lblWinsA3.setText(wA3); lblDrawsA3.setText(dA3); lblLostA3.setText(lA3); lblGFA3.setText(gfA3); lblGAA3.setText(gaA3); lblGDA3.setText(gdA3); lblPtsA3.setText(ptsA3);
				  	}
				  });
				  resetAG3.setForeground(Color.WHITE);
				  resetAG3.setBackground(Color.WHITE);
				  resetAG3.setIcon(new ImageIcon(photo));
				  resetAG3.setBounds(477, 274, 25, 17);
				  contentPane.add(resetAG3);
				  
				  resetAG4.addActionListener(new ActionListener() {
				  	public void actionPerformed(ActionEvent e) {
				  		btnGrpAG4.setEnabled(true);
		          		resultA1G3.setEditable(true);
		          		resultA2G3.setEditable(true);
		          		tabelaAPlayoff.setVisible(false);
		          		lblGrpTeamA1.setText(addTeams.teamA1); lblPlayedA1.setText(pA1); lblWinsA1.setText(wA1); lblDrawsA1.setText(dA1); lblLostA1.setText(lA1); lblGFA1.setText(gfA1); lblGAA1.setText(gaA1); lblGDA1.setText(gdA1); lblPtsA1.setText(ptsA1);
		          		lblGrpTeamA2.setText(addTeams.teamA2); lblPlayedA2.setText(pA2); lblWinsA2.setText(wA2); lblDrawsA2.setText(dA2); lblLostA2.setText(lA2); lblGFA2.setText(gfA2); lblGAA2.setText(gaA2); lblGDA2.setText(gdA2); lblPtsA2.setText(ptsA2);
		          		lblGrpTeamA3.setText(addTeams.teamA3); lblPlayedA3.setText(pA3); lblWinsA3.setText(wA3); lblDrawsA3.setText(dA3); lblLostA3.setText(lA3); lblGFA3.setText(gfA3); lblGAA3.setText(gaA3); lblGDA3.setText(gdA3); lblPtsA3.setText(ptsA3);
				  	}
				  });
				  resetAG4.setForeground(Color.WHITE);
				  resetAG4.setBackground(Color.WHITE);
				  resetAG4.setIcon(new ImageIcon(photo));
				  resetAG4.setBounds(477, 302, 25, 17);
				  contentPane.add(resetAG4);
				  
				  resetAG5.addActionListener(new ActionListener() {
				  	public void actionPerformed(ActionEvent e) {
				  		btnGrpAG5.setEnabled(true);
		          		resultA1G4.setEditable(true);
		          		resultA3G3.setEditable(true);
		          		tabelaAPlayoff.setVisible(false);
		          		lblGrpTeamA1.setText(addTeams.teamA1); lblPlayedA1.setText(pA1); lblWinsA1.setText(wA1); lblDrawsA1.setText(dA1); lblLostA1.setText(lA1); lblGFA1.setText(gfA1); lblGAA1.setText(gaA1); lblGDA1.setText(gdA1); lblPtsA1.setText(ptsA1);
		          		lblGrpTeamA2.setText(addTeams.teamA2); lblPlayedA2.setText(pA2); lblWinsA2.setText(wA2); lblDrawsA2.setText(dA2); lblLostA2.setText(lA2); lblGFA2.setText(gfA2); lblGAA2.setText(gaA2); lblGDA2.setText(gdA2); lblPtsA2.setText(ptsA2);
		          		lblGrpTeamA3.setText(addTeams.teamA3); lblPlayedA3.setText(pA3); lblWinsA3.setText(wA3); lblDrawsA3.setText(dA3); lblLostA3.setText(lA3); lblGFA3.setText(gfA3); lblGAA3.setText(gaA3); lblGDA3.setText(gdA3); lblPtsA3.setText(ptsA3);
				  	}
				  });
				  resetAG5.setForeground(Color.WHITE);
				  resetAG5.setBackground(Color.WHITE);
				  resetAG5.setIcon(new ImageIcon(photo));
				  resetAG5.setBounds(477, 330, 25, 17);
				  contentPane.add(resetAG5);
				  
				  resetAG6.addActionListener(new ActionListener() {
				  	public void actionPerformed(ActionEvent e) {
				  		btnGrpAG6.setEnabled(true);
		          		resultA2G4.setEditable(true);
		          		resultA3G4.setEditable(true);
		          		tabelaAPlayoff.setVisible(false);
		          		lblGrpTeamA1.setText(addTeams.teamA1); lblPlayedA1.setText(pA1); lblWinsA1.setText(wA1); lblDrawsA1.setText(dA1); lblLostA1.setText(lA1); lblGFA1.setText(gfA1); lblGAA1.setText(gaA1); lblGDA1.setText(gdA1); lblPtsA1.setText(ptsA1);
		          		lblGrpTeamA2.setText(addTeams.teamA2); lblPlayedA2.setText(pA2); lblWinsA2.setText(wA2); lblDrawsA2.setText(dA2); lblLostA2.setText(lA2); lblGFA2.setText(gfA2); lblGAA2.setText(gaA2); lblGDA2.setText(gdA2); lblPtsA2.setText(ptsA2);
		          		lblGrpTeamA3.setText(addTeams.teamA3); lblPlayedA3.setText(pA3); lblWinsA3.setText(wA3); lblDrawsA3.setText(dA3); lblLostA3.setText(lA3); lblGFA3.setText(gfA3); lblGAA3.setText(gaA3); lblGDA3.setText(gdA3); lblPtsA3.setText(ptsA3);
				  	}
				  });
				  resetAG6.setForeground(Color.WHITE);
				  resetAG6.setBackground(Color.WHITE);
				  resetAG6.setIcon(new ImageIcon(photo));
				  resetAG6.setBounds(477, 358, 25, 17);
				  contentPane.add(resetAG6);
				  
				  JButton resetBG1 = new JButton("");
				  resetBG1.addActionListener(new ActionListener() {
				  	public void actionPerformed(ActionEvent e) {
				  		btnGrpBG1.setEnabled(true);
		          		resultB1G1.setEditable(true);
		          		resultB2G1.setEditable(true);
		          		tabelaBPlayoff.setVisible(false);
		          		lblGrpTeamB1.setText(addTeams.teamB1); lblPlayedB1.setText(pB1); lblWinsB1.setText(wB1); lblDrawsB1.setText(dB1); lblLostB1.setText(lB1); lblGFB1.setText(gfB1); lblGAB1.setText(gaB1); lblGDB1.setText(gdB1); lblPtsB1.setText(ptsB1);
	          			lblGrpTeamB2.setText(addTeams.teamB2); lblPlayedB2.setText(pB2); lblWinsB2.setText(wB2); lblDrawsB2.setText(dB2); lblLostB2.setText(lB2); lblGFB2.setText(gfB2); lblGAB2.setText(gaB2); lblGDB2.setText(gdB2); lblPtsB2.setText(ptsB2);
	          			lblGrpTeamB3.setText(addTeams.teamB3); lblPlayedB3.setText(pB3); lblWinsB3.setText(wB3); lblDrawsB3.setText(dB3); lblLostB3.setText(lB3); lblGFB3.setText(gfB3); lblGAB3.setText(gaB3); lblGDB3.setText(gdB3); lblPtsB3.setText(ptsB3);
		          	}
				  });
				  resetBG1.setForeground(Color.WHITE);
				  resetBG1.setBackground(Color.WHITE);
				  resetBG1.setIcon(new ImageIcon(photo));
				  resetBG1.setBounds(1063, 218, 25, 17);
				  contentPane.add(resetBG1);
				  
				  JButton resetBG2 = new JButton("");
				  resetBG2.addActionListener(new ActionListener() {
				  	public void actionPerformed(ActionEvent e) {
				  		btnGrpBG2.setEnabled(true);
		          		resultB1G2.setEditable(true);
		          		resultB3G1.setEditable(true);
		          		tabelaBPlayoff.setVisible(false);
		          		lblGrpTeamB1.setText(addTeams.teamB1); lblPlayedB1.setText(pB1); lblWinsB1.setText(wB1); lblDrawsB1.setText(dB1); lblLostB1.setText(lB1); lblGFB1.setText(gfB1); lblGAB1.setText(gaB1); lblGDB1.setText(gdB1); lblPtsB1.setText(ptsB1);
	          			lblGrpTeamB2.setText(addTeams.teamB2); lblPlayedB2.setText(pB2); lblWinsB2.setText(wB2); lblDrawsB2.setText(dB2); lblLostB2.setText(lB2); lblGFB2.setText(gfB2); lblGAB2.setText(gaB2); lblGDB2.setText(gdB2); lblPtsB2.setText(ptsB2);
	          			lblGrpTeamB3.setText(addTeams.teamB3); lblPlayedB3.setText(pB3); lblWinsB3.setText(wB3); lblDrawsB3.setText(dB3); lblLostB3.setText(lB3); lblGFB3.setText(gfB3); lblGAB3.setText(gaB3); lblGDB3.setText(gdB3); lblPtsB3.setText(ptsB3);
				  	}
				  });
				  resetBG2.setForeground(Color.WHITE);
				  resetBG2.setBackground(Color.WHITE);
				  resetBG2.setIcon(new ImageIcon(photo));
				  resetBG2.setBounds(1063, 246, 25, 17);
				  contentPane.add(resetBG2);
				  
				  JButton resetBG3 = new JButton("");
				  resetBG3.addActionListener(new ActionListener() {
				  	public void actionPerformed(ActionEvent e) {
				  		btnGrpBG3.setEnabled(true);
		          		resultB2G2.setEditable(true);
		          		resultB3G2.setEditable(true);
		          		tabelaBPlayoff.setVisible(false);
		          		lblGrpTeamB1.setText(addTeams.teamB1); lblPlayedB1.setText(pB1); lblWinsB1.setText(wB1); lblDrawsB1.setText(dB1); lblLostB1.setText(lB1); lblGFB1.setText(gfB1); lblGAB1.setText(gaB1); lblGDB1.setText(gdB1); lblPtsB1.setText(ptsB1);
	          			lblGrpTeamB2.setText(addTeams.teamB2); lblPlayedB2.setText(pB2); lblWinsB2.setText(wB2); lblDrawsB2.setText(dB2); lblLostB2.setText(lB2); lblGFB2.setText(gfB2); lblGAB2.setText(gaB2); lblGDB2.setText(gdB2); lblPtsB2.setText(ptsB2);
	          			lblGrpTeamB3.setText(addTeams.teamB3); lblPlayedB3.setText(pB3); lblWinsB3.setText(wB3); lblDrawsB3.setText(dB3); lblLostB3.setText(lB3); lblGFB3.setText(gfB3); lblGAB3.setText(gaB3); lblGDB3.setText(gdB3); lblPtsB3.setText(ptsB3);
				  	}
				  });
				  resetBG3.setForeground(Color.WHITE);
				  resetBG3.setBackground(Color.WHITE);
				  resetBG3.setIcon(new ImageIcon(photo));
				  resetBG3.setBounds(1063, 274, 25, 17);
				  contentPane.add(resetBG3);
				  
				  resetBG4.addActionListener(new ActionListener() {
				  	public void actionPerformed(ActionEvent e) {
				  		btnGrpBG4.setEnabled(true);
		          		resultB1G3.setEditable(true);
		          		resultB2G3.setEditable(true);
		          		tabelaBPlayoff.setVisible(false);
		          		lblGrpTeamB1.setText(addTeams.teamB1); lblPlayedB1.setText(pB1); lblWinsB1.setText(wB1); lblDrawsB1.setText(dB1); lblLostB1.setText(lB1); lblGFB1.setText(gfB1); lblGAB1.setText(gaB1); lblGDB1.setText(gdB1); lblPtsB1.setText(ptsB1);
	          			lblGrpTeamB2.setText(addTeams.teamB2); lblPlayedB2.setText(pB2); lblWinsB2.setText(wB2); lblDrawsB2.setText(dB2); lblLostB2.setText(lB2); lblGFB2.setText(gfB2); lblGAB2.setText(gaB2); lblGDB2.setText(gdB2); lblPtsB2.setText(ptsB2);
	          			lblGrpTeamB3.setText(addTeams.teamB3); lblPlayedB3.setText(pB3); lblWinsB3.setText(wB3); lblDrawsB3.setText(dB3); lblLostB3.setText(lB3); lblGFB3.setText(gfB3); lblGAB3.setText(gaB3); lblGDB3.setText(gdB3); lblPtsB3.setText(ptsB3);
				  	}
				  });
				  resetBG4.setForeground(Color.WHITE);
				  resetBG4.setBackground(Color.WHITE);
				  resetBG4.setIcon(new ImageIcon(photo));
				  resetBG4.setBounds(1063, 302, 25, 17);
				  contentPane.add(resetBG4);
				  
				  resetBG5.addActionListener(new ActionListener() {
				  	public void actionPerformed(ActionEvent e) {
				  		btnGrpBG5.setEnabled(true);
		          		resultB1G4.setEditable(true);
		          		resultB3G3.setEditable(true);
		          		tabelaBPlayoff.setVisible(false);
		          		lblGrpTeamB1.setText(addTeams.teamB1); lblPlayedB1.setText(pB1); lblWinsB1.setText(wB1); lblDrawsB1.setText(dB1); lblLostB1.setText(lB1); lblGFB1.setText(gfB1); lblGAB1.setText(gaB1); lblGDB1.setText(gdB1); lblPtsB1.setText(ptsB1);
	          			lblGrpTeamB2.setText(addTeams.teamB2); lblPlayedB2.setText(pB2); lblWinsB2.setText(wB2); lblDrawsB2.setText(dB2); lblLostB2.setText(lB2); lblGFB2.setText(gfB2); lblGAB2.setText(gaB2); lblGDB2.setText(gdB2); lblPtsB2.setText(ptsB2);
	          			lblGrpTeamB3.setText(addTeams.teamB3); lblPlayedB3.setText(pB3); lblWinsB3.setText(wB3); lblDrawsB3.setText(dB3); lblLostB3.setText(lB3); lblGFB3.setText(gfB3); lblGAB3.setText(gaB3); lblGDB3.setText(gdB3); lblPtsB3.setText(ptsB3);
				  	}
				  });
				  resetBG5.setForeground(Color.WHITE);
				  resetBG5.setBackground(Color.WHITE);
				  resetBG5.setIcon(new ImageIcon(photo));
				  resetBG5.setBounds(1063, 330, 25, 17);
				  contentPane.add(resetBG5);
				  
				  resetBG6.addActionListener(new ActionListener() {
				  	public void actionPerformed(ActionEvent e) {
				  		btnGrpBG6.setEnabled(true);
		          		resultB2G4.setEditable(true);
		          		resultB3G4.setEditable(true);
		          		tabelaBPlayoff.setVisible(false);
		          		lblGrpTeamB1.setText(addTeams.teamB1); lblPlayedB1.setText(pB1); lblWinsB1.setText(wB1); lblDrawsB1.setText(dB1); lblLostB1.setText(lB1); lblGFB1.setText(gfB1); lblGAB1.setText(gaB1); lblGDB1.setText(gdB1); lblPtsB1.setText(ptsB1);
	          			lblGrpTeamB2.setText(addTeams.teamB2); lblPlayedB2.setText(pB2); lblWinsB2.setText(wB2); lblDrawsB2.setText(dB2); lblLostB2.setText(lB2); lblGFB2.setText(gfB2); lblGAB2.setText(gaB2); lblGDB2.setText(gdB2); lblPtsB2.setText(ptsB2);
	          			lblGrpTeamB3.setText(addTeams.teamB3); lblPlayedB3.setText(pB3); lblWinsB3.setText(wB3); lblDrawsB3.setText(dB3); lblLostB3.setText(lB3); lblGFB3.setText(gfB3); lblGAB3.setText(gaB3); lblGDB3.setText(gdB3); lblPtsB3.setText(ptsB3);
				  	}
				  });
				  resetBG6.setForeground(Color.WHITE);
				  resetBG6.setBackground(Color.WHITE);
				  resetBG6.setIcon(new ImageIcon(photo));
				  resetBG6.setBounds(1063, 358, 25, 17);
				  contentPane.add(resetBG6);
				  
		    //Tabela A playoff-----------------------------------------------------------------------------------------------------------------------------------------------------	  
				  
				  tabelaAPlayoff.setBackground(SystemColor.inactiveCaption);
				  tabelaAPlayoff.setBounds(10, 386, 532, 186);
				  contentPane.add(tabelaAPlayoff);
				  tabelaAPlayoff.setLayout(null);
				  tabelaAPlayoff.setVisible(false);
				  
				  JLabel lblPlayoff = new JLabel("Playoff");
				  lblPlayoff.setBounds(20, 11, 352, 25);
				  tabelaAPlayoff.add(lblPlayoff);
				  lblPlayoff.setHorizontalAlignment(SwingConstants.CENTER);
				  
				  resG1POTeamA1 = new JFormattedTextField(formatter);
				  resG1POTeamA1.setBounds(166, 44, 23, 17);
				  tabelaAPlayoff.add(resG1POTeamA1);
				  resG1POTeamA1.setHorizontalAlignment(SwingConstants.CENTER);
				  resG1POTeamA1.setVisible(false);
        						  
				  resG1POTeamA2 = new JFormattedTextField(formatter);
				  resG1POTeamA2.setBounds(199, 44, 23, 17);
				  tabelaAPlayoff.add(resG1POTeamA2);
				  resG1POTeamA2.setHorizontalAlignment(SwingConstants.CENTER);
				  resG1POTeamA2.setVisible(false);
				  
				  resG1POTeamA3 = new JFormattedTextField(formatter);
				  resG1POTeamA3.setBounds(166, 72, 23, 17);
				  tabelaAPlayoff.add(resG1POTeamA3);
				  resG1POTeamA3.setHorizontalAlignment(SwingConstants.CENTER);
				  resG1POTeamA3.setVisible(false);
				  
				  resG2POTeamA1 = new JFormattedTextField(formatter);
				  resG2POTeamA1.setBounds(199, 72, 23, 17);
				  tabelaAPlayoff.add(resG2POTeamA1);
				  resG2POTeamA1.setHorizontalAlignment(SwingConstants.CENTER);
				  resG2POTeamA1.setVisible(false);
				  
				  resG2POTeamA2 = new JFormattedTextField(formatter);
				  resG2POTeamA2.setBounds(166, 100, 23, 17);
				  tabelaAPlayoff.add(resG2POTeamA2);
				  resG2POTeamA2.setHorizontalAlignment(SwingConstants.CENTER);
				  resG2POTeamA2.setVisible(false);
				  
				  resG2POTeamA3 = new JFormattedTextField(formatter);
				  resG2POTeamA3.setBounds(199, 100, 23, 17);
				  tabelaAPlayoff.add(resG2POTeamA3);
				  resG2POTeamA3.setHorizontalAlignment(SwingConstants.CENTER);
				  resG2POTeamA3.setVisible(false);
				  
				  resG4POTeamA1 = new JFormattedTextField(formatter);
				  resG4POTeamA1.setHorizontalAlignment(SwingConstants.CENTER);
				  resG4POTeamA1.setBounds(166, 128, 23, 17);
				  tabelaAPlayoff.add(resG4POTeamA1);
				  resG4POTeamA1.setVisible(false);
				  
				  resG5POTeamA3 = new JFormattedTextField(formatter);
				  resG5POTeamA3.setHorizontalAlignment(SwingConstants.CENTER);
				  resG5POTeamA3.setBounds(199, 156, 23, 17);
				  tabelaAPlayoff.add(resG5POTeamA3);
				  resG5POTeamA3.setVisible(false);
				  
				  resG4POTeamA2 = new JFormattedTextField(formatter);
				  resG4POTeamA2.setHorizontalAlignment(SwingConstants.CENTER);
				  resG4POTeamA2.setBounds(199, 128, 23, 17);
				  tabelaAPlayoff.add(resG4POTeamA2);
				  resG4POTeamA2.setVisible(false);
				  
				  resG5POTeamA2 = new JFormattedTextField(formatter);
				  resG5POTeamA2.setHorizontalAlignment(SwingConstants.CENTER);
				  resG5POTeamA2.setBounds(166, 156, 23, 17);
				  tabelaAPlayoff.add(resG5POTeamA2);
				  resG5POTeamA2.setVisible(false);
				  
				  lblPOG1TeamA1.setBounds(20, 44, 118, 14);
				  tabelaAPlayoff.add(lblPOG1TeamA1);
				  lblPOG1TeamA1.setHorizontalAlignment(SwingConstants.CENTER);
				  lblPOG1TeamA1.setVisible(false);
				  				  				  
				  lblPOG1TeamA2.setBounds(244, 44, 118, 14);
				  tabelaAPlayoff.add(lblPOG1TeamA2);
				  lblPOG1TeamA2.setHorizontalAlignment(SwingConstants.CENTER);
				  lblPOG1TeamA2.setVisible(false);
				  
				  lblPOG1TeamA3.setBounds(20, 72, 118, 14);
				  tabelaAPlayoff.add(lblPOG1TeamA3);
				  lblPOG1TeamA3.setHorizontalAlignment(SwingConstants.CENTER);
				  lblPOG1TeamA3.setVisible(false);
				  
				  lblPOG2TeamA1.setBounds(244, 72, 118, 14);
				  tabelaAPlayoff.add(lblPOG2TeamA1);
				  lblPOG2TeamA1.setHorizontalAlignment(SwingConstants.CENTER);
				  lblPOG2TeamA1.setVisible(false);
				  
				  lblPOG2TeamA2.setBounds(20, 100, 118, 14);
				  tabelaAPlayoff.add(lblPOG2TeamA2);
				  lblPOG2TeamA2.setHorizontalAlignment(SwingConstants.CENTER);
				  lblPOG2TeamA2.setVisible(false);
				  
				  lblPOG2TeamA3.setBounds(244, 100, 118, 14);
				  tabelaAPlayoff.add(lblPOG2TeamA3);
				  lblPOG2TeamA3.setHorizontalAlignment(SwingConstants.CENTER);
				  lblPOG2TeamA3.setVisible(false);
				  
				  lblPOG4TeamA1.setHorizontalAlignment(SwingConstants.CENTER);
				  lblPOG4TeamA1.setBounds(20, 128, 118, 14);
				  tabelaAPlayoff.add(lblPOG4TeamA1);
				  lblPOG4TeamA1.setVisible(false);
				  
				  lblPOG4TeamA2.setHorizontalAlignment(SwingConstants.CENTER);
				  lblPOG4TeamA2.setBounds(244, 128, 118, 14);
				  tabelaAPlayoff.add(lblPOG4TeamA2);
				  lblPOG4TeamA2.setVisible(false);
				  
				  lblPOG5TeamA2.setHorizontalAlignment(SwingConstants.CENTER);
				  lblPOG5TeamA2.setBounds(20, 156, 118, 14);
				  tabelaAPlayoff.add(lblPOG5TeamA2);
				  lblPOG5TeamA2.setVisible(false);				  
				  
				  lblPOG5TeamA3.setHorizontalAlignment(SwingConstants.CENTER);
				  lblPOG5TeamA3.setBounds(244, 156, 118, 14);
				  tabelaAPlayoff.add(lblPOG5TeamA3);
				  lblPOG5TeamA3.setVisible(false);
				  				  				  				  
				  btnAG1PlayOff.addActionListener(new ActionListener() {
				  	public void actionPerformed(ActionEvent e) {
				  		
				  		gfTA1G1=Integer.parseInt(resG1POTeamA1.getText());
				  		gfTA2G1=Integer.parseInt(resG1POTeamA2.getText());
				  		
				  			if(gfTA1G1>gfTA2G1) {
				  				wTA1G1=1; lTA1G1=0; uwA1=wA1G1+wA1G2+wA1G3+wA1G4+wTA1G1+wTA1G2; ulA1=lA1G1+lA1G2+lA1G3+lA1G4+lTA1G1+lTA1G2; upA1=uwA1+ulA1+udA1; ptsuA1=3*uwA1+udA1;
				  				wTA2G1=0; lTA2G1=1; uwA2=wA2G1+wA2G2+wA2G3+wA2G4+wTA2G1+wTA2G2; ulA2=lA2G1+lA2G2+lA2G3+lA2G4+lTA2G1+lTA2G2; upA2=uwA2+ulA2+udA2; ptsuA2=3*uwA2+udA2;
				  			}
				  			else if(gfTA1G1<gfTA2G1) {
				  				wTA1G1=0; lTA1G1=1; uwA1=wA1G1+wA1G2+wA1G3+wA1G4+wTA1G1+wTA1G2; ulA1=lA1G1+lA1G2+lA1G3+lA1G4+lTA1G1+lTA1G2; upA1=uwA1+ulA1+udA1; ptsuA1=3*uwA1+udA1; 
				  				wTA2G1=1; lTA2G1=0; uwA2=wA2G1+wA2G2+wA2G3+wA2G4+wTA2G1+wTA2G2; ulA2=lA2G1+lA2G2+lA2G3+lA2G4+lTA2G1+lTA2G2; upA2=uwA2+ulA2+udA2; ptsuA2=3*uwA2+udA2;
				  			}
				  			btnAG1PlayOff.setEnabled(false);
				  			resG1POTeamA1.setEditable(false);
				  			resG1POTeamA2.setEditable(false);
				  		
				  		ArrayList<TableSort> ar = new ArrayList<TableSort>();
				  			ar.add(new TableSort(String.valueOf(addTeams.teamA1),upA1,uwA1,udA1,ulA1,gfA1G1+gfA1G2+gfA1G3+gfA1G4+gfTA1G1+gfTA1G2,gfA2G1+gfA3G1+gfA2G3+gfA3G3+gfTA2G1+gfTA3G1,(gfA1G1+gfA1G2+gfA1G3+gfA1G4+gfTA1G1+gfTA1G2)-(gfA2G1+gfA3G1+gfA2G3+gfA3G3+gfTA2G1+gfTA3G1),ptsuA1));
				  			ar.add(new TableSort(String.valueOf(addTeams.teamA2),upA2,uwA2,udA2,ulA2,gfA2G1+gfA2G2+gfA2G3+gfA2G4+gfTA2G1+gfTA2G2,gfA1G1+gfA3G2+gfA1G3+gfA3G4+gfTA1G1+gfTA3G2,(gfA2G1+gfA2G2+gfA2G3+gfA2G4+gfTA2G1+gfTA2G2)-(gfA1G1+gfA3G2+gfA1G3+gfA3G4+gfTA1G1+gfTA3G2),ptsuA2));
				  			ar.add(new TableSort(String.valueOf(addTeams.teamA3),upA3,uwA3,udA3,ulA3,gfA3G1+gfA3G2+gfA3G3+gfA3G4+gfTA3G1+gfTA3G2,gfA1G2+gfA2G2+gfA1G4+gfA2G4+gfTA1G2+gfTA2G2,(gfA3G1+gfA3G2+gfA3G3+gfA3G4+gfTA3G1+gfTA3G2)-(gfA1G2+gfA2G2+gfA1G4+gfA2G4+gfTA1G2+gfTA2G2),ptsuA3));
	          			
				  			Collections.sort(ar, new SortByPts());
	          				          				          			
				  			lblGrpTeamA1.setText(ar.get(0).getteamName()); lblPlayedA1.setText(String.valueOf(ar.get(0).getPlayed())); lblWinsA1.setText(String.valueOf(ar.get(0).getWins())); lblDrawsA1.setText(String.valueOf(ar.get(0).getDraws()));   lblLostA1.setText(String.valueOf(ar.get(0).getLoses())); lblGFA1.setText(String.valueOf(ar.get(0).getGF())); lblGAA1.setText(String.valueOf(ar.get(0).getGA())); lblGDA1.setText(String.valueOf(ar.get(0).getGD())); lblPtsA1.setText(String.valueOf(ar.get(0).getPoints()));
				  			lblGrpTeamA2.setText(ar.get(1).getteamName()); lblPlayedA2.setText(String.valueOf(ar.get(1).getPlayed())); lblWinsA2.setText(String.valueOf(ar.get(1).getWins())); lblDrawsA2.setText(String.valueOf(ar.get(1).getDraws()));   lblLostA2.setText(String.valueOf(ar.get(1).getLoses())); lblGFA2.setText(String.valueOf(ar.get(1).getGF())); lblGAA2.setText(String.valueOf(ar.get(1).getGA())); lblGDA2.setText(String.valueOf(ar.get(1).getGD())); lblPtsA2.setText(String.valueOf(ar.get(1).getPoints()));
				  			lblGrpTeamA3.setText(ar.get(2).getteamName()); lblPlayedA3.setText(String.valueOf(ar.get(2).getPlayed())); lblWinsA3.setText(String.valueOf(ar.get(2).getWins())); lblDrawsA3.setText(String.valueOf(ar.get(2).getDraws()));   lblLostA3.setText(String.valueOf(ar.get(2).getLoses())); lblGFA3.setText(String.valueOf(ar.get(2).getGF())); lblGAA3.setText(String.valueOf(ar.get(2).getGA())); lblGDA3.setText(String.valueOf(ar.get(2).getGD())); lblPtsA3.setText(String.valueOf(ar.get(2).getPoints()));
				  		
				  	}
				  	
				  });
				  btnAG1PlayOff.setBounds(372, 44, 89, 17);
				  tabelaAPlayoff.add(btnAG1PlayOff);
				  btnAG1PlayOff.setFont(new Font("Tahoma", Font.BOLD, 10));
				  btnAG1PlayOff.setVisible(false);
				  
				  btnAG2PlayOff.addActionListener(new ActionListener() {
				  	public void actionPerformed(ActionEvent e) {
				  		gfTA1G2=Integer.parseInt(resG2POTeamA1.getText());
				  		gfTA3G1=Integer.parseInt(resG1POTeamA3.getText());
				  		if(gfTA1G2>gfTA3G1) {
				  			wTA1G2=1; lTA1G2=0; uwA1=wA1G1+wA1G2+wA1G3+wA1G4+wTA1G1+wTA1G2; ulA1=lA1G1+lA1G2+lA1G3+lA1G4+lTA1G1+lTA1G2; upA1=uwA1+ulA1+udA1; ptsuA1=3*uwA1+udA1;
		          			wTA3G1=0; lTA3G1=1; uwA3=wA3G1+wA3G2+wA3G3+wA3G4+wTA3G1+wTA3G2; ulA3=lA3G1+lA3G2+lA3G3+lA3G4+lTA3G1+lTA3G2; upA3=uwA3+ulA3+udA3; ptsuA3=3*uwA3+udA3;
		          		}
				  		else if(gfTA1G2<gfTA3G1) {
				  			wTA1G2=0; lTA1G2=1; uwA1=wA1G1+wA1G2+wA1G3+wA1G4+wTA1G1+wTA1G2; ulA1=lA1G1+lA1G2+lA1G3+lA1G4+lTA1G1+lTA1G2; upA1=uwA1+ulA1+udA1; ptsuA1=3*uwA1+udA1;
		          			wTA3G1=1; lTA3G1=0; uwA3=wA3G1+wA3G2+wA3G3+wA3G4+wTA3G1+wTA3G2; ulA3=lA3G1+lA3G2+lA3G3+lA3G4+lTA3G1+lTA3G2; upA3=uwA3+ulA3+udA3; ptsuA3=3*uwA3+udA3;
				  		}
				  		btnAG2PlayOff.setEnabled(false);
			  			resG2POTeamA1.setEditable(false);
			  			resG1POTeamA3.setEditable(false);
				  		
		          		ArrayList<TableSort> ar = new ArrayList<TableSort>();
		          		ar.add(new TableSort(String.valueOf(addTeams.teamA1),upA1,uwA1,udA1,ulA1,gfA1G1+gfA1G2+gfA1G3+gfA1G4+gfTA1G1+gfTA1G2,gfA2G1+gfA3G1+gfA2G3+gfA3G3+gfTA2G1+gfTA3G1,(gfA1G1+gfA1G2+gfA1G3+gfA1G4+gfTA1G1+gfTA1G2)-(gfA2G1+gfA3G1+gfA2G3+gfA3G3+gfTA2G1+gfTA3G1),ptsuA1));
	          			ar.add(new TableSort(String.valueOf(addTeams.teamA2),upA2,uwA2,udA2,ulA2,gfA2G1+gfA2G2+gfA2G3+gfA2G4+gfTA2G1+gfTA2G2,gfA1G1+gfA3G2+gfA1G3+gfA3G4+gfTA1G1+gfTA3G2,(gfA2G1+gfA2G2+gfA2G3+gfA2G4+gfTA2G1+gfTA2G2)-(gfA1G1+gfA3G2+gfA1G3+gfA3G4+gfTA1G1+gfTA3G2),ptsuA2));
	          			ar.add(new TableSort(String.valueOf(addTeams.teamA3),upA3,uwA3,udA3,ulA3,gfA3G1+gfA3G2+gfA3G3+gfA3G4+gfTA3G1+gfTA3G2,gfA1G2+gfA2G2+gfA1G4+gfA2G4+gfTA1G2+gfTA2G2,(gfA3G1+gfA3G2+gfA3G3+gfA3G4+gfTA3G1+gfTA3G2)-(gfA1G2+gfA2G2+gfA1G4+gfA2G4+gfTA1G2+gfTA2G2),ptsuA3));
	          			
	          			Collections.sort(ar, new SortByPts());
	          				          			
	          			lblGrpTeamA1.setText(ar.get(0).getteamName()); lblPlayedA1.setText(String.valueOf(ar.get(0).getPlayed())); lblWinsA1.setText(String.valueOf(ar.get(0).getWins())); lblDrawsA1.setText(String.valueOf(ar.get(0).getDraws()));   lblLostA1.setText(String.valueOf(ar.get(0).getLoses())); lblGFA1.setText(String.valueOf(ar.get(0).getGF())); lblGAA1.setText(String.valueOf(ar.get(0).getGA())); lblGDA1.setText(String.valueOf(ar.get(0).getGD())); lblPtsA1.setText(String.valueOf(ar.get(0).getPoints()));
	          			lblGrpTeamA2.setText(ar.get(1).getteamName()); lblPlayedA2.setText(String.valueOf(ar.get(1).getPlayed())); lblWinsA2.setText(String.valueOf(ar.get(1).getWins())); lblDrawsA2.setText(String.valueOf(ar.get(1).getDraws()));   lblLostA2.setText(String.valueOf(ar.get(1).getLoses())); lblGFA2.setText(String.valueOf(ar.get(1).getGF())); lblGAA2.setText(String.valueOf(ar.get(1).getGA())); lblGDA2.setText(String.valueOf(ar.get(1).getGD())); lblPtsA2.setText(String.valueOf(ar.get(1).getPoints()));
	          			lblGrpTeamA3.setText(ar.get(2).getteamName()); lblPlayedA3.setText(String.valueOf(ar.get(2).getPlayed())); lblWinsA3.setText(String.valueOf(ar.get(2).getWins())); lblDrawsA3.setText(String.valueOf(ar.get(2).getDraws()));   lblLostA3.setText(String.valueOf(ar.get(2).getLoses())); lblGFA3.setText(String.valueOf(ar.get(2).getGF())); lblGAA3.setText(String.valueOf(ar.get(2).getGA())); lblGDA3.setText(String.valueOf(ar.get(2).getGD())); lblPtsA3.setText(String.valueOf(ar.get(2).getPoints()));
				  			  		
				  	}
				  });
				  btnAG2PlayOff.setBounds(372, 72, 89, 17);
				  tabelaAPlayoff.add(btnAG2PlayOff);
				  btnAG2PlayOff.setFont(new Font("Tahoma", Font.BOLD, 10));
				  btnAG2PlayOff.setVisible(false);
				  
				  btnAG3PlayOff.addActionListener(new ActionListener() {
				  	public void actionPerformed(ActionEvent e) {
				  		gfTA2G2=Integer.parseInt(resG2POTeamA2.getText());
				  		gfTA3G2=Integer.parseInt(resG2POTeamA3.getText());
				  		if(gfTA2G2>gfTA3G2) {
				  			wTA2G2=1; lTA2G2=0; uwA2=wA2G1+wA2G2+wA2G3+wA2G4+wTA2G1+wTA2G2; ulA2=lA2G1+lA2G2+lA2G3+lA2G4+lTA2G1+lTA2G2; upA2=uwA2+ulA2+udA2; ptsuA2=3*uwA2+udA2;
		          			wTA3G2=0; lTA3G2=1; uwA3=wA3G1+wA3G2+wA3G3+wA3G4+wTA3G1+wTA3G2; ulA3=lA3G1+lA3G2+lA3G3+lA3G4+lTA3G1+lTA3G2; upA3=uwA3+ulA3+udA3; ptsuA3=3*uwA3+udA3;
				  		}
				  		else if(gfTA2G2<gfTA3G2) {
				  			wTA2G2=0; lTA2G2=1; uwA2=wA2G1+wA2G2+wA2G3+wA2G4+wTA2G1+wTA2G2; ulA2=lA2G1+lA2G2+lA2G3+lA2G4+lTA2G1+lTA2G2; upA2=uwA2+ulA2+udA2; ptsuA2=3*uwA2+udA2;
		          			wTA3G2=1; lTA3G2=0; uwA3=wA3G1+wA3G2+wA3G3+wA3G4+wTA3G1+wTA3G2; ulA3=lA3G1+lA3G2+lA3G3+lA3G4+lTA3G1+lTA3G2; upA3=uwA3+ulA3+udA3; ptsuA3=3*uwA3+udA3;
				  		}
				  		btnAG3PlayOff.setEnabled(false);
			  			resG2POTeamA2.setEditable(false);
			  			resG2POTeamA3.setEditable(false);
				  		
				  		ArrayList<TableSort> ar = new ArrayList<TableSort>();
				  		ar.add(new TableSort(String.valueOf(addTeams.teamA1),upA1,uwA1,udA1,ulA1,gfA1G1+gfA1G2+gfA1G3+gfA1G4+gfTA1G1+gfTA1G2,gfA2G1+gfA3G1+gfA2G3+gfA3G3+gfTA2G1+gfTA3G1,(gfA1G1+gfA1G2+gfA1G3+gfA1G4+gfTA1G1+gfTA1G2)-(gfA2G1+gfA3G1+gfA2G3+gfA3G3+gfTA2G1+gfTA3G1),ptsuA1));
				  		ar.add(new TableSort(String.valueOf(addTeams.teamA2),upA2,uwA2,udA2,ulA2,gfA2G1+gfA2G2+gfA2G3+gfA2G4+gfTA2G1+gfTA2G2,gfA1G1+gfA3G2+gfA1G3+gfA3G4+gfTA1G1+gfTA3G2,(gfA2G1+gfA2G2+gfA2G3+gfA2G4+gfTA2G1+gfTA2G2)-(gfA1G1+gfA3G2+gfA1G3+gfA3G4+gfTA1G1+gfTA3G2),ptsuA2));
				  		ar.add(new TableSort(String.valueOf(addTeams.teamA3),upA3,uwA3,udA3,ulA3,gfA3G1+gfA3G2+gfA3G3+gfA3G4+gfTA3G1+gfTA3G2,gfA1G2+gfA2G2+gfA1G4+gfA2G4+gfTA1G2+gfTA2G2,(gfA3G1+gfA3G2+gfA3G3+gfA3G4+gfTA3G1+gfTA3G2)-(gfA1G2+gfA2G2+gfA1G4+gfA2G4+gfTA1G2+gfTA2G2),ptsuA3));
          			
				  		Collections.sort(ar, new SortByPts());
				  		
				  		lblGrpTeamA1.setText(ar.get(0).getteamName()); lblPlayedA1.setText(String.valueOf(ar.get(0).getPlayed())); lblWinsA1.setText(String.valueOf(ar.get(0).getWins())); lblDrawsA1.setText(String.valueOf(ar.get(0).getDraws()));   lblLostA1.setText(String.valueOf(ar.get(0).getLoses())); lblGFA1.setText(String.valueOf(ar.get(0).getGF())); lblGAA1.setText(String.valueOf(ar.get(0).getGA())); lblGDA1.setText(String.valueOf(ar.get(0).getGD())); lblPtsA1.setText(String.valueOf(ar.get(0).getPoints()));
				  		lblGrpTeamA2.setText(ar.get(1).getteamName()); lblPlayedA2.setText(String.valueOf(ar.get(1).getPlayed())); lblWinsA2.setText(String.valueOf(ar.get(1).getWins())); lblDrawsA2.setText(String.valueOf(ar.get(1).getDraws()));   lblLostA2.setText(String.valueOf(ar.get(1).getLoses())); lblGFA2.setText(String.valueOf(ar.get(1).getGF())); lblGAA2.setText(String.valueOf(ar.get(1).getGA())); lblGDA2.setText(String.valueOf(ar.get(1).getGD())); lblPtsA2.setText(String.valueOf(ar.get(1).getPoints()));
				  		lblGrpTeamA3.setText(ar.get(2).getteamName()); lblPlayedA3.setText(String.valueOf(ar.get(2).getPlayed())); lblWinsA3.setText(String.valueOf(ar.get(2).getWins())); lblDrawsA3.setText(String.valueOf(ar.get(2).getDraws()));   lblLostA3.setText(String.valueOf(ar.get(2).getLoses())); lblGFA3.setText(String.valueOf(ar.get(2).getGF())); lblGAA3.setText(String.valueOf(ar.get(2).getGA())); lblGDA3.setText(String.valueOf(ar.get(2).getGD())); lblPtsA3.setText(String.valueOf(ar.get(2).getPoints()));
				  		
				  	}
				  });
				  btnAG3PlayOff.setBounds(372, 100, 89, 17);
				  tabelaAPlayoff.add(btnAG3PlayOff);
				  btnAG3PlayOff.setFont(new Font("Tahoma", Font.BOLD, 10));
				  btnAG3PlayOff.setVisible(false);
				  
				  btnAG4PlayOff.addActionListener(new ActionListener() {
				  	public void actionPerformed(ActionEvent e) {
				  		int gfTA1G4=Integer.parseInt(resG4POTeamA1.getText());
				  		int gfTA2G4=Integer.parseInt(resG4POTeamA2.getText());
				  		
				  			if(gfTA1G4>gfTA2G4) {
				  				lblGrpTeamA1.setText(lblPOG4TeamA1.getText());
				  				lblGrpTeamA2.setText(lblPOG4TeamA2.getText());
				  				
				  			}
				  			else if(gfTA1G4<gfTA2G4) {
				  				lblGrpTeamA1.setText(lblPOG4TeamA2.getText());
				  				lblGrpTeamA2.setText(lblPOG4TeamA1.getText());
				  				
				  			}
				  			btnAG4PlayOff.setEnabled(false);
				  			resG4POTeamA1.setEditable(false);
				  			resG4POTeamA2.setEditable(false);
				  		
				  	}
				  });
				  btnAG4PlayOff.setFont(new Font("Tahoma", Font.BOLD, 10));
				  btnAG4PlayOff.setBounds(372, 128, 89, 17);
				  tabelaAPlayoff.add(btnAG4PlayOff);
				  btnAG4PlayOff.setVisible(false);
				  
				  btnAG5PlayOff.addActionListener(new ActionListener() {
				  	public void actionPerformed(ActionEvent e) {
				  		int gfTA2G5=Integer.parseInt(resG5POTeamA2.getText());
				  		int gfTA3G5=Integer.parseInt(resG5POTeamA3.getText());
				  		
				  			if(gfTA2G5>gfTA3G5) {
				  				lblGrpTeamA2.setText(lblPOG5TeamA2.getText());
				  				lblGrpTeamA3.setText(lblPOG5TeamA3.getText());
				  				
				  			}
				  			else if(gfTA2G5<gfTA3G5) {
				  				lblGrpTeamA2.setText(lblPOG5TeamA3.getText());
				  				lblGrpTeamA3.setText(lblPOG5TeamA2.getText());
				  				
				  			}
				  			btnAG5PlayOff.setEnabled(false);
				  			resG5POTeamA2.setEditable(false);
				  			resG5POTeamA3.setEditable(false);
				  	}
				  });
				  btnAG5PlayOff.setFont(new Font("Tahoma", Font.BOLD, 10));
				  btnAG5PlayOff.setBounds(372, 156, 89, 17);
				  tabelaAPlayoff.add(btnAG5PlayOff);
				  btnAG5PlayOff.setVisible(false);
				  
				  resetAG1PlayOff.addActionListener(new ActionListener() {
				  	public void actionPerformed(ActionEvent e) {
				  		btnAG1PlayOff.setEnabled(true);
			  			resG1POTeamA1.setEditable(true);
			  			resG1POTeamA2.setEditable(true);
		          		lblGrpTeamA1.setText(addTeams.teamA1); lblPlayedA1.setText(pA1); lblWinsA1.setText(wA1); lblDrawsA1.setText(dA1); lblLostA1.setText(lA1); lblGFA1.setText(gfA1); lblGAA1.setText(gaA1); lblGDA1.setText(gdA1); lblPtsA1.setText(ptsA1);
		          		lblGrpTeamA2.setText(addTeams.teamA2); lblPlayedA2.setText(pA2); lblWinsA2.setText(wA2); lblDrawsA2.setText(dA2); lblLostA2.setText(lA2); lblGFA2.setText(gfA2); lblGAA2.setText(gaA2); lblGDA2.setText(gdA2); lblPtsA2.setText(ptsA2);
		          		lblGrpTeamA3.setText(addTeams.teamA3); lblPlayedA3.setText(pA3); lblWinsA3.setText(wA3); lblDrawsA3.setText(dA3); lblLostA3.setText(lA3); lblGFA3.setText(gfA3); lblGAA3.setText(gaA3); lblGDA3.setText(gdA3); lblPtsA3.setText(ptsA3);
				  	}
				  });
				  resetAG1PlayOff.setBounds(471, 44, 25, 17);
				  tabelaAPlayoff.add(resetAG1PlayOff);
				  resetAG1PlayOff.setForeground(Color.WHITE);
				  resetAG1PlayOff.setBackground(Color.WHITE);
				  resetAG1PlayOff.setIcon(new ImageIcon(photo));
				  resetAG1PlayOff.setVisible(false);
				  
				  resetAG2PlayOff.addActionListener(new ActionListener() {
				  	public void actionPerformed(ActionEvent e) {
				  		btnAG2PlayOff.setEnabled(true);
			  			resG2POTeamA1.setEditable(true);
			  			resG1POTeamA3.setEditable(true);
		          		lblGrpTeamA1.setText(addTeams.teamA1); lblPlayedA1.setText(pA1); lblWinsA1.setText(wA1); lblDrawsA1.setText(dA1); lblLostA1.setText(lA1); lblGFA1.setText(gfA1); lblGAA1.setText(gaA1); lblGDA1.setText(gdA1); lblPtsA1.setText(ptsA1);
		          		lblGrpTeamA2.setText(addTeams.teamA2); lblPlayedA2.setText(pA2); lblWinsA2.setText(wA2); lblDrawsA2.setText(dA2); lblLostA2.setText(lA2); lblGFA2.setText(gfA2); lblGAA2.setText(gaA2); lblGDA2.setText(gdA2); lblPtsA2.setText(ptsA2);
		          		lblGrpTeamA3.setText(addTeams.teamA3); lblPlayedA3.setText(pA3); lblWinsA3.setText(wA3); lblDrawsA3.setText(dA3); lblLostA3.setText(lA3); lblGFA3.setText(gfA3); lblGAA3.setText(gaA3); lblGDA3.setText(gdA3); lblPtsA3.setText(ptsA3);
				  	}
				  });
				  resetAG2PlayOff.setBounds(471, 72, 25, 17);
				  tabelaAPlayoff.add(resetAG2PlayOff);
				  resetAG2PlayOff.setForeground(Color.WHITE);
				  resetAG2PlayOff.setBackground(Color.WHITE);
				  resetAG2PlayOff.setIcon(new ImageIcon(photo));
				  resetAG2PlayOff.setVisible(false);
				  
				  resetAG3PlayOff.addActionListener(new ActionListener() {
				  	public void actionPerformed(ActionEvent e) {
				  		btnAG3PlayOff.setEnabled(true);
			  			resG2POTeamA2.setEditable(true);
			  			resG2POTeamA3.setEditable(true);
		          		lblGrpTeamA1.setText(addTeams.teamA1); lblPlayedA1.setText(pA1); lblWinsA1.setText(wA1); lblDrawsA1.setText(dA1); lblLostA1.setText(lA1); lblGFA1.setText(gfA1); lblGAA1.setText(gaA1); lblGDA1.setText(gdA1); lblPtsA1.setText(ptsA1);
		          		lblGrpTeamA2.setText(addTeams.teamA2); lblPlayedA2.setText(pA2); lblWinsA2.setText(wA2); lblDrawsA2.setText(dA2); lblLostA2.setText(lA2); lblGFA2.setText(gfA2); lblGAA2.setText(gaA2); lblGDA2.setText(gdA2); lblPtsA2.setText(ptsA2);
		          		lblGrpTeamA3.setText(addTeams.teamA3); lblPlayedA3.setText(pA3); lblWinsA3.setText(wA3); lblDrawsA3.setText(dA3); lblLostA3.setText(lA3); lblGFA3.setText(gfA3); lblGAA3.setText(gaA3); lblGDA3.setText(gdA3); lblPtsA3.setText(ptsA3);
				  	}
				  });
				  resetAG3PlayOff.setBounds(471, 100, 25, 17);
				  tabelaAPlayoff.add(resetAG3PlayOff);
				  resetAG3PlayOff.setForeground(Color.WHITE);
				  resetAG3PlayOff.setBackground(Color.WHITE);
				  resetAG3PlayOff.setIcon(new ImageIcon(photo));
				  resetAG3PlayOff.setVisible(false);
				  
				  resetAG4PlayOff.addActionListener(new ActionListener() {
				  	public void actionPerformed(ActionEvent e) {
				  		btnAG4PlayOff.setEnabled(true);
			  			resG4POTeamA1.setEditable(true);
			  			resG4POTeamA2.setEditable(true);
			  			lblGrpTeamA1.setText(addTeams.teamA1); lblPlayedA1.setText(pA1); lblWinsA1.setText(wA1); lblDrawsA1.setText(dA1); lblLostA1.setText(lA1); lblGFA1.setText(gfA1); lblGAA1.setText(gaA1); lblGDA1.setText(gdA1); lblPtsA1.setText(ptsA1);
		          		lblGrpTeamA2.setText(addTeams.teamA2); lblPlayedA2.setText(pA2); lblWinsA2.setText(wA2); lblDrawsA2.setText(dA2); lblLostA2.setText(lA2); lblGFA2.setText(gfA2); lblGAA2.setText(gaA2); lblGDA2.setText(gdA2); lblPtsA2.setText(ptsA2);
		          		lblGrpTeamA3.setText(addTeams.teamA3); lblPlayedA3.setText(pA3); lblWinsA3.setText(wA3); lblDrawsA3.setText(dA3); lblLostA3.setText(lA3); lblGFA3.setText(gfA3); lblGAA3.setText(gaA3); lblGDA3.setText(gdA3); lblPtsA3.setText(ptsA3);
				  	}
				  });
				  resetAG4PlayOff.setForeground(Color.WHITE);
				  resetAG4PlayOff.setBackground(Color.WHITE);
				  resetAG4PlayOff.setBounds(471, 128, 25, 17);
				  tabelaAPlayoff.add(resetAG4PlayOff);
				  resetAG4PlayOff.setIcon(new ImageIcon(photo));
				  resetAG4PlayOff.setVisible(false);
				  
				  resetAG5PlayOff.addActionListener(new ActionListener() {
				  	public void actionPerformed(ActionEvent e) {
				  		btnAG5PlayOff.setEnabled(true);
			  			resG5POTeamA2.setEditable(true);
			  			resG5POTeamA3.setEditable(true);
				  		lblGrpTeamA1.setText(addTeams.teamA1); lblPlayedA1.setText(pA1); lblWinsA1.setText(wA1); lblDrawsA1.setText(dA1); lblLostA1.setText(lA1); lblGFA1.setText(gfA1); lblGAA1.setText(gaA1); lblGDA1.setText(gdA1); lblPtsA1.setText(ptsA1);
		          		lblGrpTeamA2.setText(addTeams.teamA2); lblPlayedA2.setText(pA2); lblWinsA2.setText(wA2); lblDrawsA2.setText(dA2); lblLostA2.setText(lA2); lblGFA2.setText(gfA2); lblGAA2.setText(gaA2); lblGDA2.setText(gdA2); lblPtsA2.setText(ptsA2);
		          		lblGrpTeamA3.setText(addTeams.teamA3); lblPlayedA3.setText(pA3); lblWinsA3.setText(wA3); lblDrawsA3.setText(dA3); lblLostA3.setText(lA3); lblGFA3.setText(gfA3); lblGAA3.setText(gaA3); lblGDA3.setText(gdA3); lblPtsA3.setText(ptsA3);
				  	}
				  });
				  resetAG5PlayOff.setForeground(Color.WHITE);
				  resetAG5PlayOff.setBackground(Color.WHITE);
				  resetAG5PlayOff.setBounds(471, 156, 25, 17);
				  tabelaAPlayoff.add(resetAG5PlayOff);
				  resetAG5PlayOff.setIcon(new ImageIcon(photo));
				  resetAG5PlayOff.setVisible(false);
				  				  
			//Tabela B playoff----------------------------------------------------------------------------------------------------------------------------------------------------- 
				  
				  tabelaBPlayoff.setBackground(SystemColor.inactiveCaption);
				  tabelaBPlayoff.setLayout(null);
				  tabelaBPlayoff.setBounds(569, 386, 532, 186);
				  contentPane.add(tabelaBPlayoff);
				  tabelaBPlayoff.setVisible(false);
				  
				  JLabel lblPlayoff_1 = new JLabel("Playoff");
				  lblPlayoff_1.setHorizontalAlignment(SwingConstants.CENTER);
				  lblPlayoff_1.setBounds(20, 11, 352, 25);
				  tabelaBPlayoff.add(lblPlayoff_1);
				  
				  resG1POTeamB1 = new JFormattedTextField(formatter);
				  resG1POTeamB1.setHorizontalAlignment(SwingConstants.CENTER);
				  resG1POTeamB1.setBounds(166, 44, 23, 17);
				  tabelaBPlayoff.add(resG1POTeamB1);
				  resG1POTeamB1.setVisible(false);
				  
				  resG2POTeamB1 = new JFormattedTextField(formatter);
				  resG2POTeamB1.setHorizontalAlignment(SwingConstants.CENTER);
				  resG2POTeamB1.setBounds(199, 72, 23, 17);
				  tabelaBPlayoff.add(resG2POTeamB1);
				  resG2POTeamB1.setVisible(false);
				  
				  resG1POTeamB2 = new JFormattedTextField(formatter);
				  resG1POTeamB2.setHorizontalAlignment(SwingConstants.CENTER);
				  resG1POTeamB2.setBounds(199, 44, 23, 17);
				  tabelaBPlayoff.add(resG1POTeamB2);
				  resG1POTeamB2.setVisible(false);
				  
				  resG2POTeamB2 = new JFormattedTextField(formatter);
				  resG2POTeamB2.setHorizontalAlignment(SwingConstants.CENTER);
				  resG2POTeamB2.setBounds(166, 100, 23, 17);
				  tabelaBPlayoff.add(resG2POTeamB2);
				  resG2POTeamB2.setVisible(false);
				  
				  resG1POTeamB3 = new JFormattedTextField(formatter);
				  resG1POTeamB3.setHorizontalAlignment(SwingConstants.CENTER);
				  resG1POTeamB3.setBounds(166, 72, 23, 17);
				  tabelaBPlayoff.add(resG1POTeamB3);
				  resG1POTeamB3.setVisible(false);
				  
				  resG2POTeamB3 = new JFormattedTextField(formatter);
				  resG2POTeamB3.setHorizontalAlignment(SwingConstants.CENTER);
				  resG2POTeamB3.setBounds(199, 100, 23, 17);
				  tabelaBPlayoff.add(resG2POTeamB3);
				  resG2POTeamB3.setVisible(false);
				  
				  resG4POTeamB1 = new JFormattedTextField(formatter);
				  resG4POTeamB1.setHorizontalAlignment(SwingConstants.CENTER);
				  resG4POTeamB1.setBounds(166, 130, 23, 17);
				  tabelaBPlayoff.add(resG4POTeamB1);
				  resG4POTeamB1.setVisible(false);
				  
				  resG4POTeamB2 = new JFormattedTextField(formatter);
				  resG4POTeamB2.setHorizontalAlignment(SwingConstants.CENTER);
				  resG4POTeamB2.setBounds(199, 130, 23, 17);
				  tabelaBPlayoff.add(resG4POTeamB2);
				  resG4POTeamB2.setVisible(false);
				  
				  resG5POTeamB3 = new JFormattedTextField(formatter);
				  resG5POTeamB3.setHorizontalAlignment(SwingConstants.CENTER);
				  resG5POTeamB3.setBounds(199, 158, 23, 17);
				  tabelaBPlayoff.add(resG5POTeamB3);
				  resG5POTeamB3.setVisible(false);
				  
				  resG5POTeamB2 = new JFormattedTextField(formatter);
				  resG5POTeamB2.setHorizontalAlignment(SwingConstants.CENTER);
				  resG5POTeamB2.setBounds(166, 158, 23, 17);
				  tabelaBPlayoff.add(resG5POTeamB2);
				  resG5POTeamB2.setVisible(false);
				  
				  lblPOG1TeamB1.setHorizontalAlignment(SwingConstants.CENTER);
				  lblPOG1TeamB1.setBounds(20, 44, 118, 14);
				  tabelaBPlayoff.add(lblPOG1TeamB1);
				  lblPOG1TeamB1.setVisible(false);
				  
				  lblPOG2TeamB1.setHorizontalAlignment(SwingConstants.CENTER);
				  lblPOG2TeamB1.setBounds(244, 72, 118, 14);
				  tabelaBPlayoff.add(lblPOG2TeamB1);
				  lblPOG2TeamB1.setVisible(false);
				  
				  lblPOG1TeamB2.setHorizontalAlignment(SwingConstants.CENTER);
				  lblPOG1TeamB2.setBounds(244, 44, 118, 14);
				  tabelaBPlayoff.add(lblPOG1TeamB2);
				  lblPOG1TeamB2.setVisible(false);
				  
				  lblPOG2TeamB2.setHorizontalAlignment(SwingConstants.CENTER);
				  lblPOG2TeamB2.setBounds(20, 100, 118, 14);
				  tabelaBPlayoff.add(lblPOG2TeamB2);
				  lblPOG2TeamB2.setVisible(false);
				  
				  lblPOG1TeamB3.setHorizontalAlignment(SwingConstants.CENTER);
				  lblPOG1TeamB3.setBounds(20, 72, 118, 14);
				  tabelaBPlayoff.add(lblPOG1TeamB3);
				  lblPOG1TeamB3.setVisible(false);
				  
				  lblPOG2TeamB3.setHorizontalAlignment(SwingConstants.CENTER);
				  lblPOG2TeamB3.setBounds(244, 100, 118, 14);
				  tabelaBPlayoff.add(lblPOG2TeamB3);
				  lblPOG2TeamB3.setVisible(false);
				  
				  lblPOG4TeamB1.setHorizontalAlignment(SwingConstants.CENTER);
				  lblPOG4TeamB1.setBounds(20, 130, 118, 14);
				  tabelaBPlayoff.add(lblPOG4TeamB1);
				  lblPOG4TeamB1.setVisible(false);
				  
				  lblPOG5TeamB3.setHorizontalAlignment(SwingConstants.CENTER);
				  lblPOG5TeamB3.setBounds(244, 158, 118, 14);
				  tabelaBPlayoff.add(lblPOG5TeamB3);
				  lblPOG5TeamB3.setVisible(false);
				  
				  lblPOG4TeamB2.setHorizontalAlignment(SwingConstants.CENTER);
				  lblPOG4TeamB2.setBounds(244, 130, 118, 14);
				  tabelaBPlayoff.add(lblPOG4TeamB2);
				  lblPOG4TeamB2.setVisible(false);
				  
				  lblPOG5TeamB2.setHorizontalAlignment(SwingConstants.CENTER);
				  lblPOG5TeamB2.setBounds(20, 158, 118, 14);
				  tabelaBPlayoff.add(lblPOG5TeamB2);
				  lblPOG5TeamB2.setVisible(false);
				  
				  btnBG1PlayOff.addActionListener(new ActionListener() {
				  	public void actionPerformed(ActionEvent e) {
				  		gfTB1G1=Integer.parseInt(resG1POTeamB1.getText());
				  		gfTB2G1=Integer.parseInt(resG1POTeamB2.getText());
				  		
				  			if(gfTB1G1>gfTB2G1) {
				  				wTB1G1=1; lTB1G1=0; uwB1=wB1G1+wB1G2+wB1G3+wB1G4+wTB1G1+wTB1G2; ulB1=lB1G1+lB1G2+lB1G3+lB1G4+lTB1G1+lTB1G2; upB1=uwB1+ulB1+udB1; ptsuB1=3*uwB1+udB1;
				  				wTB2G1=0; lTB2G1=1; uwB2=wB2G1+wB2G2+wB2G3+wB2G4+wTB2G1+wTB2G2; ulB2=lB2G1+lB2G2+lB2G3+lB2G4+lTB2G1+lTB2G2; upB2=uwB2+ulB2+udB2; ptsuB2=3*uwB2+udB2;
				  			}
				  			else if(gfTB1G1<gfTB2G1) {
				  				wTB1G1=0; lTB1G1=1; uwB1=wB1G1+wB1G2+wB1G3+wB1G4+wTB1G1+wTB1G2; ulB1=lB1G1+lB1G2+lB1G3+lB1G4+lTB1G1+lTB1G2; upB1=uwB1+ulB1+udB1; ptsuB1=3*uwB1+udB1; 
				  				wTB2G1=1; lTB2G1=0; uwB2=wB2G1+wB2G2+wB2G3+wB2G4+wTB2G1+wTB2G2; ulB2=lB2G1+lB2G2+lB2G3+lB2G4+lTB2G1+lTB2G2; upB2=uwB2+ulB2+udB2; ptsuB2=3*uwB2+udB2;
				  			}
				  			btnBG1PlayOff.setEnabled(false);
				  			resG1POTeamB1.setEditable(false);
				  			resG1POTeamB2.setEditable(false);
				  		
				  			ArrayList<TableSort> ar = new ArrayList<TableSort>();
			          		ar.add(new TableSort(String.valueOf(addTeams.teamB1),upB1,uwB1,udB1,ulB1,gfB1G1+gfB1G2+gfB1G3+gfB1G4+gfTB1G1+gfTB1G2,gfB2G1+gfB3G1+gfB2G3+gfB3G3+gfTB2G1+gfTB3G1,(gfB1G1+gfB1G2+gfB1G3+gfB1G4+gfTB1G1+gfTB1G2)-(gfB2G1+gfB3G1+gfB2G3+gfB3G3+gfTB2G1+gfTB3G1),ptsuB1));
		          			ar.add(new TableSort(String.valueOf(addTeams.teamB2),upB2,uwB2,udB2,ulB2,gfB2G1+gfB2G2+gfB2G3+gfB2G4+gfTB2G1+gfTB2G2,gfB1G1+gfB3G2+gfB1G3+gfB3G4+gfTB1G1+gfTB3G2,(gfB2G1+gfB2G2+gfB2G3+gfB2G4+gfTB2G1+gfTB2G2)-(gfB1G1+gfB3G2+gfB1G3+gfB3G4+gfTB1G1+gfTB3G2),ptsuB2));
		          			ar.add(new TableSort(String.valueOf(addTeams.teamB3),upB3,uwB3,udB3,ulB3,gfB3G1+gfB3G2+gfB3G3+gfB3G4+gfTB3G1+gfTB3G2,gfB1G2+gfB2G2+gfB1G4+gfB2G4+gfTB1G2+gfTB2G2,(gfB3G1+gfB3G2+gfB3G3+gfB3G4+gfTB3G1+gfTB3G2)-(gfB1G2+gfB2G2+gfB1G4+gfB2G4+gfTB1G2+gfTB2G2),ptsuB3));
		          			
		          			Collections.sort(ar, new SortByPts());
		          			
		          			lblGrpTeamB1.setText(ar.get(0).getteamName()); lblPlayedB1.setText(String.valueOf(ar.get(0).getPlayed())); lblWinsB1.setText(String.valueOf(ar.get(0).getWins())); lblDrawsB1.setText(String.valueOf(ar.get(0).getDraws()));   lblLostB1.setText(String.valueOf(ar.get(0).getLoses())); lblGFB1.setText(String.valueOf(ar.get(0).getGF())); lblGAB1.setText(String.valueOf(ar.get(0).getGA())); lblGDB1.setText(String.valueOf(ar.get(0).getGD())); lblPtsB1.setText(String.valueOf(ar.get(0).getPoints()));
		          			lblGrpTeamB2.setText(ar.get(1).getteamName()); lblPlayedB2.setText(String.valueOf(ar.get(1).getPlayed())); lblWinsB2.setText(String.valueOf(ar.get(1).getWins())); lblDrawsB2.setText(String.valueOf(ar.get(1).getDraws()));   lblLostB2.setText(String.valueOf(ar.get(1).getLoses())); lblGFB2.setText(String.valueOf(ar.get(1).getGF())); lblGAB2.setText(String.valueOf(ar.get(1).getGA())); lblGDB2.setText(String.valueOf(ar.get(1).getGD())); lblPtsB2.setText(String.valueOf(ar.get(1).getPoints()));
		          			lblGrpTeamB3.setText(ar.get(2).getteamName()); lblPlayedB3.setText(String.valueOf(ar.get(2).getPlayed())); lblWinsB3.setText(String.valueOf(ar.get(2).getWins())); lblDrawsB3.setText(String.valueOf(ar.get(2).getDraws()));   lblLostB3.setText(String.valueOf(ar.get(2).getLoses())); lblGFB3.setText(String.valueOf(ar.get(2).getGF())); lblGAB3.setText(String.valueOf(ar.get(2).getGA())); lblGDB3.setText(String.valueOf(ar.get(2).getGD())); lblPtsB3.setText(String.valueOf(ar.get(2).getPoints()));
				  	}
				  });
				  btnBG1PlayOff.setFont(new Font("Tahoma", Font.BOLD, 10));
				  btnBG1PlayOff.setBounds(372, 44, 89, 17);
				  tabelaBPlayoff.add(btnBG1PlayOff);
				  btnBG1PlayOff.setVisible(false);
				  
				  btnBG2PlayOff.addActionListener(new ActionListener() {
				  	public void actionPerformed(ActionEvent e) {
				  		gfTB1G2=Integer.parseInt(resG2POTeamB1.getText());
				  		gfTB3G1=Integer.parseInt(resG1POTeamB3.getText());
				  		if(gfTB1G2>gfTB3G1) {
				  			wTB1G2=1; lTB1G2=0; uwB1=wB1G1+wB1G2+wB1G3+wB1G4+wTB1G1+wTB1G2; ulB1=lB1G1+lB1G2+lB1G3+lB1G4+lTB1G1+lTB1G2; upB1=uwB1+ulB1+udB1; ptsuB1=3*uwB1+udB1;
		          			wTB3G1=0; lTB3G1=1; uwB3=wB3G1+wB3G2+wB3G3+wB3G4+wTB3G1+wTB3G2; ulB3=lB3G1+lB3G2+lB3G3+lB3G4+lTB3G1+lTB3G2; upB3=uwB3+ulB3+udB3; ptsuB3=3*uwB3+udB3;
		          		}
				  		else if(gfTB1G2<gfTB3G1) {
				  			wTB1G2=0; lTB1G2=1; uwB1=wB1G1+wB1G2+wB1G3+wB1G4+wTB1G1+wTB1G2; ulB1=lB1G1+lB1G2+lB1G3+lB1G4+lTB1G1+lTB1G2; upB1=uwB1+ulB1+udB1; ptsuB1=3*uwB1+udB1;
		          			wTB3G1=1; lTB3G1=0; uwB3=wB3G1+wB3G2+wB3G3+wB3G4+wTB3G1+wTB3G2; ulB3=lB3G1+lB3G2+lB3G3+lB3G4+lTB3G1+lTB3G2; upB3=uwB3+ulB3+udB3; ptsuB3=3*uwB3+udB3;
				  		}
				  		btnBG2PlayOff.setEnabled(false);
			  			resG2POTeamB1.setEditable(false);
			  			resG1POTeamB3.setEditable(false);
				  		
				  		ArrayList<TableSort> ar = new ArrayList<TableSort>();
		          		ar.add(new TableSort(String.valueOf(addTeams.teamB1),upB1,uwB1,udB1,ulB1,gfB1G1+gfB1G2+gfB1G3+gfB1G4+gfTB1G1+gfTB1G2,gfB2G1+gfB3G1+gfB2G3+gfB3G3+gfTB2G1+gfTB3G1,(gfB1G1+gfB1G2+gfB1G3+gfB1G4+gfTB1G1+gfTB1G2)-(gfB2G1+gfB3G1+gfB2G3+gfB3G3+gfTB2G1+gfTB3G1),ptsuB1));
	          			ar.add(new TableSort(String.valueOf(addTeams.teamB2),upB2,uwB2,udB2,ulB2,gfB2G1+gfB2G2+gfB2G3+gfB2G4+gfTB2G1+gfTB2G2,gfB1G1+gfB3G2+gfB1G3+gfB3G4+gfTB1G1+gfTB3G2,(gfB2G1+gfB2G2+gfB2G3+gfB2G4+gfTB2G1+gfTB2G2)-(gfB1G1+gfB3G2+gfB1G3+gfB3G4+gfTB1G1+gfTB3G2),ptsuB2));
	          			ar.add(new TableSort(String.valueOf(addTeams.teamB3),upB3,uwB3,udB3,ulB3,gfB3G1+gfB3G2+gfB3G3+gfB3G4+gfTB3G1+gfTB3G2,gfB1G2+gfB2G2+gfB1G4+gfB2G4+gfTB1G2+gfTB2G2,(gfB3G1+gfB3G2+gfB3G3+gfB3G4+gfTB3G1+gfTB3G2)-(gfB1G2+gfB2G2+gfB1G4+gfB2G4+gfTB1G2+gfTB2G2),ptsuB3));
	          			
	          			Collections.sort(ar, new SortByPts());
	          			
	          			lblGrpTeamB1.setText(ar.get(0).getteamName()); lblPlayedB1.setText(String.valueOf(ar.get(0).getPlayed())); lblWinsB1.setText(String.valueOf(ar.get(0).getWins())); lblDrawsB1.setText(String.valueOf(ar.get(0).getDraws()));   lblLostB1.setText(String.valueOf(ar.get(0).getLoses())); lblGFB1.setText(String.valueOf(ar.get(0).getGF())); lblGAB1.setText(String.valueOf(ar.get(0).getGA())); lblGDB1.setText(String.valueOf(ar.get(0).getGD())); lblPtsB1.setText(String.valueOf(ar.get(0).getPoints()));
	          			lblGrpTeamB2.setText(ar.get(1).getteamName()); lblPlayedB2.setText(String.valueOf(ar.get(1).getPlayed())); lblWinsB2.setText(String.valueOf(ar.get(1).getWins())); lblDrawsB2.setText(String.valueOf(ar.get(1).getDraws()));   lblLostB2.setText(String.valueOf(ar.get(1).getLoses())); lblGFB2.setText(String.valueOf(ar.get(1).getGF())); lblGAB2.setText(String.valueOf(ar.get(1).getGA())); lblGDB2.setText(String.valueOf(ar.get(1).getGD())); lblPtsB2.setText(String.valueOf(ar.get(1).getPoints()));
	          			lblGrpTeamB3.setText(ar.get(2).getteamName()); lblPlayedB3.setText(String.valueOf(ar.get(2).getPlayed())); lblWinsB3.setText(String.valueOf(ar.get(2).getWins())); lblDrawsB3.setText(String.valueOf(ar.get(2).getDraws()));   lblLostB3.setText(String.valueOf(ar.get(2).getLoses())); lblGFB3.setText(String.valueOf(ar.get(2).getGF())); lblGAB3.setText(String.valueOf(ar.get(2).getGA())); lblGDB3.setText(String.valueOf(ar.get(2).getGD())); lblPtsB3.setText(String.valueOf(ar.get(2).getPoints()));
				  		
				  	}
				  });
				  btnBG2PlayOff.setFont(new Font("Tahoma", Font.BOLD, 10));
				  btnBG2PlayOff.setBounds(372, 72, 89, 17);
				  tabelaBPlayoff.add(btnBG2PlayOff);
				  btnBG2PlayOff.setVisible(false);
				  
				  btnBG3PlayOff.addActionListener(new ActionListener() {
				  	public void actionPerformed(ActionEvent e) {
				  		gfTB2G2=Integer.parseInt(resG2POTeamB2.getText());
				  		gfTB3G2=Integer.parseInt(resG2POTeamB3.getText());
				  		if(gfTB2G2>gfTB3G2) {
				  			wTB2G2=1; lTB2G2=0; uwB2=wB2G1+wB2G2+wB2G3+wB2G4+wTB2G1+wTB2G2; ulB2=lB2G1+lB2G2+lB2G3+lB2G4+lTB2G1+lTB2G2; upB2=uwB2+ulB2+udB2; ptsuB2=3*uwB2+udB2;
		          			wTB3G2=0; lTB3G2=1; uwB3=wB3G1+wB3G2+wB3G3+wB3G4+wTB3G1+wTB3G2; ulB3=lB3G1+lB3G2+lB3G3+lB3G4+lTB3G1+lTB3G2; upB3=uwB3+ulB3+udB3; ptsuB3=3*uwB3+udB3;
				  		}
				  		else if(gfTB2G2<gfTB3G2) {
				  			wTB2G2=0; lTB2G2=1; uwB2=wB2G1+wB2G2+wB2G3+wB2G4+wTB2G1+wTB2G2; ulB2=lB2G1+lB2G2+lB2G3+lB2G4+lTB2G1+lTB2G2; upB2=uwB2+ulB2+udB2; ptsuB2=3*uwB2+udB2;
		          			wTB3G2=1; lTB3G2=0; uwB3=wB3G1+wB3G2+wB3G3+wB3G4+wTB3G1+wTB3G2; ulB3=lB3G1+lB3G2+lB3G3+lB3G4+lTB3G1+lTB3G2; upB3=uwB3+ulB3+udB3; ptsuB3=3*uwB3+udB3;
				  		}
				  		btnBG3PlayOff.setEnabled(false);
			  			resG2POTeamB2.setEditable(false);
			  			resG2POTeamB3.setEditable(false);
				  		
				  		ArrayList<TableSort> ar = new ArrayList<TableSort>();
		          		ar.add(new TableSort(String.valueOf(addTeams.teamB1),upB1,uwB1,udB1,ulB1,gfB1G1+gfB1G2+gfB1G3+gfB1G4+gfTB1G1+gfTB1G2,gfB2G1+gfB3G1+gfB2G3+gfB3G3+gfTB2G1+gfTB3G1,(gfB1G1+gfB1G2+gfB1G3+gfB1G4+gfTB1G1+gfTB1G2)-(gfB2G1+gfB3G1+gfB2G3+gfB3G3+gfTB2G1+gfTB3G1),ptsuB1));
	          			ar.add(new TableSort(String.valueOf(addTeams.teamB2),upB2,uwB2,udB2,ulB2,gfB2G1+gfB2G2+gfB2G3+gfB2G4+gfTB2G1+gfTB2G2,gfB1G1+gfB3G2+gfB1G3+gfB3G4+gfTB1G1+gfTB3G2,(gfB2G1+gfB2G2+gfB2G3+gfB2G4+gfTB2G1+gfTB2G2)-(gfB1G1+gfB3G2+gfB1G3+gfB3G4+gfTB1G1+gfTB3G2),ptsuB2));
	          			ar.add(new TableSort(String.valueOf(addTeams.teamB3),upB3,uwB3,udB3,ulB3,gfB3G1+gfB3G2+gfB3G3+gfB3G4+gfTB3G1+gfTB3G2,gfB1G2+gfB2G2+gfB1G4+gfB2G4+gfTB1G2+gfTB2G2,(gfB3G1+gfB3G2+gfB3G3+gfB3G4+gfTB3G1+gfTB3G2)-(gfB1G2+gfB2G2+gfB1G4+gfB2G4+gfTB1G2+gfTB2G2),ptsuB3));
	          			
	          			Collections.sort(ar, new SortByPts());
	          			
	          			lblGrpTeamB1.setText(ar.get(0).getteamName()); lblPlayedB1.setText(String.valueOf(ar.get(0).getPlayed())); lblWinsB1.setText(String.valueOf(ar.get(0).getWins())); lblDrawsB1.setText(String.valueOf(ar.get(0).getDraws()));   lblLostB1.setText(String.valueOf(ar.get(0).getLoses())); lblGFB1.setText(String.valueOf(ar.get(0).getGF())); lblGAB1.setText(String.valueOf(ar.get(0).getGA())); lblGDB1.setText(String.valueOf(ar.get(0).getGD())); lblPtsB1.setText(String.valueOf(ar.get(0).getPoints()));
	          			lblGrpTeamB2.setText(ar.get(1).getteamName()); lblPlayedB2.setText(String.valueOf(ar.get(1).getPlayed())); lblWinsB2.setText(String.valueOf(ar.get(1).getWins())); lblDrawsB2.setText(String.valueOf(ar.get(1).getDraws()));   lblLostB2.setText(String.valueOf(ar.get(1).getLoses())); lblGFB2.setText(String.valueOf(ar.get(1).getGF())); lblGAB2.setText(String.valueOf(ar.get(1).getGA())); lblGDB2.setText(String.valueOf(ar.get(1).getGD())); lblPtsB2.setText(String.valueOf(ar.get(1).getPoints()));
	          			lblGrpTeamB3.setText(ar.get(2).getteamName()); lblPlayedB3.setText(String.valueOf(ar.get(2).getPlayed())); lblWinsB3.setText(String.valueOf(ar.get(2).getWins())); lblDrawsB3.setText(String.valueOf(ar.get(2).getDraws()));   lblLostB3.setText(String.valueOf(ar.get(2).getLoses())); lblGFB3.setText(String.valueOf(ar.get(2).getGF())); lblGAB3.setText(String.valueOf(ar.get(2).getGA())); lblGDB3.setText(String.valueOf(ar.get(2).getGD())); lblPtsB3.setText(String.valueOf(ar.get(2).getPoints()));
				  	}
				  });
				  btnBG3PlayOff.setFont(new Font("Tahoma", Font.BOLD, 10));
				  btnBG3PlayOff.setBounds(372, 100, 89, 17);
				  tabelaBPlayoff.add(btnBG3PlayOff);
				  btnBG3PlayOff.setVisible(false);
				  
				  btnBG4PlayOff.addActionListener(new ActionListener() {
				  	public void actionPerformed(ActionEvent e) {
				  		int gfTB1G4=Integer.parseInt(resG4POTeamB1.getText());
				  		int gfTB2G4=Integer.parseInt(resG4POTeamB2.getText());
				  		
				  			if(gfTB1G4>gfTB2G4) {
				  				lblGrpTeamB1.setText(lblPOG4TeamB1.getText());
				  				lblGrpTeamB2.setText(lblPOG4TeamB2.getText());
				  				
				  			}
				  			else if(gfTB1G4<gfTB2G4) {
				  				lblGrpTeamB1.setText(lblPOG4TeamB2.getText());
				  				lblGrpTeamB2.setText(lblPOG4TeamB1.getText());
				  				
				  			}
				  			btnBG4PlayOff.setEnabled(false);
				  			resG4POTeamB1.setEditable(false);
				  			resG4POTeamB2.setEditable(false);
				  	}
				  });
				  btnBG4PlayOff.setFont(new Font("Tahoma", Font.BOLD, 10));
				  btnBG4PlayOff.setBounds(372, 130, 89, 17);
				  tabelaBPlayoff.add(btnBG4PlayOff);
				  btnBG4PlayOff.setVisible(false);
				  
				  btnBG5PlayOff.addActionListener(new ActionListener() {
				  	public void actionPerformed(ActionEvent e) {
				  		int gfTB2G5=Integer.parseInt(resG5POTeamB2.getText());
				  		int gfTB3G5=Integer.parseInt(resG5POTeamB3.getText());
				  		
				  			if(gfTB2G5>gfTB3G5) {
				  				lblGrpTeamB2.setText(lblPOG5TeamB2.getText());
				  				lblGrpTeamB3.setText(lblPOG5TeamB3.getText());
				  				
				  			}
				  			else if(gfTB2G5<gfTB3G5) {
				  				lblGrpTeamB2.setText(lblPOG5TeamB3.getText());
				  				lblGrpTeamB3.setText(lblPOG5TeamB2.getText());
				  				
				  			}
				  			btnBG5PlayOff.setEnabled(false);
				  			resG5POTeamB2.setEditable(false);
				  			resG5POTeamB3.setEditable(false);
				  	}
				  });
				  btnBG5PlayOff.setFont(new Font("Tahoma", Font.BOLD, 10));
				  btnBG5PlayOff.setBounds(372, 158, 89, 17);
				  tabelaBPlayoff.add(btnBG5PlayOff);
				  btnBG5PlayOff.setVisible(false);
				  
				  resetBG1PlayOff.addActionListener(new ActionListener() {
				  	public void actionPerformed(ActionEvent e) {
				  		btnBG1PlayOff.setEnabled(true);
			  			resG1POTeamB1.setEditable(true);
			  			resG1POTeamB2.setEditable(true);
			  			lblGrpTeamB1.setText(addTeams.teamB1); lblPlayedB1.setText(pB1); lblWinsB1.setText(wB1); lblDrawsB1.setText(dB1); lblLostB1.setText(lB1); lblGFB1.setText(gfB1); lblGAB1.setText(gaB1); lblGDB1.setText(gdB1); lblPtsB1.setText(ptsB1);
	          			lblGrpTeamB2.setText(addTeams.teamB2); lblPlayedB2.setText(pB2); lblWinsB2.setText(wB2); lblDrawsB2.setText(dB2); lblLostB2.setText(lB2); lblGFB2.setText(gfB2); lblGAB2.setText(gaB2); lblGDB2.setText(gdB2); lblPtsB2.setText(ptsB2);
	          			lblGrpTeamB3.setText(addTeams.teamB3); lblPlayedB3.setText(pB3); lblWinsB3.setText(wB3); lblDrawsB3.setText(dB3); lblLostB3.setText(lB3); lblGFB3.setText(gfB3); lblGAB3.setText(gaB3); lblGDB3.setText(gdB3); lblPtsB3.setText(ptsB3);
				  	}
				  });
				  resetBG1PlayOff.setForeground(Color.WHITE);
				  resetBG1PlayOff.setBackground(Color.WHITE);
				  resetBG1PlayOff.setBounds(471, 44, 25, 17);
				  tabelaBPlayoff.add(resetBG1PlayOff);
				  resetBG1PlayOff.setIcon(new ImageIcon(photo));
				  resetBG1PlayOff.setVisible(false);
				  
				  resetBG2PlayOff.addActionListener(new ActionListener() {
				  	public void actionPerformed(ActionEvent e) {
				  		btnBG2PlayOff.setEnabled(true);
			  			resG2POTeamB1.setEditable(true);
			  			resG1POTeamB3.setEditable(true);
			  			lblGrpTeamB1.setText(addTeams.teamB1); lblPlayedB1.setText(pB1); lblWinsB1.setText(wB1); lblDrawsB1.setText(dB1); lblLostB1.setText(lB1); lblGFB1.setText(gfB1); lblGAB1.setText(gaB1); lblGDB1.setText(gdB1); lblPtsB1.setText(ptsB1);
	          			lblGrpTeamB2.setText(addTeams.teamB2); lblPlayedB2.setText(pB2); lblWinsB2.setText(wB2); lblDrawsB2.setText(dB2); lblLostB2.setText(lB2); lblGFB2.setText(gfB2); lblGAB2.setText(gaB2); lblGDB2.setText(gdB2); lblPtsB2.setText(ptsB2);
	          			lblGrpTeamB3.setText(addTeams.teamB3); lblPlayedB3.setText(pB3); lblWinsB3.setText(wB3); lblDrawsB3.setText(dB3); lblLostB3.setText(lB3); lblGFB3.setText(gfB3); lblGAB3.setText(gaB3); lblGDB3.setText(gdB3); lblPtsB3.setText(ptsB3);
				  	}
				  });
				  resetBG2PlayOff.setForeground(Color.WHITE);
				  resetBG2PlayOff.setBackground(Color.WHITE);
				  resetBG2PlayOff.setBounds(471, 72, 25, 17);
				  tabelaBPlayoff.add(resetBG2PlayOff);
				  resetBG2PlayOff.setIcon(new ImageIcon(photo));
				  resetBG2PlayOff.setVisible(false);
				  
				  resetBG3PlayOff.addActionListener(new ActionListener() {
				  	public void actionPerformed(ActionEvent e) {
				  		btnBG3PlayOff.setEnabled(true);
			  			resG2POTeamB2.setEditable(true);
			  			resG2POTeamB3.setEditable(true);
			  			lblGrpTeamB1.setText(addTeams.teamB1); lblPlayedB1.setText(pB1); lblWinsB1.setText(wB1); lblDrawsB1.setText(dB1); lblLostB1.setText(lB1); lblGFB1.setText(gfB1); lblGAB1.setText(gaB1); lblGDB1.setText(gdB1); lblPtsB1.setText(ptsB1);
	          			lblGrpTeamB2.setText(addTeams.teamB2); lblPlayedB2.setText(pB2); lblWinsB2.setText(wB2); lblDrawsB2.setText(dB2); lblLostB2.setText(lB2); lblGFB2.setText(gfB2); lblGAB2.setText(gaB2); lblGDB2.setText(gdB2); lblPtsB2.setText(ptsB2);
	          			lblGrpTeamB3.setText(addTeams.teamB3); lblPlayedB3.setText(pB3); lblWinsB3.setText(wB3); lblDrawsB3.setText(dB3); lblLostB3.setText(lB3); lblGFB3.setText(gfB3); lblGAB3.setText(gaB3); lblGDB3.setText(gdB3); lblPtsB3.setText(ptsB3);
				  	}
				  });
				  resetBG3PlayOff.setForeground(Color.WHITE);
				  resetBG3PlayOff.setBackground(Color.WHITE);
				  resetBG3PlayOff.setBounds(471, 100, 25, 17);
				  tabelaBPlayoff.add(resetBG3PlayOff);
				  resetBG3PlayOff.setIcon(new ImageIcon(photo));
				  resetBG3PlayOff.setVisible(false);
				  
				  resetBG4PlayOff.addActionListener(new ActionListener() {
				  	public void actionPerformed(ActionEvent e) {
				  		btnBG4PlayOff.setEnabled(true);
			  			resG4POTeamB1.setEditable(true);
			  			resG4POTeamB2.setEditable(true);
			  			lblGrpTeamB1.setText(addTeams.teamB1); lblPlayedB1.setText(pB1); lblWinsB1.setText(wB1); lblDrawsB1.setText(dB1); lblLostB1.setText(lB1); lblGFB1.setText(gfB1); lblGAB1.setText(gaB1); lblGDB1.setText(gdB1); lblPtsB1.setText(ptsB1);
	          			lblGrpTeamB2.setText(addTeams.teamB2); lblPlayedB2.setText(pB2); lblWinsB2.setText(wB2); lblDrawsB2.setText(dB2); lblLostB2.setText(lB2); lblGFB2.setText(gfB2); lblGAB2.setText(gaB2); lblGDB2.setText(gdB2); lblPtsB2.setText(ptsB2);
	          			lblGrpTeamB3.setText(addTeams.teamB3); lblPlayedB3.setText(pB3); lblWinsB3.setText(wB3); lblDrawsB3.setText(dB3); lblLostB3.setText(lB3); lblGFB3.setText(gfB3); lblGAB3.setText(gaB3); lblGDB3.setText(gdB3); lblPtsB3.setText(ptsB3);
				  	}
				  });
				  resetBG4PlayOff.setForeground(Color.WHITE);
				  resetBG4PlayOff.setBackground(Color.WHITE);
				  resetBG4PlayOff.setBounds(471, 130, 25, 17);
				  tabelaBPlayoff.add(resetBG4PlayOff);
				  resetBG4PlayOff.setIcon(new ImageIcon(photo));
				  resetBG4PlayOff.setVisible(false);
				  
				  resetBG5PlayOff.addActionListener(new ActionListener() {
				  	public void actionPerformed(ActionEvent e) {
				  		btnBG5PlayOff.setEnabled(true);
			  			resG5POTeamB2.setEditable(true);
			  			resG5POTeamB3.setEditable(true);
			  			lblGrpTeamB1.setText(addTeams.teamB1); lblPlayedB1.setText(pB1); lblWinsB1.setText(wB1); lblDrawsB1.setText(dB1); lblLostB1.setText(lB1); lblGFB1.setText(gfB1); lblGAB1.setText(gaB1); lblGDB1.setText(gdB1); lblPtsB1.setText(ptsB1);
	          			lblGrpTeamB2.setText(addTeams.teamB2); lblPlayedB2.setText(pB2); lblWinsB2.setText(wB2); lblDrawsB2.setText(dB2); lblLostB2.setText(lB2); lblGFB2.setText(gfB2); lblGAB2.setText(gaB2); lblGDB2.setText(gdB2); lblPtsB2.setText(ptsB2);
	          			lblGrpTeamB3.setText(addTeams.teamB3); lblPlayedB3.setText(pB3); lblWinsB3.setText(wB3); lblDrawsB3.setText(dB3); lblLostB3.setText(lB3); lblGFB3.setText(gfB3); lblGAB3.setText(gaB3); lblGDB3.setText(gdB3); lblPtsB3.setText(ptsB3);
				  	}
				  });
				  resetBG5PlayOff.setForeground(Color.WHITE);
				  resetBG5PlayOff.setBackground(Color.WHITE);
				  resetBG5PlayOff.setBounds(471, 158, 25, 17);
				  tabelaBPlayoff.add(resetBG5PlayOff);
				  resetBG5PlayOff.setIcon(new ImageIcon(photo));
				  resetBG5PlayOff.setVisible(false);
				  
					  
	}
}
