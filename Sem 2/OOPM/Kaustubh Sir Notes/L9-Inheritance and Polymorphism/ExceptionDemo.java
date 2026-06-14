class SampleException extends Exception{
	private int e;
	SampleException(int num1){
		e = num1;
	}
	public String toString(){
		return "(" + e +") is less than Ten";
	}
}
class ExceptionDemo{
	static void sum(int num,int num1) throws SampleException{
		if(num1<10)
		{
			throw new SampleException(num1);
		}
		else
		{
			System.out.println(num+num1);
		}
	}
	public static void main(String[] args){
		try
		{
			sum(-5, 4);
		}
		catch(SampleException e1)
		{
			System.out.println(e1);
		}
	}
}