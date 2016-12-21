public class Test {

	
	public static void main(String[] args) {

/**
		Student s = new Student(1,"songling",25,"�Ϻ����ֶ�������������÷·");

		s.setId(2);
		s.setName("wangjian");
		
		System.out.printf("ѧ���ţ�" + s.getId() + "\n");
		System.out.printf("ѧ������" + s.getName() + "\n");
		System.out.printf("ѧ�����䣺" + s.getAge() + "\n");
		System.out.printf("ס�޵�ַ��" + s.getAddress());
**/

		Istudy study = new Study();

		System.out.println(study.read("hgfhfh"));
		System.out.println(study.write("dsada"));
		System.out.println(study.learn("9999"));
		Istudy learn = new Learn();	

		System.out.println(learn.read("jiojkiok"));
		System.out.println(learn.write("ooooo"));
		System.out.println(learn.learn("77777"));
	}

}