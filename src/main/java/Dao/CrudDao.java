package Dao;

import java.util.List;

public interface CrudDao<T> extends SuperDao {
    public List<T> getAll();
    public boolean save(T entity);
    public boolean update(T entity);
    public String generateNewId();
    public boolean delete(T entity);
    public T search(String id);
    public T findById(String id);
}