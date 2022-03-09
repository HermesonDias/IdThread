package controller;

public class IdThread extends Thread {

	private int id;

	public IdThread(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		System.out.println("TID #" + getId());
	}

}
