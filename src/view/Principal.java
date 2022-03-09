package view;

import controller.IdThread;

public class Principal {

	public static void main(String[] args) {

		for (int id = 0; id < 5; id++) {
			Thread threadId = new IdThread(id);
			threadId.start();
		}

	}

}
