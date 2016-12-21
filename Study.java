public class Study implements Istudy{


	@Override
	public String read(String text){
		return "����Study�Ķ�������" + text;
	}

	@Override
	public String write(String text){		
		return "����Study��д������" + text;
	}
	
	@Override
	public String learn(String text){
			return "oiiojinmis";	
		}

}