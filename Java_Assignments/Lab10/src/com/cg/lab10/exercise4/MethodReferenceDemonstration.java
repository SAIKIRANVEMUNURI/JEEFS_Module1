package com.cg.lab10.exercise4;


	interface A{
		public int say();
	}
	public class MethodReferenceDemonstration {
		private int b;

		public int getB() {
			return b;
		}

		public void setB(int b) {
			this.b = b;
		}
		
		
		public static void main(String args[])
		{
			MethodReferenceDemonstration obj = new MethodReferenceDemonstration();
			obj.setB(6);
			A obj1=obj::getB;
			obj1.say();
		}

	}

