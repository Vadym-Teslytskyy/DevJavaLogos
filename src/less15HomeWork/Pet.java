package less15HomeWork;

import java.io.Serializable;

public class Pet implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7469282420603182427L;
	private String name;
	private int age;
	private String species;
	
	public Pet(String species, String name, int age) {
		this.species = species;
		this.name = name;
		if ((age>=0)&&(age<=40)) {
			this.age = age;
		}else {
			throw new Error("Age of pet must be forom 0 to 40!");
		}
	}

	
	public String getSpecies() {
		return species;
	}


	public void setSpecies(String species) {
		this.species = species;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Pet [name=" + name + ", age=" + age + ", species=" + species + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((species == null) ? 0 : species.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Pet))
			return false;
		Pet other = (Pet) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (species == null) {
			if (other.species != null)
				return false;
		} else if (!species.equals(other.species))
			return false;
		return true;
	}

	
	
	
}
