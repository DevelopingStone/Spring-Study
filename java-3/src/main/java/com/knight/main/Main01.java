package com.knight.main;

import java.util.ArrayList;
import java.util.List;

// 모델 리스너(옵저버)
interface ModelListener {
    void onDataChanged();
}

// 모델
class Model {
    private List<String> data;
    private List<ModelListener> listeners;

    public Model() {
        this.data = new ArrayList<>();
        this.listeners = new ArrayList<>();
    }

    public void addData(String item) {
        data.add(item);
        notifyListeners();
    }

    public List<String> getData() {
        return data;
    }

    public void registerListener(ModelListener listener) {
        listeners.add(listener);
    }

    private void notifyListeners() {
        for (ModelListener listener : listeners) {
            listener.onDataChanged();
        }
    }
}

// 뷰
class View implements ModelListener {
    private Model model;

    public View(Model model) {
        this.model = model;
        model.registerListener(this);
    }

    public void displayData() {
        List<String> data = model.getData();
        System.out.println("Data in View: " + data);
    }

    @Override
    public void onDataChanged() {
        displayData();
    }
}

// 컨트롤러
class Controller {
    private Model model;

    public Controller(Model model) {
        this.model = model;
    }

    public void handleUserInput(String input) {
        // 사용자 입력을 받아 모델을 변경
        model.addData(input);
    }
}

// 메인 클래스
class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View(model);
        Controller controller = new Controller(model);

        // 사용자 입력을 시뮬레이션
        controller.handleUserInput("Item 1");
        controller.handleUserInput("Item 2");
    }
}


