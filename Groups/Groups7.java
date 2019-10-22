import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Component;








public class Groups7 extends JFrame {

	private JPanel contentPane;
	
	private String teamA1=addTeams.teamA1; private String teamA2=addTeams.teamA2; private String teamA3=addTeams.teamA3;
	private String teamA4=addTeams.teamA4; 
	private String teamB1=addTeams.teamB1; private String teamB2=addTeams.teamB2; private String teamB3=addTeams.teamB3;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Groups7 frame = new Groups7();
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
	public Groups7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1042, 683);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		lblTourDate.setBounds(597, 36, 180, 25);
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
		lblNewLabel.setBounds(51, 269, 352, 25);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("Fixtures");
		label.setBounds(568, 269, 352, 25);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label);
		
			String[]column= {"#", "Team", "P", "W", "D", "L", "GF", "GA", "GD", "PTS"};
	        Object[][] data= {{"1",teamA1,null,null,null,null,null,null,null,null},
	        		          {"2",teamA2,null,null,null,null,null,null,null,null},
	        		          {"3",teamA3,null,null,null,null,null,null,null,null},
	        		          {"4",teamA4,null,null,null,null,null,null,null,null},
	        };
	        JTable tableA=new JTable(data,column);
	        JScrollPane scrollPane = new JScrollPane(tableA);
	        scrollPane.setSize(484, 91);
	        scrollPane.setLocation(12, 124);
	        tableA.setRowSelectionAllowed(false);
	        tableA.setEnabled(false);
	        tableA.getTableHeader().setReorderingAllowed(false);
	        tableA.getTableHeader().setResizingAllowed(false);
	        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
	        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
	        tableA.setDefaultRenderer(String.class, centerRenderer);
	        tableA.getColumnModel().getColumn(0).setPreferredWidth(25);
	        tableA.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
	        tableA.getColumnModel().getColumn(1).setPreferredWidth(170);
	        tableA.getColumnModel().getColumn(2).setPreferredWidth(30);
	        tableA.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
	        tableA.getColumnModel().getColumn(3).setPreferredWidth(30);
	        tableA.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
	        tableA.getColumnModel().getColumn(4).setPreferredWidth(30);
	        tableA.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
	        tableA.getColumnModel().getColumn(5).setPreferredWidth(30);
	        tableA.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
	        tableA.getColumnModel().getColumn(6).setPreferredWidth(30);
	        tableA.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);
	        tableA.getColumnModel().getColumn(7).setPreferredWidth(30);
	        tableA.getColumnModel().getColumn(7).setCellRenderer(centerRenderer);
	        tableA.getColumnModel().getColumn(8).setPreferredWidth(30);
	        tableA.getColumnModel().getColumn(8).setCellRenderer(centerRenderer);
	        tableA.getColumnModel().getColumn(9).setPreferredWidth(30);
	        tableA.getColumnModel().getColumn(9).setCellRenderer(centerRenderer);
	        contentPane.add(scrollPane);
	        
	        String[]column2= {"#", "Team", "P", "W", "D", "L", "GF", "GA", "GD", "PTS"};
	        Object[][] data2= {{"1",teamB1,null,null,null,null,null,null,null,null},
	        		           {"2",teamB2,null,null,null,null,null,null,null,null},
	        		           {"3",teamB3,null,null,null,null,null,null,null,null},
	        };
	        JTable tableB=new JTable(data2,column2);
	        JScrollPane scrollPaneB = new JScrollPane(tableB);
	        scrollPaneB.setBounds(526, 124, 484, 75);
	        tableB.setRowSelectionAllowed(false);
	        tableB.setEnabled(false);
	        tableB.getTableHeader().setReorderingAllowed(false);
	        tableB.getTableHeader().setResizingAllowed(false);
	        tableB.setDefaultRenderer(String.class, centerRenderer);
	        tableB.getColumnModel().getColumn(0).setPreferredWidth(25);
	        tableB.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
	        tableB.getColumnModel().getColumn(1).setPreferredWidth(170);
	        tableB.getColumnModel().getColumn(2).setPreferredWidth(30);
	        tableB.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
	        tableB.getColumnModel().getColumn(3).setPreferredWidth(30);
	        tableB.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
	        tableB.getColumnModel().getColumn(4).setPreferredWidth(30);
	        tableB.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
	        tableB.getColumnModel().getColumn(5).setPreferredWidth(30);
	        tableB.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
	        tableB.getColumnModel().getColumn(6).setPreferredWidth(30);
	        tableB.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);
	        tableB.getColumnModel().getColumn(7).setPreferredWidth(30);
	        tableB.getColumnModel().getColumn(7).setCellRenderer(centerRenderer);
	        tableB.getColumnModel().getColumn(8).setPreferredWidth(30);
	        tableB.getColumnModel().getColumn(8).setCellRenderer(centerRenderer);
	        tableB.getColumnModel().getColumn(9).setPreferredWidth(30);
	        tableB.getColumnModel().getColumn(9).setCellRenderer(centerRenderer);
	        contentPane.add(scrollPaneB);
	        
       
		
		
		
		
        		
	}
}
