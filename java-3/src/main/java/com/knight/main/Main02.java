package com.knight.main;

public class Main02 {
}

// 모델 클래스
class MyModel {
    private String processedData;

    public String processInput(String inputData) {
        // 모델에서 데이터 처리 로직
        processedData = "Processed: " + inputData;

        return processedData;
    }

    public String getProcessedData() {
        return processedData;
    }
}

// 뷰 클래스
class MyView {
    public void displayData(String data) {
        // 뷰에서 데이터 표시 로직
        System.out.println("Displaying: " + data);
    }
}

// 컨트롤러 클래스
class MyController {
    private MyModel model;
    private MyView view;

    public MyController(MyModel model, MyView view) {
        this.model = model;
        this.view = view;
    }

    public void processData(String inputData) {
        // 컨트롤러에서 모델 호출
        String s = model.processInput(inputData);

        // 모델에서 가져온 데이터를 뷰에 전달
        view.displayData(s);
    }
}

// 메인 클래스
class Main03 {
    public static void main(String[] args) {
        // 모델, 뷰, 컨트롤러 객체 생성
        MyModel model = new MyModel();
        MyView view = new MyView();
        MyController controller = new MyController(model, view);

        // 사용자 입력 데이터
        String inputData = "User Input";

        // 사용자 입력 데이터를 컨트롤러에 전달
        controller.processData(inputData);
    }
}
