package com.zl.xml_json.dom4j;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;
/*
 * 基于树形结构，第三方组件
 * 解析速度快，效率更高，使用jAVA中的迭代器实现数据读取，在WEB框架中使用较多（Hibernate）
 */
public class Dom4jDemo {
	
	
	@Test
	public void dom4jParseXML() throws DocumentException {
		//创建dom4j的解析器对象
		SAXReader reader = new SAXReader();
		InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("com/zl/xml_json/dom4j/person.xml");
		Document doc=reader.read(is);
		Element rootElemen=doc.getRootElement();
		Iterator<Element> it= rootElemen.elementIterator();
		List<Person> list= new ArrayList<>();
		Person p=null;
		while(it.hasNext()) {
			p=new Person();
			Element e= it.next();
			p.setPersonid(e.attributeValue("personid"));
			Iterator<Element> it2=e.elementIterator();
			while(it2.hasNext()) {
				Element e2=it2.next();
				String tag =e2.getName();
				switch (tag) {
				case "name":
					p.setName(e2.getText());
					break;
				case "address":
					p.setAddress(e2.getText());
					break;
				case "tel":
					p.setTel(e2.getText());
					break;
				case "fax":
					p.setFax(e2.getText());
					break;
				case "email":
					p.setEmail(e2.getText());
					break;
				}
			}
			list.add(p);
		}
		
		Iterator<Person> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
}
