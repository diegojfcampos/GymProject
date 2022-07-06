package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DB.ClassesDB;
import objects.Classes;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class ClassesView extends JFrame {

	private JPanel contentPane;
	private JTextField textClassNameView;
	private JTextField textClassDurationView;
	private JTextField textClassDescriptionView;
	private JTextField textClassMaxCapacity;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClassesView frame = new ClassesView();
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
	public ClassesView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblClassName = new JLabel("Class Name");
		lblClassName.setBounds(24, 12, 103, 15);
		contentPane.add(lblClassName);
		
		textClassNameView = new JTextField();
		textClassNameView.setBounds(24, 28, 374, 19);
		contentPane.add(textClassNameView);
		textClassNameView.setColumns(10);
		
		JLabel lblDuration = new JLabel("Duration");
		lblDuration.setBounds(24, 59, 70, 15);
		contentPane.add(lblDuration);
		
		textClassDurationView = new JTextField();
		textClassDurationView.setBounds(24, 79, 114, 19);
		contentPane.add(textClassDurationView);
		textClassDurationView.setColumns(10);
		
		JLabel label3 = new JLabel("Description");
		label3.setBounds(24, 113, 103, 15);
		contentPane.add(label3);
		
		textClassDescriptionView = new JTextField();
		textClassDescriptionView.setBounds(24, 135, 374, 72);
		contentPane.add(textClassDescriptionView);
		textClassDescriptionView.setColumns(10);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				insertClasses();
			}
		});
		btnRegister.setBounds(149, 217, 117, 25);
		contentPane.add(btnRegister);
		
		JLabel lblMaxCapacity = new JLabel("Max Capacity");
		lblMaxCapacity.setBounds(235, 59, 108, 15);
		contentPane.add(lblMaxCapacity);
		
		textClassMaxCapacity = new JTextField();
		textClassMaxCapacity.setBounds(235, 79, 114, 19);
		contentPane.add(textClassMaxCapacity);
		textClassMaxCapacity.setColumns(10);
	}
	
	private void insertClasses() {		
		
		try {
			
			String className = textClassNameView.getText();
			String classDuration = textClassDurationView.getText();
			String classDescription = textClassDescriptionView.getText();
			String classCapacity = textClassMaxCapacity.getText();
			
			Classes objClasses = new Classes();
			
			objClasses.setClassCapacity(classCapacity);
			objClasses.setClassName(className);
			objClasses.setClassDescription(classDescription);
			objClasses.setClassDuration(classDuration);
			
			ClassesDB objClassesDB = new ClassesDB();
			objClassesDB.registerClasses(objClasses);
			
			JOptionPane.showMessageDialog(null, "Class Registered");
			dispose();
			
		}catch(Exception error) {
			JOptionPane.showMessageDialog(null, "Error in ClassView" + error);
		}
	}
}
