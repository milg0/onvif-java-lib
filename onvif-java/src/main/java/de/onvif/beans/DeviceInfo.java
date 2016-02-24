package de.onvif.beans;

public class DeviceInfo {

	private String manufacturer;
	private String model;
	private String firmwareVersion;
	private String serialNumber;
	private String hardwareId;
	
	public DeviceInfo(String manufacturer, String model, String firmwareVersion, String serialNumber,
			String hardwareId) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.firmwareVersion = firmwareVersion;
		this.serialNumber = serialNumber;
		this.hardwareId = hardwareId;
	}
	@Override
	public String toString() {
		return "DeviceInfo [manufacturer=" + manufacturer + ", model=" + model + ", firmwareVersion=" + firmwareVersion
				+ ", serialNumber=" + serialNumber + ", hardwareId=" + hardwareId + "]";
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getFirmwareVersion() {
		return firmwareVersion;
	}
	public void setFirmwareVersion(String firmwareVersion) {
		this.firmwareVersion = firmwareVersion;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getHardwareId() {
		return hardwareId;
	}
	public void setHardwareId(String hardwareId) {
		this.hardwareId = hardwareId;
	}
}
