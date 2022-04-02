package sample;
public class Employeeinfo {
	private void empinfo(){
		System.out.println("my employee info");
	}
	private void empinfo(String n){
		System.out.println("employee name is:"+n);
	}
	private void empInfo(int id){
		System.out.println("employee id is:"+id);
	}
	private void empInfo(String city,int pin){
		System.out.println("employee city is "+city);
		System.out.println("employee pincode is"+pin);
	}
	private void empInfo(String email,long mobile){
		System.out.println("employee mob is "+mobile);
		System.out.println("employee email is"+email);
	}
	private void empInfo(long mobile,String email){
		System.out.println("employee alternate mobile is " +mobile);
		System.out.println("employee alternate email is"+email);
	}
	public static void main(String[] args) {
		Employeeinfo s=new Employeeinfo();
		s.empinfo();
		s.empInfo(200);
		s.empinfo("Thillai");
		s.empInfo("ariyalur" ,600001);
		s.empInfo("123@gmail.com", 1234567890l);
		s.empInfo(1234567890l ,"123@gmail.com");
	}		
}

