package com.zl.xml_json.jdom;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.junit.Test;

import com.zl.xml_json.dom4j.Person;

public class JDOM {
	/*
	 * 使用jdom解析xml
	 * 
	 * 与Dom的区别
	 * 第三方开源组件
	 * 实现java的Collection接口效率比dom更快
	 * 
	 */
	@Test
	public void jdomParseXML() throws JDOMException, IOException {
		// 船舰JDOM解析器
		SAXBuilder builder = new SAXBuilder();
		InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("com/zl/xml_json/jdom/person.xml");
		Document build = builder.build(is);
		Element rootElement = build.getRootElement();
		List<Person> list = new ArrayList<>();
		Person p = null;
		List<Element> children = rootElement.getChildren();
		for (Element element : children) {
			p = new Person();
			String personid = element.getAttributeValue("personid");
			p.setPersonid(personid);
			List<Element> children1 = element.getChildren();
			for (Element e : children1) {
				String tag=  e.getName();
				switch (tag) {
				case "name":
					p.setName(e.getText());
					break;
				case "address":
					p.setAddress(e.getText());
					break;
				case "tel":
					p.setTel(e.getText());
					break;
				case "fax":
					p.setFax(e.getText());
					break;
				case "email":
					p.setEmail(e.getText());
					break;
				}
			}
			list.add(p);
		}
		for(Person ps :list) {
			System.out.println(ps);
		}
	}
}
