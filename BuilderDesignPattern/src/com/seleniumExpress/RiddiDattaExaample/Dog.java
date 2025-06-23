package com.seleniumExpress.RiddiDattaExaample;

public class Dog {

	// Requird Field
	private String gender;
	private String breed;

	// optional Field

	private String name;
	private String nickName;
	private Double price;
	private Integer age;
	private boolean isVaccinated;

	private Dog(DogBuilder builder) {

		this.gender = builder.gender;
		this.breed = builder.breed;
		this.name = builder.name;
		this.nickName = builder.nickName;
		this.price = builder.price;
		this.age = builder.age;
		this.isVaccinated = builder.isVaccinated;
	}

	public String getGender() {
		return gender;
	}

	public String getBreed() {
		return breed;
	}

	public String getName() {
		return name;
	}

	public String getNickName() {
		return nickName;
	}

	public Double getPrice() {
		return price;
	}

	public Integer getAge() {
		return age;
	}

	public boolean isVaccinated() {
		return isVaccinated;
	}

	@Override
	public String toString() {
		return "Dog [gender=" + gender + ", breed=" + breed + ", name=" + name + ", nickName=" + nickName + ", price="
				+ price + ", age=" + age + ", isVaccinated=" + isVaccinated + "]";
	}

	public static class DogBuilder {
		// Requird Field
		private String gender;
		private String breed;

		// optional Field

		private String name;
		private String nickName;
		private Double price;
		private Integer age;
		private boolean isVaccinated;

		public DogBuilder(String gender, String breed) {
			this.gender = gender;
			this.breed = breed;
		}

		public DogBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public DogBuilder setNickName(String nickName) {
			this.nickName = nickName;
			return this;
		}

		public DogBuilder setPrice(Double price) {
			this.price = price;
			return this;
		}

		public DogBuilder setAge(Integer age) {
			this.age = age;
			return this;
		}

		public boolean isVaccinated() {
			return isVaccinated;
		}

		public DogBuilder setVaccinated(boolean isVaccinated) {
			this.isVaccinated = isVaccinated;
			return this;
		}

		// Beacuse some one forgot to add this setter property and dog object get
		// created without reuired feild to avoid this it is neccessary to use
		// constrctor of required feild.
		
		/*
		 * public DogBuilder setGender(String gender) { this.gender = gender; return
		 * this; }
		 * 
		 * public DogBuilder setBreed(String breed) { this.breed = breed; return this; }
		 */

		public Dog build() {
			return new Dog(this);
		}
	}

}
