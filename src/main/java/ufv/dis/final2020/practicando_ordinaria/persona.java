package ufv.dis.final2020.practicando_ordinaria;

public class persona {
	
	private String name;
	private String surname;
	private String dni;
	private String nacimiento;
	private String email;
	private Integer age;
	private Boolean adult;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public persona(String name, String surname, String dni, String nacimiento, String email, Integer age) {
		super();
		this.name = name;
		this.surname = surname;
		this.dni = dni;
		this.nacimiento = nacimiento;
		this.email = email;
		this.age = age;
		this.setAdult(age > 17);
	}

	public Boolean getAdult() {
		return adult;
	}

	public void setAdult(Boolean adult) {
		this.adult = adult;
	}

}
