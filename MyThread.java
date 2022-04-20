package primeiroProjeto;

public class MyThread extends Thread {
	int threadID;

	private static final int NUM_THREADS = 5;

	MyThread(int ID) {
		threadID = ID;
	}

	// corpo de cada thread
	public void run() {
		System.out.println(threadID + ": Hello World!");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
		}
		System.out.println(threadID + ": Bye bye World!");
	}

	public static void main(String args[]) {

		MyThread[] t = new MyThread[NUM_THREADS];

		// cria as threads
		for (int i = 0; i < NUM_THREADS; i++) {
			t[i] = new MyThread(i);
		}

		// inicia a execução das threads
		for (int i = 0; i < NUM_THREADS; i++) {
			t[i].start();
		}
	}
}
