package JFrame;

public class RownanieKwadratowe {
	
	private int a, b, c;

	public RownanieKwadratowe(int a, int b, int c) {
	this.a = a;
	this.b= b;
	this.c=c;		
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public String rozwiaz(){
		String rozwi�zanie ="";
		double delta = (b*b-4*a*c);
		
		if(delta>0.0){
			delta=Math.sqrt(delta);
			double x1=(-b-delta)/(2*2);
			double x2=(-b+delta)/(2*a);
			rozwi�zanie = "Rozwi�zanie r�wnania posiada dwa pierwiastki rzeczywiste: " + x1 + "oraz " + x2;
		}else if(delta==0) {
			delta=Math.sqrt(delta);
			double x0=-b/(2*a);
			rozwi�zanie = "R�wnanie posiada jeden pierwiastek rzeczywisty: " + x0;
		}else if (delta<0) {
			rozwi�zanie= "R�wnanie nie posiada pierwiastk�w rzeczywistych";			
		}
		
		
		return rozwi�zanie;
	}
	

}
