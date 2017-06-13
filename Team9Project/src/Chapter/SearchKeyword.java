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
	private JButton btnsearch=new JButton("image����");
	private JButton btnok=new JButton("Go");
	private JButton btncancel=new JButton("Cancel");
	private JLabel lbl1=new JLabel("Enter Keyword : ");
	private JLabel lbl2=new JLabel("Similar Keywords\n");
	//listStr�� �ӽ÷� ��������� ���� ������ ����. ���� ArrayList Keyword���� inputkey�� ���ִ� String�� �����ؼ� �����ϴ� ������ �� ����.
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
			//JTextField�� �� Ű���尡 ���� �����Ǿ� �ִ� Ű���忡 �����ִ��� �Ǵ��ϰ�
			//�˻�� �����ִ� Ű������� JList�� ����, �� �����ϰ� �� 
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
						//chapter m ���� �̵�					
						clt.show(cp, "panel" + m);
//						dispose();
						
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
	

