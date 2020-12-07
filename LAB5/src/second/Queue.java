package second;

import package1.Task;

import java.util.Collection;
import java.util.LinkedList;

public class Queue implements Container {
    LinkedList<Task> list = new LinkedList<>();

    @Override
    public Task pop() {
        return list.remove();
    }

    @Override
    public void push(Task task) {
        list.add(task);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        if(list.size() == 0)
            return true;
        return false;
    }

    @Override
    public void transferFrom(Container container) {
        list = container.getTasks();
        while(!container.isEmpty()){
            container.pop();
        }
    }

    public LinkedList<Task> getTasks() {
        return list;
    }
}
