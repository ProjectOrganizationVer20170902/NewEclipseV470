package model.entity;

import java.io.Serializable;

public class Employee implements Serializable  {
	private static final long serialVersionUID = 92929292929292L;

	//フィールド
	private String name;
	private int age;

	//コンストラクタ
	public Employee() {
	}

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	//getter
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}
