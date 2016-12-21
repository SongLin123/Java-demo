public class Student{

	private int id;
	private String name;
	private int age;
	private String address;

    //¹¹ÔìÆ÷
	public Student(int id,String name,int age,String address){
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return this.id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return this.age;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return this.address;
	}

}