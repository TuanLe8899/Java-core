package chap02.oop;

public class Main {
	
	// Tổng   hai phân số 
	// Hiệu   hai phân số
	// Tích   hai phân số
	// Thương hai phân số
	public static void main(String[] args) {
		Fraction fractionA = new Fraction(1, 4);
		Fraction fractionB = new Fraction(2, 4);
		
		Fraction fractionC = new Fraction(fractionA, fractionB, "+");
		System.out.printf("%s + %s = %s \n", fractionA.print(), fractionB.print(), fractionC.print());
		Fraction fractionD = new Fraction(fractionA, fractionB, "-");
		System.out.printf("%s - %s = %s \n", fractionA.print(), fractionB.print(), fractionD.print());
		Fraction fractionE = new Fraction(fractionA, fractionB, "*");
		System.out.printf("%s * %s = %s \n", fractionA.print(), fractionB.print(), fractionE.print());
		Fraction fractionF = new Fraction(fractionA, fractionB, "/");
		System.out.printf("%s / %s = %s \n", fractionA.print(), fractionB.print(), fractionF.print());
	}
		 
	// UCLN của 2 số a và b là giá trị lớn nhất mà cả 2 số a và b đ�?u chia hết cho nó 
	// 3/9	1/3		UCLN = 3
	public static void main011(String[] args) {
		Fraction fractionA	= new Fraction(2, 8);	// 2/4
		Fraction fractionB	= new Fraction(2, 4);	// 3/9
		
		System.out.printf("UCLN của %s là: %d \n",fractionA.print(),fractionA.UCLN(fractionA.getNumerator(), fractionA.getDenominator()));
		System.out.printf("UCLN của %s là: %d \n",fractionB.print(),fractionB.UCLN(fractionB.getNumerator(), fractionB.getDenominator()));
	}	
	
	// Kiểm tra phân số tối giản khi UCLN của tử số và mẫu số = 1
	public static void main012(String[] args) {
		Fraction fractionA	= new Fraction(2, 8);	// 2/4
		Fraction fractionB	= new Fraction(1, 4);	// 3/9
		
		if(fractionA.checkNormalize() == true) {
			System.out.println(fractionA.print()+" đã ở dạng tối giản");
		} else {
			System.out.println(fractionA.print()+" chưa ở dạng tối giản");
		}
		
		if(fractionB.checkNormalize() == true) {
			System.out.println(fractionB.print()+" đã ở dạng tối giản");
		} else {
			System.out.println(fractionB.print()+" chưa ở dạng tối giản");
		}
	}
	
	// Tối giản phân số
	public static void main013(String[] args) {
		Fraction fractionA	= new Fraction(2, 8);	// 2/4
		Fraction fractionB	= new Fraction(2, 4);	// 3/9
		
		System.out.print("Phân số "+fractionA.print()+" sau khi tối giản là: ");
		fractionA.normalize();
		System.out.println(fractionA.print());
		
		System.out.print("Phân số "+fractionB.print()+" sau khi tối giản là: ");
		fractionB.normalize();
		System.out.println(fractionB.print());

	}
	
	// Fraction  
	// Khởi tạo phân số
	// Nhập phân số
	// In phân số
	public static void main008(String[] args) {
		Fraction fractionA	= new Fraction(2, 4);
		Fraction fractionB	= new Fraction(3, 9);
		
		System.out.println(fractionA.print());
		System.out.println(fractionB.print());
	}
	
	// 008 Static
	public static void main08(String[] args) {
		Counter counterObj1	= new Counter();	// object instance
		Counter counterObj2	= new Counter();
		Counter counterObj3	= new Counter();
//		
//		counterObj1.showCount();
//		counterObj2.showCount();
//		counterObj3.showCount();
		Counter.showCount();
	}

	// 007 Access modifier  
	//	Private chặn truy cập ở ngoài class 				(property, method)
	//	Null (rỗng) truy cập trong package 					(class,property, method)
	//	Protected truy cập trong package và các subclasses 	(property, method)
	//	Public truy cập từ bất kỳ đâu 						(class, property, method)

	public static void main007(String[] args) {
		Person personObj	= new Person();
		personObj.name		= "Abc";
		
	}
	
	// 006 Overriding  
	public static void main006(String[] args) {
		Student studentObj	= new Student();
		studentObj.setName("Peter");
		studentObj.setCode("SV001");
		studentObj.setBirthday(1997);
		studentObj.setScore(8.5);
		
		studentObj.showInfo();
	}
		
	// 005 Inheritance 
	public static void main005(String[] args) {
		Person personObj	= new Person();
		//personObj.showInfo();
		
		Student studentObj	= new Student();
		studentObj.setName("Peter");
		studentObj.showInfo();
		
		Teacher teacherObj	= new Teacher();
		teacherObj.setName("Mr Peter");
		teacherObj.showInfo();
	}
	
	// 004 Constructor
	/*
	public static void main004(String[] args) {
		Student studentOne	= new Student("John", "Sv009", 2000);
		studentOne.showInfo();
	}

	// 003 Overloading
	public static void main003(String[] args) {
		
		Student studentOne	= new Student();
		
		//studentOne.setCode("S001");
		studentOne.setCode(456);
		
		System.out.println("Code: " + studentOne.getCode());
	}
	
	// 002 Setter + Getter + Method
	public static void main002(String[] args) {
		
		Student studentOne	= new Student();
		Student studentTwo	= new Student();
		
		// studentOne
		studentOne.setBirthday(1994);
		studentOne.setName("John");
		studentOne.setCode("S001");
		studentOne.showInfo();
		
		// studentTwo
		studentTwo.setBirthday(1990);
		studentTwo.setName("Peter");
		studentTwo.setCode("S002");
		studentTwo.showInfo();
	}
		
	// 001 Property
	public static void main001(String[] args) {
		
		Student studentOne	= new Student();
		Student studentTwo	= new Student();
		
		studentOne.birthday	= 1994;
		studentOne.name		= "John";
		studentOne.code		= "S001";
		
		studentTwo.birthday	= 1990;
		studentTwo.name		= "Peter";
		studentTwo.code		= "S002";
		
		System.out.println("Student Info: ");
		System.out.println("- Name: " + studentOne.name);
		System.out.println("- Code: " + studentOne.code);
		System.out.println("- Birthday: " + studentOne.birthday);
		
		System.out.println("--------------------------");
		
		System.out.println("Student Info: ");
		System.out.println("- Name: " + studentTwo.name);
		System.out.println("- Code: " + studentTwo.code);
		System.out.println("- Birthday: " + studentTwo.birthday);
	}
	*/
}

