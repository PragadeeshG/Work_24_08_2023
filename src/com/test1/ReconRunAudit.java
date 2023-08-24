package com.test1;

public class ReconRunAudit {
	private int id;
	private String runInd;
	private String runDate;
	private String remarks;
	private String fileName;
	private String runStatus;
	private String misDate;
	private String serviceRunStatus;

	public ReconConfig() {
	 
 }

	public ReconRunAudit(int id, String runInd, String runDate, String remarks, String fileName, String runStatus,
			String misDate, String serviceRunStatus) {
		super();
		this.id = id;
		this.runInd = runInd;
		this.runDate = runDate;
		this.remarks = remarks;
		this.fileName = fileName;
		this.runStatus = runStatus;
		this.misDate = misDate;
		this.serviceRunStatus = serviceRunStatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRunInd() {
		return runInd;
	}

	public void setRunInd(String runInd) {
		this.runInd = runInd;
	}

	public String getRunDate() {
		return runDate;
	}

	public void setRunDate(String runDate) {
		this.runDate = runDate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getRunStatus() {
		return runStatus;
	}

	public void setRunStatus(String runStatus) {
		this.runStatus = runStatus;
	}

	public String getMisDate() {
		return misDate;
	}

	public void setMisDate(String misDate) {
		this.misDate = misDate;
	}

	public String getServiceRunStatus() {
		return serviceRunStatus;
	}

	public void setServiceRunStatus(String serviceRunStatus) {
		this.serviceRunStatus = serviceRunStatus;
	}

}
