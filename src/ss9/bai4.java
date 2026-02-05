package ss9;
public class bai4 {
    public static void main(String[] args) {
        Animal animal = new Dog();

        // Gọi phương thức chung
        animal.sound();

        // Không gọi được phương thức riêng của Dog
        // animal.bark();  LỖI COMPILE-TIME

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.bark();
        }
    }
}

class Animal {
    public void sound() {
        System.out.println("Động vật phát ra âm thanh");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Chó sủa: Gâu gâu");
    }

    public void bark() {
        System.out.println("Chó đang sủa mạnh");
    }
}
