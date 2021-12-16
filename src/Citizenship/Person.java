package Citizenship;

public class Person {
	
	private int id;
	private String name;
	private int age;
	private String category;
	
	public Person(int id, String name, int age, String category) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", category=" + category + "]";
	}
}
