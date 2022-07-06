package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSplitPane;
import javax.swing.JDesktopPane;
import javax.swing.JScrollPane;
import javax.swing.JInternalFrame;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrameView extends JFrame {

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrameView frame = new MainFrameView();
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
	public MainFrameView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		setUndecorated(true);
		setTitle("Gym Project");
		getContentPane().setLayout(new CardLayout(0, 0));
		memberPanel = new MemberMainPanel();
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, "name_31150992352573");
		panel.setLayout(new CardLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, "name_31245385896870");
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(0, 0, 259, 400);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("Members");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		btnNewButton.setBounds(12, 76, 220, 52);
		panel_2.add(btnNewButton);
		
		JButton btnStaff = new JButton("Staff");
		btnStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffView viewStaffFrame = new StaffView();
				viewStaffFrame.setVisible(true);
			}
		});
		btnStaff.setBounds(12, 140, 220, 52);
		panel_2.add(btnStaff);
		
		JButton btnClasses = new JButton("Classes");
		btnClasses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClassesView viewClassesFrame = new  ClassesView();
				viewClassesFrame.setVisible(true);
			}
		});
		btnClasses.setBounds(12, 204, 220, 52);
		panel_2.add(btnClasses);
		
		JButton btnOptions = new JButton("Exit");
		btnOptions.setBounds(12, 332, 220, 52);
		panel_2.add(btnOptions);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainFrameView mainFrame = new MainFrameView();
				mainFrame.setVisible(true);
				
			}
		});
		btnHome.setBounds(12, 12, 220, 52);
		panel_2.add(btnHome);
		
		JButton button = new JButton("Options");
		button.setBounds(12, 268, 220, 52);
		panel_2.add(button);
		
		JLabel photoLogo = new JLabel("");
		photoLogo.setIcon(new ImageIcon("/home/diego/Desktop/Projects_2022/GymProject/Gym-project-logo-v2-500px.png"));
		photoLogo.setBounds(277, 23, 500, 344);
		panel_1.add(photoLogo);
	}
}
