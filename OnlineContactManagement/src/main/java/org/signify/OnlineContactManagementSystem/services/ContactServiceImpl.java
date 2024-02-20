package org.signify.OnlineContactManagementSystem.services;

import org.signify.OnlineContactManagementSystem.entity.Contact;
import org.signify.OnlineContactManagementSystem.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;
    @Override
    public Contact saveContactbyid(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public Contact getUserById(Long User_Id) {
        return contactRepository.findById(User_Id).get();
    }

    @Override
    public void deletecontactbyid(Long User_Id) {
         contactRepository.deleteById(User_Id);
    }

    @Override
    public Contact updateContactbyid(Long User_Id, Contact contact) {
        Contact ContactDB= contactRepository.findById(User_Id).get();
        if (Objects.nonNull(contact.getName())&&!"".equalsIgnoreCase(contact.getName())){
            ContactDB.setName(contact.getName());
        }
        if (Objects.nonNull(contact.getPhoneNumber())&&!"".equalsIgnoreCase(contact.getPhoneNumber())){
            ContactDB.setPhoneNumber(contact.getPhoneNumber());
        }
        if (Objects.nonNull(contact.getEmail())&&!"".equalsIgnoreCase(contact.getEmail())){
            ContactDB.setEmail(contact.getEmail());
        }
        return contactRepository.save(ContactDB);
    }





//    @Override
//    public void deleteDepartmentById(Long departmentId) {
//         departmentRepository.deleteById(departmentId);
//    }
}
