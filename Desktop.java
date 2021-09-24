package week3.day2;

public class Desktop implements SoftWare,HardWare{
	public void desktopModel(String a) {
		System.out.println("The System Model is: " +a);
	}

	@Override
	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("No pen or touch is available");
	}

	@Override
	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("OS: Windows 10");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Desktop h=new Desktop();
h.desktopModel("Dell");
h.hardwareResources();
h.softwareResources();
	}

}

//Interface :HardWare
//Methods   :hardwareResources()
//
//Interface :Software
//Methods   :softwareResources()
//
//Class     :Desktop
//Methods   :desktopModel()
//
//Description:
//cre/ate 2 Interface and archieve multiple inheritance.