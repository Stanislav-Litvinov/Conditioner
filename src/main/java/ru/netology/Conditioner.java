package ru.netology;

public class Conditioner {

    private int currentTemperature;

    public int getCurrentTemperature() {
        return currentTemperature;
        // возвращает запрос актуальной температуры. Кто-то спрашивает какая температура
        // Дай нам ответ.
    }

    public void setCurrentTemperature(int CurrentTemperature) {
        if (CurrentTemperature < 0) {
            return;
        }
        if (CurrentTemperature > 30) {
            return;
        }
        this.currentTemperature = CurrentTemperature;
        // обращаемся к методу с просьбой поменять текущую температуру. Присваиваем
        // новое значение, но так же в этом методе делаем свои проверки, чтобы никто не
        //  нарушил работу нашего объекта.
    }

    public void setToMaxTemp() {
        currentTemperature = 30;
    }

    public void setIncrease30p() {
        currentTemperature = 130 * currentTemperature / 100;
//        if (currentTemperature > 30) {
//            return;
//        }
    }
}
