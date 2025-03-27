package Com.tnsif.Practice2;

  class Animal 
{
	float salary=80;
//		void eat()
//		{
//			System.out.println("eating");
//		}
	}
	class Dog extends Animal
	{
		float bonus=89;
//		void bark()
//		{
//			System.out.println("barking");
//		}
	}
	   class C
	  {
		public static void main (String[] args) 
		{
			Dog d=new Dog();
			System.out.println("salary"+d.salary);
			System.out.println("salary"+d.bonus);
//			d.eat();
//			d.bark();
		}
	}

