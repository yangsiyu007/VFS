package Core;

import java.util.Collection;

public interface VFS_core {
	
	// create a virtual disk of user-specified size - this size remain fixed during the lifetime of the virtual disk
	// throw exception when physical disk does not have enough space on All the disks (if a computer has multiple) - ??
	// requirements: 1. the virtual disk must be stored in a single file in the working directory in the host file system
	//				(2. creation of a new disk with the specified maximum size at the specified location in the host file system)
	public boolean createDisk(int size, String name);
	
	// delete an existing virtual disk
	// throw exception if no virtual disk of this name exists
	public boolean deleteDisk(String nameDisk);
	
	// A method for querying amount of free space in a virtual disk
	public long freeSpaceOnDisk(String nameDisk);
	
	// A method for querying amount of occupied space in a virtual disk
	public long occupiedSpaceOnDisk(String nameDisk);
	
	// import files and directories from the host file system to a virtual disk
	// the user specifies the path of the directory to be imported from and to
	// throws exception is path is mal-specified
	public boolean importToDisk(String hostPath, String virtualPath);
	
	// export files and directories from the VFS to a physical directory
	// the user specifies the path of the directory to be exported from and to
	// provide the option to rename if there is an existing file of the same name ??
	public boolean exportToDisk(String virtualPath, String hostPath);
	
	// change the current directory to that of the pathFromHere, which is wrt current directory
	public boolean changeDirectory(String pathFromHere);
	
	// list the files and folders in the directory specified by the path
	public String list(String path);
	
	// rename a file specified by a path from the current directory
	public boolean rename(String pathFromHere);
	
	// copy a file specified by a path from the current directory
	// when copy() is invoked, the pathFromHere is stored in the global variable copyPad of the VFS, instead of making a copy of the data
	public boolean copy(String pathFromHere);
	
	// remove an existing file or directory
	public boolean remove(String pathFromHere);
	
	// move an existing file or directory
	public boolean move(String pathOfFile, String pathTo);
	
	// a search that returns a path to a file, or a list of paths if there are multiple files of the same name
	public Collection<String> find(String name);
	
	
	
	// a method for saving the current VFS' state to the physical disk via serialization
	

}
