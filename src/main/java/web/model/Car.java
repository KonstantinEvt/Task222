package web.model;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Car {

    private String model;
    private int number;
    private int series;

    Car() {
    }

    public Car(String model, int number, int series) {
        this.model = model;
        this.number = number;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return number == car.number && series == car.series && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, number, series);
    }

    @Override
    public String toString() {
        return "Car {" +
                "model='" + model + '\'' +
                ", number=" + number +
                ", series=" + series +
                '}';
    }
}
