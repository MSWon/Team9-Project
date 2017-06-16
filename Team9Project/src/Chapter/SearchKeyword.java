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
	//listStr은 임시로 만들어지는 형태 보려고 만듬. 추후 ArrayList Keyword에서 inputkey가 들어가있는 String을 추출해서 저장하는 곳으로 쓸 것임.
	private ArrayList<String> listStr;
	private Chapter c;
	private Cardpanel cp;
	private static int COUNT=0;
	private JButton caller;
	
	public SearchKeyword(JFrame frame, String title,JButton caller_input){
		super(frame,title);
		this.caller = caller_input;
		list=new JList();
		setLayout(new FlowLayout(new FlowLayout().LEFT));
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
		add(lbl1);
		add(inputkey);
		add(btnsearch);
		add(lbl2);
		add(scroll);
		add(btnok);
		add(btncancel);
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
		String key=inputkey.getText().toLowerCase();
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
			
				if(s.contains(key))
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
			//JTextField에 쓴 키워드가 원래 설정되어 있는 키워드에 속해있는지 판단하고
			//검색어가 속해있는 키워드들을 JList에 나열, 및 선택하게 함 
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
			//원하는 챕터로 이동
		}
	
		if(e.getSource().equals(btncancel))
		{
			dispose();
		}
	  }
	}
	

