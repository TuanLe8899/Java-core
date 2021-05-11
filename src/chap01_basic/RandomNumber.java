package chap01_basic;

public class RandomNumber {

	public static void main(String[] args) {

		while(true) {
			int randomNum = (int)(Math.random() * 101);
			
			if(randomNum>90 || randomNum <0) {
				System.out.println(randomNum);
				continue;
			} else {
				System.out.println("not exists");
			}
		}

	}

}
