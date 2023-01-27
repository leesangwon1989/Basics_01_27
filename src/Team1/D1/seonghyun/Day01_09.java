package Team1.D1.seonghyun;

public class Day01_09 {
    public String solution(String phone_number) {
        String answer = "";
        StringBuilder pn = new StringBuilder(phone_number);
        for (int i = 0; i < phone_number.length() - 4; i++) {
            pn.setCharAt(i, '*');
        }
        answer = pn.toString();
        return answer;
    }
}

//if문을 하지 않았을 경우 4자리의 값이면 값이 출력되지 않았지만 원이 찾음 아래 참고
// for문안에서 초기화하였기 때문에 for문이 동작하지 않으면 answer가 ""로 값이 없음.
//class Solution {
//    public String solution(String phone_number) {
//        String answer = "";
//        StringBuilder pn = new StringBuilder(phone_number);
//        if (phone_number.length() == 4) {
//            answer = phone_number;
//        } else {
//            for (int i = 0; i < phone_number.length() - 4; i++) {
//                pn.setCharAt(i, '*');
//                answer = pn.toString();
//            }
//        }
//        return answer;
//    }
//}
//https://coding-factory.tistory.com/126 문자열 자르기 substring 활용
//문자열의 특정 인덱스에 있는 문자 바꾸기 아래 링크 참고
//https://www.techiedelight.com/ko/replace-character-specific-index-java-string/
//toString / String.valueof
//형변환 문제인지 알고 헛다리
//https://junghn.tistory.com/entry/JAVA-StringvalueOf-%EC%99%80-toString%EC%9D%98-%EC%82%AC%EC%9A%A9-%EB%B0%A9%EB%B2%95-%EB%B0%8F-%EC%B0%A8%EC%9D%B4-%EC%B4%9D-%EC%A0%95%EB%A6%AC