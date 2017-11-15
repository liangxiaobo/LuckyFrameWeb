package luckyweb.seagull.spring.entity;

import javax.persistence.Entity;

@Entity(name="zttask")
public class ZtTask implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int versionid;
	private String versionname;
	private String taskname;
	private String assignedDate;
	private String assstartDate;
	private String assendDate;
	private Double estimate;
	private Double consumed;
	private String finishedby;
	private String finishedname;
	private String deadline;
	private int delaystatus;
	
	public int getDelaystatus() {
		return delaystatus;
	}
	public void setDelaystatus(int delaystatus) {
		this.delaystatus = delaystatus;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getVersionid() {
		return versionid;
	}
	public void setVersionid(int versionid) {
		this.versionid = versionid;
	}
	public String getVersionname() {
		return versionname;
	}
	public void setVersionname(String versionname) {
		this.versionname = versionname;
	}
	
	public String getTaskname() {
		return taskname;
	}
	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}
	public String getAssignedDate() {
		return assignedDate;
	}
	public void setAssignedDate(String assignedDate) {
		this.assignedDate = assignedDate;
	}
	public Double getEstimate() {
		return estimate;
	}
	public void setEstimate(Double estimate) {
		this.estimate = estimate;
	}
	public Double getConsumed() {
		return consumed;
	}
	public void setConsumed(Double consumed) {
		this.consumed = consumed;
	}
	
	public String getFinishedby() {
		return finishedby;
	}
	public void setFinishedby(String finishedby) {
		this.finishedby = finishedby;
	}
	public String getFinishedname() {
		return finishedname;
	}
	public void setFinishedname(String finishedname) {
		this.finishedname = finishedname;
	}
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	public String getAssstartDate() {
		return assstartDate;
	}
	public void setAssstartDate(String assstartDate) {
		this.assstartDate = assstartDate;
	}
	public String getAssendDate() {
		return assendDate;
	}
	public void setAssendDate(String assendDate) {
		this.assendDate = assendDate;
	}
	
}
