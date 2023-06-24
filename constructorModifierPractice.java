package DemoClass;
      class cy{
    	 private int height;
    	 private int radius;
    	//setter 
         public void setHeight(int h) {
        	 this.height = h; 
         }
         //getter
         public int getHeight() {
        	 return height;
         }
         //setter
         public void setRadius(int r) {
        	 this.radius = r;
         }
         
         public int getRadius() {
        	 return radius;
         }
         
         public double AreaoFCylinder(){
        	 return  2 * 3.14*radius*radius + 2*3.14*radius*height;
         }
      }
      
public class constructorModifierPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object
		
		cy cylinder = new cy();
//        cylinder.setHeight(2);
//        System.out.println(cylinder.getHeight());
//        
//        cylinder.setRadius(3);
//        System.out.println(cylinder.getRadius());
		
		cylinder.setHeight(2);
		cylinder.setRadius(3);
		System.out.println(cylinder.AreaoFCylinder());

	}

}
