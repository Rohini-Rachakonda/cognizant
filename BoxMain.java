class BoxMain
{
	public static void main(String args[])
	{
	//Box b=new Box();
	Box b=new Box(4,4,4);
	b.setDimensions(1,2,3);
	b.getDimensions();
	System.out.println("volume"+b.volume());
	}
}