package Chapter;

import java.awt.*;
import Main.MainPage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.Border;

public class SearchKeyword extends JDialog implements ActionListener{
	private JTextField inputkey=new JTextField(10);
	private JScrollPane scroll=new JScrollPane();
	private JTextArea area=new JTextArea();
	private JList list=new JList();
	private JButton btnsearch=new JButton("image넣자");
	private JButton btnok=new JButton("Go");
	private JButton btncancel=new JButton("Cancel");
	private JLabel lbl1=new JLabel("Enter Keyword : ");
	private JLabel lbl2=new JLabel("Similar Keywords\n");
	//listStr은 임시로 만들어지는 형태 보려고 만듬. 추후 ArrayList Keyword에서 inputkey가 들어가있는 String을 추출해서 저장하는 곳으로 쓸 것임.
	private String listStr1[]=new String[50];
	private ArrayList<String> listStr=new ArrayList<String>();
	private Chapter c;
	private Cardpanel cp;
	public SearchKeyword(JFrame frame, String title){
		super(frame,title);
		//c=new Chapter();
		listStr1[0]="---------------------------------";
		setLayout(new FlowLayout(new FlowLayout().LEFT));
		setSize(350,300);
		btnsearch.addActionListener(this);
		btnok.addActionListener(this);
		btncancel.addActionListener(this);
		scroll.setViewportView(list);
		//scroll.setBorder(border);
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
		//setModal(true);
		//setVisible(true);
	}
	
	public void keysearch(){
		//Chapter b=new Chapter();
		
		c = new Chapter();
		c.set();
		String key=inputkey.getText();
		ArrayList<String> as=new ArrayList<String>();
		ValueList[] copy=new ValueList[30];
		
		copy=c.vl.clone();
		int p=0;
		for(ValueList a: copy)
		{
			as=(ArrayList<String>) a.getKeyWord().clone();
			for(String s:as)
			{
				//System.out.println(as.get(p));
				if(s.contains(key))
				{
					listStr.add(s);
//					System.out.println(listStr.get(p));
					p++;
				}
			}
		}
		int n=1;
		for(String k:listStr)
		{
			listStr1[n++]=k;
		}
		listStr1[0]="--------------------------------------------------------------------";
		//listStr1[n]="--------------------------------------------------------------------";
		list.setListData(listStr1);
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
		if(e.getSource().equals(btnok))
		{
			for(ValueList v:c.vl)
			{
				//ArrayList<String> x=v.getKeyWord();
				ArrayList<String> x=(ArrayList<String>)v.getKeyWord().clone();
				for(String s:x)
				{

					if(list.getSelectedValue().equals(s))
					{
						//chapter m 으로 이동					
						clt.show(cp, "panel" + m);
//						dispose();
						
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
	

