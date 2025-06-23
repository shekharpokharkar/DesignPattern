package com.seleniumExpress.RiddiDattaExaample;

public class Test {

	public static void main(String[] args) {

		Dog dog = new Dog.DogBuilder("Male", "Jeman Sheford").setAge(10).setName("Tomya").setNickName("Bromo")
				.setPrice(2500.00).setVaccinated(false).build();

		System.out.println(dog);

		Dog dog1 = new Dog.DogBuilder("Female", "German Shepherd").setName("Roxy").setNickName("Rox").setAge(4)
				.setPrice(35000.0).setVaccinated(true).build();

		System.out.println(dog1);
	}

}
