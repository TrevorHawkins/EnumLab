package edu.csc180.enums;

public enum Opperation {  
	

	
	Add{
		public int impliment(int n1, int n2){
			return n1 + n2;
		}
		
	},
	Subtract{  
		public int impliment(int n1, int n2){
			return n1 - n2;
		}
		
	},
	Multiply{ 
		public int impliment(int n1, int n2){
			return n1*n2; 
		}
		
	},
	Divide{ 
		public int impliment(int n1, int n2){
			return n1/n2;
		}
		
	};  
	
	 public int impliment(int n1, int n2){ 
		 return 0;
		 
	 }

		
	
	
}

