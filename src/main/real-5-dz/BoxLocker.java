import javafx.util.Builder;

import java.util.Objects;

public class BoxLocker {

    private int lenght; //sm
    private int width;  //sm
    private int height; //sm
    private int cost;   //₴
    private String color;

    public static class Builder {
        private BoxLocker boxLocker;

        public Builder() {
            boxLocker = new BoxLocker();
        }

        public Builder forLenght(int lenght) {
            boxLocker.lenght = lenght;
            return this;
        }
        public Builder forWidth(int width) {
            boxLocker.width = width;
            return this;
        }
        public Builder forHeight(int height) {
            boxLocker.height = height;
            return this;
        }
        public Builder forCost(int cost) {
            boxLocker.cost = cost;
            return this;
        }
        public Builder forColor(String color) {
            boxLocker.color = color;
            return this;
        }

        public BoxLocker build() {
            return boxLocker;
        }
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BoxLocker boxLocker = (BoxLocker) o;

        if (lenght != this.lenght) return false;
        if (width != this.width) return false;
        if (height != this.height) return false;
        if (cost != this.cost) return false;
        return color.equals(this.color);
    }



    @Override
    public int hashCode(){
        int result = color == null ? 0 : color.hashCode();
        result = result + lenght + width + height + cost;
        return result;
    }

}