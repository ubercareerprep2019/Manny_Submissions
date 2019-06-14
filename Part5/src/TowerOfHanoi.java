import java.util.*;
//as far as i got in 2 hours.
class TowerOfHanoi
{ 
	ArrayList<DiskContainer> sticks = new ArrayList<DiskContainer>(3);
	TowerOfHanoi(int n){
		for(int i = 0; i < 3; i++) {
			DiskContainer contain = new DiskContainer();
			sticks.add(contain);
		}
		for(int i = 0; i < n; i++) {
			Disk toAdd = new Disk(i);
			sticks.get(0).add(toAdd);
		}
	}
      

    public static void main(String args[]) 
    { 
        TowerOfHanoi toh = new TowerOfHanoi(3);
        toh.print();
        toh.move(0, 2);
        toh.print();
    }
    
    public void move(int stick1, int stick2) {
    	sticks.get(stick2).add(sticks.get(stick1).remove());
    }
    
    public void print() {
    	System.out.println("New Move");
    	for(int i = 0; i < 3; i++) {
    		System.out.println("Stick:" + i + " ");
    		sticks.get(i).print();
    	}
    }
} 

class Disk{
	int diskNumber;
	Disk(int diskNumber){
		this.diskNumber = diskNumber;
	}
}

class DiskContainer{
	
	ArrayList<Disk> allDisk;
	
	DiskContainer(){
		allDisk = new ArrayList<Disk>();
	}
	
	public void add(Disk disk){
		allDisk.add(disk);
	}
	
	public Disk remove() {
		return allDisk.remove(allDisk.size()-1);
	}
	
	public void print() {
		for(int i = 0; i < allDisk.size(); i++) {
			System.out.println(allDisk.get(i).diskNumber);
		}
	}
}