package com.projecttrailor.view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
public class table extends JFrame {
	 private JPanel contentPane;
 /**
  * Launch the application.
 */
	 public void run() {
		 try {
			table frame = new table();
			frame.setVisible(true);
		} catch (Exception e) {
              e.printStackTrace();	
              }
 }
 
 
 public table() { 
//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//setBounds(100,100,450,300);
//contentPane = new JPanel();
	 
	 JFrame frame = new JFrame();
	 JTable table = new JTable();
	 Object[] columns = {"cid","Name","Phone","Email"};
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);
		table.setModel(model);
		
		table.setBackground(Color.cyan);
		table.setForeground(Color.white);
		Font font = new Font("",1,22);
		table.setFont(font);
        table.setRowHeight(30);
     
	 JTextField txtID = new JTextField();
	 JTextField txtName = new JTextField();
	 JTextField txtPhone = new JTextField();
	 JTextField txtEmail = new JTextField();
	 
	 JButton btnAdd = new JButton("ADD");
	 JButton btnDelete = new JButton("DELETE");
	 JButton btnUpdate = new JButton("UPDATE");
	 	 
	 txtID.setBounds(20,220,100,25);
	 txtName.setBounds(20,250,100,25);
	 txtPhone.setBounds(20,280,100,25);
	 txtEmail.setBounds(20,310,100,25);
	 
	 btnAdd.setBounds(150,220,100,25);
	 btnDelete.setBounds(150,265,100,25);
	 btnUpdate.setBounds(150,310,100,25);
	  
	JScrollPane pane = new JScrollPane(table);
	pane.setBounds(0,0,880,200);
	frame.setLayout(null);
	frame.add(pane);
	frame.add(txtID);
	frame.add(txtName);
	frame.add(txtPhone);
	frame.add(txtEmail);

	frame.add(btnAdd);
	frame.add(btnDelete);
	frame.add(btnUpdate);
    Object[] row = new Object[4];
	btnAdd.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			row[0] = txtID.getText();
			row[1] = txtName.getText();
			row[2] = txtPhone.getText();
			row[3] = txtEmail.getText();
			
			model.addRow(row);
			
		}
	});
	
	btnDelete.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			int i = table.getSelectedRow();
			if(i>=0) {
				model.removeRow(i);
			}
			else {
				System.out.println("Delete Error");
			}
		}
		
	});
	
	table.addMouseListener(new MouseAdapter() {
		
		public void mouseClicked(MouseEvent e) {
			
			int i = table.getSelectedRow();
			txtID.setText(model.getValueAt(i,0).toString());
			txtName.setText(model.getValueAt(i,1).toString());
			txtPhone.setText(model.getValueAt(i,2).toString());
			txtEmail.setText(model.getValueAt(i,3).toString());

		}
	});
	
	btnUpdate.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			int i = table.getSelectedRow();
			
			if(i>=0) {
			model.setValueAt(txtID.getText(),i,0);
			model.setValueAt(txtName.getText(),i,1);
			model.setValueAt(txtPhone.getText(),i,2);
			model.setValueAt(txtEmail.getText(),i,3);
			}
			else {
				System.out.println("Update Error");
			}
		}
		
	});
	
	frame.setSize(900,400);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
 }
}

