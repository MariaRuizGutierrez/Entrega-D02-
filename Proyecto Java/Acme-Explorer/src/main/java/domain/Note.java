package domain;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;


public class Note extends DomainEntity{
	private Date createdMoment;
	private int remark;
	private String reply;
	private Date replyMoment;
	
	@NotNull
	@Past
	public Date getCreatedMoment() {
		return createdMoment;
	}
	
	@NotNull
	public int getRemark() {
		return remark;
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
