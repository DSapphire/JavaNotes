package com.duan.view;

import com.duan.util.IOUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class MainView extends JFrame implements ActionListener {
    private static final int WIDTH=500;
    private static final int HEIGHT=200;
    private String srcStr,desStr;
    private JButton srcButton,desButton,okButton;
    private JTextArea srcFileName,desFileName;
    private JLabel srcLabel,desLabel;
    private JPanel jp;
    private JFileChooser fc;
    public MainView(){
        super("MainView");
        File current=new File("");
        fc=new JFileChooser(current.getAbsolutePath());
    }
    public void view(){
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        jp=new JPanel(new GridLayout(3,3,20,20));
        srcFileName=new JTextArea();
        desFileName=new JTextArea();
        srcFileName.setLineWrap(true);
        desFileName.setLineWrap(true);
        //srcFileName.setEditable(false);
        //desFileName.setEditable(false);
        srcButton=new JButton("select source file");
        srcButton.setMargin(null);
        srcButton.addActionListener(this);
        desButton=new JButton("select destination file");
        desButton.setMargin(null);
        desButton.addActionListener(this);
        okButton=new JButton("copy");
        okButton.addActionListener(this);
        okButton.setMargin(null);
        srcLabel=new JLabel("Source File:");
        srcLabel.setHorizontalAlignment(JLabel.CENTER);
        desLabel=new JLabel("Destination File:");
        desLabel.setHorizontalAlignment(JLabel.CENTER);
        jp.add(srcLabel);
        jp.add(new JLabel(" "));
        jp.add(desLabel);
        jp.add(srcFileName);
        jp.add(new JLabel(" "));
        jp.add(desFileName);
        jp.add(srcButton);
        jp.add(okButton);
        jp.add(desButton);
        setContentPane(jp);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        Object o=e.getSource();
        if(o==srcButton){
            int returnVal=fc.showOpenDialog(this);
            if(returnVal==JFileChooser.APPROVE_OPTION){
                srcFileName.setText(fc.getSelectedFile().getPath());
                srcButton.setBackground(null);
                srcButton.setText("Select source file.");
            }
        }else if (o==desButton){
            int returnVal=fc.showSaveDialog(this);
            if(returnVal==JFileChooser.APPROVE_OPTION){
                desFileName.setText(fc.getSelectedFile().getPath());
                desButton.setBackground(null);
                desButton.setText("Select destination file.");
            }
        }else if (o==okButton){
            srcStr=srcFileName.getText();
            desStr=desFileName.getText();
            int op=128;//random 128
            if(srcStr!=null&&desStr!=null){
                if(IOUtil.isFile(desStr)){
                    op=JOptionPane.showConfirmDialog(this,desStr+" exist. Do you want to cover it ?","Confirm",JOptionPane.YES_NO_OPTION);
                }
                if(op==JOptionPane.YES_OPTION||op==128)
                    op=JOptionPane.showConfirmDialog(this,"Do you want to copy "+srcStr+" to "+desStr+" ?","Confirm",JOptionPane.YES_NO_OPTION);
                if(op==JOptionPane.YES_OPTION){
                    SwingWorker worker=new SwingWorker() {
                        protected Object doInBackground() throws Exception {
                            try {
                                IOUtil.copy(srcStr,desStr);
                                JOptionPane.showMessageDialog(MainView.this, "Success copy file.!");
                            }catch (IllegalArgumentException e1) {
                                JOptionPane.showMessageDialog(MainView.this,"File not exist!","Warning",JOptionPane.WARNING_MESSAGE);
                            }catch (IOException e2){
                                JOptionPane.showMessageDialog(MainView.this,"Fail to copy the file!");
                            }
                            return null;
                        }
                    };
                    worker.execute();
                }
            }else{
                JOptionPane.showMessageDialog(this, "Please enter file names.", "Warning", JOptionPane.WARNING_MESSAGE);
                if(srcStr==null){
                    srcButton.setBackground(Color.RED);
                    srcButton.setText("Click here to select source.");
                }
                if(desStr==null){
                    desButton.setBackground(Color.RED);
                    desButton.setText("Click here to select destination.");
                }
            }

        }
    }
}