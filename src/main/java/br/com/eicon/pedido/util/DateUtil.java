package br.com.eicon.pedido.util;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class DateUtil {

	public static XMLGregorianCalendar newXMLGregorianCalendar() {
		return newXMLGregorianCalendar(new Date());
	}

	public static XMLGregorianCalendar newXMLGregorianCalendar(Date date) {
		XMLGregorianCalendar xmlDate = null;
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTimeZone(TimeZone.getTimeZone("UTC")); 

		gc.setTime(date);

		try{
		    xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
		}
		catch(Exception e){
		    e.printStackTrace();
		}
		
		return xmlDate;
	}
}
