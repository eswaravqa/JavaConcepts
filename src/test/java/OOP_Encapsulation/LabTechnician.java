package OOP_Encapsulation;

public class LabTechnician {

	public static void main(String[] args) {
	
		LabTest lt = new LabTest();
		lt.name = "Madan";
		lt.bp = 120.80;
		lt.hba1c = 6.5;
		
		lt.setFastingGlucose(90);
		lt.setAge(45);
		
		System.out.println(lt.getName()+"|"+lt.getAge()+"|"+lt.getBp()+"|"+lt.getFastingGlucose()+"|"+lt.getHba1c());

	}

}
