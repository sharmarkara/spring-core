package in.rakesh.main;

import java.io.BufferedReader;
import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.util.FileSystemUtils;

import in.rakesh.bean.College;
import in.rakesh.bean.ContactsInfo;
import in.rakesh.bean.MarksInfo;
import in.rakesh.bean.UniversityInfo;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("in/rakesh/cfg/applicationContext.xml");

		//Array object is injected
		MarksInfo marksInfo = factory.getBean("marksInfo", MarksInfo.class);
		System.out.println(marksInfo);

		System.out.println();
		
		//List object injected
		College clg = factory.getBean("college", College.class);
		System.out.println(clg);

		System.out.println();
		
		//Set object is injected
		ContactsInfo info = factory.getBean("cinfo", ContactsInfo.class);
		System.out.println(info);
		
		System.out.println();
		
		//Map object is injected
		UniversityInfo universityInfo = factory.getBean("university",UniversityInfo.class);
		System.out.println(universityInfo);
	}

}
