package com.test1;

public class ReconConfigDetail {
	private int id;
	private String fielsName;
	private String fieldType;
	private String whereCondition;
	private int fieldLength;
	private String downloadType;
	private String mandatory;
	private boolean nullToBlank;
	private String status;

public ReconConfig() {
	
}

	public ReconConfigDetail(int id, String fielsName, String fieldType, String whereCondition, int fieldLength,
			String downloadType, String mandatory, boolean nullToBlank, String status) {
		super();
		this.id = id;
		this.fielsName = fielsName;
		this.fieldType = fieldType;
		this.whereCondition = whereCondition;
		this.fieldLength = fieldLength;
		this.downloadType = downloadType;
		this.mandatory = mandatory;
		this.nullToBlank = nullToBlank;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFielsName() {
		return fielsName;
	}

	public void setFielsName(String fielsName) {
		this.fielsName = fielsName;
	}

	public String getFieldType() {
		return fieldType;
	}

	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}

	public String getWhereCondition() {
		return whereCondition;
	}

	public void setWhereCondition(String whereCondition) {
		this.whereCondition = whereCondition;
	}

	public int getFieldLength() {
		return fieldLength;
	}

	public void setFieldLength(int fieldLength) {
		this.fieldLength = fieldLength;
	}

	public String getDownloadType() {
		return downloadType;
	}

	public void setDownloadType(String downloadType) {
		this.downloadType = downloadType;
	}

	public String getMandatory() {
		return mandatory;
	}

	public void setMandatory(String mandatory) {
		this.mandatory = mandatory;
	}

	public boolean isNullToBlank() {
		return nullToBlank;
	}

	public void setNullToBlank(boolean nullToBlank) {
		this.nullToBlank = nullToBlank;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
