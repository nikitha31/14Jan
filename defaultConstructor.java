class DC{
   DC(){
      System.out.println("Default constructor");
   }
   public void xyz()
   {
       System.out.println("xyz");
   }
}
class Main{
   public static void main(String args[]){
	DC obj = new DC();
	obj.xyz();
   }
}