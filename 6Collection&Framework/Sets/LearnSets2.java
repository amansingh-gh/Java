import java.util.*;
public class LearnSets2 {
    class Stud{
        int roll;
        String name;

        public Stud(int roll, String name) {
            this.roll = roll;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Stud [roll=" + roll + ", name=" + name + "]";
        }



        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + getEnclosingInstance().hashCode();
            result = prime * result + roll;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Stud other = (Stud) obj;
            if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
                return false;
            if (roll != other.roll)
                return false;
            return true;
        }




        private LearnSets2 getEnclosingInstance() {
            return LearnSets2.this;
        }
    }
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<>();

        // s1.addAll(new Stud(1, "RAM"));
        Student s1 = new Student(1,"Anuj");
    }    
}
