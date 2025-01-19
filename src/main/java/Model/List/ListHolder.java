package Model.List;

import java.util.ArrayList;
import java.util.List;

public class ListHolder<T> implements IListHolder<T> {

    private List<T> list;

    public ListHolder (){
        list = new ArrayList<>();
    }

    public ListHolder (List<T> newList){
        SetList(newList);
    }

    @Override
    public List GetList() {
        return list;
    }

    @Override
    public void SetList(List newList) {
        list = newList;
    }

    @Override
    public void AddItem(T item) {
        list.add(item);
    }

    @Override
    public void RemoveItem(T item) {
        list.remove(item);
    }
}
