public interface CarList {

    Car get(int index); // Получение машины из списка по индексу
    void add(Car car); // Добавление машины
    void add(Car car, int index);  // Добавление машины по индексу
    boolean remove(Car car); // Удаление машины
    boolean removeAt(int index); // Удаление машины по индексу
    int size(); // Получение кол-ва машин в списке
    void clear(); // Очистка списка

}
