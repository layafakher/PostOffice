package ir.ac.kntu;

import java.util.Objects;

public class City {
    private String name;
    private int x = 0;
    private int y = 0;

    public City(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public City(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return name.equals(city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static double calculateDistance(City city1,City city2){
        double temp = Math.pow((city1.x-city2.x),2)+Math.pow(city1.y-city2.y,2);
        double distance = Math.sqrt(Math.abs(temp));
        return distance;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
