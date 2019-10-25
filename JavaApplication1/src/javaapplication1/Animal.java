

/**
 *
 * @author PIRIL_KSK
 */
package javaapplication1;
public class Animal {
       
		private String name;
		private String ownername;
		private int footn;
		private int height;
		private boolean speak;
        
		public Animal(String name, String ownername, int footn, int height, boolean speak) {
			this.name= name;
			this.ownername= ownername;
			this.footn= footn;
			this.height= height;
			this.speak= speak;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOwnername() {
			return ownername;
		}

		public void setOwnername(String ownername) {
			this.ownername = ownername;
		}

		public int getFootn() {
			return footn;
		}

		public void setFootn(int footn) {
			this.footn = footn;
		}

		public int getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
		}

		public boolean isSpeak() {
			return speak;
		}

		public void setSpeak(boolean speak) {
			this.speak = speak;
		}
       
		public void show() {
	         System.out.println("name: "+ getName());
	        System.out.println("Ownername: "+ getOwnername());
	        System.out.println("foot Number: "+ getFootn());
         	System.out.println("Height: "+ getHeight());
	        System.out.println("Can it speak?: "+ isSpeak());
}
	
          
}

