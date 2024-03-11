package org.mealkitspringboot.domain;

public class InstructionVo {
	private int lot_id;
	private int inst_id;
	private int product_id;
	private int lot_size;
	private int output;
	private String inst_date;
	private String manu_date;
	private int manu_id;
	
	
	public int getLot_id() {
		return lot_id;
	}
	public void setLot_id(int lot_id) {
		this.lot_id = lot_id;
	}
	public int getInst_id() {
		return inst_id;
	}
	public void setInst_id(int inst_id) {
		this.inst_id = inst_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getLot_size() {
		return lot_size;
	}
	public void setLot_size(int lot_size) {
		this.lot_size = lot_size;
	}
	public int getOutput() {
		return output;
	}
	public void setOutput(int output) {
		this.output = output;
	}
	public String getInst_date() {
		return inst_date;
	}
	public void setInst_date(String inst_date) {
		this.inst_date = inst_date;
	}
	public String getManu_date() {
		return manu_date;
	}
	public void setManu_date(String manu_date) {
		this.manu_date = manu_date;
	}
	public int getManu_id() {
		return manu_id;
	}
	public void setManu_id(int manu_id) {
		this.manu_id = manu_id;
	}
	
}
