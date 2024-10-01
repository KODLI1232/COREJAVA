package Com.tnsif.LambdaExpression;

import java.util.ArrayList;

public class lambdaexpression {
//	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>li=new ArrayList();
li.add(1);
li.add(4);
li.add(6);
li.add(2);
li.forEach(ele->System.out.println(ele));
	}

}
