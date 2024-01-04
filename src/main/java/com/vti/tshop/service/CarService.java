package com.vti.tshop.service;

import com.vti.tshop.dto.CarDto;
import com.vti.tshop.entity.Car;
import com.vti.tshop.form.CarCreateForm;
import com.vti.tshop.form.CarUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CarService {
    Page<CarDto> findAll(Pageable pageable);

    CarDto create(CarCreateForm form);

    CarDto update(CarUpdateForm form);

    void deleteById(Car.PrimaryKey id);
}
