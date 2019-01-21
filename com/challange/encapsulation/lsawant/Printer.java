package com.challange.encapsulation.lsawant;

public class Printer {
	private String name;
	private int tonerlevel = 100;
	private int pagesPrinted;
	private boolean printDuplex = true;

	public Printer(String name, int tonerlevel, boolean duplex) {
		this.name = name;
		setTonerlevel(tonerlevel);
		this.pagesPrinted = 0;
		this.printDuplex = duplex;
	}

	public void fillToner(int level) {
		setTonerlevel(level);
	}

	private void setTonerlevel(int tonerlevel) {
		if (tonerlevel > 0 && tonerlevel <= 100) {
			this.tonerlevel = tonerlevel;
			System.out.println("Toner filled at level " + getTonerlevel());
		} else {
			System.out.println("Toner fill error !! ");
		}
	}
	
		
	public void printJob(int pages, boolean duplex) {
		int pagestobePrinted;
		if (duplex) {
			pagestobePrinted = (pages/2) + (pages%2);
		}
		else {
			pagestobePrinted = pages;
		}
		
		boolean jobPossible = reduceToner(pagestobePrinted);
		if (jobPossible) {
			if (duplex) {
				setPagesPrinted(pagestobePrinted);
			} else {
				setPagesPrinted(pagestobePrinted);
			}
			System.out.println("Job completed. Pages printed " + pages + " toner level " + getTonerlevel() + " total pages printed by printer " + getPages());
		} else {
			System.out.println("Job aborted");
		}
	}
	
	private void setPagesPrinted(int pagesPrinted) {
		this.pagesPrinted += pagesPrinted;
	}


	public boolean reduceToner(int pages) {
		boolean enoughInk = true;
		if (getTonerlevel() - pages > -1) {
			this.tonerlevel -= pages;
			enoughInk = true;
		} else {
			System.out.println("Not much toner to print " + pages + " pages");
			enoughInk = false;
		}
		return enoughInk;
	}

	public String getName() {
		return name;
	}

	public int getTonerlevel() {
		return tonerlevel;
	}

	public int getPages() {
		return pagesPrinted;
	}

	public boolean isDuplex() {
		return printDuplex;
	}

}
