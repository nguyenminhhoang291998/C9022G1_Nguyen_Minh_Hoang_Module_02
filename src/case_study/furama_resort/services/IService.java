package case_study.furama_resort.services;

import case_study.furama_resort.common.NotFoundException;

public interface IService<T> {
//    List<T> displayData();

    void addData(T t) throws NotFoundException;

}
