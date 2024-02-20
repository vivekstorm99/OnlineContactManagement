package org.signify.OnlineContactManagementSystem.repository;

import org.signify.OnlineContactManagementSystem.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact,Long> {

}
