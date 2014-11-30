package Core;

public class VolumeFactory {

	private static int IDcounter;
	private int ID;
	
	public static Volume VolumeFactory(String type) {
			if (type == "Directory") {
				return new Directory(IDcounter++);
			}
			else if (type == "File") {
				return new File(IDcounter++);
			}
			else return null;
		
	}

}
