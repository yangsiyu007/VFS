package Core;

import java.util.Collection;

public class VFS implements VFS_core {
	
	private static int IDcounter;
	

	public VFS() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean createDisk(int size, String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteDisk(String nameDisk) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long freeSpaceOnDisk(String nameDisk) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long occupiedSpaceOnDisk(String nameDisk) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean importToDisk(String hostPath, String virtualPath) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exportToDisk(String virtualPath, String hostPath) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean changeDirectory(String pathFromHere) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String list(String path) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean rename(String pathFromHere) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean copy(String pathFromHere) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(String pathFromHere) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean move(String pathOfFile, String pathTo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Collection<String> find(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
