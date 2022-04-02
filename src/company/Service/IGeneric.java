package company.Service;

import java.util.List;

public interface IGeneric<T> {
    List<T> show();
    void save(T t);
    void deleteById(int id);
}
