class Box
{
	//Data members
	int boxlength;
	int boxwidth;
	int boxheight;
	void setDimensions(int length,int width,int height)
	{
	this.boxlength=length;
	this.boxwidth=width;
	this.boxheight=height;
	}
	void getDimensions()
	{
	System.out.println(" "+boxlength+" "+boxwidth+" "+boxheight);
	}
	Box()
	{
	boxlength=2;
	boxwidth=2;
	boxheight=2;
	}
	Box(int l,int w,int h)
	{
	boxlength=l;
	boxwidth=w;
	boxheight=h;
	}
	int volume()
	{
	return boxlength*boxwidth*boxheight;
	}
}