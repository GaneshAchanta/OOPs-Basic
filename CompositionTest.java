package association;
class Car{
	String companyName;
	String carModel;
	Engine e;
	@Override
	public String toString() {
		return "Car [companyName=" + companyName + ", carModel=" + carModel + "]";
	}

	public Car(String companyName, String carModel) {
		this.companyName = companyName;
		this.carModel = carModel;
		Engine obj = new Engine("Petrol",125);//composition
		System.out.println(obj.engineType);
		System.out.println(obj.horsePower);
	}
	
}
class Engine{
	String engineType;
	int horsePower;
	public Engine(String engineType, int horsePower) {
		super();
		this.engineType = engineType;
		this.horsePower = horsePower;
	}
	
}

public class CompositionTest {

	public static void main(String[] args) {
		Car obj = new Car("TATA","Harrier");
		System.out.println(obj);

	}

}
