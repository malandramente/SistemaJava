package br.univel.classes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Control {

	private String titleTADS, subTitle, date;
	private int hour,minute;
	
	Calendar calendario = Calendar.getInstance(new Locale("pt-br"));
	
	public ImageIcon iconMain(){
		ImageIcon icon = new ImageIcon("C:\\JavaDOC\\Sistema\\icons\\Coins-48.png");
		return icon;
	}
	 
	public String getTitleTADS(){
		titleTADS = "Banco TADS";
		return titleTADS;
	}
	
	public String getSubTitle(){
		subTitle = "Aqui sua nota não vai ser zero";
		return subTitle;
	}
	
	public String getDate(){
		date = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
		return date;
	}
	
	public String getHour(){
		hour   = calendario.get(Calendar.HOUR_OF_DAY);
		minute = calendario.get(Calendar.MINUTE);
		return hour+":"+minute;
	}
}
