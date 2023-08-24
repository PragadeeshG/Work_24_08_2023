package com.test1;

public class ReconConfig {
	private int id;
	private String dsName;
	private String fileLoadDate;
	private String comparisonDate;
	private String mismatches;
	private int inSource;
	private int misiingInSource;

	public ReconConfig() {

	}

	public ReconConfig(int id, String dsName, String fileLoadDate, String comparisonDate, String mismatches,
			int inSource, int misiingInSource) {
		super();
		this.id = id;
		this.dsName = dsName;
		this.fileLoadDate = fileLoadDate;
		this.comparisonDate = comparisonDate;
		this.mismatches = mismatches;
		this.inSource = inSource;
		this.misiingInSource = misiingInSource;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDsName() {
		return dsName;
	}

	public void setDsName(String dsName) {
		this.dsName = dsName;
	}

	public String getFileLoadDate() {
		return fileLoadDate;
	}

	public void setFileLoadDate(String fileLoadDate) {
		this.fileLoadDate = fileLoadDate;
	}

	public String getComparisonDate() {
		return comparisonDate;
	}

	public void setComparisonDate(String comparisonDate) {
		this.comparisonDate = comparisonDate;
	}

	public String getMismatches() {
		return mismatches;
	}

	public void setMismatches(String mismatches) {
		this.mismatches = mismatches;
	}

	public int getInSource() {
		return inSource;
	}

	public void setInSource(int inSource) {
		this.inSource = inSource;
	}

	public int getMisiingInSource() {
		return misiingInSource;
	}

	public void setMisiingInSource(int misiingInSource) {
		this.misiingInSource = misiingInSource;
	}

}
