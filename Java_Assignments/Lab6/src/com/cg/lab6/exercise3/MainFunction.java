package com.cg.lab6.exercise3;

import java.util.Scanner;

public class MainFunction {

	public static void main(String[] args) {
	

			
				// TODO Auto-generated method stub
				System.out.println("Enter String:");
				Scanner sc =new Scanner(System.in);
				String s;
				s=sc.nextLine();
				StringBuffer tt = new StringBuffer(s);
				MirrorImage mm = new MirrorImage();
				System.out.println(mm.getImage(tt));
				
				

			}

		}

