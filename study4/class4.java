package study4;

public class class4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 연구 : 중복되지 않는 숫자들로 세팅한다.
		 * 
		 *  난수1 -> {난수1, 	  }
		 *  난수2 -> 이전값들과 비교 후 {난수1,난수2 }
		 *  	 -> 동일한 값이 있는 경우 다시 새로운 난수2 발생
		 *  난수3 -> 이전값들과 비교 후 {난수1,난수2,난3 }
		 *  	 -> 동일한 값이 있는 경우 다시 새로운 난수3 발생
		 *   :
		 *  난수6 입력 후 break;
		 */
		int idx = 0;
		while( true ) {
			int number = (int)(Math.random()*45)+1;
			for(int i=0; i<G; i++) {
				if( number == lotto[i] ) b1 = true;
			}
			
			if( b1 == false ) {   // 동일한 값이 같이 없는 경우
				lotto[idx] = number;
			} else {
				continue;
			}
			idx++;
			if(idx == 6) break;
		
		}
	}

}

