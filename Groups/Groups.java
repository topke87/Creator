import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.NumberFormatter;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.NumberFormat;

import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;



public class Groups extends JFrame {

	private JPanel contentPane;
	
	static JButton btnGrpAG4 = new JButton("AddResult");  static JButton btnGrpBG4 = new JButton("AddResult");
	static JButton btnGrpAG5 = new JButton("AddResult");  static JButton btnGrpBG5 = new JButton("AddResult");
	static JButton btnGrpAG6 = new JButton("AddResult");  static JButton btnGrpBG6 = new JButton("AddResult");
				
	private String teamA1=addTeams.teamA1; private String teamA2=addTeams.teamA2; private String teamA3=addTeams.teamA3;
	private String teamB1=addTeams.teamB1; private String teamB2=addTeams.teamB2; private String teamB3=addTeams.teamB3;
	
	private int wA1G1; private int wA1G2; private int wA1G3; private int wA1G4; private int dA1G1; private int dA1G2; private int dA1G3; private int dA1G4; private int lA1G1; private int lA1G2; private int lA1G3; private int lA1G4;
	private int gfA1G1; private int gfA1G2; private int gfA1G3; private int gfA1G4; private int gaA1G1; private int gaA1G2; private int gaA1G3; private int gaA1G4;
	
	private int wA2G1; private int wA2G2; private int wA2G3; private int wA2G4; private int dA2G1; private int dA2G2; private int dA2G3; private int dA2G4; private int lA2G1; private int lA2G2; private int lA2G3; private int lA2G4;
	private int gfA2G1; private int gfA2G2; private int gfA2G3; private int gfA2G4; private int gaA2G1; private int gaA2G2; private int gaA2G3; private int gaA2G4;
	
	private int wA3G1; private int wA3G2; private int wA3G3; private int wA3G4; private int dA3G1; private int dA3G2; private int dA3G3; private int dA3G4; private int lA3G1; private int lA3G2; private int lA3G3; private int lA3G4;
	private int gfA3G1; private int gfA3G2; private int gfA3G3; private int gfA3G4; private int gaA3G1; private int gaA3G2; private int gaA3G3; private int gaA3G4;
	
	
	private int uwA1=wA1G1+wA1G2+wA1G3+wA1G4; private int udA1=dA1G1+dA1G2+dA1G3+dA1G4; private int ulA1=lA1G1+lA1G2+lA1G3+lA1G4;
	private int uwA2=wA2G1+wA2G2+wA2G3+wA2G4; private int udA2=dA2G1+dA2G2+dA2G3+dA2G4; private int ulA2=lA2G1+lA2G2+lA2G3+lA2G4;
	private int uwA3=wA3G1+wA3G2+wA3G3+wA3G4; private int udA3=dA3G1+dA3G2+dA3G3+dA3G4; private int ulA3=lA3G1+lA3G2+lA3G3+lA3G4;
	
	private int upA1=uwA1+udA1+ulA1; private int ugfA1=gfA1G1+gfA1G2+gfA1G3+gfA1G4; private int ugaA1=gaA1G1+gaA1G2+gaA1G3+gaA1G4; private int ugdA1=ugfA1-ugaA1; private int ptsuA1=3*uwA1+udA1;
	private int upA2=uwA2+udA2+ulA2; private int ugfA2=gfA2G1+gfA2G2+gfA2G3+gfA2G4; private int ugaA2=gaA2G1+gaA2G2+gaA2G3+gaA2G4; private int ugdA2=ugfA2-ugaA2; private int ptsuA2=3*uwA2+udA2;
	private int upA3=uwA3+udA3+ulA3; private int ugfA3=gfA3G1+gfA3G2+gfA3G3+gfA3G4; private int ugaA3=gaA3G1+gaA3G2+gaA3G3+gaA3G4; private int ugdA3=ugfA3-ugaA3; private int ptsuA3=3*uwA3+udA3;
	
	private String pA1=String.valueOf(upA1); private String wA1=String.valueOf(uwA1); private String dA1=String.valueOf(udA1); private String lA1=String.valueOf(ulA1); private String gfA1=String.valueOf(ugfA1); private String gaA1=String.valueOf(ugaA1); private String gdA1=String.valueOf(ugdA1); private String ptsA1=String.valueOf(ptsuA1);
	private String pA2=String.valueOf(upA2); private String wA2=String.valueOf(uwA2); private String dA2=String.valueOf(udA2); private String lA2=String.valueOf(ulA2); private String gfA2=String.valueOf(ugfA2); private String gaA2=String.valueOf(ugaA2); private String gdA2=String.valueOf(ugdA2); private String ptsA2=String.valueOf(ptsuA2);
	private String pA3=String.valueOf(upA3); private String wA3=String.valueOf(uwA3); private String dA3=String.valueOf(udA3); private String lA3=String.valueOf(ulA3); private String gfA3=String.valueOf(ugfA3); private String gaA3=String.valueOf(ugaA3); private String gdA3=String.valueOf(ugdA3); private String ptsA3=String.valueOf(ptsuA3);

	private int wB1G1; private int wB1G2; private int wB1G3; private int wB1G4; private int dB1G1; private int dB1G2; private int dB1G3; private int dB1G4; private int lB1G1; private int lB1G2; private int lB1G3; private int lB1G4;
	private int gfB1G1; private int gfB1G2; private int gfB1G3; private int gfB1G4; private int gaB1G1; private int gaB1G2; private int gaB1G3; private int gaB1G4;
	
	private int wB2G1; private int wB2G2; private int wB2G3; private int wB2G4; private int dB2G1; private int dB2G2; private int dB2G3; private int dB2G4; private int lB2G1; private int lB2G2; private int lB2G3; private int lB2G4;
	private int gfB2G1; private int gfB2G2; private int gfB2G3; private int gfB2G4; private int gaB2G1; private int gaB2G2; private int gaB2G3; private int gaB2G4;
	
	private int wB3G1; private int wB3G2; private int wB3G3; private int wB3G4; private int dB3G1; private int dB3G2; private int dB3G3; private int dB3G4; private int lB3G1; private int lB3G2; private int lB3G3; private int lB3G4;
	private int gfB3G1; private int gfB3G2; private int gfB3G3; private int gfB3G4; private int gaB3G1; private int gaB3G2; private int gaB3G3; private int gaB3G4;
	
	
	private int uwB1=wB1G1+wB1G2+wB1G3+wB1G4; private int udB1=dB1G1+dB1G2+dB1G3+dB1G4; private int ulB1=lB1G1+lB1G2+lB1G3+lB1G4;
	private int uwB2=wB2G1+wB2G2+wB2G3+wB2G4; private int udB2=dB2G1+dB2G2+dB2G3+dB2G4; private int ulB2=lB2G1+lB2G2+lB2G3+lB2G4;
	private int uwB3=wB3G1+wB3G2+wB3G3+wB3G4; private int udB3=dB3G1+dB3G2+dB3G3+dB3G4; private int ulB3=lB3G1+lB3G2+lB3G3+lB3G4;
	
	private int upB1=uwB1+udB1+ulB1; private int ugfB1=gfB1G1+gfB1G2+gfB1G3+gfB1G4; private int ugaB1=gaB1G1+gaB1G2+gaB1G3+gaB1G4; private int ugdB1=ugfB1-ugaB1; private int ptsuB1=3*uwB1+udB1;
	private int upB2=uwB2+udB2+ulB2; private int ugfB2=gfB2G1+gfB2G2+gfB2G3+gfB2G4; private int ugaB2=gaB2G1+gaB2G2+gaB2G3+gaB2G4; private int ugdB2=ugfB2-ugaB2; private int ptsuB2=3*uwB2+udB2;
	private int upB3=uwB3+udB3+ulB3; private int ugfB3=gfB3G1+gfB3G2+gfB3G3+gfB3G4; private int ugaB3=gaB3G1+gaB3G2+gaB3G3+gaB3G4; private int ugdB3=ugfB3-ugaB3; private int ptsuB3=3*uwB3+udB3;
	
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
		setBounds(100, 100, 1122, 701);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//IMENA TIMOVA-----------------------------------------------------------------------------------------------------------
		JLabel lblGrpTeamA1 = new JLabel("New label");		JLabel lblGrpTeamA2 = new JLabel("New label");
		lblGrpTeamA1.setBounds(36, 145, 125, 14);			lblGrpTeamA2.setBounds(36, 163, 125, 14);
		lblGrpTeamA1.setText(teamA1);						lblGrpTeamA2.setText(teamA2);
		contentPane.add(lblGrpTeamA1);						contentPane.add(lblGrpTeamA2);
		
		JLabel lblGrpTeamA3 = new JLabel("New label");
		lblGrpTeamA3.setBounds(36, 181, 125, 14);
		lblGrpTeamA3.setText(teamA3);
		contentPane.add(lblGrpTeamA3);
		
		JLabel lblGrpTeamB1 = new JLabel("New label");		JLabel lblGrpTeamB2 = new JLabel("New label");
		lblGrpTeamB1.setBounds(595, 145, 125, 14);			lblGrpTeamB2.setBounds(595, 163, 125, 14);
		lblGrpTeamB1.setText(teamB1);						lblGrpTeamB2.setText(teamB2);
		contentPane.add(lblGrpTeamB1);						contentPane.add(lblGrpTeamB2);
		
		JLabel lblGrpTeamB3 = new JLabel("New label");
		lblGrpTeamB3.setBounds(595, 181, 125, 14);
		lblGrpTeamB3.setText(teamB3);
		contentPane.add(lblGrpTeamB3);
		
		//TEAM B1 STATISTIKA-----------------------------------------------------------------------------------------------------		
		JLabel lblPlayedB1 = new JLabel("P");						JLabel lblWinsB1 = new JLabel("W");
		lblPlayedB1.setHorizontalAlignment(SwingConstants.CENTER);	lblWinsB1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayedB1.setFont(new Font("Tahoma", Font.BOLD, 12));		lblWinsB1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPlayedB1.setBounds(731, 145, 29, 14);					lblWinsB1.setBounds(764, 145, 29, 14);
		
		contentPane.add(lblPlayedB1);								contentPane.add(lblWinsB1);
		
		JLabel lblDrawsB1 = new JLabel("D");						JLabel lblLostB1 = new JLabel("L");
		lblDrawsB1.setHorizontalAlignment(SwingConstants.CENTER);	lblLostB1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDrawsB1.setFont(new Font("Tahoma", Font.BOLD, 12));  	lblLostB1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDrawsB1.setBounds(797, 145, 29, 14);						lblLostB1.setBounds(830, 145, 29, 14);
		
		contentPane.add(lblDrawsB1);								contentPane.add(lblLostB1);
		
		JLabel lblGFB1 = new JLabel("GF");							JLabel lblGAB1 = new JLabel("GA");							
		lblGFB1.setHorizontalAlignment(SwingConstants.CENTER);		lblGAB1.setHorizontalAlignment(SwingConstants.CENTER);		
		lblGFB1.setFont(new Font("Tahoma", Font.BOLD, 12));			lblGAB1.setFont(new Font("Tahoma", Font.BOLD, 12));			
		lblGFB1.setBounds(863, 145, 29, 14);						lblGAB1.setBounds(896, 145, 29, 14);
		
		contentPane.add(lblGFB1);									contentPane.add(lblGAB1);									
		
		JLabel lblGDB1 = new JLabel("GD");							JLabel lblPtsB1 = new JLabel("PTS");
		lblGDB1.setHorizontalAlignment(SwingConstants.CENTER);		lblPtsB1.setHorizontalAlignment(SwingConstants.CENTER);
		lblGDB1.setFont(new Font("Tahoma", Font.BOLD, 12));			lblPtsB1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGDB1.setBounds(929, 145, 29, 14);						lblPtsB1.setBounds(962, 145, 29, 14);
		
		contentPane.add(lblGDB1);									contentPane.add(lblPtsB1);
		
		//TEAM B2 STATISTIKA-----------------------------------------------------------------------------------------------------
		JLabel lblPlayedB2 = new JLabel("P");							JLabel lblWinsB2 = new JLabel("W");
		lblPlayedB2.setHorizontalAlignment(SwingConstants.CENTER);		lblWinsB2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayedB2.setFont(new Font("Tahoma", Font.BOLD, 12));			lblWinsB2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPlayedB2.setBounds(731, 163, 29, 14);						lblWinsB2.setBounds(764, 163, 29, 14);
		lblPlayedB2.setText(pB2);                                   	lblWinsB2.setText(wB2);
		contentPane.add(lblPlayedB2);									contentPane.add(lblWinsB2);
		
		JLabel lblDrawsB2 = new JLabel("D");							JLabel lblLostB2 = new JLabel("L");
		lblDrawsB2.setHorizontalAlignment(SwingConstants.CENTER);		lblLostB2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDrawsB2.setFont(new Font("Tahoma", Font.BOLD, 12));			lblLostB2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDrawsB2.setBounds(797, 163, 29, 14);							lblLostB2.setBounds(830, 163, 29, 14);
		lblDrawsB2.setText(dB2); 										lblLostB2.setText(lB2);
		contentPane.add(lblDrawsB2);									contentPane.add(lblLostB2);
		
		JLabel lblGFB2 = new JLabel("GF");								JLabel lblGAB2 = new JLabel("GA");
		lblGFB2.setHorizontalAlignment(SwingConstants.CENTER);			lblGAB2.setHorizontalAlignment(SwingConstants.CENTER);
		lblGFB2.setFont(new Font("Tahoma", Font.BOLD, 12));				lblGAB2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGFB2.setBounds(863, 163, 29, 14);							lblGAB2.setBounds(896, 163, 29, 14);
		lblGFB2.setText(gfB2); 											lblGAB2.setText(gaB2);
		contentPane.add(lblGFB2);										contentPane.add(lblGAB2);
		
		JLabel lblGDB2 = new JLabel("GD");								JLabel lblPtsB2 = new JLabel("PTS");
		lblGDB2.setHorizontalAlignment(SwingConstants.CENTER);			lblPtsB2.setHorizontalAlignment(SwingConstants.CENTER);
		lblGDB2.setFont(new Font("Tahoma", Font.BOLD, 12));				lblPtsB2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGDB2.setBounds(929, 163, 29, 14);							lblPtsB2.setBounds(962, 163, 29, 14);
		lblGDB2.setText(gdB2); 											lblPtsB2.setText(ptsB2);
		contentPane.add(lblGDB2);										contentPane.add(lblPtsB2);
		
		//TEAM B3 STATISTIKA-----------------------------------------------------------------------------------------------------
		JLabel lblPlayedB3 = new JLabel("P");						JLabel lblWinsB3 = new JLabel("W");
		lblPlayedB3.setHorizontalAlignment(SwingConstants.CENTER);	lblWinsB3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayedB3.setFont(new Font("Tahoma", Font.BOLD, 12));		lblWinsB3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPlayedB3.setBounds(731, 181, 29, 14);					lblWinsB3.setBounds(764, 181, 29, 14);
		lblPlayedB3.setText(pB3);                                   lblWinsB3.setText(wB3);
		contentPane.add(lblPlayedB3);								contentPane.add(lblWinsB3);
		
		JLabel lblDrawsB3 = new JLabel("D");						JLabel lblLostB3 = new JLabel("L");
		lblDrawsB3.setHorizontalAlignment(SwingConstants.CENTER);	lblLostB3.setHorizontalAlignment(SwingConstants.CENTER);
		lblDrawsB3.setFont(new Font("Tahoma", Font.BOLD, 12));		lblLostB3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDrawsB3.setBounds(797, 181, 29, 14);						lblLostB3.setBounds(830, 181, 29, 14);
		lblDrawsB3.setText(dB3); 									lblLostB3.setText(lB3);
		contentPane.add(lblDrawsB3);								contentPane.add(lblLostB3);
		
		JLabel lblGFB3 = new JLabel("GF");							JLabel lblGAB3 = new JLabel("GA");
		lblGFB3.setHorizontalAlignment(SwingConstants.CENTER);		lblGAB3.setHorizontalAlignment(SwingConstants.CENTER);	
		lblGFB3.setFont(new Font("Tahoma", Font.BOLD, 12));			lblGAB3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGFB3.setBounds(863, 181, 29, 14);						lblGAB3.setBounds(896, 181, 29, 14);
		lblGFB3.setText(gfB3); 										lblGAB3.setText(gaB3);
		contentPane.add(lblGFB3);									contentPane.add(lblGAB3);
		
		JLabel lblGDB3 = new JLabel("GD");							JLabel lblPtsB3 = new JLabel("PTS");
		lblGDB3.setHorizontalAlignment(SwingConstants.CENTER);		lblPtsB3.setHorizontalAlignment(SwingConstants.CENTER);
		lblGDB3.setFont(new Font("Tahoma", Font.BOLD, 12));			lblPtsB3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGDB3.setBounds(929, 181, 29, 14);						lblPtsB3.setBounds(962, 181, 29, 14);
		lblGDB3.setText(gdB3); 										lblPtsB3.setText(ptsB3);
		contentPane.add(lblGDB3);									contentPane.add(lblPtsB3);
		
		//TEAM A3 STATISTIKA-----------------------------------------------------------------------------------------------------
		JLabel lblPlayedA3 = new JLabel("P");							JLabel lblWinsA3 = new JLabel("W");
		lblPlayedA3.setHorizontalAlignment(SwingConstants.CENTER);		lblWinsA3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayedA3.setFont(new Font("Tahoma", Font.BOLD, 12));			lblWinsA3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPlayedA3.setBounds(171, 181, 29, 14);						lblWinsA3.setBounds(204, 181, 29, 14);
		lblPlayedA3.setText(pA3); 										lblWinsA3.setText(wA3);
		contentPane.add(lblPlayedA3);									contentPane.add(lblWinsA3);
		
		JLabel lblDrawsA3 = new JLabel("D");							JLabel lblLostA3 = new JLabel("L");
		lblDrawsA3.setHorizontalAlignment(SwingConstants.CENTER);		lblLostA3.setHorizontalAlignment(SwingConstants.CENTER);
		lblDrawsA3.setFont(new Font("Tahoma", Font.BOLD, 12));			lblLostA3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDrawsA3.setBounds(237, 181, 29, 14);							lblLostA3.setBounds(270, 181, 29, 14);
		lblDrawsA3.setText(dA3); 										lblLostA3.setText(lA3);
		contentPane.add(lblDrawsA3);									contentPane.add(lblLostA3);
		
		JLabel lblGFA3 = new JLabel("GF");								JLabel lblGAA3 = new JLabel("GA");
		lblGFA3.setHorizontalAlignment(SwingConstants.CENTER);			lblGAA3.setHorizontalAlignment(SwingConstants.CENTER);
		lblGFA3.setFont(new Font("Tahoma", Font.BOLD, 12));				lblGAA3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGFA3.setBounds(303, 181, 29, 14);							lblGAA3.setBounds(336, 181, 29, 14);
		lblGFA3.setText(gfA3); 											lblGAA3.setText(gaA3);
		contentPane.add(lblGFA3);										contentPane.add(lblGAA3);
		
		JLabel lblGDA3 = new JLabel("GD");								JLabel lblPtsA3 = new JLabel("PTS");
		lblGDA3.setHorizontalAlignment(SwingConstants.CENTER);			lblPtsA3.setHorizontalAlignment(SwingConstants.CENTER);
		lblGDA3.setFont(new Font("Tahoma", Font.BOLD, 12));				lblPtsA3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGDA3.setBounds(369, 181, 29, 14);							lblPtsA3.setBounds(402, 181, 29, 14);
		lblGDA3.setText(gdA3); 											lblPtsA3.setText(ptsA3);
		contentPane.add(lblGDA3);										contentPane.add(lblPtsA3);
		
		//TEAM A2 STATISTIKA----------------------------------------------------------------------------------------------------
		JLabel lblPlayedA2 = new JLabel("P");							JLabel lblWinsA2 = new JLabel("W");
		lblPlayedA2.setHorizontalAlignment(SwingConstants.CENTER);		lblWinsA2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayedA2.setFont(new Font("Tahoma", Font.BOLD, 12));			lblWinsA2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPlayedA2.setBounds(171, 163, 29, 14);						lblWinsA2.setBounds(204, 163, 29, 14);
		lblPlayedA2.setText(pA2); 										lblWinsA2.setText(wA2);
		contentPane.add(lblPlayedA2);									contentPane.add(lblWinsA2);
		
		JLabel lblDrawsA2 = new JLabel("D");							JLabel lblLostA2 = new JLabel("L");
		lblDrawsA2.setHorizontalAlignment(SwingConstants.CENTER);		lblLostA2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDrawsA2.setFont(new Font("Tahoma", Font.BOLD, 12));			lblLostA2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDrawsA2.setBounds(237, 163, 29, 14);							lblLostA2.setBounds(270, 163, 29, 14);
		lblDrawsA2.setText(dA2); 										lblLostA2.setText(lA2);
		contentPane.add(lblDrawsA2);									contentPane.add(lblLostA2);
		
		JLabel lblGFA2 = new JLabel("GF");								JLabel lblGAA2 = new JLabel("GA");
		lblGFA2.setHorizontalAlignment(SwingConstants.CENTER);			lblGAA2.setHorizontalAlignment(SwingConstants.CENTER);
		lblGFA2.setFont(new Font("Tahoma", Font.BOLD, 12));				lblGAA2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGFA2.setBounds(303, 163, 29, 14);							lblGAA2.setBounds(336, 163, 29, 14);
		lblGFA2.setText(gfA2); 											lblGAA2.setText(gaA2);
		contentPane.add(lblGFA2);										contentPane.add(lblGAA2);		
		
		JLabel lblGDA2 = new JLabel("GD");								JLabel lblPtsA2 = new JLabel("PTS");
		lblGDA2.setHorizontalAlignment(SwingConstants.CENTER);			lblPtsA2.setHorizontalAlignment(SwingConstants.CENTER);
		lblGDA2.setFont(new Font("Tahoma", Font.BOLD, 12));				lblPtsA2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGDA2.setBounds(369, 163, 29, 14);							lblPtsA2.setBounds(402, 163, 29, 14);
		lblGDA2.setText(gdA2); 											lblPtsA2.setText(ptsA2);
		contentPane.add(lblGDA2);										contentPane.add(lblPtsA2);
		
		//TEAM A1 STATISTIKA----------------------------------------------------------------------------------------------------
		JLabel lblPlayedA1 = new JLabel("P");							JLabel lblWinsA1 = new JLabel("W");
		lblPlayedA1.setHorizontalAlignment(SwingConstants.CENTER);		lblWinsA1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayedA1.setFont(new Font("Tahoma", Font.BOLD, 12));			lblWinsA1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPlayedA1.setBounds(171, 145, 29, 14);						lblWinsA1.setBounds(204, 145, 29, 14);
		lblPlayedA1.setText(pA1); 										lblWinsA1.setText(wA1);
		contentPane.add(lblPlayedA1);									contentPane.add(lblWinsA1);
		
		JLabel lblDrawsA1 = new JLabel("D");							JLabel lblLostA1 = new JLabel("L");
		lblDrawsA1.setHorizontalAlignment(SwingConstants.CENTER);		lblLostA1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDrawsA1.setFont(new Font("Tahoma", Font.BOLD, 12));			lblLostA1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDrawsA1.setBounds(237, 145, 29, 14);							lblLostA1.setBounds(270, 145, 29, 14);
		lblDrawsA1.setText(dA1); 										lblLostA1.setText(lA1);
		contentPane.add(lblDrawsA1);									contentPane.add(lblLostA1);
		
		JLabel lblGFA1 = new JLabel("GF");								JLabel lblGAA1 = new JLabel("GA");
		lblGFA1.setHorizontalAlignment(SwingConstants.CENTER);			lblGAA1.setHorizontalAlignment(SwingConstants.CENTER);
		lblGFA1.setFont(new Font("Tahoma", Font.BOLD, 12));				lblGAA1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGFA1.setBounds(303, 145, 29, 14);							lblGAA1.setBounds(336, 145, 29, 14);
		lblGFA1.setText(gfA1); 											lblGAA1.setText(gaA1);
		contentPane.add(lblGFA1);										contentPane.add(lblGAA1);
		
		JLabel lblGDA1 = new JLabel("GD");								JLabel lblPtsA1 = new JLabel("PTS");
		lblGDA1.setHorizontalAlignment(SwingConstants.CENTER);			lblPtsA1.setHorizontalAlignment(SwingConstants.CENTER);
		lblGDA1.setFont(new Font("Tahoma", Font.BOLD, 12));				lblPtsA1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGDA1.setBounds(369, 145, 29, 14);							lblPtsA1.setBounds(402, 145, 29, 14);
		lblGDA1.setText(gdA1);  										lblPtsA1.setText(ptsA1);
		contentPane.add(lblGDA1);										contentPane.add(lblPtsA1);
		
		//IME TURNIRA----------------------------------------------------------------------------------------------------------------
		JLabel lblTourName = new JLabel();
		lblTourName.setBounds(407, 11, 180, 25);
		lblTourName.setText(Creator.tourName.getText());
		lblTourName.setHorizontalAlignment(SwingConstants.CENTER);
		lblTourName.setFont(new Font("Times New Roman", Font.BOLD, 18));
		contentPane.add(lblTourName);
		
		JLabel lblTourPlace = new JLabel();
		lblTourPlace.setBounds(196, 36, 180, 25);
		lblTourPlace.setText(Creator.tourPlace.getText());
		lblTourPlace.setFont(new Font("Times New Roman", Font.BOLD, 15));
		contentPane.add(lblTourPlace);
		
		JLabel label_2 = new JLabel("Place of tournament:");
		label_2.setBounds(26, 36, 180, 25);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Date:");
		label_3.setBounds(692, 36, 48, 25);
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		contentPane.add(label_3);
		
		JLabel lblTourDate = new JLabel();
		lblTourDate.setBounds(740, 36, 180, 25);
		lblTourDate.setText(Creator.dateTour);
		lblTourDate.setFont(new Font("Times New Roman", Font.BOLD, 15));
		contentPane.add(lblTourDate);
		
		JLabel lblGroupA = new JLabel("Group A");
		lblGroupA.setBounds(141, 88, 180, 25);
		lblGroupA.setHorizontalAlignment(SwingConstants.CENTER);
		lblGroupA.setFont(new Font("Times New Roman", Font.BOLD, 15));
		contentPane.add(lblGroupA);
		
		JLabel lblGroupB = new JLabel("Group B");
		lblGroupB.setBounds(658, 88, 180, 25);
		lblGroupB.setHorizontalAlignment(SwingConstants.CENTER);
		lblGroupB.setFont(new Font("Times New Roman", Font.BOLD, 15));
		contentPane.add(lblGroupB);
		
		JLabel lblNewLabel = new JLabel("Fixtures");
		lblNewLabel.setBounds(26, 269, 352, 25);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("Fixtures");
		label.setBounds(579, 269, 352, 25);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label);
		
		//FORMATIRANJE JFORMATTEDFIELDa-----------------------------------------------------------------------------------------------------------------------------
		NumberFormat format = NumberFormat.getNumberInstance();
	    NumberFormatter formatter = new NumberFormatter(format);
	    formatter.setValueClass(Integer.class);
	    formatter.setAllowsInvalid(true);
	    formatter.setCommitsOnValidEdit(true);
	    
		  //TABELA A------------------------------------------------------------------------------------------------------------------------------------
		  JLabel lblPositionA = new JLabel("#");								JLabel lblTeamA = new JLabel("Team");
		  lblPositionA.setFont(new Font("Tahoma", Font.BOLD, 12));				lblTeamA.setHorizontalAlignment(SwingConstants.CENTER);
		  lblPositionA.setHorizontalAlignment(SwingConstants.CENTER);			lblTeamA.setFont(new Font("Tahoma", Font.BOLD, 12));
		  lblPositionA.setBounds(10, 117, 29, 14);								lblTeamA.setBounds(49, 117, 71, 14);
		  contentPane.add(lblPositionA);										contentPane.add(lblTeamA);
		  
		  JLabel lblPA = new JLabel("P");										JLabel lblWA = new JLabel("W");
		  lblPA.setHorizontalAlignment(SwingConstants.CENTER);					lblWA.setHorizontalAlignment(SwingConstants.CENTER);
		  lblPA.setFont(new Font("Tahoma", Font.BOLD, 12));						lblWA.setFont(new Font("Tahoma", Font.BOLD, 12));
		  lblPA.setBounds(172, 117, 29, 14);									lblWA.setBounds(205, 117, 29, 14);
		  contentPane.add(lblPA);												contentPane.add(lblWA);
		  
		  JLabel lblDA = new JLabel("D");										JLabel lblLA = new JLabel("L");
		  lblDA.setHorizontalAlignment(SwingConstants.CENTER);					lblLA.setHorizontalAlignment(SwingConstants.CENTER);
		  lblDA.setFont(new Font("Tahoma", Font.BOLD, 12));						lblLA.setFont(new Font("Tahoma", Font.BOLD, 12));
		  lblDA.setBounds(238, 117, 29, 14);									lblLA.setBounds(271, 117, 29, 14);
		  contentPane.add(lblDA);												contentPane.add(lblLA);
		  
		  JLabel lblGfA = new JLabel("GF");										JLabel lblGaA = new JLabel("GA");
		  lblGfA.setHorizontalAlignment(SwingConstants.CENTER);					lblGaA.setHorizontalAlignment(SwingConstants.CENTER);
		  lblGfA.setFont(new Font("Tahoma", Font.BOLD, 12));					lblGaA.setFont(new Font("Tahoma", Font.BOLD, 12));
		  lblGfA.setBounds(304, 117, 29, 14);									lblGaA.setBounds(337, 117, 29, 14);
		  contentPane.add(lblGfA);												contentPane.add(lblGaA);
		  
		  JLabel lblGdA = new JLabel("GD");										JLabel lblPtsA = new JLabel("PTS");
		  lblGdA.setHorizontalAlignment(SwingConstants.CENTER);					lblPtsA.setHorizontalAlignment(SwingConstants.CENTER);
		  lblGdA.setFont(new Font("Tahoma", Font.BOLD, 12));					lblPtsA.setFont(new Font("Tahoma", Font.BOLD, 12));
		  lblGdA.setBounds(370, 117, 29, 14);									lblPtsA.setBounds(403, 117, 29, 14);
		  contentPane.add(lblGdA);												contentPane.add(lblPtsA);
		  
		  JLabel lblPosition1GrpA = new JLabel("1");							JLabel lblPosition2GrpA = new JLabel("2");
		  lblPosition1GrpA.setOpaque(true);										lblPosition2GrpA.setOpaque(true);
		  lblPosition1GrpA.setForeground(new Color(0, 0, 0));					lblPosition2GrpA.setHorizontalAlignment(SwingConstants.LEFT);
		  lblPosition1GrpA.setBackground(new Color(0, 204, 102));				lblPosition2GrpA.setForeground(Color.BLACK);
		  lblPosition1GrpA.setFont(new Font("Tahoma", Font.BOLD, 12));			lblPosition2GrpA.setFont(new Font("Tahoma", Font.BOLD, 12));
		  lblPosition1GrpA.setHorizontalAlignment(SwingConstants.LEFT);			lblPosition2GrpA.setBackground(new Color(0, 204, 102));
		  lblPosition1GrpA.setBounds(20, 142, 412, 20);							lblPosition2GrpA.setBounds(20, 160, 412, 20);
		  contentPane.add(lblPosition1GrpA);									contentPane.add(lblPosition2GrpA);
		  
		  JLabel lblPosition3GrpA = new JLabel("3");
		  lblPosition3GrpA.setOpaque(true);
		  lblPosition3GrpA.setHorizontalAlignment(SwingConstants.LEFT);
		  lblPosition3GrpA.setForeground(Color.BLACK);
		  lblPosition3GrpA.setFont(new Font("Tahoma", Font.BOLD, 12));
		  lblPosition3GrpA.setBackground(Color.WHITE);
		  lblPosition3GrpA.setBounds(20, 178, 412, 20);
		  contentPane.add(lblPosition3GrpA);
		  
		  //REZULTATI A-----------------------------------------------------------------------------------------------------------------
		  JFormattedTextField resultA1G1 = new JFormattedTextField(formatter);  JFormattedTextField resultA1G2 = new JFormattedTextField(formatter);
	      resultA1G1.setHorizontalAlignment(SwingConstants.CENTER);             resultA1G2.setHorizontalAlignment(SwingConstants.CENTER);
  	  	  resultA1G1.setBounds(172, 302, 23, 17);								resultA1G2.setBounds(205, 330, 23, 17);
  	  	  contentPane.add(resultA1G1);											contentPane.add(resultA1G2);
  	  	    	  	  
		  JFormattedTextField resultA2G1 = new JFormattedTextField(formatter);	JFormattedTextField resultA2G2 = new JFormattedTextField(formatter);
		  resultA2G1.setHorizontalAlignment(SwingConstants.CENTER);				resultA2G2.setHorizontalAlignment(SwingConstants.CENTER);
		  resultA2G1.setBounds(205, 302, 23, 17);								resultA2G2.setBounds(172, 358, 23, 17);
		  contentPane.add(resultA2G1);											contentPane.add(resultA2G2);
		  		  
		  JFormattedTextField resultA3G1 = new JFormattedTextField(formatter);	JFormattedTextField resultA3G2 = new JFormattedTextField(formatter);
		  resultA3G1.setHorizontalAlignment(SwingConstants.CENTER);				resultA3G2.setHorizontalAlignment(SwingConstants.CENTER);
		  resultA3G1.setBounds(172, 330, 23, 17);								resultA3G2.setBounds(205, 358, 23, 17);
		  contentPane.add(resultA3G1);											contentPane.add(resultA3G2);
		  
	        JLabel lblTeamA1G1 = new JLabel("New label"); 				JLabel lblTeamA1G2 = new JLabel("New label");
	        lblTeamA1G1.setHorizontalAlignment(SwingConstants.CENTER);	lblTeamA1G2.setHorizontalAlignment(SwingConstants.CENTER);
	        lblTeamA1G1.setBounds(26, 302, 118, 14);      				lblTeamA1G2.setBounds(250, 330, 118, 14);
	        lblTeamA1G1.setText(teamA1);  				  				lblTeamA1G2.setText(teamA1);
	        contentPane.add(lblTeamA1G1); 				  				contentPane.add(lblTeamA1G2);
	        
	        JLabel lblTeamA2G1 = new JLabel("New label"); 				JLabel lblTeamA2G2 = new JLabel("New label");
	        lblTeamA2G1.setHorizontalAlignment(SwingConstants.CENTER);	lblTeamA2G2.setHorizontalAlignment(SwingConstants.CENTER);
	        lblTeamA2G1.setBounds(250, 302, 118, 14);     				lblTeamA2G2.setBounds(26, 358, 118, 14);
	        lblTeamA2G1.setText(teamA2);				  				lblTeamA2G2.setText(teamA2);
	        contentPane.add(lblTeamA2G1);                				contentPane.add(lblTeamA2G2);
	        	        
	        JLabel lblTeamA3G1 = new JLabel("New label"); 				JLabel lblTeamA3G2 = new JLabel("New label");
	        lblTeamA3G1.setHorizontalAlignment(SwingConstants.CENTER);	lblTeamA3G2.setHorizontalAlignment(SwingConstants.CENTER);
	        lblTeamA3G1.setBounds(26, 330, 118, 14);      				lblTeamA3G2.setBounds(250, 358, 118, 14);
	        lblTeamA3G1.setText(teamA3);  				  				lblTeamA3G2.setText(teamA3);
	        contentPane.add(lblTeamA3G1);                 				contentPane.add(lblTeamA3G2);
	        
	          JButton btnGrpAG1 = new JButton("AddResult");				
	          btnGrpAG1.addActionListener(new ActionListener() {
	          	public void actionPerformed(ActionEvent e) {
	          		gfA1G1=Integer.parseInt(resultA1G1.getText());
	          		gfA2G1=Integer.parseInt(resultA2G1.getText());
	          		gfA1=String.valueOf(gfA1G1);
	          		gfA2=String.valueOf(gfA2G1);
	          		int gdA1G1=gfA1G1-gfA2G1;
	          		int gdA2G1=gfA2G1-gfA1G1;
	          		lblGFA1.setText(gfA1);
	          		lblGFA2.setText(gfA2);
	          		lblGAA1.setText(gfA2);
	          		lblGAA2.setText(gfA1);
	          		gdA1=String.valueOf(gdA1G1);
	          		gdA2=String.valueOf(gdA2G1);
	          		lblGDA1.setText(gdA1);
	          		lblGDA2.setText(gdA2);
	          			          		
	          		if(gfA1G1>gfA2G1) {
	          			wA1G1=1; dA1G1=0; lA1G1=0; upA1=wA1G1+dA1G1+lA1G1; ptsuA1=3*wA1G1+dA1G1;
	          			wA2G1=0; dA2G1=0; lA2G1=1; upA2=wA2G1+dA2G1+lA2G1; ptsuA2=3*wA2G1+dA2G1;
	          			
	          			wA1=String.valueOf(wA1G1); dA1=String.valueOf(dA1G1); lA1=String.valueOf(lA1G1); pA1=String.valueOf(upA1); ptsA1=String.valueOf(ptsuA1);
	          			lblWinsA1.setText(wA1);    lblDrawsA1.setText(dA1);   lblLostA1.setText(lA1);    lblPlayedA1.setText(pA1); lblPtsA1.setText(ptsA1);
	          			
	          			wA2=String.valueOf(wA2G1); dA2=String.valueOf(dA2G1); lA2=String.valueOf(lA2G1); pA2=String.valueOf(upA2); ptsA2=String.valueOf(ptsuA2);
	          			lblWinsA2.setText(wA2);    lblDrawsA2.setText(dA2);   lblLostA2.setText(lA2);    lblPlayedA2.setText(pA2); lblPtsA2.setText(ptsA2);
	          			
	          		}
	          		else if(gfA1G1<gfA2G1) {
	          			wA2G1=1; dA2G1=0; lA2G1=0; upA1=wA1G1+dA1G1+lA1G1; ptsuA1=3*wA1G1+dA1G1; 
	          			wA1G1=0; dA1G1=0; lA1G1=1; upA2=wA2G1+dA2G1+lA2G1; ptsuA2=3*wA2G1+dA2G1;
	          			
	          			wA2=String.valueOf(wA2G1); dA2=String.valueOf(dA2G1); lA2=String.valueOf(lA2G1); pA1=String.valueOf(upA1); ptsA1=String.valueOf(ptsuA1);
	          			lblWinsA2.setText(wA2);    lblDrawsA2.setText(dA2);   lblLostA2.setText(lA2);    lblPlayedA1.setText(pA1); lblPtsA1.setText(ptsA1);
	          			
	          			wA1=String.valueOf(wA1G1); dA1=String.valueOf(dA1G1); lA1=String.valueOf(lA1G1); pA2=String.valueOf(upA2); ptsA2=String.valueOf(ptsuA2);
	          			lblWinsA1.setText(wA1);    lblDrawsA1.setText(dA1);   lblLostA1.setText(lA1);    lblPlayedA2.setText(pA2); lblPtsA2.setText(ptsA2);
	          			
	          		}
	          		else if(gfA1G1==gfA2G1) {
	          			dA1G1=1; wA1G1=0; lA1G1=0; upA1=wA1G1+dA1G1+lA1G1; ptsuA1=3*wA1G1+dA1G1;
	          			dA2G1=1; wA2G1=0; lA2G1=0; upA2=wA2G1+dA2G1+lA2G1; ptsuA2=3*wA2G1+dA2G1;
	          			
	          			wA1=String.valueOf(wA1G1); dA1=String.valueOf(dA1G1); lA1=String.valueOf(lA1G1); pA1=String.valueOf(upA1); ptsA1=String.valueOf(ptsuA1);
	          			lblWinsA1.setText(wA1);    lblDrawsA1.setText(dA1);   lblLostA1.setText(lA1);    lblPlayedA1.setText(pA1); lblPtsA1.setText(ptsA1);
	          			
	          			wA2=String.valueOf(wA2G1); dA2=String.valueOf(dA2G1); lA2=String.valueOf(lA2G1); pA2=String.valueOf(upA2); ptsA2=String.valueOf(ptsuA2);
	          			lblWinsA2.setText(wA2);    lblDrawsA2.setText(dA2);   lblLostA2.setText(lA2);    lblPlayedA2.setText(pA2); lblPtsA2.setText(ptsA2);
	          			
	          		}
	          		btnGrpAG1.setEnabled(false);
	          		resultA1G1.setEditable(false);
	          		resultA2G1.setEditable(false);
	          	}
	          });
	          btnGrpAG1.setBounds(378, 302, 89, 17);
	          btnGrpAG1.setFont(new Font("Tahoma", Font.BOLD, 10));
	          contentPane.add(btnGrpAG1);
	          
	          JButton btnGrpAG2 = new JButton("AddResult");
	          btnGrpAG2.addActionListener(new ActionListener() {
	        	  public void actionPerformed(ActionEvent e) {
	        		    gfA1G2=Integer.parseInt(resultA1G2.getText());
		          		gfA3G1=Integer.parseInt(resultA3G1.getText());
		          		int ugfA1=gfA1G1+gfA1G2;
		          		int ugdA1=ugfA1-gfA3G1;
		          		int ugaA1=gfA2G1+gfA3G1;
		          		int gdA3G1=gfA3G1-gfA1G2;
		          		gfA1=String.valueOf(ugfA1);
		          		gaA1=String.valueOf(ugaA1);
		          		gdA1=String.valueOf(ugdA1);
		          		gfA3=String.valueOf(gfA3G1);
		          		gaA3=String.valueOf(gfA1G2);
		          		gdA3=String.valueOf(gdA3G1);
		          		lblGFA1.setText(gfA1);
		          		lblGAA1.setText(gaA1);
		          		lblGDA1.setText(gdA1);
		          		lblGFA3.setText(gfA3);
		          		lblGAA3.setText(gaA3);
		          		lblGDA3.setText(gdA3);
		          				          			          		
		          		if(gfA1G2>gfA3G1) {
		          			wA1G2=1; dA1G2=0; lA1G2=0; uwA1=wA1G1+wA1G2; udA1=dA1G1+dA1G2; ulA1=lA1G1+lA1G2; upA1=uwA1+udA1+ulA1; ptsuA1=3*uwA1+udA1;
		          			wA3G1=0; dA3G1=0; lA3G1=1; upA3=wA3G1+dA3G1+lA3G1; ptsuA3=3*wA3G1+dA3G1;
		          			
		          			wA1=String.valueOf(uwA1); dA1=String.valueOf(udA1); lA1=String.valueOf(ulA1); pA1=String.valueOf(upA1); ptsA1=String.valueOf(ptsuA1);
		          			lblWinsA1.setText(wA1);   lblDrawsA1.setText(dA1);  lblLostA1.setText(lA1);   lblPlayedA1.setText(pA1); lblPtsA1.setText(ptsA1);
		          			
		          			wA3=String.valueOf(wA3G1); dA3=String.valueOf(dA3G1); lA3=String.valueOf(lA3G1); pA3=String.valueOf(upA3); ptsA3=String.valueOf(ptsuA3);
		          			lblWinsA3.setText(wA3);    lblDrawsA3.setText(dA3);   lblLostA3.setText(lA3);    lblPlayedA3.setText(pA3); lblPtsA3.setText(ptsA3);
		          			
		          		}
		          		else if(gfA1G2<gfA3G1) {
		          			wA3G1=1; dA3G1=0; lA3G1=0; upA3=wA3G1+dA3G1+lA3G1; ptsuA3=3*wA3G1+dA3G1;
		          			wA1G2=0; dA1G2=0; lA1G2=1; uwA1=wA1G1+wA1G2; udA1=dA1G1+dA1G2; ulA1=lA1G1+lA1G2; upA1=uwA1+udA1+ulA1; ptsuA1=3*uwA1+udA1; 
		          			
		          			wA1=String.valueOf(uwA1); dA1=String.valueOf(udA1); lA1=String.valueOf(ulA1); pA1=String.valueOf(upA1); ptsA1=String.valueOf(ptsuA1);
		          			lblWinsA1.setText(wA1);   lblDrawsA1.setText(dA1);  lblLostA1.setText(lA1);   lblPlayedA1.setText(pA1); lblPtsA1.setText(ptsA1);
		          			
		          			wA3=String.valueOf(wA3G1); dA3=String.valueOf(dA3G1); lA3=String.valueOf(lA3G1); pA3=String.valueOf(upA3); ptsA3=String.valueOf(ptsuA3);
		          			lblWinsA3.setText(wA3);    lblDrawsA3.setText(dA3);   lblLostA3.setText(lA3);    lblPlayedA3.setText(pA3); lblPtsA3.setText(ptsA3);
		          			
		          		}
		          		else if(gfA1G2==gfA3G1) {
		          			dA1G2=1; wA1G2=0; lA1G2=0; uwA1=wA1G1+wA1G2; udA1=dA1G1+dA1G2; ulA1=lA1G1+lA1G2; upA1=uwA1+udA1+ulA1; ptsuA1=3*uwA1+udA1;
		          			dA3G1=1; wA3G1=0; lA3G1=0; upA3=wA3G1+dA3G1+lA3G1; ptsuA3=3*wA3G1+dA3G1;
		          			
		          			wA1=String.valueOf(uwA1); dA1=String.valueOf(udA1); lA1=String.valueOf(ulA1); pA1=String.valueOf(upA1); ptsA1=String.valueOf(ptsuA1);
		          			lblWinsA1.setText(wA1);   lblDrawsA1.setText(dA1);  lblLostA1.setText(lA1);   lblPlayedA1.setText(pA1); lblPtsA1.setText(ptsA1);
		          			
		          			wA3=String.valueOf(wA3G1); dA3=String.valueOf(dA3G1); lA3=String.valueOf(lA3G1); pA3=String.valueOf(upA3); ptsA3=String.valueOf(ptsuA3);
		          			lblWinsA3.setText(wA3);    lblDrawsA3.setText(dA3);   lblLostA3.setText(lA3);    lblPlayedA3.setText(pA3); lblPtsA3.setText(ptsA3);
		          		}
		          		btnGrpAG2.setEnabled(false);
		          		resultA1G2.setEditable(false);
		          		resultA3G1.setEditable(false);
	        	  }
	          });
	          btnGrpAG2.setFont(new Font("Tahoma", Font.BOLD, 10));
			  btnGrpAG2.setBounds(378, 330, 89, 17);
			  contentPane.add(btnGrpAG2);
			  
			  JButton btnGrpAG3 = new JButton("AddResult");
			  btnGrpAG3.addActionListener(new ActionListener() {
			  	public void actionPerformed(ActionEvent e) {
			  		gfA2G2=Integer.parseInt(resultA2G2.getText());
	          		gfA3G2=Integer.parseInt(resultA3G2.getText());
	          		int ugfA2=gfA2G1+gfA2G2;
	          		int ugaA2=gfA1G1+gfA3G2;
	          		int ugdA2=ugfA2-ugaA2;
	          		int ugfA3=gfA3G1+gfA3G2;
	          		int ugaA3=gfA2G2+gfA1G2;
	          		int ugdA3=ugfA3-ugaA3;
	          		gfA2=String.valueOf(ugfA2);
	          		gaA2=String.valueOf(ugaA2);
	          		gdA2=String.valueOf(ugdA2);
	          		gfA3=String.valueOf(ugfA3);
	          		gaA3=String.valueOf(ugaA3);
	          		gdA3=String.valueOf(ugdA3);
	          		lblGFA2.setText(gfA2);
	          		lblGAA2.setText(gaA2);
	          		lblGDA2.setText(gdA2);
	          		lblGFA3.setText(gfA3);
	          		lblGAA3.setText(gaA3);
	          		lblGDA3.setText(gdA3);
	          		
	          		if(gfA2G2>gfA3G2) {
	          			wA2G2=1; dA2G2=0; lA2G2=0; uwA2=wA2G1+wA2G2; udA2=dA2G1+dA2G2; ulA2=lA2G1+lA2G2; upA2=uwA2+udA2+ulA2; ptsuA2=3*uwA2+udA2;
	          			wA3G2=0; dA3G2=0; lA3G2=1; uwA3=wA3G1+wA3G2; udA3=dA3G1+dA3G2; ulA3=lA3G1+lA3G2; upA3=uwA3+udA3+ulA3; ptsuA3=3*uwA3+udA3;
	          			
	          			wA2=String.valueOf(uwA2); dA2=String.valueOf(udA2); lA2=String.valueOf(ulA2); pA2=String.valueOf(upA2); ptsA2=String.valueOf(ptsuA2);
	          			lblWinsA2.setText(wA2);   lblDrawsA2.setText(dA2);  lblLostA2.setText(lA2);   lblPlayedA2.setText(pA2); lblPtsA2.setText(ptsA2);
	          			
	          			wA3=String.valueOf(uwA3); dA3=String.valueOf(udA3); lA3=String.valueOf(ulA3); pA3=String.valueOf(upA3); ptsA3=String.valueOf(ptsuA3);
	          			lblWinsA3.setText(wA3);    lblDrawsA3.setText(dA3);   lblLostA3.setText(lA3);    lblPlayedA3.setText(pA3); lblPtsA3.setText(ptsA3);
	          			
	          		}
	          		else if(gfA2G2<gfA3G2) {
	          			wA2G2=0; dA2G2=0; lA2G2=1; uwA2=wA2G1+wA2G2; udA2=dA2G1+dA2G2; ulA2=lA2G1+lA2G2; upA2=uwA2+udA2+ulA2; ptsuA2=3*uwA2+udA2;
	          			wA3G2=1; dA3G2=0; lA3G2=0; uwA3=wA3G1+wA3G2; udA3=dA3G1+dA3G2; ulA3=lA3G1+lA3G2; upA3=uwA3+udA3+ulA3; ptsuA3=3*uwA3+udA3;
	          			
	          			wA2=String.valueOf(uwA2); dA2=String.valueOf(udA2); lA2=String.valueOf(ulA2); pA2=String.valueOf(upA2); ptsA2=String.valueOf(ptsuA2);
	          			lblWinsA2.setText(wA2);   lblDrawsA2.setText(dA2);  lblLostA2.setText(lA2);   lblPlayedA2.setText(pA2); lblPtsA2.setText(ptsA2);
	          			
	          			wA3=String.valueOf(uwA3); dA3=String.valueOf(udA3); lA3=String.valueOf(ulA3); pA3=String.valueOf(upA3); ptsA3=String.valueOf(ptsuA3);
	          			lblWinsA3.setText(wA3);    lblDrawsA3.setText(dA3);   lblLostA3.setText(lA3);    lblPlayedA3.setText(pA3); lblPtsA3.setText(ptsA3);
	          			
	          		}
	          		else if(gfA2G2==gfA3G2) {
	          			dA2G2=1; wA2G2=0; lA2G2=0; uwA2=wA2G1+wA2G2; udA2=dA2G1+dA2G2; ulA2=lA2G1+lA2G2; upA2=uwA2+udA2+ulA2; ptsuA2=3*uwA2+udA2;
	          			dA3G2=1; wA3G2=0; lA3G2=0; uwA3=wA3G1+wA3G2; udA3=dA3G1+dA3G2; ulA3=lA3G1+lA3G2; upA3=uwA3+udA3+ulA3; ptsuA3=3*uwA3+udA3;
	          			
	          			wA2=String.valueOf(uwA2); dA2=String.valueOf(udA2); lA2=String.valueOf(ulA2); pA2=String.valueOf(upA2); ptsA2=String.valueOf(ptsuA2);
	          			lblWinsA2.setText(wA2);   lblDrawsA2.setText(dA2);  lblLostA2.setText(lA2);   lblPlayedA2.setText(pA2); lblPtsA2.setText(ptsA2);
	          			
	          			wA3=String.valueOf(uwA3); dA3=String.valueOf(udA3); lA3=String.valueOf(ulA3); pA3=String.valueOf(upA3); ptsA3=String.valueOf(ptsuA3);
	          			lblWinsA3.setText(wA3);    lblDrawsA3.setText(dA3);   lblLostA3.setText(lA3);    lblPlayedA3.setText(pA3); lblPtsA3.setText(ptsA3);
	          		}
	          		btnGrpAG3.setEnabled(false);
	          		resultA2G2.setEditable(false);
	          		resultA3G2.setEditable(false);
			  	}
			  });
			  btnGrpAG3.setFont(new Font("Tahoma", Font.BOLD, 10));
			  btnGrpAG3.setBounds(378, 358, 89, 17);
			  contentPane.add(btnGrpAG3);
			  
			  
			  JFormattedTextField resultA2G3 = new JFormattedTextField(formatter);		JFormattedTextField resultA2G4 = new JFormattedTextField(formatter);
			  resultA2G3.setHorizontalAlignment(SwingConstants.CENTER);					resultA2G4.setHorizontalAlignment(SwingConstants.CENTER);
			  resultA2G3.setBounds(172, 386, 23, 17);									resultA2G4.setBounds(205, 442, 23, 17);
			  contentPane.add(resultA2G3);												contentPane.add(resultA2G4);
			  if(Creator.rdbtnNo.isSelected()) { resultA2G3.setVisible(false); }        if(Creator.rdbtnNo.isSelected()) { resultA2G4.setVisible(false);}
			
			  JFormattedTextField resultA3G3 = new JFormattedTextField(formatter);		JFormattedTextField resultA3G4 = new JFormattedTextField(formatter);
			  resultA3G3.setHorizontalAlignment(SwingConstants.CENTER);					resultA3G4.setHorizontalAlignment(SwingConstants.CENTER);
			  resultA3G3.setBounds(205, 414, 23, 17);									resultA3G4.setBounds(172, 442, 23, 17);
			  contentPane.add(resultA3G3);												contentPane.add(resultA3G4);
			  if(Creator.rdbtnNo.isSelected()) { resultA3G3.setVisible(false); }        if(Creator.rdbtnNo.isSelected()) { resultA3G4.setVisible(false);}
			  
			  JFormattedTextField resultA1G3 = new JFormattedTextField(formatter);		JFormattedTextField resultA1G4 = new JFormattedTextField(formatter);
			  resultA1G3.setHorizontalAlignment(SwingConstants.CENTER);					resultA1G4.setHorizontalAlignment(SwingConstants.CENTER);
			  resultA1G3.setBounds(205, 386, 23, 17);									resultA1G4.setBounds(172, 414, 23, 17);
			  contentPane.add(resultA1G3);												contentPane.add(resultA1G4);
			  if(Creator.rdbtnNo.isSelected()) { resultA1G3.setVisible(false); }        if(Creator.rdbtnNo.isSelected()) { resultA1G4.setVisible(false);}
			  
			  JLabel lblTeamA2G3 = new JLabel((String) null);							JLabel lblTeamA2G4 = new JLabel((String) null);
			  lblTeamA2G3.setHorizontalAlignment(SwingConstants.CENTER);				lblTeamA2G4.setHorizontalAlignment(SwingConstants.CENTER);
			  lblTeamA2G3.setBounds(26, 386, 118, 14);									lblTeamA2G4.setBounds(250, 442, 118, 14);
			  lblTeamA2G3.setText(teamA2);												lblTeamA2G4.setText(teamA2);
			  contentPane.add(lblTeamA2G3);												contentPane.add(lblTeamA2G4);
			  if(Creator.rdbtnNo.isSelected()) { lblTeamA2G3.setVisible(false); }       if(Creator.rdbtnNo.isSelected()) { lblTeamA2G4.setVisible(false);}
			  
			  JLabel lblTeamA3G3 = new JLabel((String) null);							JLabel lblTeamA3G4 = new JLabel((String) null);
			  lblTeamA3G3.setHorizontalAlignment(SwingConstants.CENTER);				lblTeamA3G4.setHorizontalAlignment(SwingConstants.CENTER);
			  lblTeamA3G3.setBounds(250, 414, 118, 14);									lblTeamA3G4.setBounds(26, 442, 118, 14);
			  lblTeamA3G3.setText(teamA3);												lblTeamA3G4.setText(teamA3);
			  contentPane.add(lblTeamA3G3);												contentPane.add(lblTeamA3G4);
			  if(Creator.rdbtnNo.isSelected()) { lblTeamA3G3.setVisible(false); }       if(Creator.rdbtnNo.isSelected()) { lblTeamA3G4.setVisible(false);}
			  
			  JLabel lblTeamA1G3 = new JLabel((String) null);							JLabel lblTeamA1G4 = new JLabel((String) null);
			  lblTeamA1G3.setHorizontalAlignment(SwingConstants.CENTER);				lblTeamA1G4.setHorizontalAlignment(SwingConstants.CENTER);
			  lblTeamA1G3.setBounds(250, 386, 118, 14);									lblTeamA1G4.setBounds(26, 414, 118, 14);
			  lblTeamA1G3.setText(teamA1); 												lblTeamA1G4.setText(teamA1);
			  contentPane.add(lblTeamA1G3);												contentPane.add(lblTeamA1G4);
			  if(Creator.rdbtnNo.isSelected()) { lblTeamA1G3.setVisible(false); }       if(Creator.rdbtnNo.isSelected()) { lblTeamA1G4.setVisible(false);}
			  
			  btnGrpAG4.addActionListener(new ActionListener() {
		          	public void actionPerformed(ActionEvent e) {
		          		gfA1G3=Integer.parseInt(resultA1G3.getText());
		          		gfA2G3=Integer.parseInt(resultA2G3.getText());
		          		int ugfA1=gfA1G1+gfA1G2+gfA1G3;
		          		int ugaA1=gfA2G1+gfA3G1+gfA2G3;
		          		int ugdA1=ugfA1-ugaA1;
		          		int ugfA2=gfA2G1+gfA2G2+gfA2G3;
		          		int ugaA2=gfA1G1+gfA3G2+gfA1G3;
		          		int ugdA2=ugfA2-ugaA2;
		          		gfA1=String.valueOf(ugfA1);
		          		gfA2=String.valueOf(ugfA2);
		          		gaA1=String.valueOf(ugaA1);
		          		gaA2=String.valueOf(ugaA2);
		          		lblGFA1.setText(gfA1);
		          		lblGFA2.setText(gfA2);
		          		lblGAA1.setText(gaA1);
		          		lblGAA2.setText(gaA2);
		          		gdA1=String.valueOf(ugdA1);
		          		gdA2=String.valueOf(ugdA2);
		          		lblGDA1.setText(gdA1);
		          		lblGDA2.setText(gdA2);
		          			          		
		          		if(gfA1G3>gfA2G3) {
		          			wA1G3=1; dA1G3=0; lA1G3=0; uwA1=wA1G1+wA1G2+wA1G3; udA1=dA1G1+dA1G2+dA1G3; ulA1=lA1G1+lA1G2+lA1G3; upA1=uwA1+udA1+ulA1; ptsuA1=3*uwA1+udA1;
		          			wA2G3=0; dA2G3=0; lA2G3=1; uwA2=wA2G1+wA2G2+wA2G3; udA2=dA2G1+dA2G2+dA2G3; ulA2=lA2G1+lA2G2+lA2G3; upA2=uwA2+udA2+ulA2; ptsuA2=3*uwA2+udA2;
		          			
		          			wA1=String.valueOf(uwA1); dA1=String.valueOf(udA1); lA1=String.valueOf(ulA1); pA1=String.valueOf(upA1); ptsA1=String.valueOf(ptsuA1);
		          			lblWinsA1.setText(wA1);    lblDrawsA1.setText(dA1);   lblLostA1.setText(lA1);    lblPlayedA1.setText(pA1); lblPtsA1.setText(ptsA1);
		          			
		          			wA2=String.valueOf(uwA2); dA2=String.valueOf(udA2); lA2=String.valueOf(ulA2); pA2=String.valueOf(upA2); ptsA2=String.valueOf(ptsuA2);
		          			lblWinsA2.setText(wA2);    lblDrawsA2.setText(dA2);   lblLostA2.setText(lA2);    lblPlayedA2.setText(pA2); lblPtsA2.setText(ptsA2);
		          			
		          		}
		          		else if(gfA1G3<gfA2G3) {
		          			wA2G3=1; dA2G3=0; lA2G3=0; uwA2=wA2G1+wA2G2+wA2G3; udA2=dA2G1+dA2G2+dA2G3; ulA2=lA2G1+lA2G2+lA2G3; upA2=uwA2+udA2+ulA2; ptsuA2=3*uwA2+udA2; 
		          			wA1G3=0; dA1G3=0; lA1G3=1; uwA1=wA1G1+wA1G2+wA1G3; udA1=dA1G1+dA1G2+dA1G3; ulA1=lA1G1+lA1G2+lA1G3; upA1=uwA1+udA1+ulA1; ptsuA1=3*uwA1+udA1;
		          			
		          			wA1=String.valueOf(uwA1); dA1=String.valueOf(udA1); lA1=String.valueOf(ulA1); pA1=String.valueOf(upA1); ptsA1=String.valueOf(ptsuA1);
		          			lblWinsA1.setText(wA1);    lblDrawsA1.setText(dA1);   lblLostA1.setText(lA1);    lblPlayedA1.setText(pA1); lblPtsA1.setText(ptsA1);
		          			
		          			wA2=String.valueOf(uwA2); dA2=String.valueOf(udA2); lA2=String.valueOf(ulA2); pA2=String.valueOf(upA2); ptsA2=String.valueOf(ptsuA2);
		          			lblWinsA2.setText(wA2);    lblDrawsA2.setText(dA2);   lblLostA2.setText(lA2);    lblPlayedA2.setText(pA2); lblPtsA2.setText(ptsA2);
		          			
		          		}
		          		else if(gfA1G3==gfA2G3) {
		          			dA1G3=1; wA1G3=0; lA1G3=0; uwA1=wA1G1+wA1G2+wA1G3; udA1=dA1G1+dA1G2+dA1G3; ulA1=lA1G1+lA1G2+lA1G3; upA1=uwA1+udA1+ulA1; ptsuA1=3*uwA1+udA1;
		          			dA2G3=1; wA2G3=0; lA2G3=0; uwA2=wA2G1+wA2G2+wA2G3; udA2=dA2G1+dA2G2+dA2G3; ulA2=lA2G1+lA2G2+lA2G3; upA2=uwA2+udA2+ulA2; ptsuA2=3*uwA2+udA2;
		          			
		          			wA1=String.valueOf(uwA1); dA1=String.valueOf(udA1); lA1=String.valueOf(ulA1); pA1=String.valueOf(upA1); ptsA1=String.valueOf(ptsuA1);
		          			lblWinsA1.setText(wA1);    lblDrawsA1.setText(dA1);   lblLostA1.setText(lA1);    lblPlayedA1.setText(pA1); lblPtsA1.setText(ptsA1);
		          			
		          			wA2=String.valueOf(uwA2); dA2=String.valueOf(udA2); lA2=String.valueOf(ulA2); pA2=String.valueOf(upA2); ptsA2=String.valueOf(ptsuA2);
		          			lblWinsA2.setText(wA2);    lblDrawsA2.setText(dA2);   lblLostA2.setText(lA2);    lblPlayedA2.setText(pA2); lblPtsA2.setText(ptsA2);
		          			
		          		}
		          		btnGrpAG4.setEnabled(false);
		          		resultA1G3.setEditable(false);
		          		resultA2G3.setEditable(false);
		          	}
		          });
			  btnGrpAG4.setFont(new Font("Tahoma", Font.BOLD, 10));		
			  btnGrpAG4.setBounds(378, 386, 89, 17);
			  contentPane.add(btnGrpAG4);
			  
			  btnGrpAG5.addActionListener(new ActionListener() {
		          	public void actionPerformed(ActionEvent e) {
		          		gfA1G4=Integer.parseInt(resultA1G4.getText());
		          		gfA3G3=Integer.parseInt(resultA3G3.getText());
		          		int ugfA1=gfA1G1+gfA1G2+gfA1G3+gfA1G4;
		          		int ugaA1=gfA2G1+gfA3G1+gfA2G3+gfA3G3;
		          		int ugdA1=ugfA1-ugaA1;
		          		int ugfA3=gfA3G1+gfA3G2+gfA3G3;
		          		int ugaA3=gfA1G2+gfA2G2+gfA1G4;
		          		int ugdA3=ugfA3-ugaA3;
		          		gfA1=String.valueOf(ugfA1);
		          		gfA3=String.valueOf(ugfA3);
		          		gaA1=String.valueOf(ugaA1);
		          		gaA3=String.valueOf(ugaA3);
		          		lblGFA1.setText(gfA1);
		          		lblGFA3.setText(gfA3);
		          		lblGAA1.setText(gaA1);
		          		lblGAA3.setText(gaA3);
		          		gdA1=String.valueOf(ugdA1);
		          		gdA3=String.valueOf(ugdA3);
		          		lblGDA1.setText(gdA1);
		          		lblGDA3.setText(gdA3);
		          			          		
		          		if(gfA1G4>gfA3G3) {
		          			wA1G4=1; dA1G4=0; lA1G4=0; uwA1=wA1G1+wA1G2+wA1G3+wA1G4; udA1=dA1G1+dA1G2+dA1G3+dA1G4; ulA1=lA1G1+lA1G2+lA1G3+lA1G4; upA1=uwA1+udA1+ulA1; ptsuA1=3*uwA1+udA1;
		          			wA3G3=0; dA3G3=0; lA3G3=1; uwA3=wA3G1+wA3G2+wA3G3; udA3=dA3G1+dA3G2+dA3G3; ulA3=lA3G1+lA3G2+lA3G3; upA3=uwA3+udA3+ulA3; ptsuA3=3*uwA3+udA3;
		          			
		          			wA1=String.valueOf(uwA1); dA1=String.valueOf(udA1); lA1=String.valueOf(ulA1); pA1=String.valueOf(upA1); ptsA1=String.valueOf(ptsuA1);
		          			lblWinsA1.setText(wA1);    lblDrawsA1.setText(dA1);   lblLostA1.setText(lA1);    lblPlayedA1.setText(pA1); lblPtsA1.setText(ptsA1);
		          			
		          			wA3=String.valueOf(uwA3); dA3=String.valueOf(udA3); lA3=String.valueOf(ulA3); pA3=String.valueOf(upA3); ptsA3=String.valueOf(ptsuA3);
		          			lblWinsA3.setText(wA3);    lblDrawsA3.setText(dA3);   lblLostA3.setText(lA3);    lblPlayedA3.setText(pA3); lblPtsA3.setText(ptsA3);
		          			
		          		}
		          		else if(gfA1G4<gfA3G3) {
		          			wA3G3=1; dA3G3=0; lA3G3=0; uwA3=wA3G1+wA3G2+wA3G3; udA3=dA3G1+dA3G2+dA3G3; ulA3=lA3G1+lA3G2+lA3G3; upA3=uwA3+udA3+ulA3; ptsuA3=3*uwA3+udA3; 
		          			wA1G4=0; dA1G4=0; lA1G4=1; uwA1=wA1G1+wA1G2+wA1G3+wA1G4; udA1=dA1G1+dA1G2+dA1G3+dA1G4; ulA1=lA1G1+lA1G2+lA1G3+lA1G4; upA1=uwA1+udA1+ulA1; ptsuA1=3*uwA1+udA1;
		          			
		          			wA1=String.valueOf(uwA1); dA1=String.valueOf(udA1); lA1=String.valueOf(ulA1); pA1=String.valueOf(upA1); ptsA1=String.valueOf(ptsuA1);
		          			lblWinsA1.setText(wA1);    lblDrawsA1.setText(dA1);   lblLostA1.setText(lA1);    lblPlayedA1.setText(pA1); lblPtsA1.setText(ptsA1);
		          			
		          			wA3=String.valueOf(uwA3); dA3=String.valueOf(udA3); lA3=String.valueOf(ulA3); pA3=String.valueOf(upA3); ptsA3=String.valueOf(ptsuA3);
		          			lblWinsA3.setText(wA3);    lblDrawsA3.setText(dA3);   lblLostA3.setText(lA3);    lblPlayedA3.setText(pA3); lblPtsA3.setText(ptsA3);
		          			
		          		}
		          		else if(gfA1G4==gfA3G3) {
		          			dA1G4=1; wA1G4=0; lA1G4=0; uwA1=wA1G1+wA1G2+wA1G3+wA1G4; udA1=dA1G1+dA1G2+dA1G3+dA1G4; ulA1=lA1G1+lA1G2+lA1G3+lA1G4; upA1=uwA1+udA1+ulA1; ptsuA1=3*uwA1+udA1;
		          			dA3G3=1; wA3G3=0; lA3G3=0; uwA3=wA3G1+wA3G2+wA3G3; udA3=dA3G1+dA3G2+dA3G3; ulA3=lA3G1+lA3G2+lA3G3; upA3=uwA3+udA3+ulA3; ptsuA3=3*uwA3+udA3;
		          			
		          			wA1=String.valueOf(uwA1); dA1=String.valueOf(udA1); lA1=String.valueOf(ulA1); pA1=String.valueOf(upA1); ptsA1=String.valueOf(ptsuA1);
		          			lblWinsA1.setText(wA1);    lblDrawsA1.setText(dA1);   lblLostA1.setText(lA1);    lblPlayedA1.setText(pA1); lblPtsA1.setText(ptsA1);
		          			
		          			wA3=String.valueOf(uwA3); dA3=String.valueOf(udA3); lA3=String.valueOf(ulA3); pA3=String.valueOf(upA3); ptsA3=String.valueOf(ptsuA3);
		          			lblWinsA3.setText(wA3);    lblDrawsA3.setText(dA3);   lblLostA3.setText(lA3);    lblPlayedA3.setText(pA3); lblPtsA3.setText(ptsA3);
		          			
		          		}
		          		btnGrpAG5.setEnabled(false);
		          		resultA1G4.setEditable(false);
		          		resultA3G3.setEditable(false);
		          	}
		          });
			  btnGrpAG5.setFont(new Font("Tahoma", Font.BOLD, 10));
			  btnGrpAG5.setBounds(378, 414, 89, 17);
			  contentPane.add(btnGrpAG5);
			  
			  btnGrpAG6.addActionListener(new ActionListener() {
		          	public void actionPerformed(ActionEvent e) {
		          		gfA2G4=Integer.parseInt(resultA2G4.getText());
		          		gfA3G4=Integer.parseInt(resultA3G4.getText());
		          		int ugfA2=gfA2G1+gfA2G2+gfA2G3+gfA2G4;
		          		int ugaA2=gfA1G1+gfA3G2+gfA1G3+gfA3G4;
		          		int ugdA2=ugfA2-ugaA2;
		          		int ugfA3=gfA3G1+gfA3G2+gfA3G3+gfA3G4;
		          		int ugaA3=gfA1G2+gfA2G2+gfA1G4+gfA2G4;
		          		int ugdA3=ugfA3-ugaA3;
		          		gfA2=String.valueOf(ugfA2);
		          		gfA3=String.valueOf(ugfA3);
		          		gaA2=String.valueOf(ugaA2);
		          		gaA3=String.valueOf(ugaA3);
		          		lblGFA2.setText(gfA2);
		          		lblGFA3.setText(gfA3);
		          		lblGAA2.setText(gaA2);
		          		lblGAA3.setText(gaA3);
		          		gdA2=String.valueOf(ugdA2);
		          		gdA3=String.valueOf(ugdA3);
		          		lblGDA2.setText(gdA2);
		          		lblGDA3.setText(gdA3);
		          			          		
		          		if(gfA2G4>gfA3G4) {
		          			wA2G4=1; dA2G4=0; lA2G4=0; uwA2=wA2G1+wA2G2+wA2G3+wA2G4; udA2=dA2G1+dA2G2+dA2G3+dA2G4; ulA2=lA2G1+lA2G2+lA2G3+lA2G4; upA2=uwA2+udA2+ulA2; ptsuA2=3*uwA2+udA2;
		          			wA3G4=0; dA3G4=0; lA3G4=1; uwA3=wA3G1+wA3G2+wA3G3+wA3G4; udA3=dA3G1+dA3G2+dA3G3+dA3G4; ulA3=lA3G1+lA3G2+lA3G3+lA3G4; upA3=uwA3+udA3+ulA3; ptsuA3=3*uwA3+udA3;
		          			
		          			wA2=String.valueOf(uwA2); dA2=String.valueOf(udA2); lA2=String.valueOf(ulA2); pA2=String.valueOf(upA2); ptsA2=String.valueOf(ptsuA2);
		          			lblWinsA2.setText(wA2);    lblDrawsA2.setText(dA2);   lblLostA2.setText(lA2);    lblPlayedA2.setText(pA2); lblPtsA2.setText(ptsA2);
		          			
		          			wA3=String.valueOf(uwA3); dA3=String.valueOf(udA3); lA3=String.valueOf(ulA3); pA3=String.valueOf(upA3); ptsA3=String.valueOf(ptsuA3);
		          			lblWinsA3.setText(wA3);    lblDrawsA3.setText(dA3);   lblLostA3.setText(lA3);    lblPlayedA3.setText(pA3); lblPtsA3.setText(ptsA3);
		          			
		          		}
		          		else if(gfA2G4<gfA3G4) {
		          			wA3G4=1; dA3G4=0; lA3G4=0; uwA3=wA3G1+wA3G2+wA3G3+wA3G4; udA3=dA3G1+dA3G2+dA3G3+dA3G4; ulA3=lA3G1+lA3G2+lA3G3+lA3G4; upA3=uwA3+udA3+ulA3; ptsuA3=3*uwA3+udA3; 
		          			wA2G4=0; dA2G4=0; lA2G4=1; uwA2=wA2G1+wA2G2+wA2G3+wA2G4; udA2=dA2G1+dA2G2+dA2G3+dA2G4; ulA2=lA2G1+lA2G2+lA2G3+lA2G4; upA2=uwA2+udA2+ulA2; ptsuA2=3*uwA2+udA2;
		          			
		          			wA2=String.valueOf(uwA2); dA2=String.valueOf(udA2); lA2=String.valueOf(ulA2); pA2=String.valueOf(upA2); ptsA2=String.valueOf(ptsuA2);
		          			lblWinsA2.setText(wA2);    lblDrawsA2.setText(dA2);   lblLostA2.setText(lA2);    lblPlayedA2.setText(pA2); lblPtsA2.setText(ptsA2);
		          			
		          			wA3=String.valueOf(uwA3); dA3=String.valueOf(udA3); lA3=String.valueOf(ulA3); pA3=String.valueOf(upA3); ptsA3=String.valueOf(ptsuA3);
		          			lblWinsA3.setText(wA3);    lblDrawsA3.setText(dA3);   lblLostA3.setText(lA3);    lblPlayedA3.setText(pA3); lblPtsA3.setText(ptsA3);
		          			
		          		}
		          		else if(gfA2G4==gfA3G4) {
		          			dA2G4=1; wA2G4=0; lA2G4=0; uwA2=wA2G1+wA2G2+wA2G3+wA2G4; udA2=dA2G1+dA2G2+dA2G3+dA2G4; ulA2=lA2G1+lA2G2+lA2G3+lA2G4; upA2=uwA2+udA2+ulA2; ptsuA2=3*uwA2+udA2;
		          			dA3G4=1; wA3G4=0; lA3G4=0; uwA3=wA3G1+wA3G2+wA3G3+wA3G4; udA3=dA3G1+dA3G2+dA3G3+dA3G4; ulA3=lA3G1+lA3G2+lA3G3+lA3G4; upA3=uwA3+udA3+ulA3; ptsuA3=3*uwA3+udA3;
		          			
		          			wA2=String.valueOf(uwA2); dA2=String.valueOf(udA2); lA2=String.valueOf(ulA2); pA2=String.valueOf(upA2); ptsA2=String.valueOf(ptsuA2);
		          			lblWinsA2.setText(wA2);    lblDrawsA2.setText(dA2);   lblLostA2.setText(lA2);    lblPlayedA2.setText(pA2); lblPtsA2.setText(ptsA2);
		          			
		          			wA3=String.valueOf(uwA3); dA3=String.valueOf(udA3); lA3=String.valueOf(ulA3); pA3=String.valueOf(upA3); ptsA3=String.valueOf(ptsuA3);
		          			lblWinsA3.setText(wA3);    lblDrawsA3.setText(dA3);   lblLostA3.setText(lA3);    lblPlayedA3.setText(pA3); lblPtsA3.setText(ptsA3);
		          			
		          		}
		          		btnGrpAG6.setEnabled(false);
		          		resultA2G4.setEditable(false);
		          		resultA3G4.setEditable(false);
		          	}
		          });
			  btnGrpAG6.setFont(new Font("Tahoma", Font.BOLD, 10));
			  btnGrpAG6.setBounds(378, 442, 89, 17);
			  contentPane.add(btnGrpAG6);
			  
			//TABELA B-------------------------------------------------------------------------------------------------------------------------------------------  
			  JLabel lblPositionB = new JLabel("#");							JLabel lblTeamB = new JLabel("Team");
			  lblPositionB.setHorizontalAlignment(SwingConstants.CENTER);		lblTeamB.setHorizontalAlignment(SwingConstants.CENTER);
			  lblPositionB.setFont(new Font("Tahoma", Font.BOLD, 12));			lblTeamB.setFont(new Font("Tahoma", Font.BOLD, 12));
			  lblPositionB.setBounds(569, 117, 29, 14);							lblTeamB.setBounds(608, 117, 71, 14);
			  contentPane.add(lblPositionB);									contentPane.add(lblTeamB);
			  
			  JLabel lblPB = new JLabel("P");									JLabel lblWB = new JLabel("W");
			  lblPB.setHorizontalAlignment(SwingConstants.CENTER);				lblWB.setHorizontalAlignment(SwingConstants.CENTER);
			  lblPB.setFont(new Font("Tahoma", Font.BOLD, 12));					lblWB.setFont(new Font("Tahoma", Font.BOLD, 12));
			  lblPB.setBounds(731, 117, 29, 14);								lblWB.setBounds(764, 117, 29, 14);
			  contentPane.add(lblPB);											contentPane.add(lblWB);
			  
			  JLabel lblDB = new JLabel("D");									JLabel lblLB = new JLabel("L");
			  lblDB.setHorizontalAlignment(SwingConstants.CENTER);				lblLB.setHorizontalAlignment(SwingConstants.CENTER);
			  lblDB.setFont(new Font("Tahoma", Font.BOLD, 12));					lblLB.setFont(new Font("Tahoma", Font.BOLD, 12));
			  lblDB.setBounds(797, 117, 29, 14);								lblLB.setBounds(830, 117, 29, 14);
			  contentPane.add(lblDB);											contentPane.add(lblLB);
			  
			  JLabel lblGfB = new JLabel("GF");									JLabel lblGaB = new JLabel("GA");
			  lblGfB.setHorizontalAlignment(SwingConstants.CENTER);				lblGaB.setHorizontalAlignment(SwingConstants.CENTER);
			  lblGfB.setFont(new Font("Tahoma", Font.BOLD, 12));				lblGaB.setFont(new Font("Tahoma", Font.BOLD, 12));
			  lblGfB.setBounds(863, 117, 29, 14);								lblGaB.setBounds(896, 117, 29, 14);
			  contentPane.add(lblGfB);											contentPane.add(lblGaB);
			  
			  JLabel lblGdB = new JLabel("GD");									JLabel lblPtsB = new JLabel("PTS");
			  lblGdB.setHorizontalAlignment(SwingConstants.CENTER);				lblPtsB.setHorizontalAlignment(SwingConstants.CENTER);
			  lblGdB.setFont(new Font("Tahoma", Font.BOLD, 12));				lblPtsB.setFont(new Font("Tahoma", Font.BOLD, 12));
			  lblGdB.setBounds(929, 117, 29, 14);								lblPtsB.setBounds(962, 117, 29, 14);
			  contentPane.add(lblGdB);											contentPane.add(lblPtsB);
			  
			  JLabel lblPosition1GrpB = new JLabel("1");						JLabel lblPosition2GrpB = new JLabel("2");
			  lblPosition1GrpB.setOpaque(true);									lblPosition2GrpB.setOpaque(true);
			  lblPosition1GrpB.setHorizontalAlignment(SwingConstants.LEFT);		lblPosition2GrpB.setHorizontalAlignment(SwingConstants.LEFT);
			  lblPosition1GrpB.setForeground(Color.BLACK);						lblPosition2GrpB.setForeground(Color.BLACK);
			  lblPosition1GrpB.setFont(new Font("Tahoma", Font.BOLD, 12));		lblPosition2GrpB.setFont(new Font("Tahoma", Font.BOLD, 12));
			  lblPosition1GrpB.setBackground(new Color(0, 204, 102));			lblPosition2GrpB.setBackground(new Color(0, 204, 102));
			  lblPosition1GrpB.setBounds(579, 142, 412, 20);					lblPosition2GrpB.setBounds(579, 160, 412, 20);
			  contentPane.add(lblPosition1GrpB);								contentPane.add(lblPosition2GrpB);
			 
			  JLabel lblPosition3GrpB = new JLabel("3");
			  lblPosition3GrpB.setOpaque(true);
			  lblPosition3GrpB.setHorizontalAlignment(SwingConstants.LEFT);
			  lblPosition3GrpB.setForeground(Color.BLACK);
			  lblPosition3GrpB.setFont(new Font("Tahoma", Font.BOLD, 12));
			  lblPosition3GrpB.setBackground(Color.WHITE);
			  lblPosition3GrpB.setBounds(579, 178, 412, 20);
			  contentPane.add(lblPosition3GrpB);
			  
			//REZULTATI B--------------------------------------------------------------------------------------------------------------------------------------- 
			  JFormattedTextField resultB1G1 = new JFormattedTextField(formatter);		JFormattedTextField resultB1G2 = new JFormattedTextField(formatter);
			  resultB1G1.setHorizontalAlignment(SwingConstants.CENTER);					resultB1G2.setHorizontalAlignment(SwingConstants.CENTER);
			  resultB1G1.setBounds(728, 302, 23, 17);									resultB1G2.setBounds(761, 330, 23, 17);
			  contentPane.add(resultB1G1);												contentPane.add(resultB1G2);
			  
			  JFormattedTextField resultB2G1 = new JFormattedTextField(formatter);		JFormattedTextField resultB2G2 = new JFormattedTextField(formatter);
			  resultB2G1.setHorizontalAlignment(SwingConstants.CENTER);					resultB2G2.setHorizontalAlignment(SwingConstants.CENTER);
			  resultB2G1.setBounds(761, 302, 23, 17);									resultB2G2.setBounds(728, 358, 23, 17);
			  contentPane.add(resultB2G1);												contentPane.add(resultB2G2);
			  
			  JFormattedTextField resultB3G1 = new JFormattedTextField(formatter);		JFormattedTextField resultB3G2 = new JFormattedTextField(formatter);
			  resultB3G1.setHorizontalAlignment(SwingConstants.CENTER);					resultB3G2.setHorizontalAlignment(SwingConstants.CENTER);
			  resultB3G1.setBounds(728, 330, 23, 17);									resultB3G2.setBounds(761, 358, 23, 17);
			  contentPane.add(resultB3G1);												contentPane.add(resultB3G2);
			  
			  JLabel lblTeamB1G1 = new JLabel("New label"); 				JLabel lblTeamB1G2 = new JLabel("New label");
			  lblTeamB1G1.setHorizontalAlignment(SwingConstants.CENTER);	lblTeamB1G2.setHorizontalAlignment(SwingConstants.CENTER);
			  lblTeamB1G1.setBounds(579, 302, 118, 14);     				lblTeamB1G2.setBounds(838, 330, 118, 14);
			  lblTeamB1G1.setText(teamB1); 				  					lblTeamB1G2.setText(teamB1);
			  contentPane.add(lblTeamB1G1);				  					contentPane.add(lblTeamB1G2);
	        
			  JLabel lblTeamB2G2 = new JLabel("New label"); 				JLabel lblTeamB2G1 = new JLabel("New label");
			  lblTeamB2G2.setHorizontalAlignment(SwingConstants.CENTER);	lblTeamB2G1.setHorizontalAlignment(SwingConstants.CENTER);
			  lblTeamB2G2.setBounds(579, 358, 118, 14);     				lblTeamB2G1.setBounds(838, 302, 118, 14);
			  lblTeamB2G2.setText(teamB2);  				  				lblTeamB2G1.setText(teamB2);
			  contentPane.add(lblTeamB2G2);				  					contentPane.add(lblTeamB2G1);
	        
			  JLabel lblTeamB3G1 = new JLabel("New label"); 				JLabel lblTeamB3G2 = new JLabel("New label");
			  lblTeamB3G1.setHorizontalAlignment(SwingConstants.CENTER);	lblTeamB3G2.setHorizontalAlignment(SwingConstants.CENTER);
			  lblTeamB3G1.setBounds(579, 330, 118, 14);	  					lblTeamB3G2.setBounds(838, 358, 118, 14);
			  lblTeamB3G1.setText(teamB3);  				  				lblTeamB3G2.setText(teamB3);
			  contentPane.add(lblTeamB3G1);				  					contentPane.add(lblTeamB3G2);
				 
				  JButton btnGrpBG1 = new JButton("AddResult"); 
				  btnGrpBG1.addActionListener(new ActionListener() {
			          	public void actionPerformed(ActionEvent e) {
			          		gfB1G1=Integer.parseInt(resultB1G1.getText());
			          		gfB2G1=Integer.parseInt(resultB2G1.getText());
			          		gfB1=String.valueOf(gfB1G1);
			          		gfB2=String.valueOf(gfB2G1);
			          		int gdB1G1=gfB1G1-gfB2G1;
			          		int gdB2G1=gfB2G1-gfB1G1;
			          		lblGFB1.setText(gfB1);
			          		lblGFB2.setText(gfB2);
			          		lblGAB1.setText(gfB2);
			          		lblGAB2.setText(gfB1);
			          		gdB1=String.valueOf(gdB1G1);
			          		gdB2=String.valueOf(gdB2G1);
			          		lblGDB1.setText(gdB1);
			          		lblGDB2.setText(gdB2);
			          			          		
			          		if(gfB1G1>gfB2G1) {
			          			wB1G1=1; dB1G1=0; lB1G1=0; upB1=wB1G1+dB1G1+lB1G1; ptsuB1=3*wB1G1+dB1G1;
			          			wB2G1=0; dB2G1=0; lB2G1=1; upB2=wB2G1+dB2G1+lB2G1; ptsuB2=3*wB2G1+dB2G1;
			          			
			          			wB1=String.valueOf(wB1G1); dB1=String.valueOf(dB1G1); lB1=String.valueOf(lB1G1); pB1=String.valueOf(upB1); ptsB1=String.valueOf(ptsuB1);
			          			lblWinsB1.setText(wB1);    lblDrawsB1.setText(dB1);   lblLostB1.setText(lB1);    lblPlayedB1.setText(pB1); lblPtsB1.setText(ptsB1);
			          			
			          			wB2=String.valueOf(wB2G1); dB2=String.valueOf(dB2G1); lB2=String.valueOf(lB2G1); pB2=String.valueOf(upB2); ptsB2=String.valueOf(ptsuB2);
			          			lblWinsB2.setText(wB2);    lblDrawsB2.setText(dB2);   lblLostB2.setText(lB2);    lblPlayedB2.setText(pB2); lblPtsB2.setText(ptsB2);
			          			
			          		}
			          		else if(gfB1G1<gfB2G1) {
			          			wB2G1=1; dB2G1=0; lB2G1=0; upB1=wB1G1+dB1G1+lB1G1; ptsuB1=3*wB1G1+dB1G1; 
			          			wB1G1=0; dB1G1=0; lB1G1=1; upB2=wB2G1+dB2G1+lB2G1; ptsuB2=3*wB2G1+dB2G1;
			          			
			          			wB1=String.valueOf(wB1G1); dB1=String.valueOf(dB1G1); lB1=String.valueOf(lB1G1); pB1=String.valueOf(upB1); ptsB1=String.valueOf(ptsuB1);
			          			lblWinsB1.setText(wB1);    lblDrawsB1.setText(dB1);   lblLostB1.setText(lB1);    lblPlayedB1.setText(pB1); lblPtsB1.setText(ptsB1);
			          			
			          			wB2=String.valueOf(wB2G1); dB2=String.valueOf(dB2G1); lB2=String.valueOf(lB2G1); pB2=String.valueOf(upB2); ptsB2=String.valueOf(ptsuB2);
			          			lblWinsB2.setText(wB2);    lblDrawsB2.setText(dB2);   lblLostB2.setText(lB2);    lblPlayedB2.setText(pB2); lblPtsB2.setText(ptsB2);
			          			
			          		}
			          		else if(gfB1G1==gfB2G1) {
			          			dB1G1=1; wB1G1=0; lB1G1=0; upB1=wB1G1+dB1G1+lB1G1; ptsuB1=3*wB1G1+dB1G1;
			          			dB2G1=1; wB2G1=0; lB2G1=0; upB2=wB2G1+dB2G1+lB2G1; ptsuB2=3*wB2G1+dB2G1;
			          			
			          			wB1=String.valueOf(wB1G1); dB1=String.valueOf(dB1G1); lB1=String.valueOf(lB1G1); pB1=String.valueOf(upB1); ptsB1=String.valueOf(ptsuB1);
			          			lblWinsB1.setText(wB1);    lblDrawsB1.setText(dB1);   lblLostB1.setText(lB1);    lblPlayedB1.setText(pB1); lblPtsB1.setText(ptsB1);
			          			
			          			wB2=String.valueOf(wB2G1); dB2=String.valueOf(dB2G1); lB2=String.valueOf(lB2G1); pB2=String.valueOf(upB2); ptsB2=String.valueOf(ptsuB2);
			          			lblWinsB2.setText(wB2);    lblDrawsB2.setText(dB2);   lblLostB2.setText(lB2);    lblPlayedB2.setText(pB2); lblPtsB2.setText(ptsB2);
			          			
			          		}
			          		btnGrpBG1.setEnabled(false);
			          		resultB1G1.setEditable(false);
			          		resultB2G1.setEditable(false);
			          	}
			          });
				  btnGrpBG1.setFont(new Font("Tahoma", Font.BOLD, 10));			
				  btnGrpBG1.setBounds(974, 302, 89, 17);					
				  contentPane.add(btnGrpBG1);								
				  
				  JButton btnGrpBG2 = new JButton("AddResult");
				  
				  btnGrpBG2.setFont(new Font("Tahoma", Font.BOLD, 10));
				  btnGrpBG2.setBounds(974, 330, 89, 17);
				  contentPane.add(btnGrpBG2);
				  
				  JButton btnGrpBG3 = new JButton("AddResult");
				  
				  btnGrpBG3.setFont(new Font("Tahoma", Font.BOLD, 10));
				  btnGrpBG3.setBounds(974, 358, 89, 17);
				  contentPane.add(btnGrpBG3);
				  
				  JFormattedTextField resultB2G3 = new JFormattedTextField(formatter);		JFormattedTextField resultB2G4 = new JFormattedTextField(formatter);
				  resultB2G3.setHorizontalAlignment(SwingConstants.CENTER);					resultB2G4.setHorizontalAlignment(SwingConstants.CENTER);
				  resultB2G3.setBounds(728, 386, 23, 17);									resultB2G4.setBounds(761, 442, 23, 17);
				  contentPane.add(resultB2G3);												contentPane.add(resultB2G4);
				  if(Creator.rdbtnNo.isSelected()) { resultB2G3.setVisible(false); }        if(Creator.rdbtnNo.isSelected()) { resultB2G4.setVisible(false);}
				  
				  JFormattedTextField resultB3G3 = new JFormattedTextField(formatter);		JFormattedTextField resultB3G4 = new JFormattedTextField(formatter);
				  resultB3G3.setHorizontalAlignment(SwingConstants.CENTER);					resultB3G4.setHorizontalAlignment(SwingConstants.CENTER);
				  resultB3G3.setBounds(761, 414, 23, 17);									resultB3G4.setBounds(728, 442, 23, 17);
				  contentPane.add(resultB3G3);												contentPane.add(resultB3G4);
				  if(Creator.rdbtnNo.isSelected()) { resultB3G3.setVisible(false); }        if(Creator.rdbtnNo.isSelected()) { resultB3G4.setVisible(false);}
				  
				  JFormattedTextField resultB1G3 = new JFormattedTextField(formatter);		JFormattedTextField resultB1G4 = new JFormattedTextField(formatter);
				  resultB1G3.setHorizontalAlignment(SwingConstants.CENTER);					resultB1G4.setHorizontalAlignment(SwingConstants.CENTER);
				  resultB1G3.setBounds(761, 386, 23, 17);									resultB1G4.setBounds(728, 414, 23, 17);
				  contentPane.add(resultB1G3);												contentPane.add(resultB1G4);
				  if(Creator.rdbtnNo.isSelected()) { resultB1G3.setVisible(false); }        if(Creator.rdbtnNo.isSelected()) { resultB1G4.setVisible(false);}
				  
				  JLabel lblTeamB2G3 = new JLabel((String) null);							JLabel lblTeamB2G4 = new JLabel((String) null);
				  lblTeamB2G3.setHorizontalAlignment(SwingConstants.CENTER);				lblTeamB2G4.setHorizontalAlignment(SwingConstants.CENTER);
				  lblTeamB2G3.setBounds(579, 386, 118, 14);									lblTeamB2G4.setBounds(838, 442, 118, 14);
				  lblTeamB2G3.setText(teamB2);												lblTeamB2G4.setText(teamB2);
				  contentPane.add(lblTeamB2G3);												contentPane.add(lblTeamB2G4);
				  if(Creator.rdbtnNo.isSelected()) { lblTeamB2G3.setVisible(false); }       if(Creator.rdbtnNo.isSelected()) { lblTeamB2G4.setVisible(false);}
				  
				  JLabel lblTeamB3G3 = new JLabel((String) null);							JLabel lblTeamB3G4 = new JLabel((String) null);
				  lblTeamB3G3.setHorizontalAlignment(SwingConstants.CENTER);				lblTeamB3G4.setHorizontalAlignment(SwingConstants.CENTER);
				  lblTeamB3G3.setBounds(838, 414, 118, 14);									lblTeamB3G4.setBounds(579, 442, 118, 14);
				  lblTeamB3G3.setText(teamB3); 												lblTeamB3G4.setText(teamB3);
				  contentPane.add(lblTeamB3G3);												contentPane.add(lblTeamB3G4);
				  if(Creator.rdbtnNo.isSelected()) { lblTeamB3G3.setVisible(false); }       if(Creator.rdbtnNo.isSelected()) { lblTeamB3G4.setVisible(false);}
				  
				  JLabel lblTeamB1G3 = new JLabel((String) null);							JLabel lblTeamB1G4 = new JLabel((String) null);
				  lblTeamB1G3.setHorizontalAlignment(SwingConstants.CENTER);				lblTeamB1G4.setHorizontalAlignment(SwingConstants.CENTER);
				  lblTeamB1G3.setBounds(838, 386, 118, 14);									lblTeamB1G4.setBounds(579, 414, 118, 14);
				  lblTeamB1G3.setText(teamB1); 												lblTeamB1G4.setText(teamB1);
				  contentPane.add(lblTeamB1G3);												contentPane.add(lblTeamB1G4);
				  if(Creator.rdbtnNo.isSelected()) { lblTeamB1G3.setVisible(false); }       if(Creator.rdbtnNo.isSelected()) { lblTeamB1G4.setVisible(false);}
				  
				  //JButton btnGrpBG4 = new JButton("AddResult");							
				  btnGrpBG4.setFont(new Font("Tahoma", Font.BOLD, 10));		
				  btnGrpBG4.setBounds(974, 386, 89, 17);					
				  contentPane.add(btnGrpBG4);								
				  
				  //JButton btnGrpBG5 = new JButton("AddResult");
				  btnGrpBG5.setFont(new Font("Tahoma", Font.BOLD, 10));
				  btnGrpBG5.setBounds(974, 414, 89, 17);
				  contentPane.add(btnGrpBG5);
				  
				  //JButton btnGrpBG6 = new JButton("AddResult");
				  btnGrpBG6.setFont(new Font("Tahoma", Font.BOLD, 10));
				  btnGrpBG6.setBounds(974, 442, 89, 17);
				  contentPane.add(btnGrpBG6);
				  
	}
}
