public class Animal implements Comparable<Animal>{
    int age;
    String name;

    @Override
    public String toString() {
        return "Animal [age=" + age + ", name=" + name + "]";
    }

    public Animal(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Animal that) {
        if(this.age == that.age){
            return this.name.compareTo(that.name);
        }
        return this.age - that.age;
    }
} 