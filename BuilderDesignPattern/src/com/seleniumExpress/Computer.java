package com.seleniumExpress;

public class Computer {

	// required parameters
	private String HDD;
	private String RAM;

	// optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;

	// Private constructor so objects can only be built via the builder
	private Computer(ComputerBuilder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
	}

	public String getHDD() {
		return HDD;
	}

	public String getRAM() {
		return RAM;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	@Override
	public String toString() {
		return "Computer [HDD=" + HDD + ", RAM=" + RAM + ", GraphicsCard=" + isGraphicsCardEnabled + ", Bluetooth="
				+ isBluetoothEnabled + "]";
	}

	// Static nested builder class
	public static class ComputerBuilder {

		// Required
		private String HDD;
		private String RAM;

		// Optional
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;

		// public constructor for Required Feild
		public ComputerBuilder(String hdd, String ram) {
			this.HDD = hdd;
			this.RAM = ram;
		}

		public String getHDD() {
			return HDD;
		}

		public ComputerBuilder setHDD(String hDD) {
			HDD = hDD;
			return this;
		}

		public String getRAM() {
			return RAM;
		}

		public ComputerBuilder setRAM(String rAM) {
			RAM = rAM;
			return this;
		}

		public boolean isGraphicsCardEnabled() {
			return isGraphicsCardEnabled;
		}

		public boolean isBluetoothEnabled() {
			return isBluetoothEnabled;
		}

		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}

		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}
	}

}
