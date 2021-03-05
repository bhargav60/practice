package coding;

class ha
{
	private String snm;
	private int rno;
	public String getSnm() {
		return snm;
	}
	public void setSnm(String snm) {
		this.snm = snm;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	
}



public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ha ob=new ha();
        ob.setSnm("bhanu");
        ob.setRno(18532);      
        System.out.println(ob.getSnm());
        System.out.print(ob.getRno());

	}

}


