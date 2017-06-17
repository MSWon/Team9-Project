package Chapter;

import java.awt.*;
import Chapter.*;
import Main.MainPage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class SearchKeyword extends JDialog implements ActionListener{
	private JTextField inputkey=new JTextField(10);
	private JScrollPane scroll=new JScrollPane();
	private JTextArea area=new JTextArea();
	private JList list;
	private JButton btnsearch;
	private JButton btnok=new JButton("Go");
	private JButton btncancel=new JButton("Cancel");
	private JLabel lbl1=new JLabel("Enter Keyword : ");
	private JLabel lbl2=new JLabel("Similar Keywords\n");
	//listStr�� �ӽ÷� ��������� ���� ������ ����. ���� ArrayList Keyword���� inputkey�� ���ִ� String�� �����ؼ� �����ϴ� ������ �� ����.
	private ArrayList<String> listStr;
	private Chapter c;
	private Cardpanel cp;
	private static int COUNT=0;
	private JButton caller;
	
	public SearchKeyword(JFrame frame, String title,JButton caller_input){
		super(frame,title);
		this.setResizable(false);
		this.caller = caller_input;
		list=new JList();
		setSize(350,300);
		ImageIcon oriicon=new ImageIcon("search_icon.png");
		Image oriimg=oriicon.getImage();
		Image changedimg=oriimg.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		ImageIcon icon=new ImageIcon(changedimg);
		btnsearch=new JButton(icon);
		btnsearch.addActionListener(this);
		btnok.addActionListener(this);
		btncancel.addActionListener(this);
		scroll.setViewportView(list);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lbl1)
									.addGap(5)
									.addComponent(inputkey, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnsearch))
								.addComponent(lbl2)
								.addComponent(scroll, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(btnok)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btncancel)))
					.addContainerGap(60, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(3)
									.addComponent(lbl1))
								.addComponent(inputkey, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(5)
							.addComponent(lbl2))
						.addComponent(btnsearch))
					.addGap(5)
					.addComponent(scroll, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btncancel)
						.addComponent(btnok))
					.addGap(44))
		);
		getContentPane().setLayout(groupLayout);
		setLocation(350,200);
		
		this.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) 
			{
			
				caller.setEnabled(true);// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		this.setVisible(true);
	}
	
	public void keysearch(){
		
		
		ArrayList<String> listStr1 = new ArrayList<String>();
		
		c = new Chapter();
		c.set();
		String key=inputkey.getText();
		ArrayList<String> as=new ArrayList<String>();
		listStr = new ArrayList<String>();
		ValueList[] copy=new ValueList[30];
		
		copy=c.vl.clone();
		listStr1.add("--------------------------------------------------------------------");
		
		for(ValueList a: copy)
		{
			as=(ArrayList<String>) a.getKeyWord().clone();
			for(String s:as)
			{
			  String s2 = s.toLowerCase();
			
				if(s2.contains(key))
				{
					listStr.add(s);
				}
			
			}
		}
		int n=1;
		for(String k:listStr)
		{
			listStr1.add(k);
		}
		
		list.setListData(listStr1.toArray());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		

		// TODO Auto-generated method stub
		int m=1; //chapter number
		
		Cardpanel cp= Chapter.cardpanel;

		CardLayout clt=(CardLayout)(cp.getLayout());
		
		
		if(e.getSource().equals(btnsearch))
		{
		
			keysearch();
			
			//JTextField�� �� Ű���尡 ���� �����Ǿ� �ִ� Ű���忡 �����ִ��� �Ǵ��ϰ�
			//�˻�� �����ִ� Ű������� JList�� ����, �� �����ϰ� �� 
		}
		
		Object selected = list.getSelectedValue();
		
		
		if(e.getSource().equals(btnok))
		{
			for(ValueList v:c.vl)
			{
				ArrayList<String> x=(ArrayList<String>)v.getKeyWord().clone();
				for(String s:x)
				{			
					if((list.getSelectedValue() == null))
						;
					else if(list.getSelectedValue().equals(s)){				
							//move to chapter m 		
							clt.show(cp, "panel" + m);
//							dispose();
					}
				}
				
				m++;
			}
			//���ϴ� é�ͷ� �̵�
		}
	
		if(e.getSource().equals(btncancel))
		{
			dispose();
		}
	  }
	}
	

