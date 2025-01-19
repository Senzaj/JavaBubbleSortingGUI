package Model.List;

import java.util.List;

public interface IListHolder<T> {

    public List<T> GetList();

    public void SetList(List<T> list);

    public void AddItem(T item);

    public void RemoveItem(T item);
}
