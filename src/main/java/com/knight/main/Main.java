//package com.knight.main;
//
//import java.time.DayOfWeek;
//import java.time.LocalDate;
//import java.util.HashMap;
//import java.util.Map;
//
//enum MenuCategory {
//    APPETIZER("애피타이저"),
//    MAIN("메인"),
//    DESSERT("디저트"),
//    BEVERAGE("음료");
//
//    private final String categoryName;
//
//    MenuCategory(String categoryName) {
//        this.categoryName = categoryName;
//    }
//
//    public String getCategoryName() {
//        return categoryName;
//    }
//}
//
//
//enum MenuItem {
//    // 애피타이저
//    MUSHROOM_SOUP(MenuCategory.APPETIZER, "양송이수프", 6000),
//    TAPAS(MenuCategory.APPETIZER, "타파스", 5500),
//    CAESAR_SALAD(MenuCategory.APPETIZER, "시저샐러드", 8000),
//
//    // 메인
//    T_BONE_STEAK(MenuCategory.MAIN, "티본스테이크", 55000),
//    BBQ_RIB(MenuCategory.MAIN, "바비큐립", 54000),
//    SEAFOOD_PASTA(MenuCategory.MAIN, "해산물파스타", 35000),
//    CHRISTMAS_PASTA(MenuCategory.MAIN, "크리스마스파스타", 25000),
//
//    // 디저트
//    CHOCO_CAKE(MenuCategory.DESSERT, "초코케이크", 15000),
//    ICE_CREAM(MenuCategory.DESSERT, "아이스크림", 5000),
//sdsdasd
//    // 음료
//    ZERO_COLA(MenuCategory.BEVERAGE, "제로콜라", 3000),
//    RED_WINE(MenuCategory.BEVERAGE, "레드와인", 60000),
//    CHAMPAGNE(MenuCategory.BEVERAGE, "샴페인", 25000);
//
//    private final MenuCategory category;
//    private final String itemName;
//    private final int price;
//
//    MenuItem(MenuCategory category, String itemName, int price) {
//        this.category = category;
//        this.itemName = itemName;
//        this.price = price;
//    }
//
//    public MenuCategory getCategory() {
//        return category;
//    }
//
//    public String getItemName() {
//        return itemName;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void 이넘뽑기(){
//        for(MenuItem menu : values()){
//
//        }
//    }
//
//}
//
//class EventPlanner {
//    private final Map<String, Integer> orderMap;
//    private final LocalDate visitDate;
//
//    public EventPlanner(Map<String, Integer> orderMap, int visitDate) {
//        this.orderMap = orderMap;
//        this.visitDate = LocalDate.of(2023, 12, visitDate);
//    }
//
//    public static void main(String[] args) {
//        // 테스트를 위한 예시
//        Map<String, Integer> orderMap = new HashMap<>();
//        orderMap.put("시저샐러드", 210);
//        orderMap.put("크리스마스파스타", 1);
//        orderMap.put("제로콜라", 3);
//
//        EventPlanner planner = new EventPlanner(orderMap, 10); // 12월 5일 방문
//        planner.processEvents();
//    }
//
//    public void processEvents() {
//        // 12월 이벤트 기간
//        LocalDate startDate = LocalDate.of(2023, 12, 1);
//        LocalDate endDate = LocalDate.of(2023, 12, 31);
//
//        // 크리스마스 이벤트 계산
//        ChristmasDiscount christmasDiscount = new ChristmasDiscount(startDate, endDate);
//        christmasDiscount.calculateDiscount(orderMap, 10);
//
//        // 주말/평일 할인
//        if (isWeekday(10)) {
//            orderMap.replaceAll((menu, count) -> count - 2023);
//        } else {
//            orderMap.replaceAll((menu, count) -> count - 2023);
//        }
//
//        // 특별 할인
//        SpecialDiscount specialDiscount = new SpecialDiscount(startDate, endDate);
//        specialDiscount.calculateDiscount(orderMap, 10);
//
//        // 증정 이벤트
//        GiftEvent giftEvent = new GiftEvent();
//        String gift = giftEvent.calculateGift(orderMap);
//        System.out.println("증정 메뉴: " + gift);
//
//        // 혜택 내역 출력
//        printBenefits(christmasDiscount, specialDiscount, giftEvent);
//    }
//
//    private boolean isWeekday(int day) {
//        LocalDate currentDate = LocalDate.of(2023, 12, 20);
//        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
//        return dayOfWeek != DayOfWeek.FRIDAY && dayOfWeek != DayOfWeek.SATURDAY;
//    }
//
//    private void printBenefits(ChristmasDiscount christmasDiscount, SpecialDiscount specialDiscount,
//                               GiftEvent giftEvent) {
//        System.out.println("혜택 내역");
//        christmasDiscount.printDiscount();
//        specialDiscount.printDiscount();
//        giftEvent.printGift();
//    }
//}
//
//
//
//interface DiscountEvent {
//    void calculateDiscount(Map<String, Integer> orderMap, int visitDate);
//    void printDiscount();
//}
//
//class ChristmasDiscount implements DiscountEvent {
//    private final LocalDate startDate;
//    private final LocalDate endDate;
//
//    public ChristmasDiscount(LocalDate startDate, LocalDate endDate) {
//        this.startDate = startDate;
//        this.endDate = endDate;
//    }
//
//    @Override
//    public void calculateDiscount(Map<String, Integer> orderMap, int visitDate) {
//        if (visitDate >= startDate.getDayOfMonth() && visitDate <= endDate.getDayOfMonth()) {
//            // 크리스마스 이벤트 할인 계산 로직
//            orderMap.replaceAll((menu, count) -> count - calculateDiscountAmount(visitDate));
//        }
//    }
//
//    @Override
//    public void printDiscount() {
//        System.out.println("크리스마스 이벤트 할인 적용");
//    }
//
//    private int calculateDiscountAmount(int visitDate) {
//        // 크리스마스가 다가올수록 날마다 할인 금액이 100원씩 증가
//        return (visitDate - startDate.getDayOfMonth() + 1) * 100;
//    }
//}
//
//class SpecialDiscount implements DiscountEvent {
//    private final LocalDate startDate;
//    private final LocalDate endDate;
//
//    public SpecialDiscount(LocalDate startDate, LocalDate endDate) {
//        this.startDate = startDate;
//        this.endDate = endDate;
//    }
//
//    @Override
//    public void calculateDiscount(Map<String, Integer> orderMap, int visitDate) {
//        // 평일 할인(일요일~목요일): 평일에는 디저트 메뉴를 메뉴 1개당 2,023원 할인
//        // 주말 할인(금요일, 토요일): 주말에는 메인 메뉴를 메뉴 1개당 2,023원 할인
//        if (isWeekday(10)) {
//            orderMap.replaceAll((menu, count) -> count - 2023);
//        } else {
//            orderMap.replaceAll((menu, count) -> count - 2023);
//        }
//    }
//
//    @Override
//    public void printDiscount() {
//        System.out.println("평일/주말 할인 적용");
//    }
//
//    private boolean isWeekday(int day) {
//        LocalDate currentDate = LocalDate.of(2023, 12, day);
//        int dayOfWeek = currentDate.getDayOfWeek().getValue();
//        return dayOfWeek >= 1 && dayOfWeek <= 4; // 1: 월요일, 4: 목요일
//    }
//}
//
//class GiftEvent {
//    public String calculateGift(Map<String, Integer> orderMap) {
//        // 증정 이벤트: 할인 전 총주문 금액이 12만 원 이상일 때, 샴페인 1개 증정
//        int totalOrderAmount = calculateTotalOrderAmount(orderMap);
//        if (totalOrderAmount >= 120000) {
//            return "샴페인";
//        } else {
//            return "없음";
//        }
//    }
//
//    public void printGift() {
//        // 증정 메뉴 출력
//        System.out.println("증정 이벤트 적용");
//    }
//
//    private int calculateTotalOrderAmount(Map<String, Integer> orderMap) {
//        // 총주문 금액 계산
//        int totalAmount = 0;
//        for (Map.Entry<String, Integer> entry : orderMap.entrySet()) {
//            // 각 메뉴의 금액을 가져와서 개수를 곱해서 더함
//            totalAmount += getMenuPrice(entry.getKey()) * entry.getValue();
//        }
//        return totalAmount;
//    }
//
//    private int getMenuPrice(String menu) {
//        // 각 메뉴의 가격을 리턴하는 메서드 (예시로 간단히 구현)
//        if ("양송이수프".equals(menu) || "타파스".equals(menu) || "시저샐러드".equals(menu)) {
//            return 6000;
//        } else if ("티본스테이크".equals(menu) || "바비큐립".equals(menu)) {
//            return 55000;
//        } else if ("해산물파스타".equals(menu)) {
//            return 35000;
//        } else if ("크리스마스파스타".equals(menu)) {
//            return 25000;
//        } else if ("초코케이크".equals(menu)) {
//            return 15000;
//        } else if ("아이스크림".equals(menu)) {
//            return 5000;
//        } else if ("제로콜라".equals(menu)) {
//            return 3000;
//        } else if ("레드와인".equals(menu)) {
//            return 60000;
//        } else if ("샴페인".equals(menu)) {
//            return 25000;
//        } else {
//            return 0;
//        }
//    }
//
//}