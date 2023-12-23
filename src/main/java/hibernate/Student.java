package hibernate;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@Entity
@Table(name = "student")
public class Student {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdStudent", nullable = false)
    private Integer id;

    @Column(name = "FirstName", length = 250)
    private String firstName;

    @Column(name = "LastName", length = 250)
    private String lastName;

    @Column(name = "BrithDay")
    private LocalDate brithDay;

    @Column(name = "Gender", length = 5)
    private String gender;

    @Column(name = "IdClass", length = 15)
    private String idClass;
	 	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBrithDay() {
		return brithDay;
	}

	public void setBrithDay(LocalDate brithDay) {
		this.brithDay = brithDay;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIdClass() {
		return idClass;
	}

	public void setIdClass(String idClass) {
		this.idClass = idClass;
	}

}