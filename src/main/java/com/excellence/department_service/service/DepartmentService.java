package com.excellence.department_service.service;

import com.excellence.department_service.entity.Department;

public interface DepartmentService {
	Department saveDepartment(Department department);

	Department getDepartmentById(Long departmentId);

}
