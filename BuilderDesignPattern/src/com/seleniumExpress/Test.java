package com.seleniumExpress;

public class Test {

	public static void main(String[] args) {

		// Building a computer with all options
		Computer gamingComputer = new Computer.ComputerBuilder("1TB", "16GB").setGraphicsCardEnabled(true)
				.setBluetoothEnabled(true).build();

		System.out.println(gamingComputer);

		// Building a computer with default options
		Computer officeComputer = new Computer.ComputerBuilder("512GB", "8GB").build();

		System.out.println(officeComputer);
	}

}
