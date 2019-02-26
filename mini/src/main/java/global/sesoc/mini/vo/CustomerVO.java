package global.sesoc.mini.vo;

public class CustomerVO {

	private String num;
	private String name;
	private String email;
	private String password;
	
	public CustomerVO(){
		
	}
	
	public CustomerVO(String num, String name, String email, String password) {
		super();
		this.num = num;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "CustomerVO [num=" + num + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}


	
	
}
