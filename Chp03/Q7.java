package Chp03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q7 {
	
	static class PhysData{
		private String name;
		private int height;
		private double vision;
		
		public PhysData(String name, int height, double vision) {
			this.name=name;
			this.height=height;
			this.vision=vision;
		}
		
		public String toString() {
			return name+" "+height+" "+vision;
		}
		
		public static final Comparator<PhysData> VISION_DISORDER = new VisionDisrederComparator();
			
		
		private static class VisionDisrederComparator implements Comparator<PhysData>{
			public int compare(PhysData d1, PhysData d2) {
				
				System.out.println(d1.vision+"\t"+d2.vision);
				
				
				int result=(d1.vision>d2.vision) ? 1:
					   (d1.vision<d2.vision) ? -1 :0;
				
				System.out.println(result);
				
				return result;
						
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double vision;
		
		PhysData[] x = {
			new PhysData("이나령",162,0.3),
			new PhysData("유지훈",168,0.4),
			new PhysData("김한결",169,0.8),
			new PhysData("홍준기",171,1.5),
			new PhysData("전서현",173,0.7),
			new PhysData("이호연",174,1.2),
			new PhysData("이수민",175,2.0)
		};

		System.out.println("몇 cm인 사람을 찾고 있나요?");
		vision=sc.nextInt();
		
		int idx=Arrays.binarySearch(
				x,
				new PhysData(" ",0,vision),
				PhysData.VISION_DISORDER
				
				);
		
		if(idx<0) {
			System.out.println("요소가 없습니다.");
		}
		else {
			System.out.println("x["+idx+"]에 있습니다.");
			System.out.println("찾은 데이터 : "+x[idx]);
		}
				
		 
		
	}

}
