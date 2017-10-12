package domain;

import java.util.Date;

import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;


public class Note extends DomainEntity{
	private Date createdMoment;
	private int remark;
	private String reply;
	private Date replyMoment;
	
	@Past
	public Date getCreatedMoment() {
		return createdMoment;
	}
	
	public void setCreatedMoment(Date createdMoment) {
		this.createdMoment = createdMoment;
	}
	
	public int getRemark() {
		return remark;
	}
	
	public void setRemark(int remark) {
		this.remark = remark;
	}
	
	@NotBlank
	public String getReply() {
		return reply;
	}
	
	public void setReply(String reply) {
		this.reply = reply;
	}
	
	@Past
	public Date getReplyMoment() {
		return replyMoment;
	}
	
	public void setReplyMoment(Date replyMoment) {
		this.replyMoment = replyMoment;
	}
}
