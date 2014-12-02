package Core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.LongBuffer;

public class DiskPhysical {

	private final int MIN_SIZE = 8;
	private long[] memory;
	private final long spaceTotal;
	private long spaceAvailable, spaceOccupied;
	
	// Once the disk is created, its size remains constant
	// parameter size cannot be greater than INT_MAX - at the core stage 
	// - modify later to use an ArrayList to contain multiple long[] so we can accommodate more
	public DiskPhysical(int size) {
		// a Disk's size must be a multiple of MIN_SIZE; we choose the sizeof(long) = 8 here
		spaceTotal = toMultiple(size, MIN_SIZE);
		spaceAvailable = spaceTotal;
		spaceOccupied = 0;
		
		memory = new long[size];
	}

	// returns True if import was successful
	// ----------> can we import a directory? an idea for improvement
	public void importToDisk(File file) throws DiskException, FileNotFoundException {
		
		if(!file.isFile()) {
			throw new DiskException("File asked to import is not a normal file");
		}
		
		long fileSize = file.length(); // length of the file in bytes
		if(fileSize > spaceTotal) { 
			throw new DiskException("Virtual disk too small to store this file"); // optional
		}
		if(fileSize > spaceAvailable) {
			throw new DiskException("Current virtual disk does not have enough space to store this file");
		}
		
		String fileName = file.getName();
		
		//	DataInputStream inputStream = new DataInputStream(new BufferedInputStream())
		
		// need to catch exceptions??
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
		
		while(bufferedReader.ready()) {
	}
	
	// return True if export was successful
	public void exportToDisk() {
		
	}


	private long toMultiple(int size, int multiple) {
		int remainder = size % multiple;
		
		if (remainder == 0) return size;
		else {
			int complement = multiple - remainder;
			long space = size + complement;
			return space;
		}
	}
	

}
