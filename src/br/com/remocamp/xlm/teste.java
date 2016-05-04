package br.com.remocamp.xlm;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class teste {

	public static void main(String[] args) throws JDOMException, IOException {

		File f = new File("C:\\Users\\fabiano\\Downloads\\xml_000571938345573083.xml");
		SAXBuilder sb = new SAXBuilder();
		Document d = sb.build(f);
		Element mural = d.getRootElement();
		List elements = mural.getChildren();
		Iterator i = elements.iterator();
		
		 while (i.hasNext()){
			 Element element = (Element) i.next();  
			 System.out.println("Nº NOTA :"+element.getChildText("NUM_NOTA"));
			 System.out.println("DATA DA EMISS�O :"+element.getChildText("DATA_HORA_EMISSAO"));
			 System.out.println("DIA DA EMISSAO :"+element.getChildText("DIA_EMISSAO"));
			 System.out.println("PRESTADOR RAZAO SOCIAL :"+element.getChildText("PRESTADOR_RAZAO_SOCIAL")+"\n");
		 }
	}
}
