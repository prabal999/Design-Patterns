package com.prabalhub.design.patterns.structural.facade;

/**
 * Facade
 * 
 * @author Prabal Srivastava
 */
public class ComputerFacade {
	private CPU processor;
	private Memory ram;
	private HardDrive hd;
	private int BOOT_ADDRESS = 9;
	private int BOOT_SECTOR = 99;
	private int SECTOR_SIZE = 32;

	public ComputerFacade() {
		this.processor = new CPU();
		this.ram = new Memory();
		this.hd = new HardDrive();
	}

	public void start() {
		processor.freeze();
		ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
		processor.jump(BOOT_ADDRESS);
		processor.execute();
	}
}
/* Complex parts */

class CPU {
	public void freeze() {
		System.out.println("Freezing...");
	}

	public void jump(long position) {
		System.out.println("jumping to address:" + position);
	}

	public void execute() {
		System.out.println("execute job.");
	}
}

class HardDrive {
	public byte[] read(long lba, int size) {
		System.out.println("loading HDD...");
		return "loading HDD...".getBytes();
	}
}

class Memory {
	public void load(long position, byte[] data) {
		System.out.println("loading RAM...");
	}
}
