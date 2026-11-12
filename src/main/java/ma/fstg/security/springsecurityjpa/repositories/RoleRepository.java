package ma.fstg.security.springsecurityjpa.repositories;


import ma.fstg.security.springsecurityjpa.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
