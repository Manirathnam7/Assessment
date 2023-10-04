package webElements;

public class ObjRepo {
	
	String in_email = "//input[@type='email']";
	String btn_Next = "//button/span[contains(text(),'Next')]";
	String in_pass = "//input[@type='password']";
	String btn_compose = "//div[contains(text(),'Compose')]";
	String in_toList = "//input[@role='combobox']";
	String in_sub = "//input[@name='subjectbox']";
	String in_emailBody = "//div[@aria-label='Message Body']";
	String btn_send = "(//div[contains(text(),'Send')])[2]";
	String btn_sent = "//a[contains(text(),'Sent')]";
	String email_sub = "//span[contains(text(),'Incubyte')]";
	
	public String getIn_email() {
		return in_email;
	}
	public void setIn_email(String in_email) {
		this.in_email = in_email;
	}
	public String getBtn_Next() {
		return btn_Next;
	}
	public void setBtn_Next(String btn_Next) {
		this.btn_Next = btn_Next;
	}
	public String getIn_pass() {
		return in_pass;
	}
	public void setIn_pass(String in_pass) {
		this.in_pass = in_pass;
	}
	public String getBtn_compose() {
		return btn_compose;
	}
	public void setBtn_compose(String btn_compose) {
		this.btn_compose = btn_compose;
	}
	public String getIn_toList() {
		return in_toList;
	}
	public void setIn_toList(String in_toList) {
		this.in_toList = in_toList;
	}
	public String getIn_sub() {
		return in_sub;
	}
	public void setIn_sub(String in_sub) {
		this.in_sub = in_sub;
	}
	public String getIn_emailBody() {
		return in_emailBody;
	}
	public void setIn_emailBody(String in_emailBody) {
		this.in_emailBody = in_emailBody;
	}
	public String getBtn_send() {
		return btn_send;
	}
	public void setBtn_send(String btn_send) {
		this.btn_send = btn_send;
	}
	public String getBtn_sent() {
		return btn_sent;
	}
	public void setBtn_sent(String btn_sent) {
		this.btn_sent = btn_sent;
	}
	public String getEmail_sub() {
		return email_sub;
	}
	public void setEmail_sub(String email_sub) {
		this.email_sub = email_sub;
	}
	
}
