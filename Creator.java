import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.NumberFormatter;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFormattedTextField;


public class Creator extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static JTextField tourName;
	public static JTextField tourPlace;
	public static JFormattedTextField tourDate;
	public static JFormattedTextField numTeams;
	private ButtonGroup homeAway;
	public static int numTeamsValue;
	public static String dateTour;
	List<JTextField> list = new ArrayList<>();
	public static JRadioButton rdbtnYes = new JRadioButton("Yes");
	public static JRadioButton rdbtnNo= new JRadioButton("No");
		
	
	  //Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Creator frame = new Creator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	//Create the frame.
	public Creator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 545, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tournament Creator");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 0, 509, 30);
		contentPane.add(lblNewLabel);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addTeams s = new addTeams();
				dispose();
				s.setVisible(true);
			}
		});
		
		btnNext.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNext.setBounds(368, 284, 104, 30);
		contentPane.add(btnNext);
		btnNext.setEnabled(false);
		
		JLabel lblTournamentName = new JLabel("Tournament name");
		lblTournamentName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTournamentName.setBounds(10, 66, 135, 25);
		contentPane.add(lblTournamentName);
		
		JLabel lblTournamentPlace = new JLabel("Tournament place");
		lblTournamentPlace.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTournamentPlace.setBounds(10, 101, 135, 25);
		contentPane.add(lblTournamentPlace);
		
		JLabel lblTournamentDate = new JLabel("Tournament date");
		lblTournamentDate.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTournamentDate.setBounds(10, 137, 135, 25);
		contentPane.add(lblTournamentDate);
		
		JLabel lblNumberOfTeams = new JLabel("Number of teams (5-11)");
		lblNumberOfTeams.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNumberOfTeams.setBounds(10, 175, 167, 25);
		contentPane.add(lblNumberOfTeams);
		
		JLabel lblHomeAway = new JLabel("Home & Away");
		lblHomeAway.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblHomeAway.setBounds(10, 214, 135, 25);
		contentPane.add(lblHomeAway);
		
		tourName = new JTextField();
		tourName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		tourName.setBounds(187, 67, 180, 25);
		contentPane.add(tourName);
		tourName.setColumns(10);
								
		tourPlace = new JTextField();
		tourPlace.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		tourPlace.setColumns(10);
		tourPlace.setBounds(187, 102, 180, 25);
		contentPane.add(tourPlace);
				
		DateFormat date = new SimpleDateFormat("dd/MMM/yyyy");
        JFormattedTextField tourDate = new JFormattedTextField(date);
		tourDate.setValue(new Date());
		tourDate.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		tourDate.setBounds(187, 138, 180, 25);
		contentPane.add(tourDate);
		dateTour=String.valueOf(tourDate.getText());
				
		rdbtnYes.setFont(new Font("Times New Roman", Font.BOLD, 15));
		rdbtnYes.setBounds(187, 214, 54, 25);
		rdbtnYes.setEnabled(false);
		contentPane.add(rdbtnYes);
		
		rdbtnNo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		rdbtnNo.setBounds(253, 214, 54, 25);
		rdbtnNo.setEnabled(false);
		contentPane.add(rdbtnNo);
		
		homeAway = new ButtonGroup();
		homeAway.add(rdbtnYes);
		homeAway.add(rdbtnNo);
				
		NumberFormat format = NumberFormat.getNumberInstance();
	    NumberFormatter formatter = new NumberFormatter(format);
	    JFormattedTextField numTeams = new JFormattedTextField(formatter);
		formatter.setMaximum(11);
	    formatter.setMinimum(5);
	    formatter.setValueClass(Integer.class);
	    formatter.setAllowsInvalid(true);
	    formatter.setCommitsOnValidEdit(true);
	    numTeams.setBounds(187, 176, 37, 25);
	    numTeams.setHorizontalAlignment(SwingConstants.CENTER);
		numTeams.setFont(new Font("Times New Roman", Font.PLAIN, 15));
	    contentPane.add(numTeams);
	    numTeams.addKeyListener(new KeyAdapter() {
			@Override
	    	public void keyReleased(KeyEvent e) {
	    		if(numTeams.getText().length()==2) {
					e.consume();
				}
	    		int number=0;
				try {
					number=Integer.parseInt(numTeams.getText());
					numTeamsValue=number;
				} catch (Exception e2) {
					// TODO: handle exception
				}
				if(number==6 || number==7) {
					rdbtnYes.setEnabled(true);
					rdbtnNo.setEnabled(true);
				}
				else {
					homeAway.clearSelection();
					rdbtnYes.setEnabled(false);
					rdbtnNo.setEnabled(false);
			   }
		   }
		});
	    
	   list.add(tourName);
	   list.add(tourPlace);
	   list.add(numTeams);
	   list.add(tourDate);
	   
	   //btnNext omoguciti da je aktivno
	   DocumentListener listener = new DocumentListener() {
		    @Override
		    public void removeUpdate(DocumentEvent e) { 
		    	changedUpdate(e);
		    }
		    @Override
		    public void insertUpdate(DocumentEvent e) { 
		    	changedUpdate(e);
		    }

		    @Override
		    public void changedUpdate(DocumentEvent e) {
		    	int number=0;
				try {
					number=Integer.parseInt(numTeams.getText());
					} catch (Exception e2) {
					// TODO: handle exception
					  }
		    	boolean canEnable = true;
		        for (JTextField tf : list) {
		            if (tf.getText().trim().isEmpty()) {
		                canEnable = false;
		                homeAway.clearSelection();
		                btnNext.setEnabled(canEnable);
		            }
		            
		        }
		        
		        if(number==6 || number==7  )  {
					rdbtnYes.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							boolean canEnable = true;
							
							for (JTextField tf : list) {
					            if (tf.getText().trim().isEmpty() ) {
					                canEnable = false;
					                btnNext.setEnabled(canEnable);
					                homeAway.clearSelection();
					            }
					            else {
					            	btnNext.setEnabled(canEnable);
					            }
					        }
					    }
					});
					 rdbtnNo.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								boolean canEnable = true;
																
						        for (JTextField tf : list) {
						            if (tf.getText().trim().isEmpty() ) {
						                canEnable = false;
						                btnNext.setEnabled(canEnable);
						                homeAway.clearSelection();
						            }
						            else {
						            	btnNext.setEnabled(canEnable);
						            }
						        }
						        Groups.btnGrpAG4.setVisible(false);
								Groups.btnGrpAG5.setVisible(false);
								Groups.btnGrpAG6.setVisible(false);
								Groups.btnGrpBG4.setVisible(false);
								Groups.btnGrpBG5.setVisible(false);
								Groups.btnGrpBG6.setVisible(false);
								Groups.resetAG4.setVisible(false);
								Groups.resetAG5.setVisible(false);
								Groups.resetAG6.setVisible(false);
								Groups.resetBG4.setVisible(false);
								Groups.resetBG5.setVisible(false);
								Groups.resetBG6.setVisible(false);
							}
							
						});
				}
		        if(number==5 || number>=8) {
		        btnNext.setEnabled(canEnable);
		        homeAway.clearSelection();
		        }
		    }
		};
		for (JTextField tf : list) {
		    tf.getDocument().addDocumentListener(listener);
		    
		}
	}
}
