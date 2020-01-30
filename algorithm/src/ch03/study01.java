package ch03;

public class study01 {
	static void q2() {
int arr[]= {6,4,3,2,1,9,8,3};
int key=3;
String starbg=" |*";
String star="\\* ";
System.out.println("    |0 1 2 3 4 5 6");
System.out.println("----|---------------------");
for(int i=0;i<arr.length;i++) {
	//별 찍어주기
	starbg=starbg.replaceAll("\\*", "")+star;
	System.out.println("   "+starbg);
	System.out.println("   "+i+"|6 4 3 2 1 9 8");
	//검색으로 찾아주기
	if(arr[i]==key) {
		System.out.println(key+"은 x["+i+"]에 있습니다.");
			break;
		
	}
}
}
}
