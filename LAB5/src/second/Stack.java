package second;

import package1.Task;

import java.util.Collection;
import java.util.LinkedList;

public class Stack implements Container {

    LinkedList<Task> list = new LinkedList<>();

    @Override
    public Task pop() {
        return list.removeLast();
    }

    @Override
    public void push(Task task) {
        list.addLast(task);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.size() == 0;
    }

    @Override
    public void transferFrom(Container container) {
        list =  container.getTasks();
        while(!container.isEmpty()){
            container.pop();
        }
    }

    public LinkedList<Task> getTasks() {
        return list;
    }
}
