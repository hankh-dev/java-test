package org.example;

import java.util.Date;

public class DateRangeOverlapExample {
    public static void main(String[] args) {
        // 첫 번째 기간
        Date startDate1 = new Date(122, 0, 1);  // 예: 2022년 1월 1일
        Date endDate1 = new Date(122, 0, 15);   // 예: 2022년 1월 15일

        // 두 번째 기간
        Date startDate2 = new Date(122, 0, 10);  // 예: 2022년 1월 10일
        Date endDate2 = new Date(122, 0, 20);    // 예: 2022년 1월 20일

        // 겹치는지 확인
        boolean overlap = isDateRangeOverlap(startDate1, endDate1, startDate2, endDate2);

        // 결과 출력
        if (overlap) {
            System.out.println("두 기간이 겹칩니다.");
        } else {
            System.out.println("두 기간이 겹치지 않습니다.");
        }
    }

    // 두 날짜 기간이 겹치는지 확인하는 메소드
    private static boolean isDateRangeOverlap(Date startDate1, Date endDate1, Date startDate2, Date endDate2) {
        // 두 날짜가 같은 날짜인지 확인
        if (startDate1.equals(endDate2) || endDate1.equals(startDate2)) {
            return true;
        }

        return startDate1.before(endDate2) && endDate1.after(startDate2);
    }
}
