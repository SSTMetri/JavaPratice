package examples;

class CAR
{
	String carName;
	String carType;
	public CAR(String carName,String carType)
	{
		this.carName=carName;
		this.carType=carType;
	}
	
	class Engine
	{
		String engineType;
		void setEngine()
		{
			if(CAR.this.carName.equals("4WD"))
			{
				if(CAR.this.carType.equals("XYZ"))
				{
					this.engineType="Smaller engine";
				}
				else
				{
					this.engineType="Bigger engine";
				}
			}
			else {
				this.engineType="Different type, smaller engine";
			}
		}
		String getEngineType()
		{
			return engineType;
		}
	}
}

public class Car_EngineType 
{
	public static void main(String[] args) 
	{
		CAR car1=new CAR("8WD","XYZ");
		CAR.Engine engine=car1.new Engine();
		engine.setEngine();
		String str=engine.getEngineType();
		System.out.println(str);
		
		CAR car2=new CAR("4WD","XYZ");
		CAR.Engine engine2=car2.new Engine();
		engine2.setEngine();
		String str2=engine2.getEngineType();
		System.out.println(str2);
		
		
	}

}
