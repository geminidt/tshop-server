package com.vti.tshop.service;

import com.vti.tshop.dto.AccessoryDto;
import com.vti.tshop.form.AccessoryCreateForm;
import com.vti.tshop.form.AccessoryUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AccessoryService {
    Page<AccessoryDto> findAll(Pageable pageable);

    AccessoryDto create(AccessoryCreateForm form);

    AccessoryDto update(AccessoryUpdateForm form, Long id);

    void deleteById(Long id);
}
