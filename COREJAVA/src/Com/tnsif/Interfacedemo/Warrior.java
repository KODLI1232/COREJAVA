package Com.tnsif.Interfacedemo;

public class Warrior implements Character,Weapon {

	@Override
	public void use() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("attccak");
	}
	public static void main(String[] args) {
		Warrior w=new Warrior();
		w.use();
		w.attack();
		
	}
	

}
