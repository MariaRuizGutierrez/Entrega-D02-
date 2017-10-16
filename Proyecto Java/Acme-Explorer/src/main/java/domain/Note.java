
package domain;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;

public class Note extends DomainEntity {

	private Date	createdMoment;
	private int		remark;
	private String	reply;
	private Date	replyMoment;


	@NotNull
	@Past
	public Date getCreatedMoment() {
		return this.createdMoment;
	}

	@NotNull
	public int getRemark() {
		return this.remark;
	}

	@NotBlank
	public String getReply() {
		return this.reply;
	}

	public void setReply(final String reply) {
		this.reply = reply;
	}

	@Past
	public Date getReplyMoment() {
		return this.replyMoment;
	}

	public void setReplyMoment(final Date replyMoment) {
		this.replyMoment = replyMoment;
	}
}
