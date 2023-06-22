package javaconcepts;

public class ConstructerOverLoading {
	
		private int eid;
		private int eage;
		
		ConstructerOverLoading()
		{
			eid=100;
			eage=45;
		}
		ConstructerOverLoading(int eid,int eage)
		{
			this.eid=eid;
			this.eage=eage;
			
		}
		public int getEid()
		{
			return eid;
		}
		public void setEid(int neweid)
		{
			eid=neweid;
		}
		public int getEage()
		{
			return eage;
		}
		public void setEage(int neweage)
		{
			eage=neweage;
		}
		
	public static void main(String args[])
		{
		ConstructerOverLoading emp=new ConstructerOverLoading();
		System.out.println("Employee ID:" +emp.getEid());
		System.out.println("Employee AGE:" +emp.getEage());
		ConstructerOverLoading emp1=new ConstructerOverLoading(1000,25);
		System.out.println("Employee ID:" +emp1.getEid());
		System.out.println("Employee AGE:" +emp1.getEage());
		}
		
}
