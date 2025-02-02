package kadai_018;

abstract public class Kato_Chapter18 {

	
	//フィールド
	 public String familyName = "加藤";
	 public String givenName = "";
	 public String address = "住所は東京都中野区●×です";
	 
	 //メソッド 共通の紹介
	public void commonIntroduce() {
		System.out.println( "名前は" + familyName + givenName + "です");
		System.out.println( address );
	}
	
	//セッター
	public void setGivenName(String givenName) {
		this.givenName = givenName ;
	}
	
	//抽象メソッド　個別の紹介
	abstract public void eachIntroduce();
		
	//メソッド　紹介
	public void execIntroduce() {
		
	}
}
