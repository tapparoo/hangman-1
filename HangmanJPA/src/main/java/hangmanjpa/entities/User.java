package hangmanjpa.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String username;
	private String password;
	private int totalPoints;
	private String preferredModelColor;
	private String preferredDifficulty;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getTotalPoints() {
		return totalPoints;
	}

	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}

	public String getPreferredModelColor() {
		return preferredModelColor;
	}

	public void setPreferredModelColor(String preferredModelColor) {
		this.preferredModelColor = preferredModelColor;
	}

	public String getPreferredDifficulty() {
		return preferredDifficulty;
	}

	public void setPreferredDifficulty(String preferredDifficulty) {
		this.preferredDifficulty = preferredDifficulty;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", totalPoints=" + totalPoints
				+ ", preferredModelColor=" + preferredModelColor + ", preferredDifficulty=" + preferredDifficulty + "]";
	}
}
