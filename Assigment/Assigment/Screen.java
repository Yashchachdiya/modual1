package com.Assigment;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame 
{
    private JTextField idField, nameField, addressField, contactField;
    private JRadioButton maleButton, femaleButton;
    private JTable table;
    private DefaultTableModel tableModel;

    public Screen() 
    {
        setTitle("Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        setLayout(null);

        JLabel idLabel = new JLabel("ID:");
        idLabel.setBounds(20, 30, 100, 30);
        add(idLabel);

        idField = new JTextField();
        idField.setBounds(120, 30, 200, 30);
        add(idField);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 70, 100, 30);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(120, 70, 200, 30);
        add(nameField);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(20, 110, 100, 30);
        add(genderLabel);

        maleButton = new JRadioButton("Male");
        maleButton.setBounds(120, 110, 70, 30);
        femaleButton = new JRadioButton("Female");
        femaleButton.setBounds(200, 110, 80, 30);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        add(maleButton);
        add(femaleButton);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(20, 150, 100, 30);
        add(addressLabel);

        addressField = new JTextField();
        addressField.setBounds(120, 150, 200, 30);
        add(addressField);

        JLabel contactLabel = new JLabel("Contact:");
        contactLabel.setBounds(20, 190, 100, 30);
        add(contactLabel);

        contactField = new JTextField();
        contactField.setBounds(120, 190, 200, 30);
        add(contactField);

        JButton registerButton = new JButton("Register");
        registerButton.setBounds(20, 240, 100, 30);
        add(registerButton);

        JButton updateButton = new JButton("Update");
        updateButton.setBounds(130, 240, 100, 30);
        add(updateButton);

        JButton deleteButton = new JButton("Delete");
        deleteButton.setBounds(240, 240, 100, 30);
        add(deleteButton);

        JButton resetButton = new JButton("Reset");
        resetButton.setBounds(130, 280, 100, 30);
        add(resetButton);

        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(240, 280, 100, 30);
        add(exitButton);

        
        tableModel = new DefaultTableModel(new String[]{"S.No", "ID", "Name", "Gender", "Address", "Contact"}, 0);
        table = new JTable(tableModel);
        JScrollPane tableScroll = new JScrollPane(table);
        tableScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        tableScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        tableScroll.setBounds(350, 30, 400, 280);
        add(tableScroll);

        JButton refreshButton = new JButton("Refresh Table");
        refreshButton.setBounds(350, 320, 400, 30);
        add(refreshButton);

        registerButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                addToTable();
            }
        });

        deleteButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                deleteFromTable();
            }
        });

        resetButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                resetFields();
            }
        });

        exitButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    private void addToTable() 
    {
        String id = idField.getText();
        String name = nameField.getText();
        String gender = maleButton.isSelected() ? "Male" : (femaleButton.isSelected() ? "Female" : "");
        String address = addressField.getText();
        String contact = contactField.getText();

        if (!id.isEmpty() && !name.isEmpty() && !gender.isEmpty() && !address.isEmpty() && !contact.isEmpty()) 
        {
            tableModel.addRow(new Object[]{tableModel.getRowCount() + 1, id, name, gender, address, contact});
            resetFields();
        } else 
        {
            JOptionPane.showMessageDialog(this, "Please fill all fields!");
        }
    }

    private void deleteFromTable() 
    {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) 
        {
            tableModel.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to delete!");
        }
    }

    private void resetFields() 
    {
        idField.setText("");
        nameField.setText("");
        addressField.setText("");
        contactField.setText("");
        maleButton.setSelected(false);
        femaleButton.setSelected(false);
    }

    public static void main(String[] args) 
    {
        new Screen();
    }
}
