package org.signify.OnlineContactManagementSystem.services;

import org.signify.OnlineContactManagementSystem.entity.Contact;

public interface ContactService {
    Contact saveContactbyid(Contact contact);

    Contact updateContactbyid(Long userId, Contact contact);

    Contact getUserById(Long userId);

    void deletecontactbyid(Long userId);
}
