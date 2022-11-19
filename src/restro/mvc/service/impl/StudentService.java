package restro.mvc.service.impl;

import restro.mvc.repository.IStudentRepository;
import restro.mvc.repository.impl.StudentRepository;
import restro.mvc.service.IStudentService;



public class StudentService implements IStudentService {
    private IStudentRepository iStudentRepository = new StudentRepository();
    @Override
    public void display() {
        iStudentRepository.display();
    }
}
