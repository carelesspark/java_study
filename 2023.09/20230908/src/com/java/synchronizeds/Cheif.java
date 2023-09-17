package com.java.synchronizeds;

import javax.swing.text.TabExpander;

public class Cheif implements Runnable {
	
	private Table table;
	
	public Cheif(Table table) {
		super();
		this.table = table;
	}

	@Override
	public void run() {
		while(true) {
			int idx = (int)(Math.random() * table.dishSize());
			table.add(table.dishNames[idx]);
			
			try {
				Thread.sleep(1);
			} catch(InterruptedException e) {
				
			}
		}

	}



	

}
