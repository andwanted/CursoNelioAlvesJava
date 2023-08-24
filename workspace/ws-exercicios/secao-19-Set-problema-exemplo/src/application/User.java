package application;

import java.util.Date;
import java.util.Objects;

public class User {

	private String name;
	private Date DateHour;

	public User() {

	}

	public User(String name, Date dateHour) {
		super();
		this.name = name;
		DateHour = dateHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateHour() {
		return DateHour;
	}

	public void setDateHour(Date dateHour) {
		DateHour = dateHour;
	}

	@Override
	public int hashCode() {
		return Objects.hash(DateHour, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(DateHour, other.DateHour) && Objects.equals(name, other.name);
	}

}
