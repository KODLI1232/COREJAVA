package Com.tnsif.Abstraction;

public class Square extends Shape
{
	private float side;
	public Square()
	{
		side=2.0f;
	}
	public Square(float side)
	{
		this.side=side;
	}

	@Override
	void calarea() {
		// TODO Auto-generated method stub
		super.area=side*side;
		
	}

}
