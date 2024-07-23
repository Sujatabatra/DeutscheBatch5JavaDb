package com.sujata.creational.builder;

public class Computer {

	private String hdd;
	private String ram;

	private boolean graphicCardEnabled;
	private boolean bluetoothEnabled;

	public String getHdd() {
		return hdd;
	}

	public String getRam() {
		return ram;
	}

	public boolean isGraphicCardEnabled() {
		return graphicCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return bluetoothEnabled;
	}

	private Computer(ComputerBuilder builder) {
		this.hdd=builder.hdd;
		this.ram=builder.ram;
		this.bluetoothEnabled=builder.bluetoothEnabled;
		this.graphicCardEnabled=builder.graphicCardEnabled;
	}

	static public class ComputerBuilder {
		private String hdd;
		private String ram;

		private boolean graphicCardEnabled;
		private boolean bluetoothEnabled;

		public ComputerBuilder(String hdd, String ram) {
			super();
			this.hdd = hdd;
			this.ram = ram;
		}

		

		public ComputerBuilder setGraphicCardEnabled(boolean graphicCardEnabled) {
			this.graphicCardEnabled = graphicCardEnabled;
			return this;
		}

		public ComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
			this.bluetoothEnabled = bluetoothEnabled;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}
	}

	@Override
	public String toString() {
		return "Computer [hdd=" + hdd + ", ram=" + ram + ", graphicCardEnabled=" + graphicCardEnabled
				+ ", bluetoothEnabled=" + bluetoothEnabled + "]";
	}

	
	
}
