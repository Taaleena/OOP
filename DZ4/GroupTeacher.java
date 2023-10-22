package domashki.OOP.DZ4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Comparator;

public class GroupTeacher<T extends Teacher> implements Iterable<Teacher> {
    private String nameGroup;
    private List<T> numberTeacher;
    private int index;

    public GroupTeacher(String nameGroup) {
        this.numberTeacher = new ArrayList<>();
        this.nameGroup = nameGroup;
    }

    public String getName() {
        return nameGroup;
    }

    public void add(T teacher){
        numberTeacher.add(teacher);
    }

    public int count() {
        return numberTeacher.size();
    }

    public T get(Integer index) {
        return numberTeacher.get(index);
    }

    public TeachersIterator TeachersIterator() {
        return new TeachersIterator(numberTeacher);
    }

    @Override
    public Iterator<Teacher> iterator() {
        return new TeachersIterator(numberTeacher);
    }

    private class TeachersIterator implements Iterator<Teacher> {
        private List<T> numberTeacher;
        private int counter;

        public TeachersIterator(List<T> numberTeacher) {
            this.numberTeacher = numberTeacher;
            this.counter = 0;
        }

        @Override
        public boolean hasNext() {
            return index < numberTeacher.size() - 1;
        }

        @Override
        public T next() {
            if (hasNext()) {
                return numberTeacher.get(index++);
            }
            return null;
        }

        @Override
        public void remove() {
            numberTeacher.remove(numberTeacher.get(index));
        }
    }

}