package java_1209;

public class Car3 {
	public String name;
	public String type;
	public String color;
	public String size;
	public int maxSpeed;
	
	public Car3() {
		this("아반떼");
//		this.name = "아반떼";
//		this.type = "세단";
//		this.color = "회색";
//		this.size = "준중형";
//		this.maxSpeed = 250;
	}
	
	public Car3(String name) {
		this(name, "세단");
//		this.name = name;
//		this.type = "세단";
//		this.color = "회색";
//		this.size = "준중형";
//		this.maxSpeed = 250;
	}
	
	public Car3(String name, String type) {
		this(name, type, "회색");
	}
	
	public Car3(String name, String type, String color) {
		this(name, type, color, "준중형");
	}
	
	public Car3(String name, String type, String color, String size) {
		this(name, type, color, size, 250);
	}
	
	public Car3(String name, String type, String color, String size, int maxSpeed) {
		this.name = name;
		this.type = type;
		this.color = color;
		this.size = size;
		this.maxSpeed = maxSpeed;
	}
	
	public void ptrCarInfo() {
		System.out.println("차명 : " + this.name);
		System.out.println("차종 : " + this.type);
		System.out.println("크기 : " + this.color);
		System.out.println("컬러 : " + size);
		System.out.println("최고속 : " + maxSpeed);
	}
}
