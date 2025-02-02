package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		
		KatoTaro_Chapter18 katotaro = new KatoTaro_Chapter18();
		KatoHanako_Chapter18 katohanako = new KatoHanako_Chapter18();
		KatoIchiro_Chapter18 katoichiro = new KatoIchiro_Chapter18();
		
		katotaro.setGivenName("太郎");
		katotaro.commonIntroduce();
		katotaro.eachIntroduce(); //Javaが得意です
		
		
		katoichiro.setGivenName("一郎");
		katoichiro.commonIntroduce();
		katoichiro.eachIntroduce(); //好きな食べ物はリンゴです
		
		
		katohanako.setGivenName("花子");
		katohanako.commonIntroduce();
		katohanako.eachIntroduce(); //趣味は読書です
		
	}

}
