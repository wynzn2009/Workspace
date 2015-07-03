import java.text.DecimalFormat;


public class MathFuncBase {

	/**
	 * @param args
	 */
	private int m = 100;
	private double x = 0;
	private double y = 0;
	private static double step = 0.01;
	private double[][] a = new double[101][101];
	private double convergenceConst = 0;
	
	public double getConvergenceConst() {
		return convergenceConst;
	}

	public void setConvergenceConst(double convergenceConst) {
		this.convergenceConst = convergenceConst;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public static double getStep() {
		return step;
	}

	public static void setStep(double step) {
		MathFuncBase.step = step;
	}
	
	public double[][] getA() {
		return a;
	}

	public void setA(double[][] a) {
		this.a = a;
	}

	public MathFuncBase(int m, double x, double y) {
		super();
		this.m = m;
		this.x = x;
		this.y = y;
	}
	public MathFuncBase() {
	}
	public double cal(int m ,double xx,double yy){
		if(m%2==0){
			return 0;
		}else{
			double re = 0;
			re = (100*Math.sinh(m*Math.PI*yy)/Math.sinh(m*Math.PI)+20*Math.sinh(m*Math.PI*(1-yy))/Math.sinh(m*Math.PI))*Math.sin(m*Math.PI*xx)*2/(m*Math.PI);
			re = re + (40*Math.sinh(m*Math.PI*xx)/Math.sinh(m*Math.PI)+200*Math.sinh(m*Math.PI*(1-xx))/Math.sinh(m*Math.PI))*Math.sin(m*Math.PI*yy)*2/(m*Math.PI);
			return re;
		}
		
	}
	public boolean isConverge(double k,int m){
		if(m%2==0){
			return false;
		}else if(Math.abs(this.convergenceConst-k)<=0.1){
			this.setConvergenceConst(0);
			return true;
		}else{
			System.out.println(Math.abs(this.convergenceConst-k));
			this.setConvergenceConst(k);
			return false;
		}
	}
	
	public void compute(){
		double temp = 0;
		int m = 0;
		DecimalFormat df=new DecimalFormat("########0.00");
		for(int i=0;i<101;i++){
			for(int j=0;j<101;j++){
				do{
					m++;
					double kk = this.cal(m,i*0.01, j*0.01);
					temp = temp + kk;
				//}while(!this.isConverge(temp,m));
				}while(m<224);
				this.a[i][j] = temp;
				System.out.println("x="+df.format(i*0.01)+"y="+df.format(j*0.01)+"结果："+temp);
				m = 0;
				temp = 0;
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathFuncBase test = new MathFuncBase();
		test.compute();
		System.out.println(test.getA()[1][1]);
		toExcel.Write(test.getA());
		//MathFuncBase aa = new MathFuncBase();
		//aa.compute();
		//double re =(200*Math.sinh(225*Math.PI*1)/Math.sinh(225*Math.PI))*Math.sin(225*Math.PI*0.01)*2/(225*Math.PI);
		//double a = Math.sinh(225*Math.PI);
		//double b = 20*Math.sinh(225*Math.PI*1);
		
	}

}
