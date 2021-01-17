package com.example.SOAPAPItesting.model;

public class Vnds {

	 private String orig;
	 private String dest;
	 private int  no;
	 private int  se;
	 private int  times;
	 private int  spi;
	public Vnds(String orig, String dest, int no, int se, int times, int spi) {
		super();
		this.orig = orig;
		this.dest = dest;
		this.no = no;
		this.se = se;
		this.times = times;
		this.spi = spi;
	}
	public Vnds() {
		// TODO Auto-generated constructor stub
	}
	public String getOrig() {
		return orig;
	}
	public void setOrig(String orig) {
		this.orig = orig;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getSe() {
		return se;
	}
	public void setSe(int se) {
		this.se = se;
	}
	public int getTimes() {
		return times;
	}
	public void setTimes(int times) {
		this.times = times;
	}
	public int getSpi() {
		return spi;
	}
	public void setSpi(int spi) {
		this.spi = spi;
	}
	@Override
	public String toString() {
		return "Vnds [orig=" + orig + ", dest=" + dest + ", no=" + no + ", se=" + se + ", times=" + times + ", spi="
				+ spi + "]";
	}
	 
	 
}
