package org.signify.OnlineContactManagementSystem.controller;

import org.signify.OnlineContactManagementSystem.entity.Contact;
import org.signify.OnlineContactManagementSystem.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class ContactController {
    @Autowired
    private ContactService contactService;

    @PostMapping("/")
    public Contact saveContact(@RequestBody Contact contact) {
        return contactService.saveContactbyid(contact);
    }

    @GetMapping("/{id}")
    public Contact getContact(@PathVariable("id") Long User_Id) {
        return contactService.getUserById(User_Id);
    }

    @DeleteMapping("/{id}")
    public void deleteContact(@PathVariable("id") Long User_Id) {
        contactService.deletecontactbyid(User_Id);

    }
    @PutMapping("/{id}")
    public Contact updateContact(@PathVariable("id") Long User_Id, @RequestBody Contact contact) {
        //LOGGER.info("Inside getAllDepartments of DepartmentController ...");
        return contactService.updateContactbyid(User_Id, contact);
    }
}
