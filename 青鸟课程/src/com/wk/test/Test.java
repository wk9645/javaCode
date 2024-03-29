package com.wk.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test {

	public static void main(String[] args) throws IOException {
	
		
		
		/*
		long start = System.currentTimeMillis();
		
		copyFile();
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);*/
		
	}
	
	
	
	public static void copyFile() throws IOException{
		
		Pet pet = new Pet("С��",6);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("F:\\test\\pet.txt")));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("F:\\test\\pet2.txt"),false)));
		
		
		String len = null;
		int count = 0;
		while((len = br.readLine()) != null){
			
			if(count++ == 1){
				System.out.println("�Ѹ�");
				
				len = len.replace("name", pet.getName());
				len = len.replace("age", pet.getAge()+"");
			}
			
			bw.write(len);
			bw.newLine();
			bw.flush();
		}
		
		
		bw.close();
		
	}
}



class Pet{
	
	private String name;
	private int age;
	
	
	public Pet(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Pet [name=" + name + ", age=" + age + "]";
	}
	
}