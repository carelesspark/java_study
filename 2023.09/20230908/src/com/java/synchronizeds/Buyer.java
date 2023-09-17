package com.java.synchronizeds;

public class Buyer implements Runnable {

	private Table table;
	private String food;
	
	
	
	public Buyer(Table table, String food) {
		super();
		this.table = table;
		this.food = food;
	}

	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(10);
			}catch(InterruptedException e){
				
			}
			String name = Thread.currentThread().getName();
			
			if(eatFood()) {
				System.out.println(name + "ate a " + food);
			} else {
				System.out.println(name + "failed to eat " + food);
			}
		}
		

	}
	
	boolean eatFood() {
		return table.remove(food);
	}

}
